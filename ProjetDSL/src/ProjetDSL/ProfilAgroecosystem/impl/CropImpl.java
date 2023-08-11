/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Crop;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getIdCrop <em>Id Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getCropName <em>Crop Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getTypeCrop <em>Type Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getYield <em>Yield</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getDateCrop <em>Date Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getArea <em>Area</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CropImpl extends MinimalEObjectImpl.Container implements Crop {
	/**
	 * The default value of the '{@link #getIdCrop() <em>Id Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCrop()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_CROP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdCrop() <em>Id Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCrop()
	 * @generated
	 * @ordered
	 */
	protected int idCrop = ID_CROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCropName() <em>Crop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCropName()
	 * @generated
	 * @ordered
	 */
	protected static final String CROP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCropName() <em>Crop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCropName()
	 * @generated
	 * @ordered
	 */
	protected String cropName = CROP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCrop() <em>Type Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCrop()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeCrop() <em>Type Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCrop()
	 * @generated
	 * @ordered
	 */
	protected String typeCrop = TYPE_CROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getYield() <em>Yield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYield()
	 * @generated
	 * @ordered
	 */
	protected static final String YIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYield() <em>Yield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYield()
	 * @generated
	 * @ordered
	 */
	protected String yield = YIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCrop() <em>Date Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCrop()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CROP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCrop() <em>Date Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCrop()
	 * @generated
	 * @ordered
	 */
	protected Date dateCrop = DATE_CROP_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

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
	protected CropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.CROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdCrop() {
		return idCrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdCrop(int newIdCrop) {
		int oldIdCrop = idCrop;
		idCrop = newIdCrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__ID_CROP, oldIdCrop, idCrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCropName() {
		return cropName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCropName(String newCropName) {
		String oldCropName = cropName;
		cropName = newCropName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__CROP_NAME, oldCropName, cropName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeCrop() {
		return typeCrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCrop(String newTypeCrop) {
		String oldTypeCrop = typeCrop;
		typeCrop = newTypeCrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__TYPE_CROP, oldTypeCrop, typeCrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYield() {
		return yield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYield(String newYield) {
		String oldYield = yield;
		yield = newYield;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__YIELD, oldYield, yield));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCrop() {
		return dateCrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCrop(Date newDateCrop) {
		Date oldDateCrop = dateCrop;
		dateCrop = newDateCrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__DATE_CROP, oldDateCrop, dateCrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__AREA, oldArea, area));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.CROP__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.CROP__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.CROP__ID_CROP:
				return getIdCrop();
			case ProfilAgroecosystemPackage.CROP__CROP_NAME:
				return getCropName();
			case ProfilAgroecosystemPackage.CROP__TYPE_CROP:
				return getTypeCrop();
			case ProfilAgroecosystemPackage.CROP__YIELD:
				return getYield();
			case ProfilAgroecosystemPackage.CROP__DATE_CROP:
				return getDateCrop();
			case ProfilAgroecosystemPackage.CROP__AREA:
				return getArea();
			case ProfilAgroecosystemPackage.CROP__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.CROP__ID_CROP:
				setIdCrop((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__CROP_NAME:
				setCropName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__TYPE_CROP:
				setTypeCrop((String)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__YIELD:
				setYield((String)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__DATE_CROP:
				setDateCrop((Date)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__AREA:
				setArea((String)newValue);
				return;
			case ProfilAgroecosystemPackage.CROP__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.CROP__ID_CROP:
				setIdCrop(ID_CROP_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__CROP_NAME:
				setCropName(CROP_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__TYPE_CROP:
				setTypeCrop(TYPE_CROP_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__YIELD:
				setYield(YIELD_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__DATE_CROP:
				setDateCrop(DATE_CROP_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.CROP__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.CROP__ID_CROP:
				return idCrop != ID_CROP_EDEFAULT;
			case ProfilAgroecosystemPackage.CROP__CROP_NAME:
				return CROP_NAME_EDEFAULT == null ? cropName != null : !CROP_NAME_EDEFAULT.equals(cropName);
			case ProfilAgroecosystemPackage.CROP__TYPE_CROP:
				return TYPE_CROP_EDEFAULT == null ? typeCrop != null : !TYPE_CROP_EDEFAULT.equals(typeCrop);
			case ProfilAgroecosystemPackage.CROP__YIELD:
				return YIELD_EDEFAULT == null ? yield != null : !YIELD_EDEFAULT.equals(yield);
			case ProfilAgroecosystemPackage.CROP__DATE_CROP:
				return DATE_CROP_EDEFAULT == null ? dateCrop != null : !DATE_CROP_EDEFAULT.equals(dateCrop);
			case ProfilAgroecosystemPackage.CROP__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
			case ProfilAgroecosystemPackage.CROP__BASE_CLASS:
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
		result.append(" (idCrop: ");
		result.append(idCrop);
		result.append(", cropName: ");
		result.append(cropName);
		result.append(", typeCrop: ");
		result.append(typeCrop);
		result.append(", yield: ");
		result.append(yield);
		result.append(", dateCrop: ");
		result.append(dateCrop);
		result.append(", area: ");
		result.append(area);
		result.append(')');
		return result.toString();
	}

} //CropImpl
