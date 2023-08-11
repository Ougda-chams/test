/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;
import ProjetDSL.ProfilAgroecosystem.Rotation;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.RotationImpl#getRotationName <em>Rotation Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.RotationImpl#getDateRotation <em>Date Rotation</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.RotationImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationImpl extends MinimalEObjectImpl.Container implements Rotation {
	/**
	 * The default value of the '{@link #getRotationName() <em>Rotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationName() <em>Rotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationName()
	 * @generated
	 * @ordered
	 */
	protected String rotationName = ROTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateRotation() <em>Date Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateRotation() <em>Date Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRotation()
	 * @generated
	 * @ordered
	 */
	protected Date dateRotation = DATE_ROTATION_EDEFAULT;

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
	protected RotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.ROTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationName() {
		return rotationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationName(String newRotationName) {
		String oldRotationName = rotationName;
		rotationName = newRotationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ROTATION__ROTATION_NAME, oldRotationName, rotationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateRotation() {
		return dateRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRotation(Date newDateRotation) {
		Date oldDateRotation = dateRotation;
		dateRotation = newDateRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ROTATION__DATE_ROTATION, oldDateRotation, dateRotation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.ROTATION__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ROTATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.ROTATION__ROTATION_NAME:
				return getRotationName();
			case ProfilAgroecosystemPackage.ROTATION__DATE_ROTATION:
				return getDateRotation();
			case ProfilAgroecosystemPackage.ROTATION__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ROTATION__ROTATION_NAME:
				setRotationName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.ROTATION__DATE_ROTATION:
				setDateRotation((Date)newValue);
				return;
			case ProfilAgroecosystemPackage.ROTATION__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ROTATION__ROTATION_NAME:
				setRotationName(ROTATION_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.ROTATION__DATE_ROTATION:
				setDateRotation(DATE_ROTATION_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.ROTATION__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ROTATION__ROTATION_NAME:
				return ROTATION_NAME_EDEFAULT == null ? rotationName != null : !ROTATION_NAME_EDEFAULT.equals(rotationName);
			case ProfilAgroecosystemPackage.ROTATION__DATE_ROTATION:
				return DATE_ROTATION_EDEFAULT == null ? dateRotation != null : !DATE_ROTATION_EDEFAULT.equals(dateRotation);
			case ProfilAgroecosystemPackage.ROTATION__BASE_CLASS:
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
		result.append(" (rotationName: ");
		result.append(rotationName);
		result.append(", dateRotation: ");
		result.append(dateRotation);
		result.append(')');
		return result.toString();
	}

} //RotationImpl
