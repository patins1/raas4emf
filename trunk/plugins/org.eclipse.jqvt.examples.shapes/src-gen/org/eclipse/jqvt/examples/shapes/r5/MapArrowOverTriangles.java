package org.eclipse.jqvt.examples.shapes.r5;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Shape;
import Shapes.Triangle;
import com.google.common.base.Objects;
import org.eclipse.jqvt.examples.shapes.r5.HasTrianglePath;
import org.eclipse.jqvt.examples.shapes.r5.Source2Target;
import org.eclipse.jqvt.examples.shapes.r5.Transformation;

@SuppressWarnings("all")
public class MapArrowOverTriangles {
  private Transformation trafo;
  
  private int hash;
  
  public MapArrowOverTriangles(final Arrow s1, final Arrow s2) {
    this.s1=s1;
    this.s2=s2;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + s1.hashCode();
    result = prime * result + s2.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MapArrowOverTriangles)) return false;
    MapArrowOverTriangles other = (MapArrowOverTriangles) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    if (s2 != null ? !s2.equals(other.s2) :  other.s2 == null) return false;
    return true;
  }
  
  public Shape endMapping;
  
  public final Arrow s2;
  
  public Arrow t;
  
  public final Arrow s1;
  
  public Shape beginMapping;
  
  public Block targetBlock;
  
  public Shape end;
  
  public Shape begin;
  
  public boolean evaluateClause6() {
    boolean _or = false;
    Shape _target = this.s1.getTarget();
    Shape _source = this.s2.getSource();
    boolean _HasTrianglePath = false;
    HasTrianglePath _HasTrianglePath_tuple;
    if (_target instanceof Triangle && 
        _source instanceof Triangle && 
        (_HasTrianglePath_tuple = trafo.top_relation_HasTrianglePath((Triangle)_target, (Triangle)_source)) != null)
    {
      _HasTrianglePath = true;
    }
    if (_HasTrianglePath) {
      _or = true;
    } else {
      Shape _target_1 = this.s1.getTarget();
      Shape _source_1 = this.s2.getSource();
      boolean _equals = Objects.equal(_target_1, _source_1);
      _or = (_HasTrianglePath || _equals);
    }
    return _or;
  }
  
  public boolean evaluateClause8() {
    Block _block = this.begin.getBlock();
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (_block != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(_block)) != null
         && _Source2Target_tuple.t instanceof Block)
    {
      targetBlock = (Shapes.Block) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean evaluateClause9() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.begin != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.begin)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      beginMapping = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public boolean evaluateClause10() {
    boolean _Source2Target = false;
    Source2Target _Source2Target_tuple;
    if (this.end != null && 
        (_Source2Target_tuple = trafo.top_relation_Source2Target(this.end)) != null
         && _Source2Target_tuple.t instanceof Shape)
    {
      endMapping = (Shapes.Shape) _Source2Target_tuple.t;
      _Source2Target = true;
    }
    return _Source2Target;
  }
  
  public String evaluateExpression14() {
    String _name = this.s1.getName();
    String _plus = (_name + "_");
    String _name_1 = this.s2.getName();
    String _plus_1 = (_plus + _name_1);
    return _plus_1;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // source = begin : Shape {..}
    if (s1.getSource() == null) {trafo.logFailure(188);
    return false;
    }trafo.logSuccess(188);
    begin =  s1.getSource();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r5'.transformation->Transformation.rules[12]->Relation'MapArrowOverTriangles'.when[3]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause6()) {trafo.logFailure(206);
    return false;
    }trafo.logSuccess(206);
    // target = end : Shape {..}
    if (s2.getTarget() == null) {trafo.logFailure(192);
    return false;
    }trafo.logSuccess(192);
    end =  s2.getTarget();
    // Source2Target(begin.block, targetBlock)
    if (!evaluateClause8()) {trafo.logFailure(203);
    return false;
    }trafo.logSuccess(203);
    // Source2Target(begin,beginMapping)
    if (!evaluateClause9()) {trafo.logFailure(204);
    return false;
    }trafo.logSuccess(204);
    // Source2Target(end,endMapping)
    if (!evaluateClause10()) {trafo.logFailure(205);
    return false;
    }trafo.logSuccess(205);
    // t : Arrow {..}
    t = transformation.create(Shapes.Arrow.class);
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r5'.transformation->Transformation.rules[12]->Relation'MapArrowOverTriangles'.domains[2]->RelationDomain.rootTemplate->ObjectTemplate't'.part[0]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    t.setName(evaluateExpression14());
    // source = beginMapping : Shape {..}
    t.setSource(beginMapping);
    // target = endMapping : Shape {..}
    t.setTarget(endMapping);
    // block = targetBlock
    t.setBlock(targetBlock);
    return true;
  }
}
