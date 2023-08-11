/**
 */
package ProjetDSL.ProfilAgent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.Action#getIdAction <em>Id Action</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Action#getActionName <em>Action Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Action#getBase_Action <em>Base Action</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Action</em>' attribute.
	 * @see #setIdAction(int)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAction_IdAction()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdAction();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Action#getIdAction <em>Id Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Action</em>' attribute.
	 * @see #getIdAction()
	 * @generated
	 */
	void setIdAction(int value);

	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAction_ActionName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Action#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Action</em>' reference.
	 * @see #setBase_Action(org.eclipse.uml2.uml.Action)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getAction_Base_Action()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Action getBase_Action();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Action#getBase_Action <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Action</em>' reference.
	 * @see #getBase_Action()
	 * @generated
	 */
	void setBase_Action(org.eclipse.uml2.uml.Action value);

} // Action
