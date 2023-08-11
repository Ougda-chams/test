/**
 */
package ProjetDSL.ProfilAgroecosystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Plot#getIdPlot <em>Id Plot</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Plot#getPlotName <em>Plot Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Plot#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPlot()
 * @model
 * @generated
 */
public interface Plot extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Plot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Plot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Plot</em>' attribute.
	 * @see #setIdPlot(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPlot_IdPlot()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdPlot();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Plot#getIdPlot <em>Id Plot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Plot</em>' attribute.
	 * @see #getIdPlot()
	 * @generated
	 */
	void setIdPlot(int value);

	/**
	 * Returns the value of the '<em><b>Plot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot Name</em>' attribute.
	 * @see #setPlotName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPlot_PlotName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPlotName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Plot#getPlotName <em>Plot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plot Name</em>' attribute.
	 * @see #getPlotName()
	 * @generated
	 */
	void setPlotName(String value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getPlot_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Plot#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Plot
