package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class CircleWithSeveralOutgoingArrows2Block {
  private Transformation trafo;
  
  private int hash;
  
  public CircleWithSeveralOutgoingArrows2Block(final Circle s) {
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
    if (!(obj instanceof CircleWithSeveralOutgoingArrows2Block)) return false;
    CircleWithSeveralOutgoingArrows2Block other = (CircleWithSeveralOutgoingArrows2Block) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public final Circle s;
  
  public String n;
  
  public Block block;
  
  public Block blockBlock;
  
  public boolean evaluateClause2() {
    EList<Arrow> _outArrow = this.s.getOutArrow();
    int _size = _outArrow.size();
    boolean _greaterEqualsThan = (_size >= 2);
    return _greaterEqualsThan;
  }
  
  public boolean evaluateClause4() {
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
  
  public void evaluateClause6() {
    boolean _Circle2block = false;
    Circle2block _Circle2block_tuple;
    if (this.s != null && 
        (_Circle2block_tuple = trafo.push_relation_Circle2block(this.s, null)) != null)
    {
      block =  _Circle2block_tuple.t;
      _Circle2block = true;
    }
  }
  
  public void evaluateClause10() {
    String _name = this.s.getName();
    String _plus = ("CircleWithSeveral: " + _name);
    String _name_1 = this.block.getName();
    String _plus_1 = (_plus + _name_1);
    String _name_2 = this.blockBlock.getName();
    String _plus_2 = (_plus_1 + _name_2);
    trafo._debug(_plus_2);
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[6]->Relation'CircleWithSeveralOutgoingArrows2Block'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(95);
    return false;
    }trafo.logSuccess(95);
    // name = n
    n =  s.getName();
    // Circle2Baseblock(s,blockBlock)
    if (!evaluateClause4()) {trafo.logFailure(96);
    return false;
    }trafo.logSuccess(96);
    // Circle2block(s,block)
    evaluateClause6();
    // name = n
    block.setName(n);
    // block = blockBlock : Block {..}
    block.setBlock(blockBlock);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[6]->Relation'CircleWithSeveralOutgoingArrows2Block'.where[0]->XFeatureCall.featureCallArguments[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause10();
    return true;
  }
}
