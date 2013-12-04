package org.eclipse.jqvt.examples.shapes.r12;

import Shapes.Arrow;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.jqvt.examples.shapes.r12.ArrowSource2ArrowSource;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean ArrowSource2ArrowSource(final Object sourceArrow) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MyQuery(final Arrow ar) {
    boolean _xblockexpression = false;
    {
      boolean _ArrowSource2ArrowSource = false;
      ArrowSource2ArrowSource _ArrowSource2ArrowSource_tuple;
      if (ar != null && 
          (_ArrowSource2ArrowSource_tuple = trafo.top_relation_ArrowSource2ArrowSource(ar)) != null)
      {
        _ArrowSource2ArrowSource = true;
      }
      _xblockexpression = (true);
    }
    return _xblockexpression;
  }
  
  public HashMap<ArrowSource2ArrowSource,ArrowSource2ArrowSource> traces_ArrowSource2ArrowSource;
  
  public ArrowSource2ArrowSource top_relation_ArrowSource2ArrowSource(final Arrow sourceArrow) {
    ArrowSource2ArrowSource result = new ArrowSource2ArrowSource(sourceArrow);
    if (traces_ArrowSource2ArrowSource==null) traces_ArrowSource2ArrowSource = new java.util.HashMap<ArrowSource2ArrowSource,ArrowSource2ArrowSource>();
    if (traces_ArrowSource2ArrowSource.containsKey(result)) {
    	result = traces_ArrowSource2ArrowSource.get(result);
    } else {
    	traces_ArrowSource2ArrowSource.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_ArrowSource2ArrowSource.put(result,result);
    	
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
  
  public static List<String> top_relation_ArrowSource2ArrowSource_directions = java.util.Arrays.asList("source");
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "ArrowSource2ArrowSource" );
  
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
