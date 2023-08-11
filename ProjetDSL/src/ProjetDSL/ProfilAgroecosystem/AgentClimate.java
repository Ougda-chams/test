/**
 */
package ProjetDSL.ProfilAgroecosystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Climate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getIdAgentClimate <em>Id Agent Climate</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getAgentClimateName <em>Agent Climate Name</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getAgentClimate()
 * @model
 * @generated
 */
public interface AgentClimate extends Weather {
	/**
	 * Returns the value of the '<em><b>Id Agent Climate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Agent Climate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Agent Climate</em>' attribute.
	 * @see #setIdAgentClimate(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getAgentClimate_IdAgentClimate()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdAgentClimate();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getIdAgentClimate <em>Id Agent Climate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Agent Climate</em>' attribute.
	 * @see #getIdAgentClimate()
	 * @generated
	 */
	void setIdAgentClimate(int value);

	/**
	 * Returns the value of the '<em><b>Agent Climate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Climate Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Climate Name</em>' attribute.
	 * @see #setAgentClimateName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getAgentClimate_AgentClimateName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAgentClimateName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getAgentClimateName <em>Agent Climate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Climate Name</em>' attribute.
	 * @see #getAgentClimateName()
	 * @generated
	 */
	void setAgentClimateName(String value);

} // AgentClimate
