/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.Scenario#getIdScenario <em>Id Scenario</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Scenario#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Scenario#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Scenario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Scenario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Scenario</em>' attribute.
	 * @see #setIdScenario(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getScenario_IdScenario()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdScenario();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Scenario#getIdScenario <em>Id Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Scenario</em>' attribute.
	 * @see #getIdScenario()
	 * @generated
	 */
	void setIdScenario(int value);

	/**
	 * Returns the value of the '<em><b>Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Name</em>' attribute.
	 * @see #setScenarioName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getScenario_ScenarioName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getScenarioName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Scenario#getScenarioName <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Name</em>' attribute.
	 * @see #getScenarioName()
	 * @generated
	 */
	void setScenarioName(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getScenario_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Scenario#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Scenario
