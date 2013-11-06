/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.compiler;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jvmmodel.DependencyInfo;
import org.eclipse.jqvt.jvmmodel.DependencyProcessor;
import org.eclipse.jqvt.jvmmodel.ParamPair;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.jqvt.util.JQVTUtilsExtended;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer;

/**
 * Compiles relation calls
 */
@SuppressWarnings("all")
public class JQVTCompiler extends XbaseCompiler {
  @Inject
  @Extension
  private JQVTUtils _jQVTUtils;
  
  @Inject
  @Extension
  private ITypeProvider _iTypeProvider;
  
  @Inject
  @Extension
  private JvmOnlyTypeConformanceComputer _jvmOnlyTypeConformanceComputer;
  
  @Inject
  @Extension
  private DependencyProcessor _dependencyProcessor;
  
  public void _toJavaStatement(final XAbstractFeatureCall expr, final ITreeAppendable b, final boolean isReferenced) {
    final Relation relation = this._jQVTUtils.getReferredRelation(expr);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(relation, null));
    if (!_notEquals) {
      _and = false;
    } else {
      JvmDeclaredType _typeForRelation = this._jQVTUtils.getTypeForRelation(relation);
      boolean _notEquals_1 = (!Objects.equal(_typeForRelation, null));
      _and = (_notEquals && _notEquals_1);
    }
    if (_and) {
      XExpression _implicitReceiver = expr.getImplicitReceiver();
      boolean _notEquals_2 = (!Objects.equal(_implicitReceiver, null));
      if (_notEquals_2) {
        XExpression _implicitReceiver_1 = expr.getImplicitReceiver();
        this.internalToJavaStatement(_implicitReceiver_1, b, true);
      }
      EList<XExpression> _explicitArguments = expr.getExplicitArguments();
      for (final XExpression arg : _explicitArguments) {
        this.prepareExpression(arg, b);
      }
      Iterable<EObject> _containerIterable = JQVTUtilsExtended.getContainerIterable(expr);
      final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
          public Boolean apply(final EObject x) {
            DependencyInfo _dependencyInfo = JQVTCompiler.this._dependencyProcessor.getDependencyInfo(x);
            boolean _notEquals = (!Objects.equal(_dependencyInfo, null));
            return Boolean.valueOf(_notEquals);
          }
        };
      EObject _findFirst = IterableExtensions.<EObject>findFirst(_containerIterable, _function);
      DependencyInfo info = _findFirst==null?(DependencyInfo)null:this._dependencyProcessor.getDependencyInfo(_findFirst);
      final XFeatureCall call = ((XFeatureCall) expr);
      this.declareSyntheticVariable(expr, b);
      String _varName = this.getVarName(expr, b);
      final String relationVar = (_varName + "_tuple");
      String nl = "\n    ";
      ITreeAppendable _append = b.append("\n");
      JvmDeclaredType _typeForRelation_1 = this._jQVTUtils.getTypeForRelation(relation);
      ITreeAppendable _append_1 = _append.append(_typeForRelation_1);
      ITreeAppendable _append_2 = _append_1.append(" ");
      ITreeAppendable _append_3 = _append_2.append(relationVar);
      _append_3.append(";");
      String _plus = ("\n" + "if (");
      b.append(_plus);
      Iterable<ParamPair> _paramPairs = this._jQVTUtils.getParamPairs(call, Boolean.valueOf(false));
      for (final ParamPair pair : _paramPairs) {
        {
          this.internalToJavaExpression(pair.exp, b);
          JvmTypeReference _type = this._jQVTUtils.getType(pair.domain);
          JvmTypeReference _type_1 = this.getType(pair.exp);
          boolean _isConformant = this._jvmOnlyTypeConformanceComputer.isConformant(_type, _type_1);
          boolean _not = (!_isConformant);
          if (_not) {
            ITreeAppendable _append_4 = b.append(" instanceof ");
            JvmTypeReference _type_2 = this._jQVTUtils.getType(pair.domain);
            JvmType _type_3 = _type_2.getType();
            _append_4.append(_type_3);
          } else {
            b.append(" != null");
          }
          b.append(" && ");
          b.append(nl);
        }
      }
      Iterable<ParamPair> _paramPairs_1 = this._jQVTUtils.getParamPairs(call, Boolean.valueOf(true));
      for (final ParamPair pair_1 : _paramPairs_1) {
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _and_3 = false;
        boolean _notEquals_3 = (!Objects.equal(info, null));
        if (!_notEquals_3) {
          _and_3 = false;
        } else {
          XVariableDeclaration _asVar = this._jQVTUtils.asVar(pair_1.exp);
          boolean _notEquals_4 = (!Objects.equal(_asVar, null));
          _and_3 = (_notEquals_3 && _notEquals_4);
        }
        if (!_and_3) {
          _and_2 = false;
        } else {
          XVariableDeclaration _asVar_1 = this._jQVTUtils.asVar(pair_1.exp);
          boolean _isRead = info.isRead(_asVar_1);
          boolean _not = (!_isRead);
          _and_2 = (_and_3 && _not);
        }
        boolean _not_1 = (!_and_2);
        if (!_not_1) {
          _and_1 = false;
        } else {
          JvmTypeReference _type = this._jQVTUtils.getType(pair_1.domain);
          JvmTypeReference _type_1 = this.getType(pair_1.exp);
          boolean _isConformant = this._jvmOnlyTypeConformanceComputer.isConformant(_type, _type_1);
          boolean _not_2 = (!_isConformant);
          _and_1 = (_not_1 && _not_2);
        }
        if (_and_1) {
          b.append("(");
          this.internalToJavaExpression(pair_1.exp, b);
          b.append("==null || ");
          this.internalToJavaExpression(pair_1.exp, b);
          ITreeAppendable _append_4 = b.append(" instanceof ");
          JvmTypeReference _type_2 = this._jQVTUtils.getType(pair_1.domain);
          JvmType _type_3 = _type_2.getType();
          ITreeAppendable _append_5 = _append_4.append(_type_3);
          ITreeAppendable _append_6 = _append_5.append(") && ");
          _append_6.append(nl);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      _builder.append(relationVar, "");
      _builder.append(" = trafo.");
      {
        boolean _and_4 = false;
        boolean _and_5 = false;
        boolean _notEquals_5 = (!Objects.equal(info, null));
        if (!_notEquals_5) {
          _and_5 = false;
        } else {
          _and_5 = (_notEquals_5 && info.isTarget);
        }
        if (!_and_5) {
          _and_4 = false;
        } else {
          boolean _isTopRelation = relation.isTopRelation();
          boolean _not_3 = (!_isTopRelation);
          _and_4 = (_and_5 && _not_3);
        }
        if (_and_4) {
          _builder.append("push_");
        }
      }
      String _triggerName = this._jQVTUtils.triggerName(relation);
      _builder.append(_triggerName, "");
      _builder.append("(");
      String _string = _builder.toString();
      b.append(_string);
      String connector = "";
      Boolean _xifexpression = null;
      boolean _and_6 = false;
      boolean _and_7 = false;
      boolean _notEquals_6 = (!Objects.equal(info, null));
      if (!_notEquals_6) {
        _and_7 = false;
      } else {
        _and_7 = (_notEquals_6 && info.isTarget);
      }
      if (!_and_7) {
        _and_6 = false;
      } else {
        boolean _isTopRelation_1 = relation.isTopRelation();
        boolean _not_4 = (!_isTopRelation_1);
        _and_6 = (_and_7 && _not_4);
      }
      if (_and_6) {
        _xifexpression = null;
      } else {
        _xifexpression = Boolean.valueOf(false);
      }
      Iterable<ParamPair> _paramPairs_2 = this._jQVTUtils.getParamPairs(call, _xifexpression);
      for (final ParamPair pair_2 : _paramPairs_2) {
        {
          b.append(connector);
          connector = ", ";
          boolean _and_8 = false;
          boolean _and_9 = false;
          boolean _notEquals_7 = (!Objects.equal(info, null));
          if (!_notEquals_7) {
            _and_9 = false;
          } else {
            XVariableDeclaration _asVar_2 = this._jQVTUtils.asVar(pair_2.exp);
            boolean _notEquals_8 = (!Objects.equal(_asVar_2, null));
            _and_9 = (_notEquals_7 && _notEquals_8);
          }
          if (!_and_9) {
            _and_8 = false;
          } else {
            XVariableDeclaration _asVar_3 = this._jQVTUtils.asVar(pair_2.exp);
            boolean _isRead_1 = info.isRead(_asVar_3);
            boolean _not_5 = (!_isRead_1);
            _and_8 = (_and_9 && _not_5);
          }
          if (_and_8) {
            b.append("null");
          } else {
            JvmTypeReference _type_4 = this._jQVTUtils.getType(pair_2.domain);
            JvmTypeReference _type_5 = this.getType(pair_2.exp);
            boolean _isConformant_1 = this._jvmOnlyTypeConformanceComputer.isConformant(_type_4, _type_5);
            boolean _not_6 = (!_isConformant_1);
            if (_not_6) {
              ITreeAppendable _append_7 = b.append("(");
              JvmTypeReference _type_6 = this._jQVTUtils.getType(pair_2.domain);
              JvmType _type_7 = _type_6.getType();
              ITreeAppendable _append_8 = _append_7.append(_type_7);
              _append_8.append(")");
            }
            this.internalToJavaExpression(pair_2.exp, b);
          }
        }
      }
      b.append(")) != null");
      Iterable<ParamPair> _paramPairs_3 = this._jQVTUtils.getParamPairs(call, Boolean.valueOf(true));
      for (final ParamPair pair_3 : _paramPairs_3) {
        boolean _and_8 = false;
        boolean _and_9 = false;
        boolean _notEquals_7 = (!Objects.equal(info, null));
        if (!_notEquals_7) {
          _and_9 = false;
        } else {
          XVariableDeclaration _asVar_2 = this._jQVTUtils.asVar(pair_3.exp);
          boolean _notEquals_8 = (!Objects.equal(_asVar_2, null));
          _and_9 = (_notEquals_7 && _notEquals_8);
        }
        if (!_and_9) {
          _and_8 = false;
        } else {
          XVariableDeclaration _asVar_3 = this._jQVTUtils.asVar(pair_3.exp);
          boolean _isRead_1 = info.isRead(_asVar_3);
          boolean _not_5 = (!_isRead_1);
          _and_8 = (_and_9 && _not_5);
        }
        if (_and_8) {
          JvmTypeReference _type_4 = this.getType(pair_3.exp);
          JvmTypeReference _type_5 = this._jQVTUtils.getType(pair_3.domain);
          boolean _isConformant_1 = this._jvmOnlyTypeConformanceComputer.isConformant(_type_4, _type_5);
          boolean _not_6 = (!_isConformant_1);
          if (_not_6) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(" ");
            _builder_1.append("&& ");
            _builder_1.append(relationVar, " ");
            _builder_1.append(".");
            String _name = this._jQVTUtils.getName(pair_3.domain);
            _builder_1.append(_name, " ");
            _builder_1.append(" instanceof ");
            String _plus_1 = (nl + _builder_1);
            ITreeAppendable _append_7 = b.append(_plus_1);
            JvmTypeReference _type_6 = this.getType(pair_3.exp);
            JvmType _type_7 = _type_6.getType();
            _append_7.append(_type_7);
          }
        } else {
          boolean _not_7 = (!(pair_3.exp instanceof XNullLiteral));
          if (_not_7) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append(" ");
            _builder_2.append("&& (");
            String _plus_2 = (nl + _builder_2);
            b.append(_plus_2);
            this.internalToJavaExpression(pair_3.exp, b);
            b.append("==null || ");
            this.internalToJavaExpression(pair_3.exp, b);
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append(".equals(");
            _builder_3.append(relationVar, "");
            _builder_3.append(".");
            String _name_1 = this._jQVTUtils.getName(pair_3.domain);
            _builder_3.append(_name_1, "");
            _builder_3.append("))");
            String _string_1 = _builder_3.toString();
            b.append(_string_1);
          }
        }
      }
      ITreeAppendable _append_8 = b.append(")\n{");
      _append_8.increaseIndentation();
      Iterable<ParamPair> _paramPairs_4 = this._jQVTUtils.getParamPairs(call, Boolean.valueOf(true));
      for (final ParamPair pair_4 : _paramPairs_4) {
        boolean _and_10 = false;
        boolean _and_11 = false;
        boolean _notEquals_9 = (!Objects.equal(info, null));
        if (!_notEquals_9) {
          _and_11 = false;
        } else {
          XVariableDeclaration _asVar_4 = this._jQVTUtils.asVar(pair_4.exp);
          boolean _notEquals_10 = (!Objects.equal(_asVar_4, null));
          _and_11 = (_notEquals_9 && _notEquals_10);
        }
        if (!_and_11) {
          _and_10 = false;
        } else {
          XVariableDeclaration _asVar_5 = this._jQVTUtils.asVar(pair_4.exp);
          boolean _isWrite = info.isWrite(_asVar_5);
          _and_10 = (_and_11 && _isWrite);
        }
        if (_and_10) {
          StringConcatenation _builder_4 = new StringConcatenation();
          XVariableDeclaration _asVar_6 = this._jQVTUtils.asVar(pair_4.exp);
          String _name_2 = _asVar_6.getName();
          _builder_4.append(_name_2, "");
          _builder_4.append(" = ");
          {
            JvmTypeReference _type_8 = this.getType(pair_4.exp);
            JvmTypeReference _type_9 = this._jQVTUtils.getType(pair_4.domain);
            boolean _isConformant_2 = this._jvmOnlyTypeConformanceComputer.isConformant(_type_8, _type_9);
            boolean _not_8 = (!_isConformant_2);
            if (_not_8) {
              _builder_4.append("(");
              JvmTypeReference _type_10 = this.getType(pair_4.exp);
              String _qualifiedName = _type_10.getQualifiedName();
              _builder_4.append(_qualifiedName, "");
              _builder_4.append(")");
            }
          }
          _builder_4.append(" ");
          _builder_4.append(relationVar, "");
          _builder_4.append(".");
          String _name_3 = this._jQVTUtils.getName(pair_4.domain);
          _builder_4.append(_name_3, "");
          _builder_4.append(";");
          String _plus_3 = ("\n" + _builder_4);
          b.append(_plus_3);
        }
      }
      StringConcatenation _builder_5 = new StringConcatenation();
      String _varName_1 = this.getVarName(expr, b);
      _builder_5.append(_varName_1, "");
      _builder_5.append(" = true;");
      String _plus_4 = ("\n" + _builder_5);
      ITreeAppendable _append_9 = b.append(_plus_4);
      _append_9.decreaseIndentation();
      b.append("\n}");
    } else {
      super._toJavaStatement(expr, b, isReferenced);
    }
  }
}
