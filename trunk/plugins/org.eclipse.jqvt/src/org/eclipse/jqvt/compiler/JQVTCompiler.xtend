/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.compiler

import com.google.inject.Inject
import org.eclipse.jqvt.jvmmodel.DependencyInfo
import org.eclipse.jqvt.jvmmodel.DependencyProcessor
import org.eclipse.jqvt.util.JQVTUtils
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.compiler.IAppendable
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer
import org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

import static org.eclipse.jqvt.util.JQVTUtilsExtended.*

/**
 * Compiles relation calls
 */
class JQVTCompiler extends XbaseCompiler {
   
	@Inject	extension JQVTUtils
	
	@Inject extension ITypeProvider
	
	@Inject extension JvmOnlyTypeConformanceComputer
	
	@Inject extension DependencyProcessor
	
	override _toJavaStatement(XAbstractFeatureCall expr, ITreeAppendable b, boolean isReferenced) {
		val relation = expr.referredRelation;
		if (relation != null && relation.typeForRelation!=null) {
			if (expr.getImplicitReceiver() != null) {
				internalToJavaStatement(expr.getImplicitReceiver(), b, true);
			}
			for (arg : expr.getExplicitArguments()) {
				prepareExpression(arg, b);
			}
			var DependencyInfo info = getContainerIterable(expr).findFirst(x|x.dependencyInfo!=null)?.dependencyInfo;
			val call = expr as XFeatureCall; 
			declareSyntheticVariable(expr,b);
			val relationVar = getVarName(expr,b)+"_tuple";
			var nl="\n    ";
			b.append("\n").append(relation.typeForRelation).append(" ").append(relationVar).append(";")
			b.append("\n"+'if (');
			for (pair:call.getParamPairs(false)) {internalToJavaExpression(pair.exp, b) if (!pair.domain.type.isConformant(pair.exp.type)) b.append(" instanceof ").append(pair.domain.type.type) else b.append(" != null") b.append(" && ") b.append(nl) }
			for (pair:call.getParamPairs(true)) if (!(info!=null && pair.exp.asVar!=null && !info.isRead(pair.exp.asVar)) && !pair.domain.type.isConformant(pair.exp.type)) { b.append("(") internalToJavaExpression(pair.exp, b) b.append("==null || ") internalToJavaExpression(pair.exp, b) b.append(" instanceof ").append(pair.domain.type.type).append(") && ").append(nl)}
			b.append('''(«relationVar» = trafo.«IF info!=null && info.isTarget && !relation.isTopRelation»push_«ENDIF»«relation.triggerName»('''.toString());
			var connector="";
			for (pair:call.getParamPairs(if (info!=null && info.isTarget && !relation.isTopRelation) null else false)) { b.append(connector) connector=", " if (info!=null && pair.exp.asVar!=null && !info.isRead(pair.exp.asVar)) b.append("null") else {if (!pair.domain.type.isConformant(pair.exp.type)) b.append("(").append(pair.domain.type.type).append(")") internalToJavaExpression(pair.exp, b) } }
			b.append(")) != null");
			for (pair:call.getParamPairs(true)) if (info!=null && pair.exp.asVar!=null && !info.isRead(pair.exp.asVar)) { if (!pair.exp.type.isConformant(pair.domain.type)) { b.append(nl+''' && «relationVar».«pair.domain.name» instanceof ''').append(pair.exp.type.type) } } else if (!(pair.exp instanceof XNullLiteral)) { b.append(nl+''' && (''') internalToJavaExpression(pair.exp, b) b.append("==null || ") internalToJavaExpression(pair.exp, b) b.append('''.equals(«relationVar».«pair.domain.name»))'''.toString()) }
			b.append(")\n{").increaseIndentation
			for (pair:call.getParamPairs(true)) if (info!=null && pair.exp.asVar!=null && info.isWrite(pair.exp.asVar)) b.append("\n"+'''«pair.exp.asVar.name» = «IF !pair.exp.type.isConformant(pair.domain.type)»(«pair.exp.type.qualifiedName»)«ENDIF» «relationVar».«pair.domain.name»;''');
			b.append("\n"+'''«getVarName(expr,b)» = true;''').decreaseIndentation;
			b.append("\n}")
		} else
		super._toJavaStatement(expr, b, isReferenced);
	}
   	
}


