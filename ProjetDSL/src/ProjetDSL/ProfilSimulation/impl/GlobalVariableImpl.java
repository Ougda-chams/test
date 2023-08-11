/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.GlobalVariable;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl#getGlobalVariableName <em>Global Variable Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl#getValueGlobalVariable <em>Value Global Variable</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalVariableImpl extends VariableImpl implements GlobalVariable {
	/**
	 * The default value of the '{@link #getGlobalVariableName() <em>Global Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalVariableName() <em>Global Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableName()
	 * @generated
	 * @ordered
	 */
	protected String globalVariableName = GLOBAL_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueGlobalVariable() <em>Value Global Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_GLOBAL_VARIABLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValueGlobalVariable() <em>Value Global Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGlobalVariable()
	 * @generated
	 * @ordered
	 */
	protected double valueGlobalVariable = VALUE_GLOBAL_VARIABLE_EDEFAULT;

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
	protected GlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.GLOBAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalVariableName() {
		return globalVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVariableName(String newGlobalVariableName) {
		String oldGlobalVariableName = globalVariableName;
		globalVariableName = newGlobalVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME, oldGlobalVariableName, globalVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValueGlobalVariable() {
		return valueGlobalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueGlobalVariable(double newValueGlobalVariable) {
		double oldValueGlobalVariable = valueGlobalVariable;
		valueGlobalVariable = newValueGlobalVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE, oldValueGlobalVariable, valueGlobalVariable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME:
				return getGlobalVariableName();
			case ProfilSimulationPackage.GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE:
				return getValueGlobalVariable();
			case ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME:
				setGlobalVariableName((String)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE:
				setValueGlobalVariable((Double)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME:
				setGlobalVariableName(GLOBAL_VARIABLE_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE:
				setValueGlobalVariable(VALUE_GLOBAL_VARIABLE_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME:
				return GLOBAL_VARIABLE_NAME_EDEFAULT == null ? globalVariableName != null : !GLOBAL_VARIABLE_NAME_EDEFAULT.equals(globalVariableName);
			case ProfilSimulationPackage.GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE:
				return valueGlobalVariable != VALUE_GLOBAL_VARIABLE_EDEFAULT;
			case ProfilSimulationPackage.GLOBAL_VARIABLE__BASE_PROPERTY:
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
		result.append(" (globalVariableName: ");
		result.append(globalVariableName);
		result.append(", valueGlobalVariable: ");
		result.append(valueGlobalVariable);
		result.append(')');
		return result.toString();
	}

} //GlobalVariableImpl
