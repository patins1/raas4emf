package org.eclipse.jqvt.examples.shapes.r6;

import Shapes.ModelElement;
import org.eclipse.jqvt.examples.shapes.r6.Source2Target;
import org.eclipse.jqvt.examples.shapes.r6.Transformation;

@SuppressWarnings("all")
public class ModelElementName2ModelElementName {
  private Transformation trafo;
  
  private int hash;
  
  public ModelElementName2ModelElementName(final ModelElement sourceModelElement) {
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
    if (!(obj instanceof ModelElementName2ModelElementName)) return false;
    ModelElementName2ModelElementName other = (ModelElementName2ModelElementName) obj;
    if (sourceModelElement != null ? !sourceModelElement.equals(other.sourceModelElement) :  other.sourceModelElement == null) return false;
    return true;
  }
  
  public String varName;
  
  public final ModelElement sourceModelElement;
  
  public ModelElement targetModelElement;
  
  public boolean evaluateClause3() {
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
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // name = varName
    varName =  sourceModelElement.getName();
    // Source2Target(sourceModelElement, targetModelElement)
    if (!evaluateClause3()) {trafo.logFailure(57);
    return false;
    }trafo.logSuccess(57);
    // name = varName
    targetModelElement.setName(varName);
    return true;
  }
}
