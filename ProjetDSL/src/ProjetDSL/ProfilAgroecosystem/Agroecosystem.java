/**
 */
package ProjetDSL.ProfilAgroecosystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agroecosystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Agroecosystem#getBase_Package <em>Base Package</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getAgroecosystem()
 * @model
 * @generated
 */
public interface Agroecosystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getAgroecosystem_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Agroecosystem#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

} // Agroecosystem
