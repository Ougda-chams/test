/**
 */
package ProjetDSL.ProfilAgroecosystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Farm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Farm#getIdFarm <em>Id Farm</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Farm#getFarmName <em>Farm Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Farm#getTypeFarm <em>Type Farm</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Farm#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarm()
 * @model
 * @generated
 */
public interface Farm extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Farm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Farm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Farm</em>' attribute.
	 * @see #setIdFarm(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarm_IdFarm()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdFarm();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Farm#getIdFarm <em>Id Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Farm</em>' attribute.
	 * @see #getIdFarm()
	 * @generated
	 */
	void setIdFarm(int value);

	/**
	 * Returns the value of the '<em><b>Farm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farm Name</em>' attribute.
	 * @see #setFarmName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarm_FarmName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFarmName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Farm#getFarmName <em>Farm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farm Name</em>' attribute.
	 * @see #getFarmName()
	 * @generated
	 */
	void setFarmName(String value);

	/**
	 * Returns the value of the '<em><b>Type Farm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Farm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Farm</em>' attribute.
	 * @see #setTypeFarm(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarm_TypeFarm()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeFarm();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Farm#getTypeFarm <em>Type Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Farm</em>' attribute.
	 * @see #getTypeFarm()
	 * @generated
	 */
	void setTypeFarm(String value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarm_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Farm#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Farm
