/**
 */
package ProjetDSL.ProfilAgroecosystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Clear#getClearType <em>Clear Type</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getClear()
 * @model
 * @generated
 */
public interface Clear extends Operation {
	/**
	 * Returns the value of the '<em><b>Clear Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Type</em>' attribute.
	 * @see #setClearType(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getClear_ClearType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getClearType();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Clear#getClearType <em>Clear Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Type</em>' attribute.
	 * @see #getClearType()
	 * @generated
	 */
	void setClearType(String value);

} // Clear
