package org.eclipse.jqvt.examples.shapes.r7;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.Square;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r7.Source2Target;
import org.eclipse.jqvt.examples.shapes.r7.Transformation;

@SuppressWarnings("all")
public class createSquareForInitialArrow {
  private Transformation trafo;
  
  private int hash;
  
  public createSquareForInitialArrow(final Circle s) {
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
    if (!(obj instanceof createSquareForInitialArrow)) return false;
    createSquareForInitialArrow other = (createSquareForInitialArrow) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Block targetblock;
  
  public Square t;
  
  public Block sourceblock;
  
  public final Circle s;
  
  public boolean evaluateClause3() {
    EList<Arrow> _inArrow = this.s.getInArrow();
    boolean _isEmpty = _inArrow.isEmpty();
    return _isEmpty;
  }
  
  public boolean evaluateClause5() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceblock != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceblock)) != null
         && _Source2Target_tuple.t instanceof Block)
    {
      targetblock = (Shapes.Block) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public String evaluateExpression8() {
    return "initial square";
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // s.inArrow.isEmpty()
    if (!evaluateClause3()) {trafo.logFailure(155);
    return false;
    }trafo.logSuccess(155);
    // block = sourceblock : Block {..}
    if (s.getBlock() == null) {trafo.logFailure(144);
    return false;
    }trafo.logSuccess(144);
    sourceblock =  s.getBlock();
    // Source2Target(sourceblock, targetblock)
    if (!evaluateClause5()) {trafo.logFailure(156);
    return false;
    }trafo.logSuccess(156);
    // t : Square {..}
    if (t==null) t = transformation.create(Shapes.Square.class);
    // name = 'initial square'
    t.setName(evaluateExpression8());
    // block = targetblock : Block {..}
    t.setBlock(targetblock);
    return true;
  }
}
