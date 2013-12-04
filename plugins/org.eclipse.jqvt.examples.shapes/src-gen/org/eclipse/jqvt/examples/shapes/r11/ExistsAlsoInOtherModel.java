package org.eclipse.jqvt.examples.shapes.r11;

import Shapes.ModelElement;
import org.eclipse.jqvt.examples.shapes.r11.Transformation;

@SuppressWarnings("all")
public class ExistsAlsoInOtherModel {
  private Transformation trafo;
  
  private int hash;
  
  public ExistsAlsoInOtherModel(final ModelElement s) {
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
    if (!(obj instanceof ExistsAlsoInOtherModel)) return false;
    ExistsAlsoInOtherModel other = (ExistsAlsoInOtherModel) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public final ModelElement s;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    return true;
  }
}
