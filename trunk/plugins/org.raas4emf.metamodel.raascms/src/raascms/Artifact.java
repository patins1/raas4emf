/**
 */
package raascms;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import raascms.jaxb.ArtifactImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link raascms.Artifact#getFileContent <em>File Content</em>}</li>
 *   <li>{@link raascms.Artifact#getContents <em>Contents</em>}</li>
 *   <li>{@link raascms.Artifact#getState <em>State</em>}</li>
 *   <li>{@link raascms.Artifact#getDependentArtifact <em>Dependent Artifact</em>}</li>
 *   <li>{@link raascms.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link raascms.Artifact#getModelDate <em>Model Date</em>}</li>
 *   <li>{@link raascms.Artifact#getBlobDate <em>Blob Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see raascms.RaascmsPackage#getArtifact()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(ArtifactImplAdapter.class)
public interface Artifact extends CDOObject {
	/**
	 * Returns the value of the '<em><b>File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Content</em>' attribute.
	 * @see #setFileContent(CDOBlob)
	 * @see raascms.RaascmsPackage#getArtifact_FileContent()
	 * @model dataType="org.eclipse.emf.cdo.etypes.Blob"
	 * @generated
	 */
	CDOBlob getFileContent();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getFileContent <em>File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Content</em>' attribute.
	 * @see #getFileContent()
	 * @generated
	 */
	void setFileContent(CDOBlob value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see raascms.RaascmsPackage#getArtifact_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see raascms.RaascmsPackage#getArtifact_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Dependent Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Artifact</em>' reference.
	 * @see #setDependentArtifact(Artifact)
	 * @see raascms.RaascmsPackage#getArtifact_DependentArtifact()
	 * @model
	 * @generated
	 */
	Artifact getDependentArtifact();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getDependentArtifact <em>Dependent Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Artifact</em>' reference.
	 * @see #getDependentArtifact()
	 * @generated
	 */
	void setDependentArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see raascms.RaascmsPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Date</em>' attribute.
	 * @see #setModelDate(Date)
	 * @see raascms.RaascmsPackage#getArtifact_ModelDate()
	 * @model
	 * @generated
	 */
	Date getModelDate();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getModelDate <em>Model Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Date</em>' attribute.
	 * @see #getModelDate()
	 * @generated
	 */
	void setModelDate(Date value);

	/**
	 * Returns the value of the '<em><b>Blob Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blob Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blob Date</em>' attribute.
	 * @see #setBlobDate(Date)
	 * @see raascms.RaascmsPackage#getArtifact_BlobDate()
	 * @model
	 * @generated
	 */
	Date getBlobDate();

	/**
	 * Sets the value of the '{@link raascms.Artifact#getBlobDate <em>Blob Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob Date</em>' attribute.
	 * @see #getBlobDate()
	 * @generated
	 */
	void setBlobDate(Date value);

	@GET
	@Path("{filename}")
	@Produces({ "application/octet-stream" })
	public InputStream asFile(@PathParam("filename") String filename) throws IOException;

	@GET
	@Path("{filename}.jpg")
	@Produces({ "image/jpeg" })
	public InputStream asFileJpg(@PathParam("filename") String filename) throws IOException;

	public InputStream asFile(String filename, IProgressMonitor monitor) throws IOException;

	public Object getFileOrStream(String filename, IProgressMonitor monitor) throws IOException;

	public boolean isBlobUpToDate();
	
} // Artifact
