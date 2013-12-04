package org.eclipse.jqvt.examples.shapes.r9;

import Shapes.ModelElement;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r9.Source2Target;
import org.eclipse.jqvt.examples.shapes.r9.Transformation;

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
  
  public boolean evaluateClause2() {
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
  
  public void evaluateClause3() {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this.sourceModelElement, null));
    if (_notEquals) {
      String _name = this.sourceModelElement.getName();
      _xifexpression = _name;
    } else {
      String _name_1 = this.targetModelElement.getName();
      _xifexpression = _name_1;
    }
    this.varName = _xifexpression;
  }
  
  public String evaluateExpression4() {
    String _name = this.sourceModelElement.getName();
    String _name_1 = trafo.getName(_name, this.varName);
    return _name_1;
  }
  
  public String evaluateExpression6() {
    String _name = this.targetModelElement.getName();
    String _name_1 = trafo.getName(_name, this.varName);
    return _name_1;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Source2Target(sourceModelElement, targetModelElement)
    if (!evaluateClause2()) {trafo.logFailure(61);
    return false;
    }trafo.logSuccess(61);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r9'.transformation->Transformation.rules[2]->Relation'ModelElementName2ModelElementName'.when[0]->XAssignment.value->XIfExpression.if->XBinaryOperation
    // Context: XExpression
    evaluateClause3();
    // name = getName(sourceModelElement.name, varName)
    if (sourceModelElement.getName() == null ? evaluateExpression4() != null : !sourceModelElement.getName().equals(evaluateExpression4())) {trafo.logFailure(49);
    return false;
    }trafo.logSuccess(49);
    // name = getName(targetModelElement.name, varName)
    targetModelElement.setName(evaluateExpression6());
    return true;
  }
}
