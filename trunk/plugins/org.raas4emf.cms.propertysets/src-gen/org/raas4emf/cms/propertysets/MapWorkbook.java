package org.raas4emf.cms.propertysets;

import com.google.common.base.Objects;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.raas4emf.cms.propertysets.MapProperty;
import org.raas4emf.cms.propertysets.Transformation;
import psets.IArtifact;

@SuppressWarnings("all")
public class MapWorkbook {
  private Transformation trafo;
  
  private int hash;
  
  public MapWorkbook(final HSSFWorkbook w) {
    this.w=w;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + w.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MapWorkbook)) return false;
    MapWorkbook other = (MapWorkbook) obj;
    if (w != null ? !w.equals(other.w) :  other.w == null) return false;
    return true;
  }
  
  public final HSSFWorkbook w;
  
  public IArtifact iArtifact;
  
  public HSSFSheet sheet;
  
  public int i;
  
  public void evaluateClause2() {
    HSSFSheet _sheet = this.w.getSheet("Attribute");
    this.sheet = _sheet;
  }
  
  public boolean evaluateClause3() {
    boolean _notEquals = (!Objects.equal(this.sheet, null));
    return _notEquals;
  }
  
  public void evaluateClause4() {
    this.i = 1;
  }
  
  public void evaluateClause6() {
    int _lastRowNum = this.sheet.getLastRowNum();
    boolean _lessEqualsThan = (this.i <= _lastRowNum);
    boolean _while = _lessEqualsThan;
    while (_while) {
      {
        HSSFRow _row = this.sheet.getRow(this.i);
        boolean _MapProperty = false;
        MapProperty _MapProperty_tuple;
        if (_row != null && 
            (_MapProperty_tuple = trafo.push_relation_MapProperty(_row, this.iArtifact)) != null
             && (this.iArtifact==null || this.iArtifact.equals(_MapProperty_tuple.iArtifact)))
        {
          _MapProperty = true;
        }
        int _plus = (this.i + 1);
        this.i = _plus;
      }
      int _lastRowNum_1 = this.sheet.getLastRowNum();
      boolean _lessEqualsThan_1 = (this.i <= _lastRowNum_1);
      _while = _lessEqualsThan_1;
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // sheet = w.getSheet("Attribute")
    evaluateClause2();
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.raas4emf.cms.propertysets'.transformation->Transformation.rules[2]->Relation'MapWorkbook'.when[1]->XBinaryOperation
    // Context: XExpression
    if (!evaluateClause3()) {trafo.logFailure(88);
    return false;
    }trafo.logSuccess(88);
    // i=1
    evaluateClause4();
    // iArtifact : IArtifact {..}
    iArtifact = transformation.create(psets.IArtifact.class);
    // Error occured: Operator [super] is not supported.
    // Semantic Object: PackageDeclaration'org.raas4emf.cms.propertysets'.transformation->Transformation.rules[2]->Relation'MapWorkbook'.where[1]->XWhileExpression.predicate->XBinaryOperation
    // Context: XExpression
    evaluateClause6();
    return true;
  }
}
