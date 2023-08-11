/**
 */
package ProjetDSL.ProfilAgroecosystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Rotation#getRotationName <em>Rotation Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Rotation#getDateRotation <em>Date Rotation</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Rotation#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getRotation()
 * @model
 * @generated
 */
public interface Rotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Rotation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Name</em>' attribute.
	 * @see #setRotationName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getRotation_RotationName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRotationName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getRotationName <em>Rotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Name</em>' attribute.
	 * @see #getRotationName()
	 * @generated
	 */
	void setRotationName(String value);

	/**
	 * Returns the value of the '<em><b>Date Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Rotation</em>' attribute.
	 * @see #setDateRotation(Date)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getRotation_DateRotation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateRotation();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getDateRotation <em>Date Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Rotation</em>' attribute.
	 * @see #getDateRotation()
	 * @generated
	 */
	void setDateRotation(Date value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getRotation_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Rotation
