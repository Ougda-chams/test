/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.Plot;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PlotImpl#getIdPlot <em>Id Plot</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PlotImpl#getPlotName <em>Plot Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.impl.PlotImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlotImpl extends MinimalEObjectImpl.Container implements Plot {
	/**
	 * The default value of the '{@link #getIdPlot() <em>Id Plot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPlot()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_PLOT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdPlot() <em>Id Plot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPlot()
	 * @generated
	 * @ordered
	 */
	protected int idPlot = ID_PLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlotName() <em>Plot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlotName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLOT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlotName() <em>Plot Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlotName()
	 * @generated
	 * @ordered
	 */
	protected String plotName = PLOT_NAME_EDEFAULT;

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
	protected PlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilAgroecosystemPackage.Literals.PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdPlot() {
		return idPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPlot(int newIdPlot) {
		int oldIdPlot = idPlot;
		idPlot = newIdPlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PLOT__ID_PLOT, oldIdPlot, idPlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlotName() {
		return plotName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlotName(String newPlotName) {
		String oldPlotName = plotName;
		plotName = newPlotName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PLOT__PLOT_NAME, oldPlotName, plotName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProfilAgroecosystemPackage.PLOT__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilAgroecosystemPackage.PLOT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfilAgroecosystemPackage.PLOT__ID_PLOT:
				return getIdPlot();
			case ProfilAgroecosystemPackage.PLOT__PLOT_NAME:
				return getPlotName();
			case ProfilAgroecosystemPackage.PLOT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PLOT__ID_PLOT:
				setIdPlot((Integer)newValue);
				return;
			case ProfilAgroecosystemPackage.PLOT__PLOT_NAME:
				setPlotName((String)newValue);
				return;
			case ProfilAgroecosystemPackage.PLOT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PLOT__ID_PLOT:
				setIdPlot(ID_PLOT_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.PLOT__PLOT_NAME:
				setPlotName(PLOT_NAME_EDEFAULT);
				return;
			case ProfilAgroecosystemPackage.PLOT__BASE_CLASS:
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
			case ProfilAgroecosystemPackage.PLOT__ID_PLOT:
				return idPlot != ID_PLOT_EDEFAULT;
			case ProfilAgroecosystemPackage.PLOT__PLOT_NAME:
				return PLOT_NAME_EDEFAULT == null ? plotName != null : !PLOT_NAME_EDEFAULT.equals(plotName);
			case ProfilAgroecosystemPackage.PLOT__BASE_CLASS:
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
		result.append(" (idPlot: ");
		result.append(idPlot);
		result.append(", plotName: ");
		result.append(plotName);
		result.append(')');
		return result.toString();
	}

} //PlotImpl
