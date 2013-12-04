package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Circle;
import Shapes.RootBlock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class IsStartingNode {
  private Transformation trafo;
  
  private int hash;
  
  public IsStartingNode(final Circle s1) {
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
    if (!(obj instanceof IsStartingNode)) return false;
    IsStartingNode other = (IsStartingNode) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    return true;
  }
  
  public final Circle s1;
  
  public RootBlock blockBlock;
  
  public boolean evaluateClause2() {
    EList<Arrow> _inArrow = this.s1.getInArrow();
    int _size = _inArrow.size();
    boolean _equals = (_size == 0);
    return _equals;
  }
  
  public String evaluateExpression4() {
    return "top level";
  }
  
  public void evaluateClause5() {
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
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[12]->Relation'IsStartingNode'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(243);
    return false;
    }trafo.logSuccess(243);
    // blockBlock : RootBlock {..}
    blockBlock = transformation.create(Shapes.RootBlock.class);
    // name = 'top level'
    blockBlock.setName(evaluateExpression4());
    // Circle2Baseblock(s1,blockBlock)
    evaluateClause5();
    return true;
  }
}
