/**
 */
package ProjetDSL.ProfilAgent.impl;

import ProjetDSL.ProfilAgent.Behaviour;
import ProjetDSL.ProfilAgent.ProfilAgentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.BehaviourImpl#getIdBehaviour <em>Id Behaviour</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.BehaviourImpl#getBehaviourName <em>Behaviour Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.BehaviourImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourImpl extends MinimalEObjectImpl.Container implements Behaviour {
	/**
	 * The default value of the '{@link #getIdBehaviour() <em>Id Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_BEHAVIOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdBehaviour() <em>Id Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBehaviour()
	 * @generated
	 * @ordered
	 */
	protected int idBehaviour = ID_BEHAVIOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehaviourName() <em>Behaviour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourName()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOUR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehaviourName() <em>Behaviour Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourName()
	 * @generated
	 * @ordered
	 */
	protected String behaviourName = BEHAVIOUR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgentPackage.Literals.BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdBehaviour() {
		return idBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdBehaviour(int newIdBehaviour) {
		int oldIdBehaviour = idBehaviour;
		idBehaviour = newIdBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.BEHAVIOUR__ID_BEHAVIOUR, oldIdBehaviour, idBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehaviourName() {
		return behaviourName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourName(String newBehaviourName) {
		String oldBehaviourName = behaviourName;
		behaviourName = newBehaviourName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.BEHAVIOUR__BEHAVIOUR_NAME, oldBehaviourName, behaviourName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgentPackage.BEHAVIOUR__ID_BEHAVIOUR:
				return getIdBehaviour();
			case ProfilAgentPackage.BEHAVIOUR__BEHAVIOUR_NAME:
				return getBehaviourName();
			case ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
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
			case ProfilAgentPackage.BEHAVIOUR__ID_BEHAVIOUR:
				setIdBehaviour((Integer)newValue);
				return;
			case ProfilAgentPackage.BEHAVIOUR__BEHAVIOUR_NAME:
				setBehaviourName((String)newValue);
				return;
			case ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
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
			case ProfilAgentPackage.BEHAVIOUR__ID_BEHAVIOUR:
				setIdBehaviour(ID_BEHAVIOUR_EDEFAULT);
				return;
			case ProfilAgentPackage.BEHAVIOUR__BEHAVIOUR_NAME:
				setBehaviourName(BEHAVIOUR_NAME_EDEFAULT);
				return;
			case ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
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
			case ProfilAgentPackage.BEHAVIOUR__ID_BEHAVIOUR:
				return idBehaviour != ID_BEHAVIOUR_EDEFAULT;
			case ProfilAgentPackage.BEHAVIOUR__BEHAVIOUR_NAME:
				return BEHAVIOUR_NAME_EDEFAULT == null ? behaviourName != null : !BEHAVIOUR_NAME_EDEFAULT.equals(behaviourName);
			case ProfilAgentPackage.BEHAVIOUR__BASE_BEHAVIOR:
				return base_Behavior != null;
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
		result.append(" (idBehaviour: ");
		result.append(idBehaviour);
		result.append(", behaviourName: ");
		result.append(behaviourName);
		result.append(')');
		return result.toString();
	}

} //BehaviourImpl
