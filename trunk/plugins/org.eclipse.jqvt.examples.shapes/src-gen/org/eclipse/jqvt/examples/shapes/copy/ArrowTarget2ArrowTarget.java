package org.eclipse.jqvt.examples.shapes.copy;

import Shapes.Arrow;
import Shapes.Shape;
import org.eclipse.jqvt.examples.shapes.copy.Source2Target;
import org.eclipse.jqvt.examples.shapes.copy.Transformation;

@SuppressWarnings("all")
public class ArrowTarget2ArrowTarget {
  private Transformation trafo;
  
  private int hash;
  
  public ArrowTarget2ArrowTarget(final Arrow sourceArrow) {
    this.sourceArrow=sourceArrow;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + sourceArrow.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ArrowTarget2ArrowTarget)) return false;
    ArrowTarget2ArrowTarget other = (ArrowTarget2ArrowTarget) obj;
    if (sourceArrow != null ? !sourceArrow.equals(other.sourceArrow) :  other.sourceArrow == null) return false;
    return true;
  }
  
  public Arrow targetArrow;
  
  public Shape targetArrowTarget;
  
  public Shape sourceArrowTarget;
  
  public final Arrow sourceArrow;
  
  public boolean evaluateClause4() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceArrow != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceArrow)) != null
         && _Source2Target_tuple.t instanceof Arrow)
    {
      targetArrow = (Shapes.Arrow) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean evaluateClause5() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceArrowTarget != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceArrowTarget)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      targetArrowTarget = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // target = sourceArrowTarget : Shape {..}
    if (sourceArrow.getTarget() == null) {trafo.logFailure(30);
    return false;
    }trafo.logSuccess(30);
    sourceArrowTarget =  sourceArrow.getTarget();
    // Source2Target(sourceArrow, targetArrow)
    if (!evaluateClause4()) {trafo.logFailure(40);
    return false;
    }trafo.logSuccess(40);
    // Source2Target(sourceArrowTarget, targetArrowTarget)
    if (!evaluateClause5()) {trafo.logFailure(41);
    return false;
    }trafo.logSuccess(41);
    // target = targetArrowTarget : Shape {..}
    targetArrow.setTarget(targetArrowTarget);
    return true;
  }
}
