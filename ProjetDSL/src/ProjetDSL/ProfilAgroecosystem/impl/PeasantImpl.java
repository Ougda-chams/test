/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Peasant;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peasant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl#getIdPeasant <em>Id Peasant</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl#getPeasantName <em>Peasant Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeasantImpl extends MinimalEObjectImpl.Container implements Peasant {
	/**
	 * The default value of the '{@link #getIdPeasant() <em>Id Peasant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPeasant()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PEASANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPeasant() <em>Id Peasant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPeasant()
	 * @generated
	 * @ordered
	 */
	protected int idPeasant = ID_PEASANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeasantName() <em>Peasant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeasantName()
	 * @generated
	 * @ordered
	 */
	protected static final String PEASANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeasantName() <em>Peasant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeasantName()
	 * @generated
	 * @ordered
	 */
	protected String peasantName = PEASANT_NAME_EDEFAULT;

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
	protected PeasantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.PEASANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPeasant() {
		return idPeasant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPeasant(int newIdPeasant) {
		int oldIdPeasant = idPeasant;
		idPeasant = newIdPeasant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PEASANT__ID_PEASANT, oldIdPeasant, idPeasant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeasantName() {
		return peasantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeasantName(String newPeasantName) {
		String oldPeasantName = peasantName;
		peasantName = newPeasantName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PEASANT__PEASANT_NAME, oldPeasantName, peasantName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.PEASANT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PEASANT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.PEASANT__ID_PEASANT:
				return getIdPeasant();
			case ProfilAgroecosystemPackage.PEASANT__PEASANT_NAME:
				return getPeasantName();
			case ProfilAgroecosystemPackage.PEASANT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PEASANT__ID_PEASANT:
				setIdPeasant((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.PEASANT__PEASANT_NAME:
				setPeasantName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.PEASANT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PEASANT__ID_PEASANT:
				setIdPeasant(ID_PEASANT_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.PEASANT__PEASANT_NAME:
				setPeasantName(PEASANT_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.PEASANT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PEASANT__ID_PEASANT:
				return idPeasant != ID_PEASANT_EDEFAULT;
			case ProfilAgroecosystemPackage.PEASANT__PEASANT_NAME:
				return PEASANT_NAME_EDEFAULT == null ? peasantName != null : !PEASANT_NAME_EDEFAULT.equals(peasantName);
			case ProfilAgroecosystemPackage.PEASANT__BASE_CLASS:
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
		result.append(" (idPeasant: ");
		result.append(idPeasant);
		result.append(", peasantName: ");
		result.append(peasantName);
		result.append(')');
		return result.toString();
	}

} //PeasantImpl
