/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.Output;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.OutputImpl#getIdOutput <em>Id Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.OutputImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.OutputImpl#getTypeOutput <em>Type Output</em>}</li>
 *   <li>{@link ProjetDSL.ProfilSimulation.impl.OutputImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output {
	/**
	 * The default value of the '{@link #getIdOutput() <em>Id Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOutput()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_OUTPUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdOutput() <em>Id Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOutput()
	 * @generated
	 * @ordered
	 */
	protected int idOutput = ID_OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected String outputName = OUTPUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOutput() <em>Type Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOutput() <em>Type Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOutput()
	 * @generated
	 * @ordered
	 */
	protected String typeOutput = TYPE_OUTPUT_EDEFAULT;

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
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilSimulationPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdOutput() {
		return idOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOutput(int newIdOutput) {
		int oldIdOutput = idOutput;
		idOutput = newIdOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.OUTPUT__ID_OUTPUT, oldIdOutput, idOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputName() {
		return outputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputName(String newOutputName) {
		String oldOutputName = outputName;
		outputName = newOutputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.OUTPUT__OUTPUT_NAME, oldOutputName, outputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOutput() {
		return typeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOutput(String newTypeOutput) {
		String oldTypeOutput = typeOutput;
		typeOutput = newTypeOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.OUTPUT__TYPE_OUTPUT, oldTypeOutput, typeOutput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilSimulationPackage.OUTPUT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilSimulationPackage.OUTPUT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilSimulationPackage.OUTPUT__ID_OUTPUT:
				return getIdOutput();
			case ProfilSimulationPackage.OUTPUT__OUTPUT_NAME:
				return getOutputName();
			case ProfilSimulationPackage.OUTPUT__TYPE_OUTPUT:
				return getTypeOutput();
			case ProfilSimulationPackage.OUTPUT__BASE_CLASS:
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
			case ProfilSimulationPackage.OUTPUT__ID_OUTPUT:
				setIdOutput((Integer)newValue);
				return;
			case ProfilSimulationPackage.OUTPUT__OUTPUT_NAME:
				setOutputName((String)newValue);
				return;
			case ProfilSimulationPackage.OUTPUT__TYPE_OUTPUT:
				setTypeOutput((String)newValue);
				return;
			case ProfilSimulationPackage.OUTPUT__BASE_CLASS:
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
			case ProfilSimulationPackage.OUTPUT__ID_OUTPUT:
				setIdOutput(ID_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.OUTPUT__OUTPUT_NAME:
				setOutputName(OUTPUT_NAME_EDEFAULT);
				return;
			case ProfilSimulationPackage.OUTPUT__TYPE_OUTPUT:
				setTypeOutput(TYPE_OUTPUT_EDEFAULT);
				return;
			case ProfilSimulationPackage.OUTPUT__BASE_CLASS:
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
			case ProfilSimulationPackage.OUTPUT__ID_OUTPUT:
				return idOutput != ID_OUTPUT_EDEFAULT;
			case ProfilSimulationPackage.OUTPUT__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
			case ProfilSimulationPackage.OUTPUT__TYPE_OUTPUT:
				return TYPE_OUTPUT_EDEFAULT == null ? typeOutput != null : !TYPE_OUTPUT_EDEFAULT.equals(typeOutput);
			case ProfilSimulationPackage.OUTPUT__BASE_CLASS:
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
		result.append(" (idOutput: ");
		result.append(idOutput);
		result.append(", outputName: ");
		result.append(outputName);
		result.append(", typeOutput: ");
		result.append(typeOutput);
		result.append(')');
		return result.toString();
	}

} //OutputImpl
