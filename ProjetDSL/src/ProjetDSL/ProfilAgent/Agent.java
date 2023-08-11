/**
 */
package ProjetDSL.ProfilAgent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.Agent#getIdAgent <em>Id Agent</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Agent#getAgentName <em>Agent Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Agent#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Agent</em>' attribute.
	 * @see #setIdAgent(int)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAgent_IdAgent()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdAgent();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Agent#getIdAgent <em>Id Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Agent</em>' attribute.
	 * @see #getIdAgent()
	 * @generated
	 */
	void setIdAgent(int value);

	/**
	 * Returns the value of the '<em><b>Agent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Name</em>' attribute.
	 * @see #setAgentName(String)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAgent_AgentName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAgentName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Agent#getAgentName <em>Agent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Name</em>' attribute.
	 * @see #getAgentName()
	 * @generated
	 */
	void setAgentName(String value);

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
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAgent_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Agent#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Agent
