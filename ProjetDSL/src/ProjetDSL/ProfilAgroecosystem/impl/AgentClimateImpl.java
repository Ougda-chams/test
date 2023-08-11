/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.AgentClimate;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Climate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl#getIdAgentClimate <em>Id Agent Climate</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl#getAgentClimateName <em>Agent Climate Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentClimateImpl extends WeatherImpl implements AgentClimate {
	/**
	 * The default value of the '{@link #getIdAgentClimate() <em>Id Agent Climate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAgentClimate()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_AGENT_CLIMATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdAgentClimate() <em>Id Agent Climate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAgentClimate()
	 * @generated
	 * @ordered
	 */
	protected int idAgentClimate = ID_AGENT_CLIMATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentClimateName() <em>Agent Climate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentClimateName()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_CLIMATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentClimateName() <em>Agent Climate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentClimateName()
	 * @generated
	 * @ordered
	 */
	protected String agentClimateName = AGENT_CLIMATE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentClimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.AGENT_CLIMATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdAgentClimate() {
		return idAgentClimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAgentClimate(int newIdAgentClimate) {
		int oldIdAgentClimate = idAgentClimate;
		idAgentClimate = newIdAgentClimate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.AGENT_CLIMATE__ID_AGENT_CLIMATE, oldIdAgentClimate, idAgentClimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentClimateName() {
		return agentClimateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentClimateName(String newAgentClimateName) {
		String oldAgentClimateName = agentClimateName;
		agentClimateName = newAgentClimateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.AGENT_CLIMATE__AGENT_CLIMATE_NAME, oldAgentClimateName, agentClimateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__ID_AGENT_CLIMATE:
				return getIdAgentClimate();
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__AGENT_CLIMATE_NAME:
				return getAgentClimateName();
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
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__ID_AGENT_CLIMATE:
				setIdAgentClimate((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__AGENT_CLIMATE_NAME:
				setAgentClimateName((String)newValue);
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
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__ID_AGENT_CLIMATE:
				setIdAgentClimate(ID_AGENT_CLIMATE_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__AGENT_CLIMATE_NAME:
				setAgentClimateName(AGENT_CLIMATE_NAME_EDEFAULT);
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
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__ID_AGENT_CLIMATE:
				return idAgentClimate != ID_AGENT_CLIMATE_EDEFAULT;
			case ProfilAgroecosystemPackage.AGENT_CLIMATE__AGENT_CLIMATE_NAME:
				return AGENT_CLIMATE_NAME_EDEFAULT == null ? agentClimateName != null : !AGENT_CLIMATE_NAME_EDEFAULT.equals(agentClimateName);
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
		result.append(" (idAgentClimate: ");
		result.append(idAgentClimate);
		result.append(", agentClimateName: ");
		result.append(agentClimateName);
		result.append(')');
		return result.toString();
	}

} //AgentClimateImpl
