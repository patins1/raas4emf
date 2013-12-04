package org.eclipse.jqvt.examples.shapes.r2;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.ModelElement;
import Shapes.RootBlock;
import Shapes.Square;
import Shapes.Triangle;
import org.eclipse.jqvt.examples.shapes.r2.MapArrow;
import org.eclipse.jqvt.examples.shapes.r2.MapBlock;
import org.eclipse.jqvt.examples.shapes.r2.MapCircle;
import org.eclipse.jqvt.examples.shapes.r2.MapRootBlock;
import org.eclipse.jqvt.examples.shapes.r2.MapSquare;
import org.eclipse.jqvt.examples.shapes.r2.MapTriangle;
import org.eclipse.jqvt.examples.shapes.r2.Transformation;

@SuppressWarnings("all")
public class Source2Target {
  private Transformation trafo;
  
  private int hash;
  
  public Source2Target(final ModelElement s) {
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
    if (!(obj instanceof Source2Target)) return false;
    Source2Target other = (Source2Target) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public ModelElement t;
  
  public final ModelElement s;
  
  public boolean evaluateClause2() {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _or_3 = false;
    boolean _or_4 = false;
    boolean _MapBlock = false;
    MapBlock _MapBlock_tuple;
    if (this.s instanceof Block && 
        (_MapBlock_tuple = trafo.top_relation_MapBlock((Block)this.s)) != null)
    {
      t =  _MapBlock_tuple.t;
      _MapBlock = true;
    }
    if (_MapBlock) {
      _or_4 = true;
    } else {
      boolean _MapRootBlock = false;
      MapRootBlock _MapRootBlock_tuple;
      if (this.s instanceof RootBlock && 
          (_MapRootBlock_tuple = trafo.top_relation_MapRootBlock((RootBlock)this.s)) != null)
      {
        t =  _MapRootBlock_tuple.t;
        _MapRootBlock = true;
      }
      _or_4 = (_MapBlock || _MapRootBlock);
    }
    if (_or_4) {
      _or_3 = true;
    } else {
      boolean _MapCircle = false;
      MapCircle _MapCircle_tuple;
      if (this.s instanceof Circle && 
          (_MapCircle_tuple = trafo.top_relation_MapCircle((Circle)this.s)) != null)
      {
        t =  _MapCircle_tuple.t;
        _MapCircle = true;
      }
      _or_3 = (_or_4 || _MapCircle);
    }
    if (_or_3) {
      _or_2 = true;
    } else {
      boolean _MapTriangle = false;
      MapTriangle _MapTriangle_tuple;
      if (this.s instanceof Triangle && 
          (_MapTriangle_tuple = trafo.top_relation_MapTriangle((Triangle)this.s)) != null)
      {
        t =  _MapTriangle_tuple.t;
        _MapTriangle = true;
      }
      _or_2 = (_or_3 || _MapTriangle);
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _MapSquare = false;
      MapSquare _MapSquare_tuple;
      if (this.s instanceof Square && 
          (_MapSquare_tuple = trafo.top_relation_MapSquare((Square)this.s)) != null)
      {
        t =  _MapSquare_tuple.t;
        _MapSquare = true;
      }
      _or_1 = (_or_2 || _MapSquare);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _MapArrow = false;
      MapArrow _MapArrow_tuple;
      if (this.s instanceof Arrow && 
          (_MapArrow_tuple = trafo.top_relation_MapArrow((Arrow)this.s)) != null)
      {
        t =  _MapArrow_tuple.t;
        _MapArrow = true;
      }
      _or = (_or_1 || _MapArrow);
    }
    return _or;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r2'.transformation->Transformation.rules[4]->Relation'Source2Target'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(91);
    return false;
    }trafo.logSuccess(91);
    // t : ModelElement {..}
    if (t==null) t = transformation.create(Shapes.ModelElement.class);
    return true;
  }
}
