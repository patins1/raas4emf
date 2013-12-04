package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.Shape;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class HasNoJoinPredecessor {
  private Transformation trafo;
  
  private int hash;
  
  public HasNoJoinPredecessor(final Circle s1) {
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
    if (!(obj instanceof HasNoJoinPredecessor)) return false;
    HasNoJoinPredecessor other = (HasNoJoinPredecessor) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    return true;
  }
  
  public Shape predecessor;
  
  public final Circle s1;
  
  public Arrow arrow;
  
  public Block blockBlock;
  
  public boolean evaluateClause4() {
    EList<Arrow> _inArrow = this.s1.getInArrow();
    int _size = _inArrow.size();
    boolean _lessEqualsThan = (_size <= 1);
    return _lessEqualsThan;
  }
  
  public boolean evaluateClause7() {
    EList<Arrow> _inArrow = this.predecessor.getInArrow();
    int _size = _inArrow.size();
    boolean _lessEqualsThan = (_size <= 1);
    return _lessEqualsThan;
  }
  
  public boolean evaluateClause8() {
    boolean _Circle2block = false;
    Circle2block _Circle2block_tuple;
    if (this.predecessor instanceof Circle && 
        (_Circle2block_tuple = trafo.relation_Circle2block((Circle)this.predecessor)) != null)
    {
      blockBlock =  _Circle2block_tuple.t;
      _Circle2block = true;
    }
    return _Circle2block;
  }
  
  public void evaluateClause9() {
    String _name = this.s1.getName();
    String _plus = ("HasNoJoinPredecessor:" + _name);
    String _plus_1 = (_plus + " by ");
    String _name_1 = this.predecessor.getName();
    String _plus_2 = (_plus_1 + _name_1);
    trafo._debug(_plus_2);
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
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[11]->Relation'HasNoJoinPredecessor'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause4()) {trafo.logFailure(217);
    return false;
    }trafo.logSuccess(217);
    // inArrow = arrow : Arrow {..}
    boolean result = false;
    for (Shapes.Arrow __arrow : s1.getInArrow()) {
    arrow = __arrow;
    // source = predecessor : Shape {..}
    if (arrow.getSource() == null) {trafo.logFailure(212);
    continue;
    }trafo.logSuccess(212);
    predecessor =  arrow.getSource();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[11]->Relation'HasNoJoinPredecessor'.when[1]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause7()) {trafo.logFailure(219);
    continue;
    }trafo.logSuccess(219);
    // --!IsJoinNode(predecessor); ---
    // 			Circle2block(predecessor,blockBlock)
    if (!evaluateClause8()) {trafo.logFailure(221);
    continue;
    }trafo.logSuccess(221);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[11]->Relation'HasNoJoinPredecessor'.where[0]->XFeatureCall.featureCallArguments[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause9();
    // Circle2Baseblock(s1,blockBlock)
    evaluateClause10();
    result=true;
    }
    return result;
  }
}
