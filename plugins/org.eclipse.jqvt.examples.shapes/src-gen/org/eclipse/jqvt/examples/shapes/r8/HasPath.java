package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Circle;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;

@SuppressWarnings("all")
public class HasPath {
  private Transformation trafo;
  
  private int hash;
  
  public HasPath(final Circle s1, final Circle s2) {
    this.s1=s1;
    this.s2=s2;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + s1.hashCode();
    result = prime * result + s2.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof HasPath)) return false;
    HasPath other = (HasPath) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    if (s2 != null ? !s2.equals(other.s2) :  other.s2 == null) return false;
    return true;
  }
  
  public final Circle s2;
  
  public final Circle s1;
  
  public Arrow arrow;
  
  public Circle nextCircle;
  
  public boolean evaluateClause7() {
    boolean _or = false;
    boolean _equals = Objects.equal(this.s2, this.nextCircle);
    if (_equals) {
      _or = true;
    } else {
      boolean _HasPath = false;
      HasPath _HasPath_tuple;
      if (this.nextCircle != null && 
          this.s2 != null && 
          (_HasPath_tuple = trafo.top_relation_HasPath(this.nextCircle, this.s2)) != null)
      {
        _HasPath = true;
      }
      _or = (_equals || _HasPath);
    }
    return _or;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // outArrow = arrow : Arrow {..}
    boolean result = false;
    for (Shapes.Arrow __arrow : s1.getOutArrow()) {
    arrow = __arrow;
    // target = nextCircle : Circle {..}
    if (!(arrow.getTarget() instanceof Shapes.Circle)) {trafo.logFailure(135);
    continue;
    }trafo.logSuccess(135);
    nextCircle = (Shapes.Circle) arrow.getTarget();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[8]->Relation'HasPath'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause7()) {trafo.logFailure(143);
    continue;
    }trafo.logSuccess(143);
    result=true;
    }
    return result;
  }
}
