package org.eclipse.jqvt.examples.shapes.a_implies_b_problem;

import Shapes.Circle;
import org.eclipse.jqvt.examples.shapes.a_implies_b_problem.Transformation;
import org.eclipse.jqvt.examples.shapes.a_implies_b_problem.myRelationName2;

@SuppressWarnings("all")
public class myRelationName {
  private Transformation trafo;
  
  private int hash;
  
  public myRelationName(final Circle s) {
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
    if (!(obj instanceof myRelationName)) return false;
    myRelationName other = (myRelationName) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Circle t;
  
  public String varName;
  
  public final Circle s;
  
  public void evaluateClause3() {
    boolean _myRelationName2 = false;
    myRelationName2 _myRelationName2_tuple;
    if (this.s != null && 
        (_myRelationName2_tuple = trafo.push_relation_myRelationName2(this.s, null)) != null)
    {
      t =  _myRelationName2_tuple.t;
      _myRelationName2 = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // name = varName
    varName =  s.getName();
    // myRelationName2(s,t)
    evaluateClause3();
    // name = varName
    t.setName(varName);
    return true;
  }
}
