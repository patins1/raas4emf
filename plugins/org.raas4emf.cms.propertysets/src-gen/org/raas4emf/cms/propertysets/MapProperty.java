package org.raas4emf.cms.propertysets;

import com.google.common.base.Objects;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.ifc4emf.metamodel.ifc.samples.IFCComparer;
import org.raas4emf.cms.propertysets.MapPropertySet;
import org.raas4emf.cms.propertysets.Transformation;
import psets.IArtifact;
import psets.IDefaultValue;
import psets.IProperty;
import psets.IPropertySet;

@SuppressWarnings("all")
public class MapProperty {
  private Transformation trafo;
  
  private int hash;
  
  public MapProperty(final HSSFRow row) {
    this.row=row;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + row.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MapProperty)) return false;
    MapProperty other = (MapProperty) obj;
    if (row != null ? !row.equals(other.row) :  other.row == null) return false;
    return true;
  }
  
  public String theLodVisibility;
  
  public String attName;
  
  public IProperty def;
  
  public String psetName;
  
  public String theLodReadOnly;
  
  public IDefaultValue valueDef;
  
  public String value;
  
  public IArtifact iArtifact;
  
  public final HSSFRow row;
  
  public String theLodMustChange;
  
  public IPropertySet aPset;
  
  public void evaluateClause2() {
    HSSFCell _cell = this.row.getCell(0);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.attName = _string;
  }
  
  public boolean evaluateClause3() {
    boolean _notEquals = (!Objects.equal(this.attName, null));
    return _notEquals;
  }
  
  public void evaluateClause4() {
    HSSFCell _cell = this.row.getCell(10);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.psetName = _string;
  }
  
  public boolean evaluateClause5() {
    boolean _notEquals = (!Objects.equal(this.psetName, null));
    return _notEquals;
  }
  
  public void evaluateClause6() {
    HSSFCell _cell = this.row.getCell(6);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.value = _string;
  }
  
  public boolean evaluateClause7() {
    boolean _notEquals = (!Objects.equal(this.value, null));
    return _notEquals;
  }
  
  public void evaluateClause8() {
    HSSFCell _cell = this.row.getCell(13);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.theLodVisibility = _string;
  }
  
  public void evaluateClause9() {
    HSSFCell _cell = this.row.getCell(14);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.theLodReadOnly = _string;
  }
  
  public void evaluateClause10() {
    HSSFCell _cell = this.row.getCell(15);
    String _string = null;
    if (_cell!=null) {
      _string=_cell.toString();
    }
    this.theLodMustChange = _string;
  }
  
  public void evaluateClause12() {
    boolean _MapPropertySet = false;
    MapPropertySet _MapPropertySet_tuple;
    if (this.psetName != null && 
        (_MapPropertySet_tuple = trafo.push_relation_MapPropertySet(this.psetName, null)) != null)
    {
      aPset =  _MapPropertySet_tuple.aPset;
      _MapPropertySet = true;
    }
  }
  
  public int evaluateExpression19() {
    int _int = trafo.toInt(this.theLodVisibility);
    return _int;
  }
  
  public int evaluateExpression20() {
    int _int = trafo.toInt(this.theLodReadOnly);
    return _int;
  }
  
  public int evaluateExpression21() {
    int _int = trafo.toInt(this.theLodMustChange);
    return _int;
  }
  
  public String evaluateExpression24() {
    String _normalizeIfcValue = IFCComparer.normalizeIfcValue(this.value);
    return _normalizeIfcValue;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // attName = row.getCell(0/*Name Column*/)?.toString()
    evaluateClause2();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.raas4emf.cms.propertysets'.transformation->Transformation.rules[1]->Relation'MapProperty'.when[1]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause3()) {trafo.logFailure(59);
    return false;
    }trafo.logSuccess(59);
    // psetName = row.getCell(10/*ExtIdentifier Column*/)?.toString()
    evaluateClause4();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.raas4emf.cms.propertysets'.transformation->Transformation.rules[1]->Relation'MapProperty'.when[3]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause5()) {trafo.logFailure(61);
    return false;
    }trafo.logSuccess(61);
    // value = row.getCell(6/*Value Column*/)?.toString()
    evaluateClause6();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.raas4emf.cms.propertysets'.transformation->Transformation.rules[1]->Relation'MapProperty'.when[5]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause7()) {trafo.logFailure(63);
    return false;
    }trafo.logSuccess(63);
    // theLodVisibility = row.getCell(13)?.toString()
    evaluateClause8();
    // theLodReadOnly = row.getCell(14)?.toString()
    evaluateClause9();
    // theLodMustChange = row.getCell(15)?.toString()
    evaluateClause10();
    // attName : String {..}
    if (attName==null) attName = transformation.create(java.lang.String.class);
    // MapPropertySet(psetName,aPset)
    evaluateClause12();
    // iArtifact : IArtifact {..}
    if (iArtifact==null) iArtifact = transformation.create(psets.IArtifact.class);
    // PropertySets = aPset : IPropertySet {..}
    iArtifact.getPropertySets().add(aPset);
    // def : IProperty {..}
    def = transformation.create(psets.IProperty.class);
    // Properties = def : IProperty {..}
    aPset.getProperties().add(def);
    // Name = attName : String {..}
    def.setName(attName);
    // LodVisibility = toInt(theLodVisibility)
    def.setLodVisibility(evaluateExpression19());
    // LodReadOnly = toInt(theLodReadOnly)
    def.setLodReadOnly(evaluateExpression20());
    // LodMustChange = toInt(theLodMustChange)
    def.setLodMustChange(evaluateExpression21());
    // valueDef : IDefaultValue {..}
    valueDef = transformation.create(psets.IDefaultValue.class);
    // PropertyValues = valueDef : IDefaultValue {..}
    def.getPropertyValues().add(valueDef);
    // Value = IFCComparer.normalizeIfcValue(value)
    valueDef.setValue(evaluateExpression24());
    return true;
  }
}
