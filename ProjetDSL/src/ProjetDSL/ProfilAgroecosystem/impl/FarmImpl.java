/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Farm;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Farm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl#getIdFarm <em>Id Farm</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl#getFarmName <em>Farm Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl#getTypeFarm <em>Type Farm</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FarmImpl extends MinimalEObjectImpl.Container implements Farm {
	/**
	 * The default value of the '{@link #getIdFarm() <em>Id Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFarm()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_FARM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdFarm() <em>Id Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFarm()
	 * @generated
	 * @ordered
	 */
	protected int idFarm = ID_FARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFarmName() <em>Farm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarmName()
	 * @generated
	 * @ordered
	 */
	protected static final String FARM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarmName() <em>Farm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarmName()
	 * @generated
	 * @ordered
	 */
	protected String farmName = FARM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeFarm() <em>Type Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFarm()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_FARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeFarm() <em>Type Farm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFarm()
	 * @generated
	 * @ordered
	 */
	protected String typeFarm = TYPE_FARM_EDEFAULT;

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
	protected FarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.FARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdFarm() {
		return idFarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdFarm(int newIdFarm) {
		int oldIdFarm = idFarm;
		idFarm = newIdFarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARM__ID_FARM, oldIdFarm, idFarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFarmName() {
		return farmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarmName(String newFarmName) {
		String oldFarmName = farmName;
		farmName = newFarmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARM__FARM_NAME, oldFarmName, farmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeFarm() {
		return typeFarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFarm(String newTypeFarm) {
		String oldTypeFarm = typeFarm;
		typeFarm = newTypeFarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARM__TYPE_FARM, oldTypeFarm, typeFarm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.FARM__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.FARM__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.FARM__ID_FARM:
				return getIdFarm();
			case ProfilAgroecosystemPackage.FARM__FARM_NAME:
				return getFarmName();
			case ProfilAgroecosystemPackage.FARM__TYPE_FARM:
				return getTypeFarm();
			case ProfilAgroecosystemPackage.FARM__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARM__ID_FARM:
				setIdFarm((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.FARM__FARM_NAME:
				setFarmName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.FARM__TYPE_FARM:
				setTypeFarm((String)newValue);
				return;
			case ProfilAgroecosystemPackage.FARM__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARM__ID_FARM:
				setIdFarm(ID_FARM_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.FARM__FARM_NAME:
				setFarmName(FARM_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.FARM__TYPE_FARM:
				setTypeFarm(TYPE_FARM_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.FARM__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.FARM__ID_FARM:
				return idFarm != ID_FARM_EDEFAULT;
			case ProfilAgroecosystemPackage.FARM__FARM_NAME:
				return FARM_NAME_EDEFAULT == null ? farmName != null : !FARM_NAME_EDEFAULT.equals(farmName);
			case ProfilAgroecosystemPackage.FARM__TYPE_FARM:
				return TYPE_FARM_EDEFAULT == null ? typeFarm != null : !TYPE_FARM_EDEFAULT.equals(typeFarm);
			case ProfilAgroecosystemPackage.FARM__BASE_CLASS:
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
		result.append(" (idFarm: ");
		result.append(idFarm);
		result.append(", farmName: ");
		result.append(farmName);
		result.append(", typeFarm: ");
		result.append(typeFarm);
		result.append(')');
		return result.toString();
	}

} //FarmImpl
