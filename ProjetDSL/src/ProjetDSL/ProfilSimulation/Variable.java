/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.Variable#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Variable#getTypeVariable <em>Type Variable</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Variable#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getVariable_VariableName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Variable#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Type Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Variable</em>' attribute.
	 * @see #setTypeVariable(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getVariable_TypeVariable()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeVariable();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Variable#getTypeVariable <em>Type Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Variable</em>' attribute.
	 * @see #getTypeVariable()
	 * @generated
	 */
	void setTypeVariable(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getVariable_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Variable#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Variable
