package org.eclipse.jqvt.examples.shapes.r5;

import Shapes.Arrow;
import Shapes.Triangle;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r5.Transformation;

@SuppressWarnings("all")
public class HasTrianglePath {
  private Transformation trafo;
  
  private int hash;
  
  public HasTrianglePath(final Triangle s1, final Triangle s2) {
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
    if (!(obj instanceof HasTrianglePath)) return false;
    HasTrianglePath other = (HasTrianglePath) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    if (s2 != null ? !s2.equals(other.s2) :  other.s2 == null) return false;
    return true;
  }
  
  public final Triangle s2;
  
  public final Triangle s1;
  
  public Triangle nextTriangle;
  
  public Arrow arrow;
  
  public boolean evaluateClause7() {
    boolean _or = false;
    boolean _equals = Objects.equal(this.s2, this.nextTriangle);
    if (_equals) {
      _or = true;
    } else {
      boolean _HasTrianglePath = false;
      HasTrianglePath _HasTrianglePath_tuple;
      if (this.nextTriangle != null && 
          this.s2 != null && 
          (_HasTrianglePath_tuple = trafo.top_relation_HasTrianglePath(this.nextTriangle, this.s2)) != null)
      {
        _HasTrianglePath = true;
      }
      _or = (_equals || _HasTrianglePath);
    }
    return _or;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // outArrow = arrow : Arrow {..}
    boolean result = false;
    for (Shapes.Arrow __arrow : s1.getOutArrow()) {
    arrow = __arrow;
    // target = nextTriangle : Triangle {..}
    if (!(arrow.getTarget() instanceof Shapes.Triangle)) {trafo.logFailure(160);
    continue;
    }trafo.logSuccess(160);
    nextTriangle = (Shapes.Triangle) arrow.getTarget();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r5'.transformation->Transformation.rules[10]->Relation'HasTrianglePath'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause7()) {trafo.logFailure(168);
    continue;
    }trafo.logSuccess(168);
    result=true;
    }
    return result;
  }
}
