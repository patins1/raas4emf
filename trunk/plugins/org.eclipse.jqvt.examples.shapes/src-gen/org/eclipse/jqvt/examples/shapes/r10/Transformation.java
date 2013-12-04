package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.Arrow;
import Shapes.Circle;
import Shapes.ModelElement;
import Shapes.RootBlock;
import Shapes.Square;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.jqvt.examples.shapes.r10.ArrowSource2ArrowSource;
import org.eclipse.jqvt.examples.shapes.r10.ArrowTarget2ArrowTarget;
import org.eclipse.jqvt.examples.shapes.r10.MapArrow;
import org.eclipse.jqvt.examples.shapes.r10.MapCircle;
import org.eclipse.jqvt.examples.shapes.r10.MapRootBlock;
import org.eclipse.jqvt.examples.shapes.r10.MarkRootBlock;
import org.eclipse.jqvt.examples.shapes.r10.ModelElementName2ModelElementName;
import org.eclipse.jqvt.examples.shapes.r10.Source2Target;
import org.eclipse.jqvt.examples.shapes.r10.markerForIncomingArrows;
import org.eclipse.jqvt.examples.shapes.r10.markerForOutgoingArrows;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean ArrowSource2ArrowSource(final Object sourceArrow, final Object targetArrow) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean ArrowTarget2ArrowTarget(final Object sourceArrow, final Object targetArrow) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean ModelElementName2ModelElementName(final Object sourceModelElement, final Object targetModelElement) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapCircle(final Object s, final Object square) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean markerForOutgoingArrows(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean markerForIncomingArrows(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapArrow(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Source2Target(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapRootBlock(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MarkRootBlock(final Object root) {
    throw new RuntimeException("should never be called");
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
  
  public static List<String> top_relation_ArrowSource2ArrowSource_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<ArrowTarget2ArrowTarget,ArrowTarget2ArrowTarget> traces_ArrowTarget2ArrowTarget;
  
  public ArrowTarget2ArrowTarget top_relation_ArrowTarget2ArrowTarget(final Arrow sourceArrow) {
    ArrowTarget2ArrowTarget result = new ArrowTarget2ArrowTarget(sourceArrow);
    if (traces_ArrowTarget2ArrowTarget==null) traces_ArrowTarget2ArrowTarget = new java.util.HashMap<ArrowTarget2ArrowTarget,ArrowTarget2ArrowTarget>();
    if (traces_ArrowTarget2ArrowTarget.containsKey(result)) {
    	result = traces_ArrowTarget2ArrowTarget.get(result);
    } else {
    	traces_ArrowTarget2ArrowTarget.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_ArrowTarget2ArrowTarget.put(result,result);
    	
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
  
  public static List<String> top_relation_ArrowTarget2ArrowTarget_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<ModelElementName2ModelElementName,ModelElementName2ModelElementName> traces_ModelElementName2ModelElementName;
  
  public ModelElementName2ModelElementName top_relation_ModelElementName2ModelElementName(final ModelElement sourceModelElement) {
    ModelElementName2ModelElementName result = new ModelElementName2ModelElementName(sourceModelElement);
    if (traces_ModelElementName2ModelElementName==null) traces_ModelElementName2ModelElementName = new java.util.HashMap<ModelElementName2ModelElementName,ModelElementName2ModelElementName>();
    if (traces_ModelElementName2ModelElementName.containsKey(result)) {
    	result = traces_ModelElementName2ModelElementName.get(result);
    } else {
    	traces_ModelElementName2ModelElementName.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_ModelElementName2ModelElementName.put(result,result);
    	
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
  
  public static List<String> top_relation_ModelElementName2ModelElementName_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<MapCircle,MapCircle> traces_MapCircle;
  
  public MapCircle top_relation_MapCircle(final Circle s) {
    MapCircle result = new MapCircle(s);
    if (traces_MapCircle==null) traces_MapCircle = new java.util.HashMap<MapCircle,MapCircle>();
    if (traces_MapCircle.containsKey(result)) {
    	result = traces_MapCircle.get(result);
    } else {
    	traces_MapCircle.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapCircle.put(result,result);
    	
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
  
  public static List<String> top_relation_MapCircle_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<markerForOutgoingArrows,markerForOutgoingArrows> traces_markerForOutgoingArrows;
  
  public markerForOutgoingArrows push_relation_markerForOutgoingArrows(final Circle s, final Circle t) {
    markerForOutgoingArrows result = new markerForOutgoingArrows(s);
    if (traces_markerForOutgoingArrows==null) traces_markerForOutgoingArrows = new java.util.HashMap<markerForOutgoingArrows,markerForOutgoingArrows>();
    if (traces_markerForOutgoingArrows.containsKey(result)) {
    	result = traces_markerForOutgoingArrows.get(result);
    } else {
    	traces_markerForOutgoingArrows.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_markerForOutgoingArrows.put(result,result);
    	
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
  
  public markerForOutgoingArrows relation_markerForOutgoingArrows(final Circle s) {
    markerForOutgoingArrows result = new markerForOutgoingArrows(s);
    if (traces_markerForOutgoingArrows==null) traces_markerForOutgoingArrows = new java.util.HashMap<markerForOutgoingArrows,markerForOutgoingArrows>();
    if (traces_markerForOutgoingArrows.containsKey(result)) {
    	result = traces_markerForOutgoingArrows.get(result);
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
  
  public HashMap<markerForIncomingArrows,markerForIncomingArrows> traces_markerForIncomingArrows;
  
  public markerForIncomingArrows push_relation_markerForIncomingArrows(final Circle s, final Square t) {
    markerForIncomingArrows result = new markerForIncomingArrows(s);
    if (traces_markerForIncomingArrows==null) traces_markerForIncomingArrows = new java.util.HashMap<markerForIncomingArrows,markerForIncomingArrows>();
    if (traces_markerForIncomingArrows.containsKey(result)) {
    	result = traces_markerForIncomingArrows.get(result);
    } else {
    	traces_markerForIncomingArrows.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_markerForIncomingArrows.put(result,result);
    	
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
  
  public markerForIncomingArrows relation_markerForIncomingArrows(final Circle s) {
    markerForIncomingArrows result = new markerForIncomingArrows(s);
    if (traces_markerForIncomingArrows==null) traces_markerForIncomingArrows = new java.util.HashMap<markerForIncomingArrows,markerForIncomingArrows>();
    if (traces_markerForIncomingArrows.containsKey(result)) {
    	result = traces_markerForIncomingArrows.get(result);
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
  
  public HashMap<MapArrow,MapArrow> traces_MapArrow;
  
  public MapArrow top_relation_MapArrow(final Arrow s) {
    MapArrow result = new MapArrow(s);
    if (traces_MapArrow==null) traces_MapArrow = new java.util.HashMap<MapArrow,MapArrow>();
    if (traces_MapArrow.containsKey(result)) {
    	result = traces_MapArrow.get(result);
    } else {
    	traces_MapArrow.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapArrow.put(result,result);
    	
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
  
  public static List<String> top_relation_MapArrow_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<Source2Target,Source2Target> traces_Source2Target;
  
  public Source2Target push_relation_Source2Target(final ModelElement s, final ModelElement t) {
    Source2Target result = new Source2Target(s);
    if (traces_Source2Target==null) traces_Source2Target = new java.util.HashMap<Source2Target,Source2Target>();
    if (traces_Source2Target.containsKey(result)) {
    	result = traces_Source2Target.get(result);
    } else {
    	traces_Source2Target.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Source2Target.put(result,result);
    	
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
  
  public Source2Target relation_Source2Target(final ModelElement s) {
    Source2Target result = new Source2Target(s);
    if (traces_Source2Target==null) traces_Source2Target = new java.util.HashMap<Source2Target,Source2Target>();
    if (traces_Source2Target.containsKey(result)) {
    	result = traces_Source2Target.get(result);
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
  
  public HashMap<MapRootBlock,MapRootBlock> traces_MapRootBlock;
  
  public MapRootBlock top_relation_MapRootBlock(final RootBlock s) {
    MapRootBlock result = new MapRootBlock(s);
    if (traces_MapRootBlock==null) traces_MapRootBlock = new java.util.HashMap<MapRootBlock,MapRootBlock>();
    if (traces_MapRootBlock.containsKey(result)) {
    	result = traces_MapRootBlock.get(result);
    } else {
    	traces_MapRootBlock.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapRootBlock.put(result,result);
    	
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
  
  public static List<String> top_relation_MapRootBlock_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<MarkRootBlock,MarkRootBlock> traces_MarkRootBlock;
  
  public MarkRootBlock push_relation_MarkRootBlock(final RootBlock root) {
    MarkRootBlock result = new MarkRootBlock();
    if (traces_MarkRootBlock==null) traces_MarkRootBlock = new java.util.HashMap<MarkRootBlock,MarkRootBlock>();
    if (traces_MarkRootBlock.containsKey(result)) {
    	result = traces_MarkRootBlock.get(result);
    } else {
    	traces_MarkRootBlock.put(result,null);
    	result.root = root;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MarkRootBlock.put(result,result);
    	
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
  
  public MarkRootBlock relation_MarkRootBlock() {
    MarkRootBlock result = new MarkRootBlock();
    if (traces_MarkRootBlock==null) traces_MarkRootBlock = new java.util.HashMap<MarkRootBlock,MarkRootBlock>();
    if (traces_MarkRootBlock.containsKey(result)) {
    	result = traces_MarkRootBlock.get(result);
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
  
  public List<String> topOrder = java.util.Arrays.asList( "ArrowSource2ArrowSource", "ArrowTarget2ArrowTarget", "ModelElementName2ModelElementName", "MapCircle", "MapArrow", "MapRootBlock" );
  
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
