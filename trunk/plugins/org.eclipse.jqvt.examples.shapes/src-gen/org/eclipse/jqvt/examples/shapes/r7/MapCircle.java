package org.eclipse.jqvt.examples.shapes.r7;

import Shapes.Arrow;
import Shapes.Circle;
import Shapes.Shape;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r7.MapArrow;
import org.eclipse.jqvt.examples.shapes.r7.Transformation;
import org.eclipse.jqvt.examples.shapes.r7.createSquareForFinalArrow;
import org.eclipse.jqvt.examples.shapes.r7.createSquareForInitialArrow;

@SuppressWarnings("all")
public class MapCircle {
  private Transformation trafo;
  
  private int hash;
  
  public MapCircle(final Circle s) {
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
    if (!(obj instanceof MapCircle)) return false;
    MapCircle other = (MapCircle) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Arrow t;
  
  public Shape c1;
  
  public final Circle s;
  
  public Shape c2;
  
  public Boolean hasAtLeaseOneOutArrow;
  
  public Boolean hasAtLeaseOneInArrow;
  
  public void evaluateClause2() {
    boolean _or = false;
    Arrow _xifexpression = null;
    EList<Arrow> _inArrow = this.s.getInArrow();
    boolean _isEmpty = _inArrow.isEmpty();
    if (_isEmpty) {
      _xifexpression = null;
    } else {
      EList<Arrow> _inArrow_1 = this.s.getInArrow();
      Arrow _get = _inArrow_1.get(0);
      _xifexpression = _get;
    }
    boolean _MapArrow = false;
    MapArrow _MapArrow_tuple;
    if (_xifexpression != null && 
        (_MapArrow_tuple = trafo.top_relation_MapArrow(_xifexpression)) != null)
    {
      c1 =  _MapArrow_tuple.t;
      _MapArrow = true;
    }
    if (_MapArrow) {
      _or = true;
    } else {
      boolean _createSquareForInitialArrow = false;
      createSquareForInitialArrow _createSquareForInitialArrow_tuple;
      if (this.s != null && 
          (_createSquareForInitialArrow_tuple = trafo.push_relation_createSquareForInitialArrow(this.s, null)) != null)
      {
        c1 =  _createSquareForInitialArrow_tuple.t;
        _createSquareForInitialArrow = true;
      }
      _or = (_MapArrow || _createSquareForInitialArrow);
    }
  }
  
  public void evaluateClause4() {
    boolean _or = false;
    Arrow _xifexpression = null;
    EList<Arrow> _outArrow = this.s.getOutArrow();
    boolean _isEmpty = _outArrow.isEmpty();
    if (_isEmpty) {
      _xifexpression = null;
    } else {
      EList<Arrow> _outArrow_1 = this.s.getOutArrow();
      Arrow _get = _outArrow_1.get(0);
      _xifexpression = _get;
    }
    boolean _MapArrow = false;
    MapArrow _MapArrow_tuple;
    if (_xifexpression != null && 
        (_MapArrow_tuple = trafo.top_relation_MapArrow(_xifexpression)) != null)
    {
      c2 =  _MapArrow_tuple.t;
      _MapArrow = true;
    }
    if (_MapArrow) {
      _or = true;
    } else {
      boolean _createSquareForFinalArrow = false;
      createSquareForFinalArrow _createSquareForFinalArrow_tuple;
      if (this.s != null && 
          (_createSquareForFinalArrow_tuple = trafo.push_relation_createSquareForFinalArrow(this.s, null)) != null)
      {
        c2 =  _createSquareForFinalArrow_tuple.t;
        _createSquareForFinalArrow = true;
      }
      _or = (_MapArrow || _createSquareForFinalArrow);
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r7'.transformation->Transformation.rules[7]->Relation'MapCircle'.where[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause2();
    // c1 : Shape {..}
    if (c1==null) c1 = transformation.create(Shapes.Shape.class);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r7'.transformation->Transformation.rules[7]->Relation'MapCircle'.where[1]->XBinaryOperation
    // Context: XExpression
    evaluateClause4();
    // c2 : Shape {..}
    if (c2==null) c2 = transformation.create(Shapes.Shape.class);
    // t : Arrow {..}
    t = transformation.create(Shapes.Arrow.class);
    // source = c1 : Shape {..}
    t.setSource(c1);
    // target = c2 : Shape {..}
    t.setTarget(c2);
    return true;
  }
}
