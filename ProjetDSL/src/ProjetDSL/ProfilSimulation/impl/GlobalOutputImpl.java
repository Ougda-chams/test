/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.GlobalOutput;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl#getIdGlobalOutput <em>Id Global Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl#getGlobalOutputName <em>Global Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl#getTypeGlobalOutput <em>Type Global Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalOutputImpl extends OutputImpl implements GlobalOutput {
	/**
	 * The default value of the '{@link #getIdGlobalOutput() <em>Id Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdGlobalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_GLOBAL_OUTPUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdGlobalOutput() <em>Id Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdGlobalOutput()
	 * @generated
	 * @ordered
	 */
	protected int idGlobalOutput = ID_GLOBAL_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalOutputName() <em>Global Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_OUTPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalOutputName() <em>Global Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOutputName()
	 * @generated
	 * @ordered
	 */
	protected String globalOutputName = GLOBAL_OUTPUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeGlobalOutput() <em>Type Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGlobalOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_GLOBAL_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeGlobalOutput() <em>Type Global Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGlobalOutput()
	 * @generated
	 * @ordered
	 */
	protected String typeGlobalOutput = TYPE_GLOBAL_OUTPUT_EDEFAULT;

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
	protected GlobalOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.GLOBAL_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdGlobalOutput() {
		return idGlobalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdGlobalOutput(int newIdGlobalOutput) {
		int oldIdGlobalOutput = idGlobalOutput;
		idGlobalOutput = newIdGlobalOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT, oldIdGlobalOutput, idGlobalOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalOutputName() {
		return globalOutputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOutputName(String newGlobalOutputName) {
		String oldGlobalOutputName = globalOutputName;
		globalOutputName = newGlobalOutputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME, oldGlobalOutputName, globalOutputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeGlobalOutput() {
		return typeGlobalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeGlobalOutput(String newTypeGlobalOutput) {
		String oldTypeGlobalOutput = typeGlobalOutput;
		typeGlobalOutput = newTypeGlobalOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT, oldTypeGlobalOutput, typeGlobalOutput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT:
				return getIdGlobalOutput();
			case ProfilSimulationPackage.GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME:
				return getGlobalOutputName();
			case ProfilSimulationPackage.GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT:
				return getTypeGlobalOutput();
			case ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT:
				setIdGlobalOutput((Integer)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME:
				setGlobalOutputName((String)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT:
				setTypeGlobalOutput((String)newValue);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT:
				setIdGlobalOutput(ID_GLOBAL_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME:
				setGlobalOutputName(GLOBAL_OUTPUT_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT:
				setTypeGlobalOutput(TYPE_GLOBAL_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT:
				return idGlobalOutput != ID_GLOBAL_OUTPUT_EDEFAULT;
			case ProfilSimulationPackage.GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME:
				return GLOBAL_OUTPUT_NAME_EDEFAULT == null ? globalOutputName != null : !GLOBAL_OUTPUT_NAME_EDEFAULT.equals(globalOutputName);
			case ProfilSimulationPackage.GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT:
				return TYPE_GLOBAL_OUTPUT_EDEFAULT == null ? typeGlobalOutput != null : !TYPE_GLOBAL_OUTPUT_EDEFAULT.equals(typeGlobalOutput);
			case ProfilSimulationPackage.GLOBAL_OUTPUT__BASE_PROPERTY:
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
		result.append(" (idGlobalOutput: ");
		result.append(idGlobalOutput);
		result.append(", globalOutputName: ");
		result.append(globalOutputName);
		result.append(", typeGlobalOutput: ");
		result.append(typeGlobalOutput);
		result.append(')');
		return result.toString();
	}

} //GlobalOutputImpl
