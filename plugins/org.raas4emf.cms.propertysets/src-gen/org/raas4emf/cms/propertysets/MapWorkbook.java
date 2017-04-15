package org.raas4emf.cms.propertysets;

import com.google.common.base.Objects;
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
  
  public IArtifact iArtifact;
  
  public final HSSFWorkbook w;
  
  public int i;
  
  public HSSFSheet sheet;
  
  public void evaluateClause2() {
    this.sheet = this.w.getSheet("Attribute");
  }
  
  public boolean evaluateClause3() {
    boolean _notEquals = (!Objects.equal(this.sheet, null));
    return _notEquals;
  }
  
  public void evaluateClause4() {
    this.i = 1;
  }
  
  public void evaluateClause6() {
    while ((this.i <= this.sheet.getLastRowNum())) {
      {
        boolean _MapProperty = false;
        MapProperty _MapProperty_tuple;
        if (this.sheet.getRow(this.i) != null && 
            (_MapProperty_tuple = trafo.push_relation_MapProperty(this.sheet.getRow(this.i), this.iArtifact)) != null
             && (this.iArtifact==null || this.iArtifact.equals(_MapProperty_tuple.iArtifact)))
        {
          _MapProperty = true;
        }
        this.i = (this.i + 1);
      }
    }
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // sheet = w.getSheet("Attribute")
    evaluateClause2();
    // sheet != null
    if (!evaluateClause3()) {trafo.logFailure(88);
    return false;
    }trafo.logSuccess(88);
    // i=1
    evaluateClause4();
    // iArtifact : IArtifact {..}
    iArtifact = transformation.create(psets.IArtifact.class);
    // while (i <= sheet.lastRowNum) {
    // 				MapProperty(sheet.getRow(i),iArtifact);
    // 				i = i +1;
    // 			}
    evaluateClause6();
    return true;
  }
}
