package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.Circle;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;

@SuppressWarnings("all")
public class markerForOutgoingArrows {
  private Transformation trafo;
  
  private int hash;
  
  public markerForOutgoingArrows(final Circle s) {
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
    if (!(obj instanceof markerForOutgoingArrows)) return false;
    markerForOutgoingArrows other = (markerForOutgoingArrows) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Circle t;
  
  public final Circle s;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // t : Circle {..}
    if (t==null) t = transformation.create(Shapes.Circle.class);
    return true;
  }
}
