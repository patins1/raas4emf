package org.eclipse.jqvt.examples.shapes.r12;

import Shapes.Arrow;
import org.eclipse.jqvt.examples.shapes.r12.Transformation;

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
  
  public final Arrow sourceArrow;
  
  public String aname;
  
  public boolean evaluateClause2() {
    boolean _MyQuery = trafo.MyQuery(this.sourceArrow);
    return _MyQuery;
  }
  
  public void evaluateClause3() {
    this.aname = "Asf";
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // MyQuery(sourceArrow)
    if (!evaluateClause2()) {trafo.logFailure(22);
    return false;
    }trafo.logSuccess(22);
    // aname = "Asf"
    evaluateClause3();
    return true;
  }
}
