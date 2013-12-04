package org.eclipse.jqvt.examples.shapes.r11;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.ModelElement;
import Shapes.RootBlock;
import Shapes.Square;
import Shapes.Triangle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.jqvt.examples.shapes.r11.ArrowSource2ArrowSource;
import org.eclipse.jqvt.examples.shapes.r11.ArrowTarget2ArrowTarget;
import org.eclipse.jqvt.examples.shapes.r11.EqualityRelation;
import org.eclipse.jqvt.examples.shapes.r11.ExistsAlsoInOtherModel;
import org.eclipse.jqvt.examples.shapes.r11.MapArrow;
import org.eclipse.jqvt.examples.shapes.r11.MapBlock;
import org.eclipse.jqvt.examples.shapes.r11.MapCircle;
import org.eclipse.jqvt.examples.shapes.r11.MapRootBlock;
import org.eclipse.jqvt.examples.shapes.r11.MapSquare;
import org.eclipse.jqvt.examples.shapes.r11.MapTriangle;
import org.eclipse.jqvt.examples.shapes.r11.ModelElementName2ModelElementName;
import org.eclipse.jqvt.examples.shapes.r11.ModelElementblock2ModelElementblock;
import org.eclipse.jqvt.examples.shapes.r11.Source2Target;

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
  
  public boolean ModelElementblock2ModelElementblock(final Object sourceModelElement, final Object targetModelElement) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Source2Target(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapRootBlock(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapBlock(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapCircle(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapTriangle(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapSquare(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean MapArrow(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean EqualityRelation(final Object s, final Object s2) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean ExistsAlsoInOtherModel(final Object s) {
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
  
  public HashMap<ModelElementblock2ModelElementblock,ModelElementblock2ModelElementblock> traces_ModelElementblock2ModelElementblock;
  
  public ModelElementblock2ModelElementblock top_relation_ModelElementblock2ModelElementblock(final ModelElement sourceModelElement) {
    ModelElementblock2ModelElementblock result = new ModelElementblock2ModelElementblock(sourceModelElement);
    if (traces_ModelElementblock2ModelElementblock==null) traces_ModelElementblock2ModelElementblock = new java.util.HashMap<ModelElementblock2ModelElementblock,ModelElementblock2ModelElementblock>();
    if (traces_ModelElementblock2ModelElementblock.containsKey(result)) {
    	result = traces_ModelElementblock2ModelElementblock.get(result);
    } else {
    	traces_ModelElementblock2ModelElementblock.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_ModelElementblock2ModelElementblock.put(result,result);
    	
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
  
  public static List<String> top_relation_ModelElementblock2ModelElementblock_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<Source2Target,Source2Target> traces_Source2Target;
  
  public Source2Target top_relation_Source2Target(final ModelElement s) {
    Source2Target result = new Source2Target(s);
    if (traces_Source2Target==null) traces_Source2Target = new java.util.HashMap<Source2Target,Source2Target>();
    if (traces_Source2Target.containsKey(result)) {
    	result = traces_Source2Target.get(result);
    } else {
    	traces_Source2Target.put(result,null);
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
  
  public static List<String> top_relation_Source2Target_directions = java.util.Arrays.asList("source", "target");
  
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
  
  public HashMap<MapBlock,MapBlock> traces_MapBlock;
  
  public MapBlock top_relation_MapBlock(final Block s) {
    MapBlock result = new MapBlock(s);
    if (traces_MapBlock==null) traces_MapBlock = new java.util.HashMap<MapBlock,MapBlock>();
    if (traces_MapBlock.containsKey(result)) {
    	result = traces_MapBlock.get(result);
    } else {
    	traces_MapBlock.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapBlock.put(result,result);
    	
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
  
  public static List<String> top_relation_MapBlock_directions = java.util.Arrays.asList("source", "target");
  
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
  
  public HashMap<MapTriangle,MapTriangle> traces_MapTriangle;
  
  public MapTriangle top_relation_MapTriangle(final Triangle s) {
    MapTriangle result = new MapTriangle(s);
    if (traces_MapTriangle==null) traces_MapTriangle = new java.util.HashMap<MapTriangle,MapTriangle>();
    if (traces_MapTriangle.containsKey(result)) {
    	result = traces_MapTriangle.get(result);
    } else {
    	traces_MapTriangle.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapTriangle.put(result,result);
    	
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
  
  public static List<String> top_relation_MapTriangle_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<MapSquare,MapSquare> traces_MapSquare;
  
  public MapSquare top_relation_MapSquare(final Square s) {
    MapSquare result = new MapSquare(s);
    if (traces_MapSquare==null) traces_MapSquare = new java.util.HashMap<MapSquare,MapSquare>();
    if (traces_MapSquare.containsKey(result)) {
    	result = traces_MapSquare.get(result);
    } else {
    	traces_MapSquare.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_MapSquare.put(result,result);
    	
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
  
  public static List<String> top_relation_MapSquare_directions = java.util.Arrays.asList("source", "target");
  
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
  
  public HashMap<EqualityRelation,EqualityRelation> traces_EqualityRelation;
  
  public EqualityRelation top_relation_EqualityRelation(final ModelElement s, final ModelElement s2) {
    EqualityRelation result = new EqualityRelation(s, s2);
    if (traces_EqualityRelation==null) traces_EqualityRelation = new java.util.HashMap<EqualityRelation,EqualityRelation>();
    if (traces_EqualityRelation.containsKey(result)) {
    	result = traces_EqualityRelation.get(result);
    } else {
    	traces_EqualityRelation.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_EqualityRelation.put(result,result);
    	
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
  
  public static List<String> top_relation_EqualityRelation_directions = java.util.Arrays.asList("source", "source2");
  
  public HashMap<ExistsAlsoInOtherModel,ExistsAlsoInOtherModel> traces_ExistsAlsoInOtherModel;
  
  public ExistsAlsoInOtherModel push_relation_ExistsAlsoInOtherModel(final ModelElement s) {
    ExistsAlsoInOtherModel result = new ExistsAlsoInOtherModel(s);
    if (traces_ExistsAlsoInOtherModel==null) traces_ExistsAlsoInOtherModel = new java.util.HashMap<ExistsAlsoInOtherModel,ExistsAlsoInOtherModel>();
    if (traces_ExistsAlsoInOtherModel.containsKey(result)) {
    	result = traces_ExistsAlsoInOtherModel.get(result);
    } else {
    	traces_ExistsAlsoInOtherModel.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_ExistsAlsoInOtherModel.put(result,result);
    	
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
  
  public ExistsAlsoInOtherModel relation_ExistsAlsoInOtherModel(final ModelElement s) {
    ExistsAlsoInOtherModel result = new ExistsAlsoInOtherModel(s);
    if (traces_ExistsAlsoInOtherModel==null) traces_ExistsAlsoInOtherModel = new java.util.HashMap<ExistsAlsoInOtherModel,ExistsAlsoInOtherModel>();
    if (traces_ExistsAlsoInOtherModel.containsKey(result)) {
    	result = traces_ExistsAlsoInOtherModel.get(result);
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
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "source2", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "ArrowSource2ArrowSource", "ArrowTarget2ArrowTarget", "ModelElementName2ModelElementName", "ModelElementblock2ModelElementblock", "Source2Target", "MapRootBlock", "MapBlock", "MapCircle", "MapTriangle", "MapSquare", "MapArrow", "EqualityRelation" );
  
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
