package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.ModelElement;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;

@SuppressWarnings("all")
public class Source2Target {
  private Transformation trafo;
  
  private int hash;
  
  public Source2Target(final ModelElement s) {
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
    if (!(obj instanceof Source2Target)) return false;
    Source2Target other = (Source2Target) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public ModelElement t;
  
  public final ModelElement s;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // t : ModelElement {..}
    if (t==null) t = transformation.create(Shapes.ModelElement.class);
    return true;
  }
}
