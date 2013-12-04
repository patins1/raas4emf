package org.eclipse.jqvt.examples.shapes.r7;

import Shapes.Block;
import Shapes.RootBlock;
import org.eclipse.jqvt.examples.shapes.r7.MapRootBlock;
import org.eclipse.jqvt.examples.shapes.r7.Transformation;

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
    // !MapRootBlock(s, t)
    if (!evaluateClause2()) {trafo.logFailure(115);
    return false;
    }trafo.logSuccess(115);
    // t : Block {..}
    t = transformation.create(Shapes.Block.class);
    return true;
  }
}
