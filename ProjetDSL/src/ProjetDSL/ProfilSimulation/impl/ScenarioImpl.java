/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;
import ProjetDSL.ProfilSimulation.Scenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.ScenarioImpl#getIdScenario <em>Id Scenario</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.ScenarioImpl#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.ScenarioImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getIdScenario() <em>Id Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdScenario()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_SCENARIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdScenario() <em>Id Scenario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdScenario()
	 * @generated
	 * @ordered
	 */
	protected int idScenario = ID_SCENARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioName()
	 * @generated
	 * @ordered
	 */
	protected String scenarioName = SCENARIO_NAME_EDEFAULT;

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
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdScenario() {
		return idScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdScenario(int newIdScenario) {
		int oldIdScenario = idScenario;
		idScenario = newIdScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SCENARIO__ID_SCENARIO, oldIdScenario, idScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioName() {
		return scenarioName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioName(String newScenarioName) {
		String oldScenarioName = scenarioName;
		scenarioName = newScenarioName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SCENARIO__SCENARIO_NAME, oldScenarioName, scenarioName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.SCENARIO__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SCENARIO__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.SCENARIO__ID_SCENARIO:
				return getIdScenario();
			case ProfilSimulationPackage.SCENARIO__SCENARIO_NAME:
				return getScenarioName();
			case ProfilSimulationPackage.SCENARIO__BASE_CLASS:
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
			case ProfilSimulationPackage.SCENARIO__ID_SCENARIO:
				setIdScenario((Integer)newValue);
				return;
			case ProfilSimulationPackage.SCENARIO__SCENARIO_NAME:
				setScenarioName((String)newValue);
				return;
			case ProfilSimulationPackage.SCENARIO__BASE_CLASS:
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
			case ProfilSimulationPackage.SCENARIO__ID_SCENARIO:
				setIdScenario(ID_SCENARIO_EDEFAULT);
				return;
			case ProfilSimulationPackage.SCENARIO__SCENARIO_NAME:
				setScenarioName(SCENARIO_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.SCENARIO__BASE_CLASS:
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
			case ProfilSimulationPackage.SCENARIO__ID_SCENARIO:
				return idScenario != ID_SCENARIO_EDEFAULT;
			case ProfilSimulationPackage.SCENARIO__SCENARIO_NAME:
				return SCENARIO_NAME_EDEFAULT == null ? scenarioName != null : !SCENARIO_NAME_EDEFAULT.equals(scenarioName);
			case ProfilSimulationPackage.SCENARIO__BASE_CLASS:
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
		result.append(" (idScenario: ");
		result.append(idScenario);
		result.append(", scenarioName: ");
		result.append(scenarioName);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
