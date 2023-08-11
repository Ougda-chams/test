/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Asset;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl#getIdAsset <em>Id Asset</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl#getAssetName <em>Asset Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The default value of the '{@link #getIdAsset() <em>Id Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAsset()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_ASSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdAsset() <em>Id Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAsset()
	 * @generated
	 * @ordered
	 */
	protected int idAsset = ID_ASSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetName() <em>Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetName() <em>Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetName()
	 * @generated
	 * @ordered
	 */
	protected String assetName = ASSET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAsset() <em>Type Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ASSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected String typeAsset = TYPE_ASSET_EDEFAULT;

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
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdAsset() {
		return idAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAsset(int newIdAsset) {
		int oldIdAsset = idAsset;
		idAsset = newIdAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ASSET__ID_ASSET, oldIdAsset, idAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetName() {
		return assetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetName(String newAssetName) {
		String oldAssetName = assetName;
		assetName = newAssetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ASSET__ASSET_NAME, oldAssetName, assetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAsset(String newTypeAsset) {
		String oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ASSET__TYPE_ASSET, oldTypeAsset, typeAsset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.ASSET__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.ASSET__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.ASSET__ID_ASSET:
				return getIdAsset();
			case ProfilAgroecosystemPackage.ASSET__ASSET_NAME:
				return getAssetName();
			case ProfilAgroecosystemPackage.ASSET__TYPE_ASSET:
				return getTypeAsset();
			case ProfilAgroecosystemPackage.ASSET__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ASSET__ID_ASSET:
				setIdAsset((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.ASSET__ASSET_NAME:
				setAssetName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.ASSET__TYPE_ASSET:
				setTypeAsset((String)newValue);
				return;
			case ProfilAgroecosystemPackage.ASSET__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ASSET__ID_ASSET:
				setIdAsset(ID_ASSET_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.ASSET__ASSET_NAME:
				setAssetName(ASSET_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.ASSET__TYPE_ASSET:
				setTypeAsset(TYPE_ASSET_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.ASSET__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.ASSET__ID_ASSET:
				return idAsset != ID_ASSET_EDEFAULT;
			case ProfilAgroecosystemPackage.ASSET__ASSET_NAME:
				return ASSET_NAME_EDEFAULT == null ? assetName != null : !ASSET_NAME_EDEFAULT.equals(assetName);
			case ProfilAgroecosystemPackage.ASSET__TYPE_ASSET:
				return TYPE_ASSET_EDEFAULT == null ? typeAsset != null : !TYPE_ASSET_EDEFAULT.equals(typeAsset);
			case ProfilAgroecosystemPackage.ASSET__BASE_CLASS:
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
		result.append(" (idAsset: ");
		result.append(idAsset);
		result.append(", assetName: ");
		result.append(assetName);
		result.append(", typeAsset: ");
		result.append(typeAsset);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
