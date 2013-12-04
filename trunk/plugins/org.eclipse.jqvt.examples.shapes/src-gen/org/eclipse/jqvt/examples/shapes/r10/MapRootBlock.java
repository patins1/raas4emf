package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.RootBlock;
import org.eclipse.jqvt.examples.shapes.r10.MarkRootBlock;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;

@SuppressWarnings("all")
public class MapRootBlock {
  private Transformation trafo;
  
  private int hash;
  
  public MapRootBlock(final RootBlock s) {
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
    if (!(obj instanceof MapRootBlock)) return false;
    MapRootBlock other = (MapRootBlock) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public RootBlock t;
  
  public final RootBlock s;
  
  public void evaluateClause2() {
    boolean _MarkRootBlock = false;
    MarkRootBlock _MarkRootBlock_tuple;
    if ((_MarkRootBlock_tuple = trafo.push_relation_MarkRootBlock(null)) != null)
    {
      t =  _MarkRootBlock_tuple.root;
      _MarkRootBlock = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // MarkRootBlock(t)
    evaluateClause2();
    return true;
  }
}
