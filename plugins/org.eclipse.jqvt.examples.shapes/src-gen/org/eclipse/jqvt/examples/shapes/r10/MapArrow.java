package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.Arrow;
import Shapes.RootBlock;
import org.eclipse.jqvt.examples.shapes.r10.MarkRootBlock;
import org.eclipse.jqvt.examples.shapes.r10.Source2Target;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;

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
  
  public RootBlock root;
  
  public boolean evaluateClause2() {
    boolean _MarkRootBlock = false;
    MarkRootBlock _MarkRootBlock_tuple;
    if ((_MarkRootBlock_tuple = trafo.relation_MarkRootBlock()) != null)
    {
      root =  _MarkRootBlock_tuple.root;
      _MarkRootBlock = true;
    }
    return _MarkRootBlock;
  }
  
  public void evaluateClause5() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.s != null && 
        (_Source2Target_tuple = trafo.push_relation_Source2Target(this.s, this.t)) != null
         && (this.t==null || this.t.equals(_Source2Target_tuple.t)))
    {
      _Source2Target = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // MarkRootBlock(root)
    if (!evaluateClause2()) {trafo.logFailure(130);
    return false;
    }trafo.logSuccess(130);
    // t : Arrow {..}
    t = transformation.create(Shapes.Arrow.class);
    // block = root
    t.setBlock(root);
    // Source2Target(s,t)
    evaluateClause5();
    return true;
  }
}
