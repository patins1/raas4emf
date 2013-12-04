package org.eclipse.jqvt.examples.shapes.r8;

import Shapes.Arrow;
import Shapes.Block;
import Shapes.Circle;
import Shapes.Shape;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jqvt.examples.shapes.r8.Circle2Baseblock;
import org.eclipse.jqvt.examples.shapes.r8.Circle2block;
import org.eclipse.jqvt.examples.shapes.r8.HasPath;
import org.eclipse.jqvt.examples.shapes.r8.IsForkNode;
import org.eclipse.jqvt.examples.shapes.r8.IsJoinNode;
import org.eclipse.jqvt.examples.shapes.r8.Join2Fork;
import org.eclipse.jqvt.examples.shapes.r8.Transformation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class IsJoinAndFork {
  private Transformation trafo;
  
  private int hash;
  
  public IsJoinAndFork(final Circle s1, final Circle s2) {
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
    if (!(obj instanceof IsJoinAndFork)) return false;
    IsJoinAndFork other = (IsJoinAndFork) obj;
    if (s1 != null ? !s1.equals(other.s1) :  other.s1 == null) return false;
    if (s2 != null ? !s2.equals(other.s2) :  other.s2 == null) return false;
    return true;
  }
  
  public final Circle s2;
  
  public final Circle s1;
  
  public Block blockBlock;
  
  public boolean evaluateClause2() {
    EList<Arrow> _outArrow = this.s1.getOutArrow();
    int _size = _outArrow.size();
    boolean _greaterEqualsThan = (_size >= 2);
    return _greaterEqualsThan;
  }
  
  public boolean evaluateClause4() {
    boolean _HasPath = false;
    HasPath _HasPath_tuple;
    if (this.s1 != null && 
        this.s2 != null && 
        (_HasPath_tuple = trafo.top_relation_HasPath(this.s1, this.s2)) != null)
    {
      _HasPath = true;
    }
    return _HasPath;
  }
  
  public boolean evaluateClause5() {
    EList<Arrow> _inArrow = this.s2.getInArrow();
    int _size = _inArrow.size();
    boolean _greaterEqualsThan = (_size >= 2);
    return _greaterEqualsThan;
  }
  
  public boolean evaluateClause6() {
    EList<Arrow> _inArrow = this.s2.getInArrow();
    final Function1<Arrow,Boolean> _function = new Function1<Arrow,Boolean>() {
      public Boolean apply(final Arrow x) {
        boolean _or = false;
        Shape _source = x.getSource();
        boolean _equals = Objects.equal(_source, null);
        if (_equals) {
          _or = true;
        } else {
          Shape _source_1 = x.getSource();
          boolean _HasPath = false;
          HasPath _HasPath_tuple;
          if (IsJoinAndFork.this.s1 != null && 
              _source_1 instanceof Circle && 
              (_HasPath_tuple = trafo.top_relation_HasPath(IsJoinAndFork.this.s1, (Circle)_source_1)) != null)
          {
            _HasPath = true;
          }
          _or = (_equals || _HasPath);
        }
        return Boolean.valueOf(_or);
      }
    };
    boolean _forall = IterableExtensions.<Arrow>forall(_inArrow, _function);
    return _forall;
  }
  
  public boolean evaluateClause7() {
    EList<Arrow> _outArrow = this.s1.getOutArrow();
    final Function1<Arrow,Boolean> _function = new Function1<Arrow,Boolean>() {
      public Boolean apply(final Arrow x) {
        boolean _or = false;
        Shape _target = x.getTarget();
        boolean _equals = Objects.equal(_target, null);
        if (_equals) {
          _or = true;
        } else {
          Shape _target_1 = x.getTarget();
          boolean _HasPath = false;
          HasPath _HasPath_tuple;
          if (_target_1 instanceof Circle && 
              IsJoinAndFork.this.s2 != null && 
              (_HasPath_tuple = trafo.top_relation_HasPath((Circle)_target_1, IsJoinAndFork.this.s2)) != null)
          {
            _HasPath = true;
          }
          _or = (_equals || _HasPath);
        }
        return Boolean.valueOf(_or);
      }
    };
    boolean _forall = IterableExtensions.<Arrow>forall(_outArrow, _function);
    return _forall;
  }
  
  public boolean evaluateClause8() {
    String _name = this.s1.getName();
    String _plus = ("HasMultiplePaths:" + _name);
    String _plus_1 = (_plus + " ");
    String _name_1 = this.s2.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String __debug = trafo._debug(_plus_2);
    boolean _notEquals = (!Objects.equal(__debug, ""));
    return _notEquals;
  }
  
  public boolean evaluateClause9() {
    boolean _Circle2block = false;
    Circle2block _Circle2block_tuple;
    if (this.s1 != null && 
        (_Circle2block_tuple = trafo.relation_Circle2block(this.s1)) != null)
    {
      blockBlock =  _Circle2block_tuple.t;
      _Circle2block = true;
    }
    return _Circle2block;
  }
  
  public void evaluateClause10() {
    String _name = this.s2.getName();
    String _plus = ("IsJoinAndFork: " + _name);
    String _name_1 = this.s1.getName();
    String _plus_1 = (_plus + _name_1);
    trafo._debug(_plus_1);
  }
  
  public void evaluateClause11() {
    boolean _Circle2Baseblock = false;
    Circle2Baseblock _Circle2Baseblock_tuple;
    if (this.s2 != null && 
        (_Circle2Baseblock_tuple = trafo.push_relation_Circle2Baseblock(this.s2, this.blockBlock)) != null
         && (this.blockBlock==null || this.blockBlock.equals(_Circle2Baseblock_tuple.t)))
    {
      _Circle2Baseblock = true;
    }
  }
  
  public void evaluateClause12() {
    boolean _IsJoinNode = false;
    IsJoinNode _IsJoinNode_tuple;
    if (this.s2 != null && 
        (_IsJoinNode_tuple = trafo.push_relation_IsJoinNode(this.s2)) != null)
    {
      _IsJoinNode = true;
    }
  }
  
  public void evaluateClause13() {
    boolean _IsForkNode = false;
    IsForkNode _IsForkNode_tuple;
    if (this.s1 != null && 
        (_IsForkNode_tuple = trafo.push_relation_IsForkNode(this.s1)) != null)
    {
      _IsForkNode = true;
    }
  }
  
  public void evaluateClause14() {
    boolean _Join2Fork = false;
    Join2Fork _Join2Fork_tuple;
    if (this.s2 != null && 
        (_Join2Fork_tuple = trafo.push_relation_Join2Fork(this.s2, this.s1)) != null
         && (this.s1==null || this.s1.equals(_Join2Fork_tuple.t)))
    {
      _Join2Fork = true;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.when[1]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause2()) {trafo.logFailure(160);
    return false;
    }trafo.logSuccess(160);
    // HasPath(s1,s2)
    if (!evaluateClause4()) {trafo.logFailure(159);
    return false;
    }trafo.logSuccess(159);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.when[2]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause5()) {trafo.logFailure(161);
    return false;
    }trafo.logSuccess(161);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.when[3]->XMemberFeatureCall.memberCallArguments[0]->XClosure.expression->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause6()) {trafo.logFailure(162);
    return false;
    }trafo.logSuccess(162);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.when[4]->XMemberFeatureCall.memberCallArguments[0]->XClosure.expression->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause7()) {trafo.logFailure(163);
    return false;
    }trafo.logSuccess(163);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.when[5]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause8()) {trafo.logFailure(164);
    return false;
    }trafo.logSuccess(164);
    // Circle2block(s1,blockBlock)
    if (!evaluateClause9()) {trafo.logFailure(165);
    return false;
    }trafo.logSuccess(165);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.eclipse.jqvt.examples.shapes.r8'.transformation->Transformation.rules[9]->Relation'IsJoinAndFork'.where[0]->XFeatureCall.featureCallArguments[0]->XBinaryOperation
    // Context: XExpression
    evaluateClause10();
    // Circle2Baseblock(s2,blockBlock)
    evaluateClause11();
    // IsJoinNode(s2)
    evaluateClause12();
    // IsForkNode(s1)
    evaluateClause13();
    // Join2Fork(s2,s1)
    evaluateClause14();
    return true;
  }
}
