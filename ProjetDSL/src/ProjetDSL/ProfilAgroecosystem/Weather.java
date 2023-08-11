/**
 */
package ProjetDSL.ProfilAgroecosystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Weather#getIdWeather <em>Id Weather</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Weather#getWeatherName <em>Weather Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Weather#getProbability <em>Probability</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Weather#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getWeather()
 * @model
 * @generated
 */
public interface Weather extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Weather</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Weather</em>' attribute.
	 * @see #setIdWeather(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getWeather_IdWeather()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdWeather();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Weather#getIdWeather <em>Id Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Weather</em>' attribute.
	 * @see #getIdWeather()
	 * @generated
	 */
	void setIdWeather(int value);

	/**
	 * Returns the value of the '<em><b>Weather Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weather Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather Name</em>' attribute.
	 * @see #setWeatherName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getWeather_WeatherName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getWeatherName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Weather#getWeatherName <em>Weather Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather Name</em>' attribute.
	 * @see #getWeatherName()
	 * @generated
	 */
	void setWeatherName(String value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getWeather_Probability()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Weather#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

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
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getWeather_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Weather#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Weather
