package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class CircleWithOneOutgoingArrow2Block {
  private Transformation trafo;
  
  private int hash;
  
  public CircleWithOneOutgoingArrow2Block(final Circle s) {
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
    if (!(obj instanceof CircleWithOneOutgoingArrow2Block)) return false;
    CircleWithOneOutgoingArrow2Block other = (CircleWithOneOutgoingArrow2Block) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public final Circle s;
  
  public Block blockBlock;
  
  public boolean evaluateClause2() {
    EList<Arrow> _outArrow = this.s.getOutArrow();
    int _size = _outArrow.size();
    boolean _lessThan = (_size < 2);
    return _lessThan;
  }
  
  public boolean evaluateClause3() {
    boolean _Circle2Baseblock = false;
    Circle2Baseblock _Circle2Baseblock_tuple;
    if (this.s != null && 
        (_Circle2Baseblock_tuple = trafo.relation_Circle2Baseblock(this.s)) != null)
    {
      blockBlock =  _Circle2Baseblock_tuple.t;
      _Circle2Baseblock = true;
    }
    return _Circle2Baseblock;
  }
  
  public void evaluateClause5() {
    String _name = this.s.getName();
    String _plus = ("CircleWithOne..." + _name);
    String _name_1 = this.blockBlock.getName();
    String _plus_1 = (_plus + _name_1);
    trafo._debug(_plus_1);
  }
  
  public void evaluateClause6() {
    boolean _Circle2block = false;
    Circle2block _Circle2block_tuple;
    if (this.s != null && 
        (_Circle2block_tuple = trafo.push_relation_Circle2block(this.s, this.blockBlock)) != null
         && (this.blockBlock==null || this.blockBlock.equals(_Circle2block_tuple.t)))
    {
      _Circle2block = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[7]->Relation'CircleWithOneOutgoingArrow2Block'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(117);
    return false;
    }trafo.logSuccess(117);
    // --!CircleWithSeveralOutgoingArrows2Block(s,blockBlock);
    // 			Circle2Baseblock(s,blockBlock)
    if (!evaluateClause3()) {trafo.logFailure(119);
    return false;
    }trafo.logSuccess(119);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[7]->Relation'CircleWithOneOutgoingArrow2Block'.where[0]->XFeatureCall.featureCallArguments[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause5();
    // Circle2block(s,blockBlock)
    evaluateClause6();
    return true;
  }
}
