/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.IndividualOutput;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl#getIdIndividualOutput <em>Id Individual Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl#getIndividualOutputName <em>Individual Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl#getTypeIndividualOutput <em>Type Individual Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualOutputImpl extends OutputImpl implements IndividualOutput {
	/**
	 * The default value of the '{@link #getIdIndividualOutput() <em>Id Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdIndividualOutput()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_INDIVIDUAL_OUTPUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdIndividualOutput() <em>Id Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdIndividualOutput()
	 * @generated
	 * @ordered
	 */
	protected int idIndividualOutput = ID_INDIVIDUAL_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndividualOutputName() <em>Individual Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIVIDUAL_OUTPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndividualOutputName() <em>Individual Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualOutputName()
	 * @generated
	 * @ordered
	 */
	protected String individualOutputName = INDIVIDUAL_OUTPUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeIndividualOutput() <em>Type Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIndividualOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_INDIVIDUAL_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeIndividualOutput() <em>Type Individual Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIndividualOutput()
	 * @generated
	 * @ordered
	 */
	protected String typeIndividualOutput = TYPE_INDIVIDUAL_OUTPUT_EDEFAULT;

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
	protected IndividualOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.INDIVIDUAL_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdIndividualOutput() {
		return idIndividualOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdIndividualOutput(int newIdIndividualOutput) {
		int oldIdIndividualOutput = idIndividualOutput;
		idIndividualOutput = newIdIndividualOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT, oldIdIndividualOutput, idIndividualOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndividualOutputName() {
		return individualOutputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndividualOutputName(String newIndividualOutputName) {
		String oldIndividualOutputName = individualOutputName;
		individualOutputName = newIndividualOutputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME, oldIndividualOutputName, individualOutputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeIndividualOutput() {
		return typeIndividualOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIndividualOutput(String newTypeIndividualOutput) {
		String oldTypeIndividualOutput = typeIndividualOutput;
		typeIndividualOutput = newTypeIndividualOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT, oldTypeIndividualOutput, typeIndividualOutput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT:
				return getIdIndividualOutput();
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME:
				return getIndividualOutputName();
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT:
				return getTypeIndividualOutput();
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT:
				setIdIndividualOutput((Integer)newValue);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME:
				setIndividualOutputName((String)newValue);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT:
				setTypeIndividualOutput((String)newValue);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT:
				setIdIndividualOutput(ID_INDIVIDUAL_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME:
				setIndividualOutputName(INDIVIDUAL_OUTPUT_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT:
				setTypeIndividualOutput(TYPE_INDIVIDUAL_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY:
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
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT:
				return idIndividualOutput != ID_INDIVIDUAL_OUTPUT_EDEFAULT;
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME:
				return INDIVIDUAL_OUTPUT_NAME_EDEFAULT == null ? individualOutputName != null : !INDIVIDUAL_OUTPUT_NAME_EDEFAULT.equals(individualOutputName);
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT:
				return TYPE_INDIVIDUAL_OUTPUT_EDEFAULT == null ? typeIndividualOutput != null : !TYPE_INDIVIDUAL_OUTPUT_EDEFAULT.equals(typeIndividualOutput);
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT__BASE_PROPERTY:
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
		result.append(" (idIndividualOutput: ");
		result.append(idIndividualOutput);
		result.append(", individualOutputName: ");
		result.append(individualOutputName);
		result.append(", typeIndividualOutput: ");
		result.append(typeIndividualOutput);
		result.append(')');
		return result.toString();
	}

} //IndividualOutputImpl
