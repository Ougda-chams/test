/**
 */
package ProjetDSL.ProfilAgent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.Ressource#getIdRessource <em>Id Ressource</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Ressource#getRessourceName <em>Ressource Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Ressource#getTypeRessource <em>Type Ressource</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Ressource#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getRessource()
 * @model
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ressource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ressource</em>' attribute.
	 * @see #setIdRessource(int)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getRessource_IdRessource()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdRessource();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Ressource#getIdRessource <em>Id Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ressource</em>' attribute.
	 * @see #getIdRessource()
	 * @generated
	 */
	void setIdRessource(int value);

	/**
	 * Returns the value of the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource Name</em>' attribute.
	 * @see #setRessourceName(String)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getRessource_RessourceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRessourceName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Ressource#getRessourceName <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource Name</em>' attribute.
	 * @see #getRessourceName()
	 * @generated
	 */
	void setRessourceName(String value);

	/**
	 * Returns the value of the '<em><b>Type Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ressource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ressource</em>' attribute.
	 * @see #setTypeRessource(String)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getRessource_TypeRessource()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeRessource();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Ressource#getTypeRessource <em>Type Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ressource</em>' attribute.
	 * @see #getTypeRessource()
	 * @generated
	 */
	void setTypeRessource(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getRessource_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Ressource#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Ressource
