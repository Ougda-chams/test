/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Irrigation;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irrigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.IrrigationImpl#getTypeIrrigation <em>Type Irrigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrrigationImpl extends OperationImpl implements Irrigation {
	/**
	 * The default value of the '{@link #getTypeIrrigation() <em>Type Irrigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIrrigation()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_IRRIGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIrrigation() <em>Type Irrigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIrrigation()
	 * @generated
	 * @ordered
	 */
	protected String typeIrrigation = TYPE_IRRIGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrrigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.IRRIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIrrigation() {
		return typeIrrigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIrrigation(String newTypeIrrigation) {
		String oldTypeIrrigation = typeIrrigation;
		typeIrrigation = newTypeIrrigation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.IRRIGATION__TYPE_IRRIGATION, oldTypeIrrigation, typeIrrigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.IRRIGATION__TYPE_IRRIGATION:
				return getTypeIrrigation();
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
			case ProfilAgroecosystemPackage.IRRIGATION__TYPE_IRRIGATION:
				setTypeIrrigation((String)newValue);
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
			case ProfilAgroecosystemPackage.IRRIGATION__TYPE_IRRIGATION:
				setTypeIrrigation(TYPE_IRRIGATION_EDEFAULT);
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
			case ProfilAgroecosystemPackage.IRRIGATION__TYPE_IRRIGATION:
				return TYPE_IRRIGATION_EDEFAULT == null ? typeIrrigation != null : !TYPE_IRRIGATION_EDEFAULT.equals(typeIrrigation);
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
		result.append(" (typeIrrigation: ");
		result.append(typeIrrigation);
		result.append(')');
		return result.toString();
	}

} //IrrigationImpl
