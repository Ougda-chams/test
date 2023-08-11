/**
 */
package ProjetDSL.ProfilAgent.impl;

import ProjetDSL.ProfilAgent.Location;
import ProjetDSL.ProfilAgent.ProfilAgentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.LocationImpl#getLengthLocation <em>Length Location</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.LocationImpl#getWidthLocation <em>Width Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends CellImpl implements Location {
	/**
	 * The default value of the '{@link #getLengthLocation() <em>Length Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthLocation()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_LOCATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLengthLocation() <em>Length Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthLocation()
	 * @generated
	 * @ordered
	 */
	protected double lengthLocation = LENGTH_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthLocation() <em>Width Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthLocation()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_LOCATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidthLocation() <em>Width Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthLocation()
	 * @generated
	 * @ordered
	 */
	protected double widthLocation = WIDTH_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgentPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLengthLocation() {
		return lengthLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthLocation(double newLengthLocation) {
		double oldLengthLocation = lengthLocation;
		lengthLocation = newLengthLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.LOCATION__LENGTH_LOCATION, oldLengthLocation, lengthLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidthLocation() {
		return widthLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthLocation(double newWidthLocation) {
		double oldWidthLocation = widthLocation;
		widthLocation = newWidthLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.LOCATION__WIDTH_LOCATION, oldWidthLocation, widthLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgentPackage.LOCATION__LENGTH_LOCATION:
				return getLengthLocation();
			case ProfilAgentPackage.LOCATION__WIDTH_LOCATION:
				return getWidthLocation();
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
			case ProfilAgentPackage.LOCATION__LENGTH_LOCATION:
				setLengthLocation((Double)newValue);
				return;
			case ProfilAgentPackage.LOCATION__WIDTH_LOCATION:
				setWidthLocation((Double)newValue);
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
			case ProfilAgentPackage.LOCATION__LENGTH_LOCATION:
				setLengthLocation(LENGTH_LOCATION_EDEFAULT);
				return;
			case ProfilAgentPackage.LOCATION__WIDTH_LOCATION:
				setWidthLocation(WIDTH_LOCATION_EDEFAULT);
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
			case ProfilAgentPackage.LOCATION__LENGTH_LOCATION:
				return lengthLocation != LENGTH_LOCATION_EDEFAULT;
			case ProfilAgentPackage.LOCATION__WIDTH_LOCATION:
				return widthLocation != WIDTH_LOCATION_EDEFAULT;
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
		result.append(" (lengthLocation: ");
		result.append(lengthLocation);
		result.append(", widthLocation: ");
		result.append(widthLocation);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
