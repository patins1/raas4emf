package org.eclipse.jqvt.examples.shapes.r11;

import Shapes.ModelElement;
import org.eclipse.jqvt.examples.shapes.r11.ExistsAlsoInOtherModel;
import org.eclipse.jqvt.examples.shapes.r11.Transformation;

@SuppressWarnings("all")
public class EqualityRelation {
  private Transformation trafo;
  
  private int hash;
  
  public EqualityRelation(final ModelElement s, final ModelElement s2) {
    this.s=s;
    this.s2=s2;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + s.hashCode();
    result = prime * result + s2.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof EqualityRelation)) return false;
    EqualityRelation other = (EqualityRelation) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    if (s2 != null ? !s2.equals(other.s2) :  other.s2 == null) return false;
    return true;
  }
  
  public final ModelElement s2;
  
  public String varName;
  
  public final ModelElement s;
  
  public void evaluateClause5() {
    boolean _ExistsAlsoInOtherModel = false;
    ExistsAlsoInOtherModel _ExistsAlsoInOtherModel_tuple;
    if (this.s != null && 
        (_ExistsAlsoInOtherModel_tuple = trafo.push_relation_ExistsAlsoInOtherModel(this.s)) != null)
    {
      _ExistsAlsoInOtherModel = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // name = varName
    varName =  s.getName();
    // name = varName
    if (s2.getName() == null ? varName != null : !s2.getName().equals(varName)) {trafo.logFailure(191);
    return false;
    }trafo.logSuccess(191);
    // ExistsAlsoInOtherModel(s)
    evaluateClause5();
    return true;
  }
}
