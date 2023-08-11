/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalVariable#getGlobalVariableName <em>Global Variable Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalVariable#getValueGlobalVariable <em>Value Global Variable</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalVariable#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalVariable()
 * @model
 * @generated
 */
public interface GlobalVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Global Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Name</em>' attribute.
	 * @see #setGlobalVariableName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalVariable_GlobalVariableName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGlobalVariableName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getGlobalVariableName <em>Global Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Variable Name</em>' attribute.
	 * @see #getGlobalVariableName()
	 * @generated
	 */
	void setGlobalVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Value Global Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Global Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Global Variable</em>' attribute.
	 * @see #setValueGlobalVariable(double)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalVariable_ValueGlobalVariable()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValueGlobalVariable();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getValueGlobalVariable <em>Value Global Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Global Variable</em>' attribute.
	 * @see #getValueGlobalVariable()
	 * @generated
	 */
	void setValueGlobalVariable(double value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalVariable_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // GlobalVariable
