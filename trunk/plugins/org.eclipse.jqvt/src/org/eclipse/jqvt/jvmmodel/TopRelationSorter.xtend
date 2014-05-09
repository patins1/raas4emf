/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.jqvt.jQVT.Relation
import org.eclipse.jqvt.jQVT.Transformation
import org.eclipse.xtext.util.Pair
import org.eclipse.xtext.util.Tuples
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.common.types.JvmOperation

class TopRelationSorter {
	 /**
   	 * Return a list of top relations, which are topological sorted according to the patial
   	 * order defined by {@link #precede(Relation, Relation}
   	 */
   	def getTopSortedTopRelations(Transformation transformation){
   		mapPrecede.clear();
   		val relations = transformation.rules.deCircle();
   		val sorted = new ArrayList<Relation>()
   		
   		var fine = true;
   		while(sorted.size() < relations.size() && fine){
   			val found = relations.findFirst(r|
   				(!sorted.contains(r)) && 
   				(!relations.exists(r1 | (!sorted.contains(r1)) && precede(r1,r)))
   			)
   			if(found == null){
   				validationException("Top relations cannot be sorted, because their when and where clauses form circles", transformation)
   				fine = false;
   			}
   			else
   				sorted += found
   		}
   		
		sorted.filter(e|e.topRelation)
   	}
   	
   	Map<Pair<Relation,Relation>,Boolean> mapPrecede = new HashMap<Pair<Relation,Relation>,Boolean> ()
   	
   	/**
   	 * A partial order between two Relations, 
   	 * precede(left, right)==true, if left.where mentios right or right.when mentions left
   	 */
   	def private boolean precede(Relation left, Relation right){
   		val paras = Tuples::create(left,right)
   		val Boolean cached = mapPrecede.get(paras)
   		if(cached != null) return cached
   		
   		val res= 
   			if(right.when.exists(e|e.mentionedRel(left)))
   				true
   			else if(left.where.exists(e|e.mentionedRel(right)))
   				true
   			else false
   			
   		mapPrecede.put(paras,res)
   		
   		res
   	}
   	
   	def public boolean mentionedRel(XExpression expr, Relation relation){
		switch expr{
			XFeatureCall case expr.feature instanceof JvmOperation && expr.feature.simpleName == relation.name
			 : true
			XExpression case expr.eContents().exists(
				obj | obj instanceof XExpression && mentionedRel(obj as XExpression, relation)
			) : true
			default : false
		}
   	}  
   	def private deCircle(List<Relation> original){
   		val temp = new ArrayList<Relation>(original.size())
   		original.forEach(e | temp.add(e));
   		var exists = true;
   		while(exists){
   			var FakeRelation tmpCircle = null;
   			var Relation cirmember = null;
   			var i=0;
   			while (i<temp.size && cirmember==null) {
   				val e = temp.get(i);
   				if ((tmpCircle=e.getCircle(temp))!=null) 
   					cirmember = e;
   				i = i + 1;
   			}
   			if(cirmember == null)
   				return temp;
   			val fake = tmpCircle
   			temp.removeAll(fake.members);
   			
   			temp.forEach(e | fake.members.forEach(f | 
   				if(e.precede(f)) mapPrecede.put(Tuples::create(e,fake as Relation),true)		
   			))
   			
   			temp.forEach(e | fake.members.forEach(f | 
   				if(f.precede(e)) mapPrecede.put(Tuples::create(fake as Relation, e),true)		
   			))
   			
   			temp.add(fake);
   			
   		}   		
   		
   		temp
   	}
   	
   	def private FakeRelation getCircle(Relation curr, List<Relation> list){
   		return getCircle(curr, list, new ArrayList<Relation>());
   	}
   	
   	def private FakeRelation getCircle(Relation curr, List<Relation> list, List<Relation> trace){
   		trace.add(curr)
   		val subseq = list.filter(e | curr.precede(e))
   		for(e : subseq){
   			val index = trace.indexOf(e)
   			if(index >= 0){
   				val res = new FakeRelation();
   				var i = index
   				do res.add(trace.get(i)) 
   				while ((i = i+1) < trace.size())
   				trace.clear()
   				return res
   			}
   			
   			val circle = e.getCircle(list, trace);
   			if(circle != null)
   				return circle;
   			
   		}
   		trace.remove(trace.size()-1)
   		null
   	}
   	
   	def forceBreakCircleToString(FakeRelation circle,Transformation transfo){
   		val result = new ArrayList<Relation>()
   		result.addAll(circle.members.filter(e|e.topRelation))
   		while(result.exists(e|e instanceof FakeRelation)){
   			val fake = result.findFirst(e|e instanceof FakeRelation) as FakeRelation
   			result.remove(fake)
   			result.addAll(fake.members.filter(e|e.topRelation))
   		}
   		System::out.println(result.map(r|r.name).join(", "))
   		val ret = result.sortBy(e|transfo.rules.indexOf(e)).map(r|"\""+r.name+"\"").join(", ")
   		System::out.println(ret)
   		ret
   	}
   	
   	def public void validationException(String message, EObject source){
   		//Still cannot trace the Relations that cause the circle
   		validationException(message, source, null, -1);
   	}	
   	
   	def public void validationException(String message, EObject source, EStructuralFeature feature, int index) {
		// do nothing as default
	}
	
	
   	
 
}