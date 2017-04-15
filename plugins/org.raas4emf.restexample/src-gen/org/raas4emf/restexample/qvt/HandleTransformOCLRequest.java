package org.raas4emf.restexample.qvt;

import au.net.electronichealth.ci.transformation.ocl2csharp.OCL2CSharpTransformationForEcore;
import au.net.electronichealth.ci.transformation.ocl2java.OCL2JavaTransformationForEcore;
import au.net.electronichealth.ci.transformation.ocl2xpath.OCL2XPathTransformationForEcore;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.raas4emf.restexample.qvt.Transformation;
import restexample.TransformOCLRequest;
import restexample.TransformOCLResponse;

@SuppressWarnings("all")
public class HandleTransformOCLRequest {
  private Transformation trafo;
  
  private int hash;
  
  public HandleTransformOCLRequest(final TransformOCLRequest request) {
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
    if (!(obj instanceof HandleTransformOCLRequest)) return false;
    HandleTransformOCLRequest other = (HandleTransformOCLRequest) obj;
    if (request != null ? !request.equals(other.request) :  other.request == null) return false;
    return true;
  }
  
  public final TransformOCLRequest request;
  
  public String theOclText;
  
  public EPackage ePackage;
  
  public TransformOCLResponse response;
  
  public String aClassName;
  
  public String aPackageURI;
  
  public EClassifier eClass;
  
  public String evaluateExpression2() {
    return this.aPackageURI;
  }
  
  public String evaluateExpression3() {
    return this.aClassName;
  }
  
  public String evaluateExpression4() {
    return this.theOclText;
  }
  
  public void evaluateClause5() {
    this.ePackage = EPackage.Registry.INSTANCE.getEPackage(this.aPackageURI);
  }
  
  public boolean evaluateClause6() {
    return (this.ePackage != null);
  }
  
  public void evaluateClause7() {
    this.eClass = this.ePackage.getEClassifier(this.aClassName);
  }
  
  public boolean evaluateClause8() {
    return (this.eClass != null);
  }
  
  public String evaluateExpression10() {
    ResourceSet _resourceSet = this.eClass.eResource().getResourceSet();
    String _transform = new OCL2JavaTransformationForEcore(_resourceSet).transform(this.eClass, this.theOclText);
    return _transform;
  }
  
  public String evaluateExpression11() {
    String _transform = new OCL2CSharpTransformationForEcore().transform(this.eClass, this.theOclText);
    return _transform;
  }
  
  public String evaluateExpression12() {
    String _transform = new OCL2XPathTransformationForEcore().transform(this.eClass, this.theOclText);
    return _transform;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // PackageURI = aPackageURI
    aPackageURI =  request.getPackageURI();
    // ClassName = aClassName
    aClassName =  request.getClassName();
    // OclText = theOclText
    theOclText =  request.getOclText();
    // ePackage = EPackage.Registry.INSTANCE.getEPackage(aPackageURI)
    evaluateClause5();
    // ePackage !== null
    if (!evaluateClause6()) {trafo.logFailure(76);
    return false;
    }trafo.logSuccess(76);
    // eClass = ePackage.getEClassifier(aClassName)
    evaluateClause7();
    // eClass !== null
    if (!evaluateClause8()) {trafo.logFailure(78);
    return false;
    }trafo.logSuccess(78);
    // response : TransformOCLResponse {..}
    response = transformation.create(restexample.TransformOCLResponse.class);
    // JavaText = new OCL2JavaTransformationForEcore(eClass.eResource.resourceSet).transform(eClass , theOclText)
    response.setJavaText(evaluateExpression10());
    // CsharpText = new OCL2CSharpTransformationForEcore().transform(eClass , theOclText)
    response.setCsharpText(evaluateExpression11());
    // XpathText = new OCL2XPathTransformationForEcore().transform(eClass , theOclText)
    response.setXpathText(evaluateExpression12());
    return true;
  }
}
