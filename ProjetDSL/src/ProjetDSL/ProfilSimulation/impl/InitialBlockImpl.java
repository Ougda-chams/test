/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.InitialBlock;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.InitialBlockImpl#getIdInitialBlock <em>Id Initial Block</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.InitialBlockImpl#getInitialBlockName <em>Initial Block Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.InitialBlockImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialBlockImpl extends MinimalEObjectImpl.Container implements InitialBlock {
	/**
	 * The default value of the '{@link #getIdInitialBlock() <em>Id Initial Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInitialBlock()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_INITIAL_BLOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdInitialBlock() <em>Id Initial Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdInitialBlock()
	 * @generated
	 * @ordered
	 */
	protected int idInitialBlock = ID_INITIAL_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialBlockName() <em>Initial Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBlockName()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_BLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialBlockName() <em>Initial Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialBlockName()
	 * @generated
	 * @ordered
	 */
	protected String initialBlockName = INITIAL_BLOCK_NAME_EDEFAULT;

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
	protected InitialBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.INITIAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdInitialBlock() {
		return idInitialBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdInitialBlock(int newIdInitialBlock) {
		int oldIdInitialBlock = idInitialBlock;
		idInitialBlock = newIdInitialBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INITIAL_BLOCK__ID_INITIAL_BLOCK, oldIdInitialBlock, idInitialBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialBlockName() {
		return initialBlockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialBlockName(String newInitialBlockName) {
		String oldInitialBlockName = initialBlockName;
		initialBlockName = newInitialBlockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INITIAL_BLOCK__INITIAL_BLOCK_NAME, oldInitialBlockName, initialBlockName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.INITIAL_BLOCK__ID_INITIAL_BLOCK:
				return getIdInitialBlock();
			case ProfilSimulationPackage.INITIAL_BLOCK__INITIAL_BLOCK_NAME:
				return getInitialBlockName();
			case ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.INITIAL_BLOCK__ID_INITIAL_BLOCK:
				setIdInitialBlock((Integer)newValue);
				return;
			case ProfilSimulationPackage.INITIAL_BLOCK__INITIAL_BLOCK_NAME:
				setInitialBlockName((String)newValue);
				return;
			case ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.INITIAL_BLOCK__ID_INITIAL_BLOCK:
				setIdInitialBlock(ID_INITIAL_BLOCK_EDEFAULT);
				return;
			case ProfilSimulationPackage.INITIAL_BLOCK__INITIAL_BLOCK_NAME:
				setInitialBlockName(INITIAL_BLOCK_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS:
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
			case ProfilSimulationPackage.INITIAL_BLOCK__ID_INITIAL_BLOCK:
				return idInitialBlock != ID_INITIAL_BLOCK_EDEFAULT;
			case ProfilSimulationPackage.INITIAL_BLOCK__INITIAL_BLOCK_NAME:
				return INITIAL_BLOCK_NAME_EDEFAULT == null ? initialBlockName != null : !INITIAL_BLOCK_NAME_EDEFAULT.equals(initialBlockName);
			case ProfilSimulationPackage.INITIAL_BLOCK__BASE_CLASS:
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
		result.append(" (idInitialBlock: ");
		result.append(idInitialBlock);
		result.append(", initialBlockName: ");
		result.append(initialBlockName);
		result.append(')');
		return result.toString();
	}

} //InitialBlockImpl
