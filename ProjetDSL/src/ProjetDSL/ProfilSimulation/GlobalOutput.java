/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalOutput#getIdGlobalOutput <em>Id Global Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalOutput#getGlobalOutputName <em>Global Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalOutput#getTypeGlobalOutput <em>Type Global Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.GlobalOutput#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalOutput()
 * @model
 * @generated
 */
public interface GlobalOutput extends Output {
	/**
	 * Returns the value of the '<em><b>Id Global Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Global Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Global Output</em>' attribute.
	 * @see #setIdGlobalOutput(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalOutput_IdGlobalOutput()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdGlobalOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getIdGlobalOutput <em>Id Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Global Output</em>' attribute.
	 * @see #getIdGlobalOutput()
	 * @generated
	 */
	void setIdGlobalOutput(int value);

	/**
	 * Returns the value of the '<em><b>Global Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Output Name</em>' attribute.
	 * @see #setGlobalOutputName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalOutput_GlobalOutputName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getGlobalOutputName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getGlobalOutputName <em>Global Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Output Name</em>' attribute.
	 * @see #getGlobalOutputName()
	 * @generated
	 */
	void setGlobalOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Type Global Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Global Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Global Output</em>' attribute.
	 * @see #setTypeGlobalOutput(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalOutput_TypeGlobalOutput()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeGlobalOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getTypeGlobalOutput <em>Type Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Global Output</em>' attribute.
	 * @see #getTypeGlobalOutput()
	 * @generated
	 */
	void setTypeGlobalOutput(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getGlobalOutput_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // GlobalOutput
