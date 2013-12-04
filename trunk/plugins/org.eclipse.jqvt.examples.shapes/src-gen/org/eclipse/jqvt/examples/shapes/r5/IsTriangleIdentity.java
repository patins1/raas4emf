package org.eclipse.jqvt.examples.shapes.r5;

import Shapes.Triangle;
import org.eclipse.jqvt.examples.shapes.r5.Transformation;

@SuppressWarnings("all")
public class IsTriangleIdentity {
  private Transformation trafo;
  
  private int hash;
  
  public IsTriangleIdentity(final Triangle s1) {
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
    if (!(obj instanceof IsTriangleIdentity)) return false;
    IsTriangleIdentity other = (IsTriangleIdentity) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    return true;
  }
  
  public final Triangle s1;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    return true;
  }
}
