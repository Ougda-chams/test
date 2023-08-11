/**
 */
package ProjetDSL.ProfilAgent;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.Behaviour#getIdBehaviour <em>Id Behaviour</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Behaviour#getBehaviourName <em>Behaviour Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Behaviour#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Behaviour</em>' attribute.
	 * @see #setIdBehaviour(int)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getBehaviour_IdBehaviour()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdBehaviour();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Behaviour#getIdBehaviour <em>Id Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Behaviour</em>' attribute.
	 * @see #getIdBehaviour()
	 * @generated
	 */
	void setIdBehaviour(int value);

	/**
	 * Returns the value of the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Name</em>' attribute.
	 * @see #setBehaviourName(String)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getBehaviour_BehaviourName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBehaviourName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Behaviour#getBehaviourName <em>Behaviour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Name</em>' attribute.
	 * @see #getBehaviourName()
	 * @generated
	 */
	void setBehaviourName(String value);

	/**
	 * Returns the value of the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavior</em>' reference.
	 * @see #setBase_Behavior(Behavior)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getBehaviour_Base_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBase_Behavior();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Behaviour#getBase_Behavior <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavior</em>' reference.
	 * @see #getBase_Behavior()
	 * @generated
	 */
	void setBase_Behavior(Behavior value);

} // Behaviour
