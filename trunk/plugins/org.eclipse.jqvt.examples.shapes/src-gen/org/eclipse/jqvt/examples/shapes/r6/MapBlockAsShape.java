package org.eclipse.jqvt.examples.shapes.r6;

import Shapes.Block;
import Shapes.ModelElement;
import Shapes.Square;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r6.Transformation;

@SuppressWarnings("all")
public class MapBlockAsShape {
  private Transformation trafo;
  
  private int hash;
  
  public MapBlockAsShape(final Block s) {
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
    if (!(obj instanceof MapBlockAsShape)) return false;
    MapBlockAsShape other = (MapBlockAsShape) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Square t;
  
  public final Block s;
  
  public boolean evaluateClause2() {
    EList<ModelElement> _modelElement = this.s.getModelElement();
    int _size = _modelElement.size();
    boolean _equals = (_size == 0);
    return _equals;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r6'.transformation->Transformation.rules[7]->Relation'MapBlockAsShape'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(130);
    return false;
    }trafo.logSuccess(130);
    // t : Square {..}
    t = transformation.create(Shapes.Square.class);
    return true;
  }
}
