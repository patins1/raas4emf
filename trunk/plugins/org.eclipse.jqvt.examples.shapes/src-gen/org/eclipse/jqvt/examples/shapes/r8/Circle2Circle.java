package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Block;
import Shapes.Circle;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.IsForkNode;
import org.eclipse.jqvt.examples.shapes.r8.IsJoinNode;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class Circle2Circle {
  private Transformation trafo;
  
  private int hash;
  
  public Circle2Circle(final Circle s) {
    this.s=s;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + s.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Circle2Circle)) return false;
    Circle2Circle other = (Circle2Circle) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Circle t;
  
  public final Circle s;
  
  public String n;
  
  public Block block;
  
  public boolean evaluateClause2() {
    boolean _and = false;
    boolean _IsForkNode = false;
    IsForkNode _IsForkNode_tuple;
    if (this.s != null && 
        (_IsForkNode_tuple = trafo.relation_IsForkNode(this.s)) != null)
    {
      _IsForkNode = true;
    }
    boolean _not = (!_IsForkNode);
    if (!_not) {
      _and = false;
    } else {
      boolean _IsJoinNode = false;
      IsJoinNode _IsJoinNode_tuple;
      if (this.s != null && 
          (_IsJoinNode_tuple = trafo.relation_IsJoinNode(this.s)) != null)
      {
        _IsJoinNode = true;
      }
      boolean _not_1 = (!_IsJoinNode);
      _and = (_not && _not_1);
    }
    return _and;
  }
  
  public boolean evaluateClause4() {
    boolean _Circle2block = false;
    Circle2block _Circle2block_tuple;
    if (this.s != null && 
        (_Circle2block_tuple = trafo.relation_Circle2block(this.s)) != null)
    {
      block =  _Circle2block_tuple.t;
      _Circle2block = true;
    }
    return _Circle2block;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[5]->Relation'Circle2Circle'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(74);
    return false;
    }trafo.logSuccess(74);
    // name = n
    n =  s.getName();
    // ---
    // 			Circle2block(s,block)
    if (!evaluateClause4()) {trafo.logFailure(75);
    return false;
    }trafo.logSuccess(75);
    // t : Circle {..}
    t = transformation.create(Shapes.Circle.class);
    // name = n
    t.setName(n);
    // block = block : Block {..}
    t.setBlock(block);
    return true;
  }
}
