/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;
import ProjetDSL.ProfilSimulation.StateVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.StateVariableImpl#getStateVariableName <em>State Variable Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.StateVariableImpl#getValueStateVariable <em>Value State Variable</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.StateVariableImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateVariableImpl extends VariableImpl implements StateVariable {
	/**
	 * The default value of the '{@link #getStateVariableName() <em>State Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateVariableName() <em>State Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVariableName()
	 * @generated
	 * @ordered
	 */
	protected String stateVariableName = STATE_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueStateVariable() <em>Value State Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueStateVariable()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_STATE_VARIABLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValueStateVariable() <em>Value State Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueStateVariable()
	 * @generated
	 * @ordered
	 */
	protected double valueStateVariable = VALUE_STATE_VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.STATE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateVariableName() {
		return stateVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateVariableName(String newStateVariableName) {
		String oldStateVariableName = stateVariableName;
		stateVariableName = newStateVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.STATE_VARIABLE__STATE_VARIABLE_NAME, oldStateVariableName, stateVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValueStateVariable() {
		return valueStateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueStateVariable(double newValueStateVariable) {
		double oldValueStateVariable = valueStateVariable;
		valueStateVariable = newValueStateVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.STATE_VARIABLE__VALUE_STATE_VARIABLE, oldValueStateVariable, valueStateVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.STATE_VARIABLE__STATE_VARIABLE_NAME:
				return getStateVariableName();
			case ProfilSimulationPackage.STATE_VARIABLE__VALUE_STATE_VARIABLE:
				return getValueStateVariable();
			case ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
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
			case ProfilSimulationPackage.STATE_VARIABLE__STATE_VARIABLE_NAME:
				setStateVariableName((String)newValue);
				return;
			case ProfilSimulationPackage.STATE_VARIABLE__VALUE_STATE_VARIABLE:
				setValueStateVariable((Double)newValue);
				return;
			case ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case ProfilSimulationPackage.STATE_VARIABLE__STATE_VARIABLE_NAME:
				setStateVariableName(STATE_VARIABLE_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.STATE_VARIABLE__VALUE_STATE_VARIABLE:
				setValueStateVariable(VALUE_STATE_VARIABLE_EDEFAULT);
				return;
			case ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case ProfilSimulationPackage.STATE_VARIABLE__STATE_VARIABLE_NAME:
				return STATE_VARIABLE_NAME_EDEFAULT == null ? stateVariableName != null : !STATE_VARIABLE_NAME_EDEFAULT.equals(stateVariableName);
			case ProfilSimulationPackage.STATE_VARIABLE__VALUE_STATE_VARIABLE:
				return valueStateVariable != VALUE_STATE_VARIABLE_EDEFAULT;
			case ProfilSimulationPackage.STATE_VARIABLE__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (stateVariableName: ");
		result.append(stateVariableName);
		result.append(", valueStateVariable: ");
		result.append(valueStateVariable);
		result.append(')');
		return result.toString();
	}

} //StateVariableImpl
