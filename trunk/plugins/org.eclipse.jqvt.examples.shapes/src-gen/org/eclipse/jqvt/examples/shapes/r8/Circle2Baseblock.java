package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Block;
import Shapes.Circle;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class Circle2Baseblock {
  private Transformation trafo;
  
  private int hash;
  
  public Circle2Baseblock(final Circle s) {
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
    if (!(obj instanceof Circle2Baseblock)) return false;
    Circle2Baseblock other = (Circle2Baseblock) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Block t;
  
  public final Circle s;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // t : Block {..}
    if (t==null) t = transformation.create(Shapes.Block.class);
    return true;
  }
}
