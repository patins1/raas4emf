package org.eclipse.jqvt.examples.shapes.r3;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Shape;
import Shapes.Square;
import org.eclipse.jqvt.examples.shapes.r3.Source2Target;
import org.eclipse.jqvt.examples.shapes.r3.Transformation;

@SuppressWarnings("all")
public class MapArrow {
  private Transformation trafo;
  
  private int hash;
  
  public MapArrow(final Arrow sourceArrow) {
    this.sourceArrow=sourceArrow;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + sourceArrow.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MapArrow)) return false;
    MapArrow other = (MapArrow) obj;
    if (sourceArrow != null ? !sourceArrow.equals(other.sourceArrow) :  other.sourceArrow == null) return false;
    return true;
  }
  
  public Arrow targetArrow1;
  
  public Arrow targetArrow2;
  
  public Block targetblock;
  
  public Block sourceblock;
  
  public String varName;
  
  public Shape targetArrowTarget;
  
  public Shape sourceArrowTarget;
  
  public final Arrow sourceArrow;
  
  public Shape sourceArrowSource;
  
  public Square targetSquare;
  
  public Shape targetArrowSource;
  
  public boolean evaluateClause9() {
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
  
  public boolean evaluateClause10() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceArrowSource != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceArrowSource)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      targetArrowSource = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean evaluateClause11() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.sourceArrowTarget != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.sourceArrowTarget)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      targetArrowTarget = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public String evaluateExpression17() {
    String _plus = (this.varName + " generated square");
    return _plus;
  }
  
  public String evaluateExpression20() {
    String _plus = (this.varName + " generated first arrow");
    return _plus;
  }
  
  public String evaluateExpression25() {
    String _plus = (this.varName + " generated second arrow");
    return _plus;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // block = sourceblock : Block {..}
    if (sourceArrow.getBlock() == null) {trafo.logFailure(116);
    return false;
    }trafo.logSuccess(116);
    sourceblock =  sourceArrow.getBlock();
    // name = varName
    varName =  sourceArrow.getName();
    // source = sourceArrowSource : Shape {..}
    if (sourceArrow.getSource() == null) {trafo.logFailure(119);
    return false;
    }trafo.logSuccess(119);
    sourceArrowSource =  sourceArrow.getSource();
    // target = sourceArrowTarget : Shape {..}
    if (sourceArrow.getTarget() == null) {trafo.logFailure(121);
    return false;
    }trafo.logSuccess(121);
    sourceArrowTarget =  sourceArrow.getTarget();
    // Source2Target(sourceblock, targetblock)
    if (!evaluateClause9()) {trafo.logFailure(150);
    return false;
    }trafo.logSuccess(150);
    // Source2Target(sourceArrowSource, targetArrowSource)
    if (!evaluateClause10()) {trafo.logFailure(151);
    return false;
    }trafo.logSuccess(151);
    // Source2Target(sourceArrowTarget, targetArrowTarget)
    if (!evaluateClause11()) {trafo.logFailure(152);
    return false;
    }trafo.logSuccess(152);
    // targetSquare : Square {..}
    targetSquare = transformation.create(Shapes.Square.class);
    // block = targetblock : Block {..}
    targetSquare.setBlock(targetblock);
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r3'.transformation->Transformation.rules[8]->Relation'MapArrow'.domains[1]->RelationDomain.rootTemplate->ObjectTemplate'targetSquare'.part[1]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    targetSquare.setName(evaluateExpression17());
    // targetArrow1 : Arrow {..}
    targetArrow1 = transformation.create(Shapes.Arrow.class);
    // block = targetblock : Block {..}
    targetArrow1.setBlock(targetblock);
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r3'.transformation->Transformation.rules[8]->Relation'MapArrow'.domains[2]->RelationDomain.rootTemplate->ObjectTemplate'targetArrow1'.part[1]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    targetArrow1.setName(evaluateExpression20());
    // source = targetArrowSource : Shape {..}
    targetArrow1.setSource(targetArrowSource);
    // target = targetSquare
    targetArrow1.setTarget(targetSquare);
    // targetArrow2 : Arrow {..}
    targetArrow2 = transformation.create(Shapes.Arrow.class);
    // block = targetblock : Block {..}
    targetArrow2.setBlock(targetblock);
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r3'.transformation->Transformation.rules[8]->Relation'MapArrow'.domains[3]->RelationDomain.rootTemplate->ObjectTemplate'targetArrow2'.part[1]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    targetArrow2.setName(evaluateExpression25());
    // target = targetArrowTarget : Shape {..}
    targetArrow2.setTarget(targetArrowTarget);
    // source = targetSquare
    targetArrow2.setSource(targetSquare);
    return true;
  }
}
