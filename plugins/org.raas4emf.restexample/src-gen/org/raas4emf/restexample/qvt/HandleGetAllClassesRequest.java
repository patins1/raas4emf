package org.raas4emf.restexample.qvt;

import java.util.List;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.raas4emf.restexample.qvt.Transformation;
import restexample.GetAllClassesRequest;
import restexample.GetAllClassesResponse;

@SuppressWarnings("all")
public class HandleGetAllClassesRequest {
  private Transformation trafo;
  
  private int hash;
  
  public HandleGetAllClassesRequest(final GetAllClassesRequest request) {
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
    if (!(obj instanceof HandleGetAllClassesRequest)) return false;
    HandleGetAllClassesRequest other = (HandleGetAllClassesRequest) obj;
    if (request != null ? !request.equals(other.request) :  other.request == null) return false;
    return true;
  }
  
  public final GetAllClassesRequest request;
  
  public EPackage ePackage;
  
  public GetAllClassesResponse response;
  
  public String aPackageURI;
  
  public String evaluateExpression2() {
    return this.aPackageURI;
  }
  
  public void evaluateClause3() {
    this.ePackage = EPackage.Registry.INSTANCE.getEPackage(this.aPackageURI);
  }
  
  public boolean evaluateClause4() {
    return (this.ePackage != null);
  }
  
  public List<String> evaluateExpression6() {
    final Function1<EClassifier, String> _function = (EClassifier c) -> {
      return c.getName();
    };
    List<String> _map = ListExtensions.<EClassifier, String>map(this.ePackage.getEClassifiers(), _function);
    return _map;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // PackageURI = aPackageURI
    aPackageURI =  request.getPackageURI();
    // ePackage = EPackage.Registry.INSTANCE.getEPackage(aPackageURI)
    evaluateClause3();
    // ePackage !== null
    if (!evaluateClause4()) {trafo.logFailure(49);
    return false;
    }trafo.logSuccess(49);
    // response : GetAllClassesResponse {..}
    response = transformation.create(restexample.GetAllClassesResponse.class);
    // ClassNames = ePackage.EClassifiers.map [ EClassifier c | c.name ]
    response.getClassNames().retainAll(evaluateExpression6());
    response.getClassNames().addAll(evaluateExpression6());
    return true;
  }
}
