package org.eclipse.jqvt.examples.shapes.r4;

import Shapes.Block;
import Shapes.Circle;
import Shapes.Square;
import org.eclipse.jqvt.examples.shapes.r4.Transformation;

@SuppressWarnings("all")
public class MapSquare {
  private Transformation trafo;
  
  private int hash;
  
  public MapSquare(final Square s) {
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
    if (!(obj instanceof MapSquare)) return false;
    MapSquare other = (MapSquare) obj;
    if (s != null ? !s.equals(other.s) :  other.s == null) return false;
    return true;
  }
  
  public Circle containedCircle;
  
  public Block t;
  
  public final Square s;
  
  public String evaluateExpression5() {
    return "generated circle";
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // t : Block {..}
    t = transformation.create(Shapes.Block.class);
    // containedCircle : Circle {..}
    containedCircle = transformation.create(Shapes.Circle.class);
    // modelElement = containedCircle : Circle {..}
    t.getModelElement().add(containedCircle);
    // name = 'generated circle'
    containedCircle.setName(evaluateExpression5());
    return true;
  }
}
