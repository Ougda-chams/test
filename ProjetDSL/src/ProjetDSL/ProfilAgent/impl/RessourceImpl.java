/**
 */
package ProjetDSL.ProfilAgent.impl;

import ProjetDSL.ProfilAgent.ProfilAgentPackage;
import ProjetDSL.ProfilAgent.Ressource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.RessourceImpl#getIdRessource <em>Id Ressource</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.RessourceImpl#getRessourceName <em>Ressource Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.RessourceImpl#getTypeRessource <em>Type Ressource</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgent.impl.RessourceImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceImpl extends MinimalEObjectImpl.Container implements Ressource {
	/**
	 * The default value of the '{@link #getIdRessource() <em>Id Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRessource()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_RESSOURCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdRessource() <em>Id Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRessource()
	 * @generated
	 * @ordered
	 */
	protected int idRessource = ID_RESSOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRessourceName() <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESSOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRessourceName() <em>Ressource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessourceName()
	 * @generated
	 * @ordered
	 */
	protected String ressourceName = RESSOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRessource() <em>Type Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRessource()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_RESSOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRessource() <em>Type Ressource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRessource()
	 * @generated
	 * @ordered
	 */
	protected String typeRessource = TYPE_RESSOURCE_EDEFAULT;

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
	protected RessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgentPackage.Literals.RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdRessource() {
		return idRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRessource(int newIdRessource) {
		int oldIdRessource = idRessource;
		idRessource = newIdRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.RESSOURCE__ID_RESSOURCE, oldIdRessource, idRessource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRessourceName() {
		return ressourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessourceName(String newRessourceName) {
		String oldRessourceName = ressourceName;
		ressourceName = newRessourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.RESSOURCE__RESSOURCE_NAME, oldRessourceName, ressourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeRessource() {
		return typeRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRessource(String newTypeRessource) {
		String oldTypeRessource = typeRessource;
		typeRessource = newTypeRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.RESSOURCE__TYPE_RESSOURCE, oldTypeRessource, typeRessource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgentPackage.RESSOURCE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgentPackage.RESSOURCE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgentPackage.RESSOURCE__ID_RESSOURCE:
				return getIdRessource();
			case ProfilAgentPackage.RESSOURCE__RESSOURCE_NAME:
				return getRessourceName();
			case ProfilAgentPackage.RESSOURCE__TYPE_RESSOURCE:
				return getTypeRessource();
			case ProfilAgentPackage.RESSOURCE__BASE_CLASS:
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
			case ProfilAgentPackage.RESSOURCE__ID_RESSOURCE:
				setIdRessource((Integer)newValue);
				return;
			case ProfilAgentPackage.RESSOURCE__RESSOURCE_NAME:
				setRessourceName((String)newValue);
				return;
			case ProfilAgentPackage.RESSOURCE__TYPE_RESSOURCE:
				setTypeRessource((String)newValue);
				return;
			case ProfilAgentPackage.RESSOURCE__BASE_CLASS:
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
			case ProfilAgentPackage.RESSOURCE__ID_RESSOURCE:
				setIdRessource(ID_RESSOURCE_EDEFAULT);
				return;
			case ProfilAgentPackage.RESSOURCE__RESSOURCE_NAME:
				setRessourceName(RESSOURCE_NAME_EDEFAULT);
				return;
			case ProfilAgentPackage.RESSOURCE__TYPE_RESSOURCE:
				setTypeRessource(TYPE_RESSOURCE_EDEFAULT);
				return;
			case ProfilAgentPackage.RESSOURCE__BASE_CLASS:
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
			case ProfilAgentPackage.RESSOURCE__ID_RESSOURCE:
				return idRessource != ID_RESSOURCE_EDEFAULT;
			case ProfilAgentPackage.RESSOURCE__RESSOURCE_NAME:
				return RESSOURCE_NAME_EDEFAULT == null ? ressourceName != null : !RESSOURCE_NAME_EDEFAULT.equals(ressourceName);
			case ProfilAgentPackage.RESSOURCE__TYPE_RESSOURCE:
				return TYPE_RESSOURCE_EDEFAULT == null ? typeRessource != null : !TYPE_RESSOURCE_EDEFAULT.equals(typeRessource);
			case ProfilAgentPackage.RESSOURCE__BASE_CLASS:
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
		result.append(" (idRessource: ");
		result.append(idRessource);
		result.append(", ressourceName: ");
		result.append(ressourceName);
		result.append(", typeRessource: ");
		result.append(typeRessource);
		result.append(')');
		return result.toString();
	}

} //RessourceImpl
