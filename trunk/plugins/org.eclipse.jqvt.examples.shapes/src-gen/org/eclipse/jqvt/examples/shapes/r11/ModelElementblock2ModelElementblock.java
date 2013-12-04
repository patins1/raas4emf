package org.eclipse.jqvt.examples.shapes.r11;

import Shapes.Block;
import Shapes.ModelElement;
import org.eclipse.jqvt.examples.shapes.r11.Source2Target;
import org.eclipse.jqvt.examples.shapes.r11.Transformation;

@SuppressWarnings("all")
public class ModelElementblock2ModelElementblock {
  private Transformation trafo;
  
  private int hash;
  
  public ModelElementblock2ModelElementblock(final ModelElement sourceModelElement) {
    this.sourceModelElement=sourceModelElement;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + sourceModelElement.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ModelElementblock2ModelElementblock)) return false;
    ModelElementblock2ModelElementblock other = (ModelElementblock2ModelElementblock) obj;
    if (sourceModelElement != null ? !sourceModelElement.equals(other.sourceModelElement) :  other.sourceModelElement == null) return false;
    return true;
  }
  
  public Block targetblock;
  
  public Block sourceblock;
  
  public final ModelElement sourceModelElement;
  
  public ModelElement targetModelElement;
  
  public boolean evaluateClause4() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceModelElement != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceModelElement)) != null)
    {
      targetModelElement =  _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean evaluateClause5() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceblock != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceblock)) != null
         && _Source2Target_tuple.t instanceof Block)
    {
      targetblock = (Shapes.Block) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // block = sourceblock : Block {..}
    if (sourceModelElement.getBlock() == null) {trafo.logFailure(66);
    return false;
    }trafo.logSuccess(66);
    sourceblock =  sourceModelElement.getBlock();
    // Source2Target(sourceModelElement, targetModelElement)
    if (!evaluateClause4()) {trafo.logFailure(76);
    return false;
    }trafo.logSuccess(76);
    // Source2Target(sourceblock, targetblock)
    if (!evaluateClause5()) {trafo.logFailure(77);
    return false;
    }trafo.logSuccess(77);
    // block = targetblock : Block {..}
    targetModelElement.setBlock(targetblock);
    return true;
  }
}
