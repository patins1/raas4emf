package org.raas4emf.restexample.qvt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.raas4emf.restexample.qvt.HandleGetAllClassesRequest;
import org.raas4emf.restexample.qvt.HandleGetAllPackagesRequest;
import org.raas4emf.restexample.qvt.HandleTransformOCLRequest;
import restexample.GetAllClassesRequest;
import restexample.GetAllPackagesRequest;
import restexample.TransformOCLRequest;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean HandleGetAllPackagesRequest(final Object request, final Object response) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean HandleGetAllClassesRequest(final Object request, final Object response) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean HandleTransformOCLRequest(final Object request, final Object response) {
    throw new RuntimeException("should never be called");
  }
  
  public HashMap<HandleGetAllPackagesRequest, HandleGetAllPackagesRequest> traces_HandleGetAllPackagesRequest;
  
  public HandleGetAllPackagesRequest top_relation_HandleGetAllPackagesRequest(final GetAllPackagesRequest request) {
    HandleGetAllPackagesRequest result = new HandleGetAllPackagesRequest(request);
    if (traces_HandleGetAllPackagesRequest==null) traces_HandleGetAllPackagesRequest = new java.util.HashMap<HandleGetAllPackagesRequest,HandleGetAllPackagesRequest>();
    if (traces_HandleGetAllPackagesRequest.containsKey(result)) {
    	result = traces_HandleGetAllPackagesRequest.get(result);
    } else {
    	traces_HandleGetAllPackagesRequest.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HandleGetAllPackagesRequest.put(result,result);
    	
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
  
  public static List<String> top_relation_HandleGetAllPackagesRequest_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<HandleGetAllClassesRequest, HandleGetAllClassesRequest> traces_HandleGetAllClassesRequest;
  
  public HandleGetAllClassesRequest top_relation_HandleGetAllClassesRequest(final GetAllClassesRequest request) {
    HandleGetAllClassesRequest result = new HandleGetAllClassesRequest(request);
    if (traces_HandleGetAllClassesRequest==null) traces_HandleGetAllClassesRequest = new java.util.HashMap<HandleGetAllClassesRequest,HandleGetAllClassesRequest>();
    if (traces_HandleGetAllClassesRequest.containsKey(result)) {
    	result = traces_HandleGetAllClassesRequest.get(result);
    } else {
    	traces_HandleGetAllClassesRequest.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HandleGetAllClassesRequest.put(result,result);
    	
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
  
  public static List<String> top_relation_HandleGetAllClassesRequest_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<HandleTransformOCLRequest, HandleTransformOCLRequest> traces_HandleTransformOCLRequest;
  
  public HandleTransformOCLRequest top_relation_HandleTransformOCLRequest(final TransformOCLRequest request) {
    HandleTransformOCLRequest result = new HandleTransformOCLRequest(request);
    if (traces_HandleTransformOCLRequest==null) traces_HandleTransformOCLRequest = new java.util.HashMap<HandleTransformOCLRequest,HandleTransformOCLRequest>();
    if (traces_HandleTransformOCLRequest.containsKey(result)) {
    	result = traces_HandleTransformOCLRequest.get(result);
    } else {
    	traces_HandleTransformOCLRequest.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HandleTransformOCLRequest.put(result,result);
    	
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
  
  public static List<String> top_relation_HandleTransformOCLRequest_directions = java.util.Arrays.asList("source", "target");
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "HandleGetAllPackagesRequest", "HandleGetAllClassesRequest", "HandleTransformOCLRequest" );
  
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
  
  public Map<Object, Set<Object>> waitingList = new HashMap<Object,Set<Object>>();
  
  public Stack<Object> relStack = new Stack<Object>();
  
  public Map<Integer, Integer> successes = new HashMap<Integer,Integer>();
  
  public Map<Integer, Integer> failures = new HashMap<Integer,Integer>();
  
  public void logSuccess(final int i) {
    Integer prev = successes.get(i);
    successes.put(i, prev == null ? 1 : prev+1);
  }
  
  public void logFailure(final int i) {
    Integer prev = failures.get(i);
    failures.put(i, prev == null ? 1 : prev+1);
  }
}
