package org.eclipse.jqvt.examples.shapes.r2;

import Shapes.Block;
import Shapes.ModelElement;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r2.Source2Target;
import org.eclipse.jqvt.examples.shapes.r2.Transformation;

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
  
  public boolean evaluateClause6() {
    boolean _notEquals = (!Objects.equal(this.targetModelElement, this.targetblock));
    return _notEquals;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // block = sourceblock : Block {..}
    if (sourceModelElement.getBlock() == null) {trafo.logFailure(65);
    return false;
    }trafo.logSuccess(65);
    sourceblock =  sourceModelElement.getBlock();
    // Source2Target(sourceModelElement, targetModelElement)
    if (!evaluateClause4()) {trafo.logFailure(75);
    return false;
    }trafo.logSuccess(75);
    // Source2Target(sourceblock, targetblock)
    if (!evaluateClause5()) {trafo.logFailure(76);
    return false;
    }trafo.logSuccess(76);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r2'.transformation->Transformation.rules[3]->Relation'ModelElementblock2ModelElementblock'.when[2]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause6()) {trafo.logFailure(77);
    return false;
    }trafo.logSuccess(77);
    // block = targetblock : Block {..}
    targetModelElement.setBlock(targetblock);
    return true;
  }
}
