/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;
import ProjetDSL.ProfilSimulation.SpatialEnvironment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl#getSpatialEnvironmentName <em>Spatial Environment Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl#getValueSpatialEnvironment <em>Value Spatial Environment</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialEnvironmentImpl extends VariableImpl implements SpatialEnvironment {
	/**
	 * The default value of the '{@link #getSpatialEnvironmentName() <em>Spatial Environment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialEnvironmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPATIAL_ENVIRONMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpatialEnvironmentName() <em>Spatial Environment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialEnvironmentName()
	 * @generated
	 * @ordered
	 */
	protected String spatialEnvironmentName = SPATIAL_ENVIRONMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSpatialEnvironment() <em>Value Spatial Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpatialEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_SPATIAL_ENVIRONMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValueSpatialEnvironment() <em>Value Spatial Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpatialEnvironment()
	 * @generated
	 * @ordered
	 */
	protected double valueSpatialEnvironment = VALUE_SPATIAL_ENVIRONMENT_EDEFAULT;

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
	protected SpatialEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.SPATIAL_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpatialEnvironmentName() {
		return spatialEnvironmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpatialEnvironmentName(String newSpatialEnvironmentName) {
		String oldSpatialEnvironmentName = spatialEnvironmentName;
		spatialEnvironmentName = newSpatialEnvironmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME, oldSpatialEnvironmentName, spatialEnvironmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValueSpatialEnvironment() {
		return valueSpatialEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpatialEnvironment(double newValueSpatialEnvironment) {
		double oldValueSpatialEnvironment = valueSpatialEnvironment;
		valueSpatialEnvironment = newValueSpatialEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT, oldValueSpatialEnvironment, valueSpatialEnvironment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME:
				return getSpatialEnvironmentName();
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT:
				return getValueSpatialEnvironment();
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME:
				setSpatialEnvironmentName((String)newValue);
				return;
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT:
				setValueSpatialEnvironment((Double)newValue);
				return;
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME:
				setSpatialEnvironmentName(SPATIAL_ENVIRONMENT_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT:
				setValueSpatialEnvironment(VALUE_SPATIAL_ENVIRONMENT_EDEFAULT);
				return;
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME:
				return SPATIAL_ENVIRONMENT_NAME_EDEFAULT == null ? spatialEnvironmentName != null : !SPATIAL_ENVIRONMENT_NAME_EDEFAULT.equals(spatialEnvironmentName);
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT:
				return valueSpatialEnvironment != VALUE_SPATIAL_ENVIRONMENT_EDEFAULT;
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT__BASE_PROPERTY:
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
		result.append(" (spatialEnvironmentName: ");
		result.append(spatialEnvironmentName);
		result.append(", valueSpatialEnvironment: ");
		result.append(valueSpatialEnvironment);
		result.append(')');
		return result.toString();
	}

} //SpatialEnvironmentImpl
