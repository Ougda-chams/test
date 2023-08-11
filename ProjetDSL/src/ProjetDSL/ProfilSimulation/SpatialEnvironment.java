/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getSpatialEnvironmentName <em>Spatial Environment Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getValueSpatialEnvironment <em>Value Spatial Environment</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getSpatialEnvironment()
 * @model
 * @generated
 */
public interface SpatialEnvironment extends Variable {
	/**
	 * Returns the value of the '<em><b>Spatial Environment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spatial Environment Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Environment Name</em>' attribute.
	 * @see #setSpatialEnvironmentName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getSpatialEnvironment_SpatialEnvironmentName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSpatialEnvironmentName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getSpatialEnvironmentName <em>Spatial Environment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Environment Name</em>' attribute.
	 * @see #getSpatialEnvironmentName()
	 * @generated
	 */
	void setSpatialEnvironmentName(String value);

	/**
	 * Returns the value of the '<em><b>Value Spatial Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Spatial Environment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Spatial Environment</em>' attribute.
	 * @see #setValueSpatialEnvironment(double)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getSpatialEnvironment_ValueSpatialEnvironment()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValueSpatialEnvironment();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getValueSpatialEnvironment <em>Value Spatial Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Spatial Environment</em>' attribute.
	 * @see #getValueSpatialEnvironment()
	 * @generated
	 */
	void setValueSpatialEnvironment(double value);

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getSpatialEnvironment_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // SpatialEnvironment
