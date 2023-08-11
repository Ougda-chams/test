/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgent.ProfilAgentPackage;

import ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl;

import ProjetDSL.ProfilAgroecosystem.AgentClimate;
import ProjetDSL.ProfilAgroecosystem.Agroecosystem;
import ProjetDSL.ProfilAgroecosystem.Asset;
import ProjetDSL.ProfilAgroecosystem.Buy;
import ProjetDSL.ProfilAgroecosystem.Clear;
import ProjetDSL.ProfilAgroecosystem.Crop;
import ProjetDSL.ProfilAgroecosystem.Cultivate;
import ProjetDSL.ProfilAgroecosystem.Farm;
import ProjetDSL.ProfilAgroecosystem.FarmingCalendar;
import ProjetDSL.ProfilAgroecosystem.Fertilize;
import ProjetDSL.ProfilAgroecosystem.Harvest;
import ProjetDSL.ProfilAgroecosystem.Irrigation;
import ProjetDSL.ProfilAgroecosystem.Operation;
import ProjetDSL.ProfilAgroecosystem.Organisation;
import ProjetDSL.ProfilAgroecosystem.Peasant;
import ProjetDSL.ProfilAgroecosystem.Plant;
import ProjetDSL.ProfilAgroecosystem.Plot;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemFactory;
import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;
import ProjetDSL.ProfilAgroecosystem.Rotation;
import ProjetDSL.ProfilAgroecosystem.Sell;
import ProjetDSL.ProfilAgroecosystem.Stock;
import ProjetDSL.ProfilAgroecosystem.Time;
import ProjetDSL.ProfilAgroecosystem.Transport;
import ProjetDSL.ProfilAgroecosystem.Transporte;
import ProjetDSL.ProfilAgroecosystem.Weather;

import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;

import ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilAgroecosystemPackageImpl extends EPackageImpl implements ProfilAgroecosystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agroecosystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peasantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass farmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weatherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass farmingCalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentClimateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fertilizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cultivateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irrigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harvestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transporteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfilAgroecosystemPackageImpl() {
		super(eNS_URI, ProfilAgroecosystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProfilAgroecosystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfilAgroecosystemPackage init() {
		if (isInited) return (ProfilAgroecosystemPackage)EPackage.Registry.INSTANCE.getEPackage(ProfilAgroecosystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProfilAgroecosystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProfilAgroecosystemPackageImpl theProfilAgroecosystemPackage = registeredProfilAgroecosystemPackage instanceof ProfilAgroecosystemPackageImpl ? (ProfilAgroecosystemPackageImpl)registeredProfilAgroecosystemPackage : new ProfilAgroecosystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilSimulationPackage.eNS_URI);
		ProfilSimulationPackageImpl theProfilSimulationPackage = (ProfilSimulationPackageImpl)(registeredPackage instanceof ProfilSimulationPackageImpl ? registeredPackage : ProfilSimulationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilAgentPackage.eNS_URI);
		ProfilAgentPackageImpl theProfilAgentPackage = (ProfilAgentPackageImpl)(registeredPackage instanceof ProfilAgentPackageImpl ? registeredPackage : ProfilAgentPackage.eINSTANCE);

		// Create package meta-data objects
		theProfilAgroecosystemPackage.createPackageContents();
		theProfilSimulationPackage.createPackageContents();
		theProfilAgentPackage.createPackageContents();

		// Initialize created meta-data
		theProfilAgroecosystemPackage.initializePackageContents();
		theProfilSimulationPackage.initializePackageContents();
		theProfilAgentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfilAgroecosystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfilAgroecosystemPackage.eNS_URI, theProfilAgroecosystemPackage);
		return theProfilAgroecosystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgroecosystem() {
		return agroecosystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgroecosystem_Base_Package() {
		return (EReference)agroecosystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeasant() {
		return peasantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeasant_IdPeasant() {
		return (EAttribute)peasantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeasant_PeasantName() {
		return (EAttribute)peasantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeasant_Base_Class() {
		return (EReference)peasantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_IdAsset() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_AssetName() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_TypeAsset() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Base_Class() {
		return (EReference)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFarm() {
		return farmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarm_IdFarm() {
		return (EAttribute)farmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarm_FarmName() {
		return (EAttribute)farmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarm_TypeFarm() {
		return (EAttribute)farmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarm_Base_Class() {
		return (EReference)farmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotation() {
		return rotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotation_RotationName() {
		return (EAttribute)rotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotation_DateRotation() {
		return (EAttribute)rotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRotation_Base_Class() {
		return (EReference)rotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlot() {
		return plotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_IdPlot() {
		return (EAttribute)plotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_PlotName() {
		return (EAttribute)plotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlot_Base_Class() {
		return (EReference)plotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrop() {
		return cropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_IdCrop() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_CropName() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_TypeCrop() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_Yield() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_DateCrop() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_Area() {
		return (EAttribute)cropEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrop_Base_Class() {
		return (EReference)cropEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeather() {
		return weatherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_IdWeather() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_WeatherName() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeather_Probability() {
		return (EAttribute)weatherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeather_Base_Class() {
		return (EReference)weatherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFarmingCalendar() {
		return farmingCalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarmingCalendar_FarmingCalendarName() {
		return (EAttribute)farmingCalendarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarmingCalendar_Year() {
		return (EAttribute)farmingCalendarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarmingCalendar_Base_Class() {
		return (EReference)farmingCalendarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentClimate() {
		return agentClimateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentClimate_IdAgentClimate() {
		return (EAttribute)agentClimateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentClimate_AgentClimateName() {
		return (EAttribute)agentClimateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_OrganizationName() {
		return (EAttribute)organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Base_Class() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OperationName() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Base_Activity() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTime_Base_Class() {
		return (EReference)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Day() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Month() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Year() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFertilize() {
		return fertilizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCultivate() {
		return cultivateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIrrigation() {
		return irrigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIrrigation_TypeIrrigation() {
		return (EAttribute)irrigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHarvest() {
		return harvestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransporte() {
		return transporteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClear() {
		return clearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClear_ClearType() {
		return (EAttribute)clearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuy() {
		return buyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSell() {
		return sellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStock() {
		return stockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransport() {
		return transportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgroecosystemFactory getProfilAgroecosystemFactory() {
		return (ProfilAgroecosystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		agroecosystemEClass = createEClass(AGROECOSYSTEM);
		createEReference(agroecosystemEClass, AGROECOSYSTEM__BASE_PACKAGE);

		peasantEClass = createEClass(PEASANT);
		createEAttribute(peasantEClass, PEASANT__ID_PEASANT);
		createEAttribute(peasantEClass, PEASANT__PEASANT_NAME);
		createEReference(peasantEClass, PEASANT__BASE_CLASS);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ID_ASSET);
		createEAttribute(assetEClass, ASSET__ASSET_NAME);
		createEAttribute(assetEClass, ASSET__TYPE_ASSET);
		createEReference(assetEClass, ASSET__BASE_CLASS);

		farmEClass = createEClass(FARM);
		createEAttribute(farmEClass, FARM__ID_FARM);
		createEAttribute(farmEClass, FARM__FARM_NAME);
		createEAttribute(farmEClass, FARM__TYPE_FARM);
		createEReference(farmEClass, FARM__BASE_CLASS);

		rotationEClass = createEClass(ROTATION);
		createEAttribute(rotationEClass, ROTATION__ROTATION_NAME);
		createEAttribute(rotationEClass, ROTATION__DATE_ROTATION);
		createEReference(rotationEClass, ROTATION__BASE_CLASS);

		plotEClass = createEClass(PLOT);
		createEAttribute(plotEClass, PLOT__ID_PLOT);
		createEAttribute(plotEClass, PLOT__PLOT_NAME);
		createEReference(plotEClass, PLOT__BASE_CLASS);

		cropEClass = createEClass(CROP);
		createEAttribute(cropEClass, CROP__ID_CROP);
		createEAttribute(cropEClass, CROP__CROP_NAME);
		createEAttribute(cropEClass, CROP__TYPE_CROP);
		createEAttribute(cropEClass, CROP__YIELD);
		createEAttribute(cropEClass, CROP__DATE_CROP);
		createEAttribute(cropEClass, CROP__AREA);
		createEReference(cropEClass, CROP__BASE_CLASS);

		weatherEClass = createEClass(WEATHER);
		createEAttribute(weatherEClass, WEATHER__ID_WEATHER);
		createEAttribute(weatherEClass, WEATHER__WEATHER_NAME);
		createEAttribute(weatherEClass, WEATHER__PROBABILITY);
		createEReference(weatherEClass, WEATHER__BASE_CLASS);

		farmingCalendarEClass = createEClass(FARMING_CALENDAR);
		createEAttribute(farmingCalendarEClass, FARMING_CALENDAR__FARMING_CALENDAR_NAME);
		createEAttribute(farmingCalendarEClass, FARMING_CALENDAR__YEAR);
		createEReference(farmingCalendarEClass, FARMING_CALENDAR__BASE_CLASS);

		agentClimateEClass = createEClass(AGENT_CLIMATE);
		createEAttribute(agentClimateEClass, AGENT_CLIMATE__ID_AGENT_CLIMATE);
		createEAttribute(agentClimateEClass, AGENT_CLIMATE__AGENT_CLIMATE_NAME);

		organisationEClass = createEClass(ORGANISATION);
		createEAttribute(organisationEClass, ORGANISATION__ORGANIZATION_NAME);
		createEReference(organisationEClass, ORGANISATION__BASE_CLASS);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__OPERATION_NAME);
		createEReference(operationEClass, OPERATION__BASE_ACTIVITY);

		timeEClass = createEClass(TIME);
		createEReference(timeEClass, TIME__BASE_CLASS);
		createEAttribute(timeEClass, TIME__DAY);
		createEAttribute(timeEClass, TIME__MONTH);
		createEAttribute(timeEClass, TIME__YEAR);

		plantEClass = createEClass(PLANT);

		fertilizeEClass = createEClass(FERTILIZE);

		cultivateEClass = createEClass(CULTIVATE);

		irrigationEClass = createEClass(IRRIGATION);
		createEAttribute(irrigationEClass, IRRIGATION__TYPE_IRRIGATION);

		harvestEClass = createEClass(HARVEST);

		transporteEClass = createEClass(TRANSPORTE);

		clearEClass = createEClass(CLEAR);
		createEAttribute(clearEClass, CLEAR__CLEAR_TYPE);

		buyEClass = createEClass(BUY);

		sellEClass = createEClass(SELL);

		stockEClass = createEClass(STOCK);

		transportEClass = createEClass(TRANSPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentClimateEClass.getESuperTypes().add(this.getWeather());
		plantEClass.getESuperTypes().add(this.getOperation());
		fertilizeEClass.getESuperTypes().add(this.getOperation());
		cultivateEClass.getESuperTypes().add(this.getPeasant());
		irrigationEClass.getESuperTypes().add(this.getOperation());
		harvestEClass.getESuperTypes().add(this.getPeasant());
		transporteEClass.getESuperTypes().add(this.getPeasant());
		clearEClass.getESuperTypes().add(this.getOperation());
		buyEClass.getESuperTypes().add(this.getPeasant());
		sellEClass.getESuperTypes().add(this.getPeasant());
		stockEClass.getESuperTypes().add(this.getPeasant());
		transportEClass.getESuperTypes().add(this.getOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(agroecosystemEClass, Agroecosystem.class, "Agroecosystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgroecosystem_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Agroecosystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(peasantEClass, Peasant.class, "Peasant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeasant_IdPeasant(), theTypesPackage.getInteger(), "idPeasant", null, 1, 1, Peasant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPeasant_PeasantName(), theTypesPackage.getString(), "peasantName", null, 1, 1, Peasant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPeasant_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Peasant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_IdAsset(), theTypesPackage.getInteger(), "idAsset", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_AssetName(), theTypesPackage.getString(), "assetName", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_TypeAsset(), theTypesPackage.getString(), "typeAsset", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAsset_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(farmEClass, Farm.class, "Farm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFarm_IdFarm(), theTypesPackage.getInteger(), "idFarm", null, 1, 1, Farm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFarm_FarmName(), theTypesPackage.getString(), "farmName", null, 1, 1, Farm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFarm_TypeFarm(), theTypesPackage.getString(), "typeFarm", null, 1, 1, Farm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFarm_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Farm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rotationEClass, Rotation.class, "Rotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotation_RotationName(), theTypesPackage.getString(), "rotationName", null, 1, 1, Rotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRotation_DateRotation(), ecorePackage.getEDate(), "dateRotation", null, 1, 1, Rotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRotation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Rotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(plotEClass, Plot.class, "Plot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlot_IdPlot(), theTypesPackage.getInteger(), "idPlot", null, 1, 1, Plot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPlot_PlotName(), theTypesPackage.getString(), "plotName", null, 1, 1, Plot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPlot_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Plot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cropEClass, Crop.class, "Crop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrop_IdCrop(), theTypesPackage.getInteger(), "idCrop", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrop_CropName(), theTypesPackage.getString(), "cropName", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrop_TypeCrop(), theTypesPackage.getString(), "typeCrop", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrop_Yield(), theTypesPackage.getString(), "yield", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrop_DateCrop(), ecorePackage.getEDate(), "dateCrop", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrop_Area(), theTypesPackage.getString(), "area", null, 1, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrop_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Crop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(weatherEClass, Weather.class, "Weather", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeather_IdWeather(), theTypesPackage.getInteger(), "idWeather", null, 1, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWeather_WeatherName(), theTypesPackage.getString(), "weatherName", null, 1, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWeather_Probability(), theTypesPackage.getReal(), "probability", null, 1, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWeather_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(farmingCalendarEClass, FarmingCalendar.class, "FarmingCalendar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFarmingCalendar_FarmingCalendarName(), theTypesPackage.getString(), "farmingCalendarName", null, 1, 1, FarmingCalendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFarmingCalendar_Year(), ecorePackage.getEDate(), "year", null, 1, 1, FarmingCalendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFarmingCalendar_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, FarmingCalendar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(agentClimateEClass, AgentClimate.class, "AgentClimate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentClimate_IdAgentClimate(), theTypesPackage.getInteger(), "idAgentClimate", null, 1, 1, AgentClimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAgentClimate_AgentClimateName(), theTypesPackage.getString(), "agentClimateName", null, 1, 1, AgentClimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisation_OrganizationName(), theTypesPackage.getString(), "organizationName", null, 1, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganisation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_OperationName(), theTypesPackage.getString(), "operationName", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Base_Activity(), theUMLPackage.getActivity(), null, "base_Activity", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTime_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTime_Day(), theTypesPackage.getInteger(), "day", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTime_Month(), theTypesPackage.getInteger(), "month", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTime_Year(), theTypesPackage.getInteger(), "year", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fertilizeEClass, Fertilize.class, "Fertilize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cultivateEClass, Cultivate.class, "Cultivate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(irrigationEClass, Irrigation.class, "Irrigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIrrigation_TypeIrrigation(), theTypesPackage.getString(), "typeIrrigation", null, 1, 1, Irrigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(harvestEClass, Harvest.class, "Harvest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transporteEClass, Transporte.class, "Transporte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearEClass, Clear.class, "Clear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClear_ClearType(), theTypesPackage.getString(), "clearType", null, 1, 1, Clear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(buyEClass, Buy.class, "Buy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sellEClass, Sell.class, "Sell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stockEClass, Stock.class, "Stock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportEClass, Transport.class, "Transport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProfilAgroecosystemPackageImpl
