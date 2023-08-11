/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIdIndividualOutput <em>Id Individual Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIndividualOutputName <em>Individual Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.IndividualOutput#getTypeIndividualOutput <em>Type Individual Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.IndividualOutput#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getIndividualOutput()
 * @model
 * @generated
 */
public interface IndividualOutput extends Output {
	/**
	 * Returns the value of the '<em><b>Id Individual Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Individual Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Individual Output</em>' attribute.
	 * @see #setIdIndividualOutput(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getIndividualOutput_IdIndividualOutput()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdIndividualOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIdIndividualOutput <em>Id Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Individual Output</em>' attribute.
	 * @see #getIdIndividualOutput()
	 * @generated
	 */
	void setIdIndividualOutput(int value);

	/**
	 * Returns the value of the '<em><b>Individual Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individual Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Output Name</em>' attribute.
	 * @see #setIndividualOutputName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getIndividualOutput_IndividualOutputName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIndividualOutputName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIndividualOutputName <em>Individual Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Output Name</em>' attribute.
	 * @see #getIndividualOutputName()
	 * @generated
	 */
	void setIndividualOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Type Individual Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Individual Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Individual Output</em>' attribute.
	 * @see #setTypeIndividualOutput(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getIndividualOutput_TypeIndividualOutput()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeIndividualOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getTypeIndividualOutput <em>Type Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Individual Output</em>' attribute.
	 * @see #getTypeIndividualOutput()
	 * @generated
	 */
	void setTypeIndividualOutput(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getIndividualOutput_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // IndividualOutput
