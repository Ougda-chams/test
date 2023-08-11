/**
 */
package ProjetDSL.ProfilAgroecosystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Farming Calendar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getFarmingCalendarName <em>Farming Calendar Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getYear <em>Year</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarmingCalendar()
 * @model
 * @generated
 */
public interface FarmingCalendar extends EObject {
	/**
	 * Returns the value of the '<em><b>Farming Calendar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Farming Calendar Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Farming Calendar Name</em>' attribute.
	 * @see #setFarmingCalendarName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarmingCalendar_FarmingCalendarName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFarmingCalendarName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getFarmingCalendarName <em>Farming Calendar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Farming Calendar Name</em>' attribute.
	 * @see #getFarmingCalendarName()
	 * @generated
	 */
	void setFarmingCalendarName(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(Date)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarmingCalendar_Year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getYear();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Date value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getFarmingCalendar_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // FarmingCalendar
