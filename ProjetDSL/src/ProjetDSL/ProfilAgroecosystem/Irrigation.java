/**
 */
package ProjetDSL.ProfilAgroecosystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irrigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Irrigation#getTypeIrrigation <em>Type Irrigation</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getIrrigation()
 * @model
 * @generated
 */
public interface Irrigation extends Operation {
	/**
	 * Returns the value of the '<em><b>Type Irrigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Irrigation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Irrigation</em>' attribute.
	 * @see #setTypeIrrigation(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getIrrigation_TypeIrrigation()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeIrrigation();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Irrigation#getTypeIrrigation <em>Type Irrigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Irrigation</em>' attribute.
	 * @see #getTypeIrrigation()
	 * @generated
	 */
	void setTypeIrrigation(String value);

} // Irrigation
