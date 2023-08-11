/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.InitialBlock#getIdInitialBlock <em>Id Initial Block</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.InitialBlock#getInitialBlockName <em>Initial Block Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.InitialBlock#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getInitialBlock()
 * @model
 * @generated
 */
public interface InitialBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Initial Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Initial Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Initial Block</em>' attribute.
	 * @see #setIdInitialBlock(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getInitialBlock_IdInitialBlock()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdInitialBlock();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.InitialBlock#getIdInitialBlock <em>Id Initial Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Initial Block</em>' attribute.
	 * @see #getIdInitialBlock()
	 * @generated
	 */
	void setIdInitialBlock(int value);

	/**
	 * Returns the value of the '<em><b>Initial Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Block Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Block Name</em>' attribute.
	 * @see #setInitialBlockName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getInitialBlock_InitialBlockName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInitialBlockName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.InitialBlock#getInitialBlockName <em>Initial Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Block Name</em>' attribute.
	 * @see #getInitialBlockName()
	 * @generated
	 */
	void setInitialBlockName(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getInitialBlock_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.InitialBlock#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // InitialBlock
