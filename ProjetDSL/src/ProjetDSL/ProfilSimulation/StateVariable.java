/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.StateVariable#getStateVariableName <em>State Variable Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.StateVariable#getValueStateVariable <em>Value State Variable</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.StateVariable#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getStateVariable()
 * @model
 * @generated
 */
public interface StateVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>State Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variable Name</em>' attribute.
	 * @see #setStateVariableName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getStateVariable_StateVariableName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStateVariableName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.StateVariable#getStateVariableName <em>State Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Variable Name</em>' attribute.
	 * @see #getStateVariableName()
	 * @generated
	 */
	void setStateVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Value State Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value State Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value State Variable</em>' attribute.
	 * @see #setValueStateVariable(double)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getStateVariable_ValueStateVariable()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValueStateVariable();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.StateVariable#getValueStateVariable <em>Value State Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value State Variable</em>' attribute.
	 * @see #getValueStateVariable()
	 * @generated
	 */
	void setValueStateVariable(double value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getStateVariable_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.StateVariable#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // StateVariable
