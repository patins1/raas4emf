package org.eclipse.jqvt.examples.shapes.a_implies_b_problem;

import Shapes.Circle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.jqvt.examples.shapes.a_implies_b_problem.myRelationName;
import org.eclipse.jqvt.examples.shapes.a_implies_b_problem.myRelationName2;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean myRelationName(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean myRelationName2(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public HashMap<myRelationName,myRelationName> traces_myRelationName;
  
  public myRelationName top_relation_myRelationName(final Circle s) {
    myRelationName result = new myRelationName(s);
    if (traces_myRelationName==null) traces_myRelationName = new java.util.HashMap<myRelationName,myRelationName>();
    if (traces_myRelationName.containsKey(result)) {
    	result = traces_myRelationName.get(result);
    } else {
    	traces_myRelationName.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_myRelationName.put(result,result);
    	
    	Set<Object> waitingRelList = this.waitingList.get(result);
    	if(waitingRelList != null){
    		for(Object waitingRel : waitingRelList){
    			try{
    				Method m = waitingRel.getClass().getMethod("execute",Transformation.class);
    				m.invoke(waitingRel, this);
    				//System.out.println("Re-execute: " + waitingRel);
    			}
    			catch(Exception exception){
    				exception.printStackTrace();
    			}
    		}
    		this.waitingList.get(result).clear();
    	}
    }
    return result;
  }
  
  public static List<String> top_relation_myRelationName_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<myRelationName2,myRelationName2> traces_myRelationName2;
  
  public myRelationName2 push_relation_myRelationName2(final Circle s, final Circle t) {
    myRelationName2 result = new myRelationName2(s);
    if (traces_myRelationName2==null) traces_myRelationName2 = new java.util.HashMap<myRelationName2,myRelationName2>();
    if (traces_myRelationName2.containsKey(result)) {
    	result = traces_myRelationName2.get(result);
    } else {
    	traces_myRelationName2.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_myRelationName2.put(result,result);
    	
    	Set<Object> waitingRelList = this.waitingList.get(result);
    	if(waitingRelList != null){
    		for(Object waitingRel : waitingRelList){
    			try{
    				Method m = waitingRel.getClass().getMethod("execute",Transformation.class);
    				m.invoke(waitingRel, this);
    				//System.out.println("Re-execute: " + waitingRel);
    			}
    			catch(Exception exception){
    				exception.printStackTrace();
    			}
    		}
    		this.waitingList.get(result).clear();
    	}
    }
    return result;
  }
  
  public myRelationName2 relation_myRelationName2(final Circle s) {
    myRelationName2 result = new myRelationName2(s);
    if (traces_myRelationName2==null) traces_myRelationName2 = new java.util.HashMap<myRelationName2,myRelationName2>();
    if (traces_myRelationName2.containsKey(result)) {
    	result = traces_myRelationName2.get(result);
    } else {
    	
    	Set<Object> waiting = this.waitingList.get(result);
    	if(waiting == null)
    		this.waitingList.put(result, (waiting = new java.util.HashSet<Object>()));
    	waiting.addAll(this.relStack);
    	//System.out.println(waiting);
    	return null;
    }
    return result;
  }
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "myRelationName" );
  
  private List<Method> cachedTopMethods = null;
  
  public List<Method> getTopSortedMethods() {
    if(cachedTopMethods!=null)
    	return cachedTopMethods;
    cachedTopMethods = new java.util.ArrayList<Method>();
    Class clazz = this.getClass();
    for(String it : this.topOrder){
    	if(it.startsWith("["))
    		System.err.println("The following relations are not evaluated due to circles: "+it);
    	for(Method m : clazz.getMethods()){
    		if(("top_relation_" + it).equals(m.getName())){
    			cachedTopMethods.add(m);
    			break;
    		}
    	}
    }
    return cachedTopMethods;
  }
  
  public abstract <T> T create(final Class<T> c);
  
  public Map<Object,Set<Object>> waitingList = new HashMap<Object,Set<Object>>();
  
  public Stack<Object> relStack = new Stack<Object>();
  
  public Map<Integer,Integer> successes = new HashMap<Integer,Integer>();
  
  public Map<Integer,Integer> failures = new HashMap<Integer,Integer>();
  
  public void logSuccess(final int i) {
    Integer prev = successes.get(i);
    successes.put(i, prev == null ? 1 : prev+1);
  }
  
  public void logFailure(final int i) {
    Integer prev = failures.get(i);
    failures.put(i, prev == null ? 1 : prev+1);
  }
}
