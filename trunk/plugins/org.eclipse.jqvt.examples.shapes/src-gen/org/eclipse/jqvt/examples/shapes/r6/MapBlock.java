package org.eclipse.jqvt.examples.shapes.r6;

import Shapes.Block;
import Shapes.ModelElement;
import Shapes.RootBlock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r6.MapRootBlock;
import org.eclipse.jqvt.examples.shapes.r6.Transformation;

@SuppressWarnings("all")
public class MapBlock {
  private Transformation trafo;
  
  private int hash;
  
  public MapBlock(final Block s) {
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
    if (!(obj instanceof MapBlock)) return false;
    MapBlock other = (MapBlock) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Block t;
  
  public final Block s;
  
  public boolean evaluateClause2() {
    EList<ModelElement> _modelElement = this.s.getModelElement();
    int _size = _modelElement.size();
    boolean _greaterEqualsThan = (_size >= 1);
    return _greaterEqualsThan;
  }
  
  public boolean evaluateClause3() {
    boolean _MapRootBlock = false;
    MapRootBlock _MapRootBlock_tuple;
    if (this.s instanceof RootBlock && 
        (_MapRootBlock_tuple = trafo.top_relation_MapRootBlock((RootBlock)this.s)) != null)
    {
      _MapRootBlock = true;
    }
    boolean _not = (!_MapRootBlock);
    return _not;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r6'.transformation->Transformation.rules[6]->Relation'MapBlock'.when[0]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(115);
    return false;
    }trafo.logSuccess(115);
    // !MapRootBlock(s, t)
    if (!evaluateClause3()) {trafo.logFailure(116);
    return false;
    }trafo.logSuccess(116);
    // t : Block {..}
    t = transformation.create(Shapes.Block.class);
    return true;
  }
}
