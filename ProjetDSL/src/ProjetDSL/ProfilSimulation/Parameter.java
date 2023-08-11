/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.Parameter#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Parameter#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Parameter#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.Parameter#getBase_Parameter <em>Base Parameter</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getParameter_ParameterName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter</em>' attribute.
	 * @see #setTypeParameter(String)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getParameter_TypeParameter()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeParameter();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Parameter#getTypeParameter <em>Type Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameter</em>' attribute.
	 * @see #getTypeParameter()
	 * @generated
	 */
	void setTypeParameter(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getParameter_InitialValue()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Parameter#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Returns the value of the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter</em>' reference.
	 * @see #setBase_Parameter(org.eclipse.uml2.uml.Parameter)
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#getParameter_Base_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilSimulation.Parameter#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(org.eclipse.uml2.uml.Parameter value);

} // Parameter
