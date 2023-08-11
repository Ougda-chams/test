/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalBlock#getIdGlobalBlock <em>Id Global Block</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalBlock#getGlobalBlockName <em>Global Block Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalBlock#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalBlock()
 * @model
 * @generated
 */
public interface GlobalBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Global Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Global Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Global Block</em>' attribute.
	 * @see #setIdGlobalBlock(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalBlock_IdGlobalBlock()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdGlobalBlock();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getIdGlobalBlock <em>Id Global Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Global Block</em>' attribute.
	 * @see #getIdGlobalBlock()
	 * @generated
	 */
	void setIdGlobalBlock(int value);

	/**
	 * Returns the value of the '<em><b>Global Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Block Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Block Name</em>' attribute.
	 * @see #setGlobalBlockName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalBlock_GlobalBlockName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGlobalBlockName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getGlobalBlockName <em>Global Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Block Name</em>' attribute.
	 * @see #getGlobalBlockName()
	 * @generated
	 */
	void setGlobalBlockName(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalBlock_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // GlobalBlock
