package org.raas4emf.restexample.qvt;

import java.util.Set;
import org.eclipse.emf.ecore.EPackage;
import org.raas4emf.restexample.qvt.Transformation;
import restexample.GetAllPackagesRequest;
import restexample.GetAllPackagesResponse;

@SuppressWarnings("all")
public class HandleGetAllPackagesRequest {
  private Transformation trafo;
  
  private int hash;
  
  public HandleGetAllPackagesRequest(final GetAllPackagesRequest request) {
    this.request=request;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + request.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof HandleGetAllPackagesRequest)) return false;
    HandleGetAllPackagesRequest other = (HandleGetAllPackagesRequest) obj;
    if (request != null ? !request.equals(other.request) :  other.request == null) return false;
    return true;
  }
  
  public final GetAllPackagesRequest request;
  
  public GetAllPackagesResponse response;
  
  public Set<String> evaluateExpression3() {
    Set<String> _keySet = EPackage.Registry.INSTANCE.keySet();
    return _keySet;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // response : GetAllPackagesResponse {..}
    response = transformation.create(restexample.GetAllPackagesResponse.class);
    // PackageURIs = EPackage.Registry.INSTANCE.keySet()
    response.getPackageURIs().retainAll(evaluateExpression3());
    response.getPackageURIs().addAll(evaluateExpression3());
    return true;
  }
}
