/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.GlobalBlock;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl#getIdGlobalBlock <em>Id Global Block</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl#getGlobalBlockName <em>Global Block Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBlockImpl extends MinimalEObjectImpl.Container implements GlobalBlock {
	/**
	 * The default value of the '{@link #getIdGlobalBlock() <em>Id Global Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdGlobalBlock()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_GLOBAL_BLOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdGlobalBlock() <em>Id Global Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdGlobalBlock()
	 * @generated
	 * @ordered
	 */
	protected int idGlobalBlock = ID_GLOBAL_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalBlockName() <em>Global Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBlockName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_BLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalBlockName() <em>Global Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalBlockName()
	 * @generated
	 * @ordered
	 */
	protected String globalBlockName = GLOBAL_BLOCK_NAME_EDEFAULT;

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
	protected GlobalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.GLOBAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdGlobalBlock() {
		return idGlobalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdGlobalBlock(int newIdGlobalBlock) {
		int oldIdGlobalBlock = idGlobalBlock;
		idGlobalBlock = newIdGlobalBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_BLOCK__ID_GLOBAL_BLOCK, oldIdGlobalBlock, idGlobalBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalBlockName() {
		return globalBlockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalBlockName(String newGlobalBlockName) {
		String oldGlobalBlockName = globalBlockName;
		globalBlockName = newGlobalBlockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_BLOCK__GLOBAL_BLOCK_NAME, oldGlobalBlockName, globalBlockName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.GLOBAL_BLOCK__ID_GLOBAL_BLOCK:
				return getIdGlobalBlock();
			case ProfilSimulationPackage.GLOBAL_BLOCK__GLOBAL_BLOCK_NAME:
				return getGlobalBlockName();
			case ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.GLOBAL_BLOCK__ID_GLOBAL_BLOCK:
				setIdGlobalBlock((Integer)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_BLOCK__GLOBAL_BLOCK_NAME:
				setGlobalBlockName((String)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.GLOBAL_BLOCK__ID_GLOBAL_BLOCK:
				setIdGlobalBlock(ID_GLOBAL_BLOCK_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_BLOCK__GLOBAL_BLOCK_NAME:
				setGlobalBlockName(GLOBAL_BLOCK_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.GLOBAL_BLOCK__ID_GLOBAL_BLOCK:
				return idGlobalBlock != ID_GLOBAL_BLOCK_EDEFAULT;
			case ProfilSimulationPackage.GLOBAL_BLOCK__GLOBAL_BLOCK_NAME:
				return GLOBAL_BLOCK_NAME_EDEFAULT == null ? globalBlockName != null : !GLOBAL_BLOCK_NAME_EDEFAULT.equals(globalBlockName);
			case ProfilSimulationPackage.GLOBAL_BLOCK__BASE_CLASS:
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
		result.append(" (idGlobalBlock: ");
		result.append(idGlobalBlock);
		result.append(", globalBlockName: ");
		result.append(globalBlockName);
		result.append(')');
		return result.toString();
	}

} //GlobalBlockImpl
