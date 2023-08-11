/**
 */
package ProjetDSL.ProfilAgent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.Location#getLengthLocation <em>Length Location</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.Location#getWidthLocation <em>Width Location</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Cell {
	/**
	 * Returns the value of the '<em><b>Length Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Location</em>' attribute.
	 * @see #setLengthLocation(double)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getLocation_LengthLocation()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getLengthLocation();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Location#getLengthLocation <em>Length Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Location</em>' attribute.
	 * @see #getLengthLocation()
	 * @generated
	 */
	void setLengthLocation(double value);

	/**
	 * Returns the value of the '<em><b>Width Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Location</em>' attribute.
	 * @see #setWidthLocation(double)
	 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage#getLocation_WidthLocation()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getWidthLocation();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgent.Location#getWidthLocation <em>Width Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Location</em>' attribute.
	 * @see #getWidthLocation()
	 * @generated
	 */
	void setWidthLocation(double value);

} // Location
