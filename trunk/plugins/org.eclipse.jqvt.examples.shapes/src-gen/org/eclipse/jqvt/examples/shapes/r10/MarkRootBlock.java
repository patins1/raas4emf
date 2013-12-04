package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.RootBlock;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;

@SuppressWarnings("all")
public class MarkRootBlock {
  private Transformation trafo;
  
  private int hash;
  
  public MarkRootBlock() {
    
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MarkRootBlock)) return false;
    MarkRootBlock other = (MarkRootBlock) obj;
    return true;
  }
  
  public RootBlock root;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // root : RootBlock {..}
    if (root==null) root = transformation.create(Shapes.RootBlock.class);
    return true;
  }
}
