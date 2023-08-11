/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.Output#getIdOutput <em>Id Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Output#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Output#getTypeOutput <em>Type Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Output#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Output</em>' attribute.
	 * @see #setIdOutput(int)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getOutput_IdOutput()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Output#getIdOutput <em>Id Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Output</em>' attribute.
	 * @see #getIdOutput()
	 * @generated
	 */
	void setIdOutput(int value);

	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getOutput_OutputName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Output#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Type Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Output</em>' attribute.
	 * @see #setTypeOutput(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getOutput_TypeOutput()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeOutput();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Output#getTypeOutput <em>Type Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Output</em>' attribute.
	 * @see #getTypeOutput()
	 * @generated
	 */
	void setTypeOutput(String value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getOutput_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Output#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Output
