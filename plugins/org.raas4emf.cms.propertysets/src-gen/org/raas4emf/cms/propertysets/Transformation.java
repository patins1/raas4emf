package org.raas4emf.cms.propertysets;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.raas4emf.cms.propertysets.MapProperty;
import org.raas4emf.cms.propertysets.MapPropertySet;
import org.raas4emf.cms.propertysets.MapWorkbook;
import psets.IArtifact;
import psets.IPropertySet;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean MapPropertySet(final Object psetName, final Object aPset) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapProperty(final Object row, final Object iArtifact) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapWorkbook(final Object w, final Object iArtifact) {
    throw new RuntimeException("should never be called");
  }
  
  public int toInt(final String s) {
    try {
      return Integer.parseInt(s);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        return 0;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public HashMap<MapPropertySet,MapPropertySet> traces_MapPropertySet;
  
  public MapPropertySet push_relation_MapPropertySet(final String psetName, final IPropertySet aPset) {
    MapPropertySet result = new MapPropertySet(psetName);
    if (traces_MapPropertySet==null) traces_MapPropertySet = new java.util.HashMap<MapPropertySet,MapPropertySet>();
    if (traces_MapPropertySet.containsKey(result)) {
    	result = traces_MapPropertySet.get(result);
    } else {
    	traces_MapPropertySet.put(result,null);
    	result.aPset = aPset;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapPropertySet.put(result,result);
    	
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
  
  public MapPropertySet relation_MapPropertySet(final String psetName) {
    MapPropertySet result = new MapPropertySet(psetName);
    if (traces_MapPropertySet==null) traces_MapPropertySet = new java.util.HashMap<MapPropertySet,MapPropertySet>();
    if (traces_MapPropertySet.containsKey(result)) {
    	result = traces_MapPropertySet.get(result);
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
  
  public HashMap<MapProperty,MapProperty> traces_MapProperty;
  
  public MapProperty push_relation_MapProperty(final HSSFRow row, final IArtifact iArtifact) {
    MapProperty result = new MapProperty(row);
    if (traces_MapProperty==null) traces_MapProperty = new java.util.HashMap<MapProperty,MapProperty>();
    if (traces_MapProperty.containsKey(result)) {
    	result = traces_MapProperty.get(result);
    } else {
    	traces_MapProperty.put(result,null);
    	result.iArtifact = iArtifact;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapProperty.put(result,result);
    	
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
  
  public MapProperty relation_MapProperty(final HSSFRow row) {
    MapProperty result = new MapProperty(row);
    if (traces_MapProperty==null) traces_MapProperty = new java.util.HashMap<MapProperty,MapProperty>();
    if (traces_MapProperty.containsKey(result)) {
    	result = traces_MapProperty.get(result);
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
  
  public HashMap<MapWorkbook,MapWorkbook> traces_MapWorkbook;
  
  public MapWorkbook top_relation_MapWorkbook(final HSSFWorkbook w) {
    MapWorkbook result = new MapWorkbook(w);
    if (traces_MapWorkbook==null) traces_MapWorkbook = new java.util.HashMap<MapWorkbook,MapWorkbook>();
    if (traces_MapWorkbook.containsKey(result)) {
    	result = traces_MapWorkbook.get(result);
    } else {
    	traces_MapWorkbook.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapWorkbook.put(result,result);
    	
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
  
  public static List<String> top_relation_MapWorkbook_directions = java.util.Arrays.asList("source", "target");
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "MapWorkbook" );
  
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
