/**
 */
package ProjetDSL.ProfilAgent.impl;

import ProjetDSL.ProfilAgent.Agent;
import ProjetDSL.ProfilAgent.ProfilAgentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.AgentImpl#getIdAgent <em>Id Agent</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.AgentImpl#getAgentName <em>Agent Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.AgentImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent {
	/**
	 * The default value of the '{@link #getIdAgent() <em>Id Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAgent()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_AGENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdAgent() <em>Id Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAgent()
	 * @generated
	 * @ordered
	 */
	protected int idAgent = ID_AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentName() <em>Agent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentName() <em>Agent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentName()
	 * @generated
	 * @ordered
	 */
	protected String agentName = AGENT_NAME_EDEFAULT;

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
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgentPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdAgent() {
		return idAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAgent(int newIdAgent) {
		int oldIdAgent = idAgent;
		idAgent = newIdAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.AGENT__ID_AGENT, oldIdAgent, idAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentName(String newAgentName) {
		String oldAgentName = agentName;
		agentName = newAgentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.AGENT__AGENT_NAME, oldAgentName, agentName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgentPackage.AGENT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.AGENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgentPackage.AGENT__ID_AGENT:
				return getIdAgent();
			case ProfilAgentPackage.AGENT__AGENT_NAME:
				return getAgentName();
			case ProfilAgentPackage.AGENT__BASE_CLASS:
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
			case ProfilAgentPackage.AGENT__ID_AGENT:
				setIdAgent((Integer)newValue);
				return;
			case ProfilAgentPackage.AGENT__AGENT_NAME:
				setAgentName((String)newValue);
				return;
			case ProfilAgentPackage.AGENT__BASE_CLASS:
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
			case ProfilAgentPackage.AGENT__ID_AGENT:
				setIdAgent(ID_AGENT_EDEFAULT);
				return;
			case ProfilAgentPackage.AGENT__AGENT_NAME:
				setAgentName(AGENT_NAME_EDEFAULT);
				return;
			case ProfilAgentPackage.AGENT__BASE_CLASS:
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
			case ProfilAgentPackage.AGENT__ID_AGENT:
				return idAgent != ID_AGENT_EDEFAULT;
			case ProfilAgentPackage.AGENT__AGENT_NAME:
				return AGENT_NAME_EDEFAULT == null ? agentName != null : !AGENT_NAME_EDEFAULT.equals(agentName);
			case ProfilAgentPackage.AGENT__BASE_CLASS:
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
		result.append(" (idAgent: ");
		result.append(idAgent);
		result.append(", agentName: ");
		result.append(agentName);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
