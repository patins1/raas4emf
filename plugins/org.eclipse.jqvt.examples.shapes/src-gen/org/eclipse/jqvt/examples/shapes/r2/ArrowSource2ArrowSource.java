package org.eclipse.jqvt.examples.shapes.r2;

import Shapes.Arrow;
import Shapes.Shape;
import org.eclipse.jqvt.examples.shapes.r2.Source2Target;
import org.eclipse.jqvt.examples.shapes.r2.Transformation;

@SuppressWarnings("all")
public class ArrowSource2ArrowSource {
  private Transformation trafo;
  
  private int hash;
  
  public ArrowSource2ArrowSource(final Arrow sourceArrow) {
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
    if (!(obj instanceof ArrowSource2ArrowSource)) return false;
    ArrowSource2ArrowSource other = (ArrowSource2ArrowSource) obj;
    if (sourceArrow != null ? !sourceArrow.equals(other.sourceArrow) :  other.sourceArrow == null) return false;
    return true;
  }
  
  public Arrow targetArrow;
  
  public final Arrow sourceArrow;
  
  public Shape sourceArrowSource;
  
  public Shape targetArrowSource;
  
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
    if (this.sourceArrowSource != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceArrowSource)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      targetArrowSource = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // source = sourceArrowSource : Shape {..}
    if (sourceArrow.getSource() == null) {trafo.logFailure(9);
    return false;
    }trafo.logSuccess(9);
    sourceArrowSource =  sourceArrow.getSource();
    // Source2Target(sourceArrow, targetArrow)
    if (!evaluateClause4()) {trafo.logFailure(19);
    return false;
    }trafo.logSuccess(19);
    // Source2Target(sourceArrowSource, targetArrowSource)
    if (!evaluateClause5()) {trafo.logFailure(20);
    return false;
    }trafo.logSuccess(20);
    // source = targetArrowSource : Shape {..}
    targetArrow.setSource(targetArrowSource);
    return true;
  }
}
