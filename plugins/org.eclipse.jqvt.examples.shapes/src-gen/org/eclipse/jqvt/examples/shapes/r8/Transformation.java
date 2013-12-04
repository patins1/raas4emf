package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Block;
import Shapes.Circle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Circle;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.CircleWithOneOutgoingArrow2Block;
import org.eclipse.jqvt.examples.shapes.r8.CircleWithSeveralOutgoingArrows2Block;
import org.eclipse.jqvt.examples.shapes.r8.HasJoinPredecessor;
import org.eclipse.jqvt.examples.shapes.r8.HasNoJoinPredecessor;
import org.eclipse.jqvt.examples.shapes.r8.HasPath;
import org.eclipse.jqvt.examples.shapes.r8.IsForkNode;
import org.eclipse.jqvt.examples.shapes.r8.IsJoinAndFork;
import org.eclipse.jqvt.examples.shapes.r8.IsJoinNode;
import org.eclipse.jqvt.examples.shapes.r8.IsStartingNode;
import org.eclipse.jqvt.examples.shapes.r8.Join2Fork;

@SuppressWarnings("all")
public abstract class Transformation {
  public boolean Circle2block(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Join2Fork(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Circle2Baseblock(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean IsJoinNode(final Object s) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean IsForkNode(final Object s) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Circle2Circle(final Object s, final Object t) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean CircleWithSeveralOutgoingArrows2Block(final Object s, final Object block) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean CircleWithOneOutgoingArrow2Block(final Object s, final Object blockBlock) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean HasPath(final Object s1, final Object s2) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean IsJoinAndFork(final Object s1, final Object s2) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean HasJoinPredecessor(final Object s1) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean HasNoJoinPredecessor(final Object s1) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean IsStartingNode(final Object s1, final Object blockBlock) {
    throw new RuntimeException("should never be called");
  }
  
  public String _debug(final String s) {
    String _xblockexpression = null;
    {
      System.out.println(s);
      _xblockexpression = (s);
    }
    return _xblockexpression;
  }
  
  public String _debug(final Block s) {
    return null;
  }
  
  public HashMap<Circle2block,Circle2block> traces_Circle2block;
  
  public Circle2block push_relation_Circle2block(final Circle s, final Block t) {
    Circle2block result = new Circle2block(s);
    if (traces_Circle2block==null) traces_Circle2block = new java.util.HashMap<Circle2block,Circle2block>();
    if (traces_Circle2block.containsKey(result)) {
    	result = traces_Circle2block.get(result);
    } else {
    	traces_Circle2block.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Circle2block.put(result,result);
    	
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
  
  public Circle2block relation_Circle2block(final Circle s) {
    Circle2block result = new Circle2block(s);
    if (traces_Circle2block==null) traces_Circle2block = new java.util.HashMap<Circle2block,Circle2block>();
    if (traces_Circle2block.containsKey(result)) {
    	result = traces_Circle2block.get(result);
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
  
  public HashMap<Join2Fork,Join2Fork> traces_Join2Fork;
  
  public Join2Fork push_relation_Join2Fork(final Circle s, final Circle t) {
    Join2Fork result = new Join2Fork(s);
    if (traces_Join2Fork==null) traces_Join2Fork = new java.util.HashMap<Join2Fork,Join2Fork>();
    if (traces_Join2Fork.containsKey(result)) {
    	result = traces_Join2Fork.get(result);
    } else {
    	traces_Join2Fork.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Join2Fork.put(result,result);
    	
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
  
  public Join2Fork relation_Join2Fork(final Circle s) {
    Join2Fork result = new Join2Fork(s);
    if (traces_Join2Fork==null) traces_Join2Fork = new java.util.HashMap<Join2Fork,Join2Fork>();
    if (traces_Join2Fork.containsKey(result)) {
    	result = traces_Join2Fork.get(result);
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
  
  public HashMap<Circle2Baseblock,Circle2Baseblock> traces_Circle2Baseblock;
  
  public Circle2Baseblock push_relation_Circle2Baseblock(final Circle s, final Block t) {
    Circle2Baseblock result = new Circle2Baseblock(s);
    if (traces_Circle2Baseblock==null) traces_Circle2Baseblock = new java.util.HashMap<Circle2Baseblock,Circle2Baseblock>();
    if (traces_Circle2Baseblock.containsKey(result)) {
    	result = traces_Circle2Baseblock.get(result);
    } else {
    	traces_Circle2Baseblock.put(result,null);
    	result.t = t;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Circle2Baseblock.put(result,result);
    	
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
  
  public Circle2Baseblock relation_Circle2Baseblock(final Circle s) {
    Circle2Baseblock result = new Circle2Baseblock(s);
    if (traces_Circle2Baseblock==null) traces_Circle2Baseblock = new java.util.HashMap<Circle2Baseblock,Circle2Baseblock>();
    if (traces_Circle2Baseblock.containsKey(result)) {
    	result = traces_Circle2Baseblock.get(result);
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
  
  public HashMap<IsJoinNode,IsJoinNode> traces_IsJoinNode;
  
  public IsJoinNode push_relation_IsJoinNode(final Circle s) {
    IsJoinNode result = new IsJoinNode(s);
    if (traces_IsJoinNode==null) traces_IsJoinNode = new java.util.HashMap<IsJoinNode,IsJoinNode>();
    if (traces_IsJoinNode.containsKey(result)) {
    	result = traces_IsJoinNode.get(result);
    } else {
    	traces_IsJoinNode.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_IsJoinNode.put(result,result);
    	
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
  
  public IsJoinNode relation_IsJoinNode(final Circle s) {
    IsJoinNode result = new IsJoinNode(s);
    if (traces_IsJoinNode==null) traces_IsJoinNode = new java.util.HashMap<IsJoinNode,IsJoinNode>();
    if (traces_IsJoinNode.containsKey(result)) {
    	result = traces_IsJoinNode.get(result);
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
  
  public HashMap<IsForkNode,IsForkNode> traces_IsForkNode;
  
  public IsForkNode push_relation_IsForkNode(final Circle s) {
    IsForkNode result = new IsForkNode(s);
    if (traces_IsForkNode==null) traces_IsForkNode = new java.util.HashMap<IsForkNode,IsForkNode>();
    if (traces_IsForkNode.containsKey(result)) {
    	result = traces_IsForkNode.get(result);
    } else {
    	traces_IsForkNode.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_IsForkNode.put(result,result);
    	
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
  
  public IsForkNode relation_IsForkNode(final Circle s) {
    IsForkNode result = new IsForkNode(s);
    if (traces_IsForkNode==null) traces_IsForkNode = new java.util.HashMap<IsForkNode,IsForkNode>();
    if (traces_IsForkNode.containsKey(result)) {
    	result = traces_IsForkNode.get(result);
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
  
  public HashMap<Circle2Circle,Circle2Circle> traces_Circle2Circle;
  
  public Circle2Circle top_relation_Circle2Circle(final Circle s) {
    Circle2Circle result = new Circle2Circle(s);
    if (traces_Circle2Circle==null) traces_Circle2Circle = new java.util.HashMap<Circle2Circle,Circle2Circle>();
    if (traces_Circle2Circle.containsKey(result)) {
    	result = traces_Circle2Circle.get(result);
    } else {
    	traces_Circle2Circle.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Circle2Circle.put(result,result);
    	
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
  
  public static List<String> top_relation_Circle2Circle_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<CircleWithSeveralOutgoingArrows2Block,CircleWithSeveralOutgoingArrows2Block> traces_CircleWithSeveralOutgoingArrows2Block;
  
  public CircleWithSeveralOutgoingArrows2Block top_relation_CircleWithSeveralOutgoingArrows2Block(final Circle s) {
    CircleWithSeveralOutgoingArrows2Block result = new CircleWithSeveralOutgoingArrows2Block(s);
    if (traces_CircleWithSeveralOutgoingArrows2Block==null) traces_CircleWithSeveralOutgoingArrows2Block = new java.util.HashMap<CircleWithSeveralOutgoingArrows2Block,CircleWithSeveralOutgoingArrows2Block>();
    if (traces_CircleWithSeveralOutgoingArrows2Block.containsKey(result)) {
    	result = traces_CircleWithSeveralOutgoingArrows2Block.get(result);
    } else {
    	traces_CircleWithSeveralOutgoingArrows2Block.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_CircleWithSeveralOutgoingArrows2Block.put(result,result);
    	
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
  
  public static List<String> top_relation_CircleWithSeveralOutgoingArrows2Block_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<CircleWithOneOutgoingArrow2Block,CircleWithOneOutgoingArrow2Block> traces_CircleWithOneOutgoingArrow2Block;
  
  public CircleWithOneOutgoingArrow2Block top_relation_CircleWithOneOutgoingArrow2Block(final Circle s) {
    CircleWithOneOutgoingArrow2Block result = new CircleWithOneOutgoingArrow2Block(s);
    if (traces_CircleWithOneOutgoingArrow2Block==null) traces_CircleWithOneOutgoingArrow2Block = new java.util.HashMap<CircleWithOneOutgoingArrow2Block,CircleWithOneOutgoingArrow2Block>();
    if (traces_CircleWithOneOutgoingArrow2Block.containsKey(result)) {
    	result = traces_CircleWithOneOutgoingArrow2Block.get(result);
    } else {
    	traces_CircleWithOneOutgoingArrow2Block.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_CircleWithOneOutgoingArrow2Block.put(result,result);
    	
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
  
  public static List<String> top_relation_CircleWithOneOutgoingArrow2Block_directions = java.util.Arrays.asList("source", "target");
  
  public HashMap<HasPath,HasPath> traces_HasPath;
  
  public HasPath top_relation_HasPath(final Circle s1, final Circle s2) {
    HasPath result = new HasPath(s1, s2);
    if (traces_HasPath==null) traces_HasPath = new java.util.HashMap<HasPath,HasPath>();
    if (traces_HasPath.containsKey(result)) {
    	result = traces_HasPath.get(result);
    } else {
    	traces_HasPath.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HasPath.put(result,result);
    	
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
  
  public static List<String> top_relation_HasPath_directions = java.util.Arrays.asList("source", "source");
  
  public HashMap<IsJoinAndFork,IsJoinAndFork> traces_IsJoinAndFork;
  
  public IsJoinAndFork top_relation_IsJoinAndFork(final Circle s1, final Circle s2) {
    IsJoinAndFork result = new IsJoinAndFork(s1, s2);
    if (traces_IsJoinAndFork==null) traces_IsJoinAndFork = new java.util.HashMap<IsJoinAndFork,IsJoinAndFork>();
    if (traces_IsJoinAndFork.containsKey(result)) {
    	result = traces_IsJoinAndFork.get(result);
    } else {
    	traces_IsJoinAndFork.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_IsJoinAndFork.put(result,result);
    	
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
  
  public static List<String> top_relation_IsJoinAndFork_directions = java.util.Arrays.asList("source", "source");
  
  public HashMap<HasJoinPredecessor,HasJoinPredecessor> traces_HasJoinPredecessor;
  
  public HasJoinPredecessor top_relation_HasJoinPredecessor(final Circle s1) {
    HasJoinPredecessor result = new HasJoinPredecessor(s1);
    if (traces_HasJoinPredecessor==null) traces_HasJoinPredecessor = new java.util.HashMap<HasJoinPredecessor,HasJoinPredecessor>();
    if (traces_HasJoinPredecessor.containsKey(result)) {
    	result = traces_HasJoinPredecessor.get(result);
    } else {
    	traces_HasJoinPredecessor.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HasJoinPredecessor.put(result,result);
    	
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
  
  public static List<String> top_relation_HasJoinPredecessor_directions = java.util.Arrays.asList("source");
  
  public HashMap<HasNoJoinPredecessor,HasNoJoinPredecessor> traces_HasNoJoinPredecessor;
  
  public HasNoJoinPredecessor top_relation_HasNoJoinPredecessor(final Circle s1) {
    HasNoJoinPredecessor result = new HasNoJoinPredecessor(s1);
    if (traces_HasNoJoinPredecessor==null) traces_HasNoJoinPredecessor = new java.util.HashMap<HasNoJoinPredecessor,HasNoJoinPredecessor>();
    if (traces_HasNoJoinPredecessor.containsKey(result)) {
    	result = traces_HasNoJoinPredecessor.get(result);
    } else {
    	traces_HasNoJoinPredecessor.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_HasNoJoinPredecessor.put(result,result);
    	
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
  
  public static List<String> top_relation_HasNoJoinPredecessor_directions = java.util.Arrays.asList("source");
  
  public HashMap<IsStartingNode,IsStartingNode> traces_IsStartingNode;
  
  public IsStartingNode top_relation_IsStartingNode(final Circle s1) {
    IsStartingNode result = new IsStartingNode(s1);
    if (traces_IsStartingNode==null) traces_IsStartingNode = new java.util.HashMap<IsStartingNode,IsStartingNode>();
    if (traces_IsStartingNode.containsKey(result)) {
    	result = traces_IsStartingNode.get(result);
    } else {
    	traces_IsStartingNode.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_IsStartingNode.put(result,result);
    	
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
  
  public static List<String> top_relation_IsStartingNode_directions = java.util.Arrays.asList("source", "target");
  
  public static List<String> global_direction = java.util.Arrays.asList("source", "target");
  
  public List<String> topOrder = java.util.Arrays.asList( "Circle2Circle", "CircleWithSeveralOutgoingArrows2Block", "CircleWithOneOutgoingArrow2Block", "HasPath", "IsJoinAndFork", "HasJoinPredecessor", "HasNoJoinPredecessor", "IsStartingNode" );
  
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
