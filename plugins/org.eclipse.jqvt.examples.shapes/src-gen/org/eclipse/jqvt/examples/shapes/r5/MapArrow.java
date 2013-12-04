package org.eclipse.jqvt.examples.shapes.r5;

import Shapes.Arrow;
import Shapes.Shape;
import Shapes.Triangle;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r5.Transformation;

@SuppressWarnings("all")
public class MapArrow {
  private Transformation trafo;
  
  private int hash;
  
  public MapArrow(final Arrow s) {
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
    if (!(obj instanceof MapArrow)) return false;
    MapArrow other = (MapArrow) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Arrow t;
  
  public final Arrow s;
  
  public boolean evaluateClause2() {
    boolean _and = false;
    Shape _source = this.s.getSource();
    boolean _notEquals = (!Objects.equal(_source, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Shape _source_1 = this.s.getSource();
      boolean _not = (!(_source_1 instanceof Triangle));
      _and = (_notEquals && _not);
    }
    return _and;
  }
  
  public boolean evaluateClause3() {
    boolean _and = false;
    Shape _target = this.s.getTarget();
    boolean _notEquals = (!Objects.equal(_target, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Shape _target_1 = this.s.getTarget();
      boolean _not = (!(_target_1 instanceof Triangle));
      _and = (_notEquals && _not);
    }
    return _and;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r5'.transformation->Transformation.rules[9]->Relation'MapArrow'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(150);
    return false;
    }trafo.logSuccess(150);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r5'.transformation->Transformation.rules[9]->Relation'MapArrow'.when[1]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause3()) {trafo.logFailure(151);
    return false;
    }trafo.logSuccess(151);
    // t : Arrow {..}
    t = transformation.create(Shapes.Arrow.class);
    return true;
  }
}
