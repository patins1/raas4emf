package org.eclipse.jqvt.examples.shapes.r10;

import Shapes.Arrow;
import Shapes.Circle;
import Shapes.RootBlock;
import Shapes.Square;
import org.eclipse.jqvt.examples.shapes.r10.MarkRootBlock;
import org.eclipse.jqvt.examples.shapes.r10.Transformation;
import org.eclipse.jqvt.examples.shapes.r10.markerForIncomingArrows;
import org.eclipse.jqvt.examples.shapes.r10.markerForOutgoingArrows;

@SuppressWarnings("all")
public class MapCircle {
  private Transformation trafo;
  
  private int hash;
  
  public MapCircle(final Circle s) {
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
    if (!(obj instanceof MapCircle)) return false;
    MapCircle other = (MapCircle) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public final Circle s;
  
  public RootBlock root;
  
  public Arrow a;
  
  public String n;
  
  public Circle circle;
  
  public Square square;
  
  public boolean evaluateClause3() {
    boolean _MarkRootBlock = false;
    MarkRootBlock _MarkRootBlock_tuple;
    if ((_MarkRootBlock_tuple = trafo.relation_MarkRootBlock()) != null)
    {
      root =  _MarkRootBlock_tuple.root;
      _MarkRootBlock = true;
    }
    return _MarkRootBlock;
  }
  
  public void evaluateClause4() {
    boolean _markerForOutgoingArrows = false;
    markerForOutgoingArrows _markerForOutgoingArrows_tuple;
    if (this.s != null && 
        (_markerForOutgoingArrows_tuple = trafo.push_relation_markerForOutgoingArrows(this.s, null)) != null)
    {
      circle =  _markerForOutgoingArrows_tuple.t;
      _markerForOutgoingArrows = true;
    }
  }
  
  public String evaluateExpression6() {
    String _plus = (this.n + " circle");
    return _plus;
  }
  
  public void evaluateClause8() {
    boolean _markerForIncomingArrows = false;
    markerForIncomingArrows _markerForIncomingArrows_tuple;
    if (this.s != null && 
        (_markerForIncomingArrows_tuple = trafo.push_relation_markerForIncomingArrows(this.s, null)) != null)
    {
      square =  _markerForIncomingArrows_tuple.t;
      _markerForIncomingArrows = true;
    }
  }
  
  public String evaluateExpression10() {
    String _plus = (this.n + " square");
    return _plus;
  }
  
  public String evaluateExpression15() {
    String _plus = (this.n + " arrow");
    return _plus;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // name = n
    n =  s.getName();
    // MarkRootBlock(root)
    if (!evaluateClause3()) {trafo.logFailure(87);
    return false;
    }trafo.logSuccess(87);
    // markerForOutgoingArrows(s,circle)
    evaluateClause4();
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r10'.transformation->Transformation.rules[3]->Relation'MapCircle'.domains[1]->RelationDomain.rootTemplate->ObjectTemplate'square'.part[2]->PropertyTemplateItem.value->ObjectTemplate'a'.part[0]->PropertyTemplateItem.value->ObjectTemplate'circle'.part[0]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    circle.setName(evaluateExpression6());
    // block = root
    circle.setBlock(root);
    // markerForIncomingArrows(s,square)
    evaluateClause8();
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r10'.transformation->Transformation.rules[3]->Relation'MapCircle'.domains[1]->RelationDomain.rootTemplate->ObjectTemplate'square'.part[0]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    square.setName(evaluateExpression10());
    // block = root
    square.setBlock(root);
    // a : Arrow {..}
    a = transformation.create(Shapes.Arrow.class);
    // outArrow = a : Arrow {..}
    square.getOutArrow().add(a);
    // target = circle : Circle {..}
    a.setTarget(circle);
    // name = Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r10'.transformation->Transformation.rules[3]->Relation'MapCircle'.domains[1]->RelationDomain.rootTemplate->ObjectTemplate'square'.part[2]->PropertyTemplateItem.value->ObjectTemplate'a'.part[1]->PropertyTemplateItem.value->XBinaryOperation
    // Context: XExpression
    a.setName(evaluateExpression15());
    // block = root
    a.setBlock(root);
    return true;
  }
}
