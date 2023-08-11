/**
 */
package ProjetDSL.ProfilAgroecosystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peasant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Peasant#getIdPeasant <em>Id Peasant</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Peasant#getPeasantName <em>Peasant Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Peasant#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPeasant()
 * @model
 * @generated
 */
public interface Peasant extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Peasant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Peasant</em>' attribute.
	 * @see #setIdPeasant(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPeasant_IdPeasant()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdPeasant();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getIdPeasant <em>Id Peasant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Peasant</em>' attribute.
	 * @see #getIdPeasant()
	 * @generated
	 */
	void setIdPeasant(int value);

	/**
	 * Returns the value of the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peasant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peasant Name</em>' attribute.
	 * @see #setPeasantName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPeasant_PeasantName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPeasantName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getPeasantName <em>Peasant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peasant Name</em>' attribute.
	 * @see #getPeasantName()
	 * @generated
	 */
	void setPeasantName(String value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPeasant_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Peasant
