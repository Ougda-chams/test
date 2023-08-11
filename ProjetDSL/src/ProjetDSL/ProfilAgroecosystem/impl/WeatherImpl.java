/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;
import ProjetDSL.ProfilAgroecosystem.Weather;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl#getIdWeather <em>Id Weather</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl#getWeatherName <em>Weather Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeatherImpl extends MinimalEObjectImpl.Container implements Weather {
	/**
	 * The default value of the '{@link #getIdWeather() <em>Id Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdWeather()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_WEATHER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdWeather() <em>Id Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdWeather()
	 * @generated
	 * @ordered
	 */
	protected int idWeather = ID_WEATHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeatherName() <em>Weather Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEATHER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeatherName() <em>Weather Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeatherName()
	 * @generated
	 * @ordered
	 */
	protected String weatherName = WEATHER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.WEATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdWeather() {
		return idWeather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdWeather(int newIdWeather) {
		int oldIdWeather = idWeather;
		idWeather = newIdWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.WEATHER__ID_WEATHER, oldIdWeather, idWeather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeatherName() {
		return weatherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeatherName(String newWeatherName) {
		String oldWeatherName = weatherName;
		weatherName = newWeatherName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.WEATHER__WEATHER_NAME, oldWeatherName, weatherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.WEATHER__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.WEATHER__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.WEATHER__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.WEATHER__ID_WEATHER:
				return getIdWeather();
			case ProfilAgroecosystemPackage.WEATHER__WEATHER_NAME:
				return getWeatherName();
			case ProfilAgroecosystemPackage.WEATHER__PROBABILITY:
				return getProbability();
			case ProfilAgroecosystemPackage.WEATHER__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.WEATHER__ID_WEATHER:
				setIdWeather((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.WEATHER__WEATHER_NAME:
				setWeatherName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.WEATHER__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case ProfilAgroecosystemPackage.WEATHER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.WEATHER__ID_WEATHER:
				setIdWeather(ID_WEATHER_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.WEATHER__WEATHER_NAME:
				setWeatherName(WEATHER_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.WEATHER__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.WEATHER__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.WEATHER__ID_WEATHER:
				return idWeather != ID_WEATHER_EDEFAULT;
			case ProfilAgroecosystemPackage.WEATHER__WEATHER_NAME:
				return WEATHER_NAME_EDEFAULT == null ? weatherName != null : !WEATHER_NAME_EDEFAULT.equals(weatherName);
			case ProfilAgroecosystemPackage.WEATHER__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case ProfilAgroecosystemPackage.WEATHER__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idWeather: ");
		result.append(idWeather);
		result.append(", weatherName: ");
		result.append(weatherName);
		result.append(", probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //WeatherImpl
