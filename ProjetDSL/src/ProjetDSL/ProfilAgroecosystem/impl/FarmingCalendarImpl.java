/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.FarmingCalendar;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Farming Calendar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl#getFarmingCalendarName <em>Farming Calendar Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl#getYear <em>Year</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FarmingCalendarImpl extends MinimalEObjectImpl.Container implements FarmingCalendar {
	/**
	 * The default value of the '{@link #getFarmingCalendarName() <em>Farming Calendar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarmingCalendarName()
	 * @generated
	 * @ordered
	 */
	protected static final String FARMING_CALENDAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarmingCalendarName() <em>Farming Calendar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarmingCalendarName()
	 * @generated
	 * @ordered
	 */
	protected String farmingCalendarName = FARMING_CALENDAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final Date YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Date year = YEAR_EDEFAULT;

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
	protected FarmingCalendarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.FARMING_CALENDAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFarmingCalendarName() {
		return farmingCalendarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarmingCalendarName(String newFarmingCalendarName) {
		String oldFarmingCalendarName = farmingCalendarName;
		farmingCalendarName = newFarmingCalendarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARMING_CALENDAR__FARMING_CALENDAR_NAME, oldFarmingCalendarName, farmingCalendarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Date newYear) {
		Date oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARMING_CALENDAR__YEAR, oldYear, year));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__FARMING_CALENDAR_NAME:
				return getFarmingCalendarName();
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__YEAR:
				return getYear();
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__FARMING_CALENDAR_NAME:
				setFarmingCalendarName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__YEAR:
				setYear((Date)newValue);
				return;
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__FARMING_CALENDAR_NAME:
				setFarmingCalendarName(FARMING_CALENDAR_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__FARMING_CALENDAR_NAME:
				return FARMING_CALENDAR_NAME_EDEFAULT == null ? farmingCalendarName != null : !FARMING_CALENDAR_NAME_EDEFAULT.equals(farmingCalendarName);
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case ProfilAgroecosystemPackage.FARMING_CALENDAR__BASE_CLASS:
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
		result.append(" (farmingCalendarName: ");
		result.append(farmingCalendarName);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //FarmingCalendarImpl
