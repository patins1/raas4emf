package org.raas4emf.cms.propertysets;

import org.raas4emf.cms.propertysets.Transformation;
import psets.IPropertySet;

@SuppressWarnings("all")
public class MapPropertySet {
  private Transformation trafo;
  
  private int hash;
  
  public MapPropertySet(final String psetName) {
    this.psetName=psetName;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + psetName.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MapPropertySet)) return false;
    MapPropertySet other = (MapPropertySet) obj;
    if (psetName != null ? !psetName.equals(other.psetName) :  other.psetName == null) return false;
    return true;
  }
  
  public final String psetName;
  
  public IPropertySet aPset;
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // aPset : IPropertySet {..}
    if (aPset==null) aPset = transformation.create(psets.IPropertySet.class);
    // Name = psetName : String {..}
    aPset.setName(psetName);
    return true;
  }
}
