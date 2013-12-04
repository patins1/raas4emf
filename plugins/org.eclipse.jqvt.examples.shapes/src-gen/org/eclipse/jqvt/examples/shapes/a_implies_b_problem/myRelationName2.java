package org.eclipse.jqvt.examples.shapes.a_implies_b_problem;

import Shapes.Circle;
import org.eclipse.jqvt.examples.shapes.a_implies_b_problem.Transformation;

@SuppressWarnings("all")
public class myRelationName2 {
  private Transformation trafo;
  
  private int hash;
  
  public myRelationName2(final Circle s) {
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
    if (!(obj instanceof myRelationName2)) return false;
    myRelationName2 other = (myRelationName2) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Circle t;
  
  public final Circle s;
  
  public String evaluateExpression2() {
    return "Circle1";
  }
  
  public String evaluateExpression4() {
    return "Circle1*";
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // name = 'Circle1'
    if (s.getName() == null ? evaluateExpression2() != null : !s.getName().equals(evaluateExpression2())) {trafo.logFailure(27);
    return false;
    }trafo.logSuccess(27);
    // t : Circle {..}
    if (t==null) t = transformation.create(Shapes.Circle.class);
    // name = 'Circle1*'
    t.setName(evaluateExpression4());
    return true;
  }
}
