package org.eclipse.jqvt.examples.shapes.r11;

import Shapes.RootBlock;
import org.eclipse.jqvt.examples.shapes.r11.ExistsAlsoInOtherModel;
import org.eclipse.jqvt.examples.shapes.r11.Transformation;

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
  
  public boolean evaluateClause2() {
    boolean _ExistsAlsoInOtherModel = false;
    ExistsAlsoInOtherModel _ExistsAlsoInOtherModel_tuple;
    if (this.s != null && 
        (_ExistsAlsoInOtherModel_tuple = trafo.relation_ExistsAlsoInOtherModel(this.s)) != null)
    {
      _ExistsAlsoInOtherModel = true;
    }
    return _ExistsAlsoInOtherModel;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // ExistsAlsoInOtherModel(s)
    if (!evaluateClause2()) {trafo.logFailure(105);
    return false;
    }trafo.logSuccess(105);
    // t : RootBlock {..}
    t = transformation.create(Shapes.RootBlock.class);
    return true;
  }
}
