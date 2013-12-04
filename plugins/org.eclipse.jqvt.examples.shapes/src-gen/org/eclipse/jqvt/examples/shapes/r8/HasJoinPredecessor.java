package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.Shape;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.IsJoinNode;
import org.eclipse.jqvt.examples.shapes.r8.Join2Fork;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class HasJoinPredecessor {
  private Transformation trafo;
  
  private int hash;
  
  public HasJoinPredecessor(final Circle s1) {
    this.s1=s1;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + s1.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof HasJoinPredecessor)) return false;
    HasJoinPredecessor other = (HasJoinPredecessor) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    return true;
  }
  
  public Shape predecessor;
  
  public Shape fork;
  
  public final Circle s1;
  
  public Arrow arrow;
  
  public Block blockBlock;
  
  public boolean evaluateClause4() {
    boolean _IsJoinNode = false;
    IsJoinNode _IsJoinNode_tuple;
    if (this.s1 != null && 
        (_IsJoinNode_tuple = trafo.relation_IsJoinNode(this.s1)) != null)
    {
      _IsJoinNode = true;
    }
    boolean _not = (!_IsJoinNode);
    return _not;
  }
  
  public boolean evaluateClause7() {
    boolean _Join2Fork = false;
    Join2Fork _Join2Fork_tuple;
    if (this.predecessor instanceof Circle && 
        (_Join2Fork_tuple = trafo.relation_Join2Fork((Circle)this.predecessor)) != null)
    {
      fork =  _Join2Fork_tuple.t;
      _Join2Fork = true;
    }
    return _Join2Fork;
  }
  
  public boolean evaluateClause8() {
    boolean _Circle2Baseblock = false;
    Circle2Baseblock _Circle2Baseblock_tuple;
    if (this.fork instanceof Circle && 
        (_Circle2Baseblock_tuple = trafo.relation_Circle2Baseblock((Circle)this.fork)) != null)
    {
      blockBlock =  _Circle2Baseblock_tuple.t;
      _Circle2Baseblock = true;
    }
    return _Circle2Baseblock;
  }
  
  public void evaluateClause9() {
    String _name = this.s1.getName();
    String _plus = ("HasJoinPredecessor:" + _name);
    String _plus_1 = (_plus + " by ");
    String _name_1 = this.fork.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String __debug = trafo._debug(_plus_2);
    /* (!Objects.equal(__debug, "")); */
  }
  
  public void evaluateClause10() {
    boolean _Circle2Baseblock = false;
    Circle2Baseblock _Circle2Baseblock_tuple;
    if (this.s1 != null && 
        (_Circle2Baseblock_tuple = trafo.push_relation_Circle2Baseblock(this.s1, this.blockBlock)) != null
         && (this.blockBlock==null || this.blockBlock.equals(_Circle2Baseblock_tuple.t)))
    {
      _Circle2Baseblock = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // !IsJoinNode(s1)
    if (!evaluateClause4()) {trafo.logFailure(192);
    return false;
    }trafo.logSuccess(192);
    // inArrow = arrow : Arrow {..}
    boolean result = false;
    for (Shapes.Arrow __arrow : s1.getInArrow()) {
    arrow = __arrow;
    // source = predecessor : Shape {..}
    if (arrow.getSource() == null) {trafo.logFailure(186);
    continue;
    }trafo.logSuccess(186);
    predecessor =  arrow.getSource();
    // Join2Fork(predecessor,fork)
    if (!evaluateClause7()) {trafo.logFailure(193);
    continue;
    }trafo.logSuccess(193);
    // Circle2Baseblock(fork,blockBlock)
    if (!evaluateClause8()) {trafo.logFailure(194);
    continue;
    }trafo.logSuccess(194);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[10]->Relation'HasJoinPredecessor'.where[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause9();
    // Circle2Baseblock(s1,blockBlock)
    evaluateClause10();
    result=true;
    }
    return result;
  }
}
