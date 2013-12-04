package org.eclipse.jqvt.examples.shapes.r9;

import Shapes.Square;
import org.eclipse.jqvt.examples.shapes.r9.Transformation;

@SuppressWarnings("all")
public class MapSquare {
  private Transformation trafo;
  
  private int hash;
  
  public MapSquare(final Square s) {
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
    if (!(obj instanceof MapSquare)) return false;
    MapSquare other = (MapSquare) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Square t;
  
  public final Square s;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // t : Square {..}
    t = transformation.create(Shapes.Square.class);
    return true;
  }
}
