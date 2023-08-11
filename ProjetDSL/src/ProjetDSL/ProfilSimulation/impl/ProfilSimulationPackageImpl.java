/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilAgent.ProfilAgentPackage;

import ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl;

import ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage;

import ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl;

import ProjetDSL.ProfilSimulation.GlobalBlock;
import ProjetDSL.ProfilSimulation.GlobalOutput;
import ProjetDSL.ProfilSimulation.GlobalVariable;
import ProjetDSL.ProfilSimulation.IndividualOutput;
import ProjetDSL.ProfilSimulation.InitialBlock;
import ProjetDSL.ProfilSimulation.Model;
import ProjetDSL.ProfilSimulation.Output;
import ProjetDSL.ProfilSimulation.Parameter;
import ProjetDSL.ProfilSimulation.ProfilSimulationFactory;
import ProjetDSL.ProfilSimulation.ProfilSimulationPackage;
import ProjetDSL.ProfilSimulation.Scenario;
import ProjetDSL.ProfilSimulation.Simulation;
import ProjetDSL.ProfilSimulation.SpatialEnvironment;
import ProjetDSL.ProfilSimulation.StateVariable;
import ProjetDSL.ProfilSimulation.Variable;

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
public class ProfilSimulationPackageImpl extends EPackageImpl implements ProfilSimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVariableEClass = null;

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
	 * @see ProjetDSL.ProfilSimulation.ProfilSimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfilSimulationPackageImpl() {
		super(eNS_URI, ProfilSimulationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProfilSimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfilSimulationPackage init() {
		if (isInited) return (ProfilSimulationPackage)EPackage.Registry.INSTANCE.getEPackage(ProfilSimulationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProfilSimulationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProfilSimulationPackageImpl theProfilSimulationPackage = registeredProfilSimulationPackage instanceof ProfilSimulationPackageImpl ? (ProfilSimulationPackageImpl)registeredProfilSimulationPackage : new ProfilSimulationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilAgroecosystemPackage.eNS_URI);
		ProfilAgroecosystemPackageImpl theProfilAgroecosystemPackage = (ProfilAgroecosystemPackageImpl)(registeredPackage instanceof ProfilAgroecosystemPackageImpl ? registeredPackage : ProfilAgroecosystemPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilAgentPackage.eNS_URI);
		ProfilAgentPackageImpl theProfilAgentPackage = (ProfilAgentPackageImpl)(registeredPackage instanceof ProfilAgentPackageImpl ? registeredPackage : ProfilAgentPackage.eINSTANCE);

		// Create package meta-data objects
		theProfilSimulationPackage.createPackageContents();
		theProfilAgroecosystemPackage.createPackageContents();
		theProfilAgentPackage.createPackageContents();

		// Initialize created meta-data
		theProfilSimulationPackage.initializePackageContents();
		theProfilAgroecosystemPackage.initializePackageContents();
		theProfilAgentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfilSimulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfilSimulationPackage.eNS_URI, theProfilSimulationPackage);
		return theProfilSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulation() {
		return simulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_IdSimulation() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_StartDate() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_EndDate() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Base_Class() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_IdScenario() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ScenarioName() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Base_Class() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_IdModel() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_ModelName() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Base_Class() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_VariableName() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_TypeVariable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Base_Class() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_IdOutput() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_OutputName() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_TypeOutput() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Base_Class() {
		return (EReference)outputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ParameterName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_TypeParameter() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_InitialValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Base_Parameter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialBlock() {
		return initialBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialBlock_IdInitialBlock() {
		return (EAttribute)initialBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitialBlock_InitialBlockName() {
		return (EAttribute)initialBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitialBlock_Base_Class() {
		return (EReference)initialBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalBlock() {
		return globalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBlock_IdGlobalBlock() {
		return (EAttribute)globalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBlock_GlobalBlockName() {
		return (EAttribute)globalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBlock_Base_Class() {
		return (EReference)globalBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualOutput() {
		return individualOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualOutput_IdIndividualOutput() {
		return (EAttribute)individualOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualOutput_IndividualOutputName() {
		return (EAttribute)individualOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualOutput_TypeIndividualOutput() {
		return (EAttribute)individualOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualOutput_Base_Property() {
		return (EReference)individualOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalOutput() {
		return globalOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalOutput_IdGlobalOutput() {
		return (EAttribute)globalOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalOutput_GlobalOutputName() {
		return (EAttribute)globalOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalOutput_TypeGlobalOutput() {
		return (EAttribute)globalOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalOutput_Base_Property() {
		return (EReference)globalOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpatialEnvironment() {
		return spatialEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialEnvironment_SpatialEnvironmentName() {
		return (EAttribute)spatialEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialEnvironment_ValueSpatialEnvironment() {
		return (EAttribute)spatialEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpatialEnvironment_Base_Property() {
		return (EReference)spatialEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateVariable() {
		return stateVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateVariable_StateVariableName() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateVariable_ValueStateVariable() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateVariable_Base_Property() {
		return (EReference)stateVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVariable() {
		return globalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_GlobalVariableName() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVariable_ValueGlobalVariable() {
		return (EAttribute)globalVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVariable_Base_Property() {
		return (EReference)globalVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilSimulationFactory getProfilSimulationFactory() {
		return (ProfilSimulationFactory)getEFactoryInstance();
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
		simulationEClass = createEClass(SIMULATION);
		createEAttribute(simulationEClass, SIMULATION__ID_SIMULATION);
		createEAttribute(simulationEClass, SIMULATION__START_DATE);
		createEAttribute(simulationEClass, SIMULATION__END_DATE);
		createEReference(simulationEClass, SIMULATION__BASE_CLASS);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__ID_SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__SCENARIO_NAME);
		createEReference(scenarioEClass, SCENARIO__BASE_CLASS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__ID_MODEL);
		createEAttribute(modelEClass, MODEL__MODEL_NAME);
		createEReference(modelEClass, MODEL__BASE_CLASS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VARIABLE_NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE_VARIABLE);
		createEReference(variableEClass, VARIABLE__BASE_CLASS);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__ID_OUTPUT);
		createEAttribute(outputEClass, OUTPUT__OUTPUT_NAME);
		createEAttribute(outputEClass, OUTPUT__TYPE_OUTPUT);
		createEReference(outputEClass, OUTPUT__BASE_CLASS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE_PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__INITIAL_VALUE);
		createEReference(parameterEClass, PARAMETER__BASE_PARAMETER);

		initialBlockEClass = createEClass(INITIAL_BLOCK);
		createEAttribute(initialBlockEClass, INITIAL_BLOCK__ID_INITIAL_BLOCK);
		createEAttribute(initialBlockEClass, INITIAL_BLOCK__INITIAL_BLOCK_NAME);
		createEReference(initialBlockEClass, INITIAL_BLOCK__BASE_CLASS);

		globalBlockEClass = createEClass(GLOBAL_BLOCK);
		createEAttribute(globalBlockEClass, GLOBAL_BLOCK__ID_GLOBAL_BLOCK);
		createEAttribute(globalBlockEClass, GLOBAL_BLOCK__GLOBAL_BLOCK_NAME);
		createEReference(globalBlockEClass, GLOBAL_BLOCK__BASE_CLASS);

		individualOutputEClass = createEClass(INDIVIDUAL_OUTPUT);
		createEAttribute(individualOutputEClass, INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT);
		createEAttribute(individualOutputEClass, INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME);
		createEAttribute(individualOutputEClass, INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT);
		createEReference(individualOutputEClass, INDIVIDUAL_OUTPUT__BASE_PROPERTY);

		globalOutputEClass = createEClass(GLOBAL_OUTPUT);
		createEAttribute(globalOutputEClass, GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT);
		createEAttribute(globalOutputEClass, GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME);
		createEAttribute(globalOutputEClass, GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT);
		createEReference(globalOutputEClass, GLOBAL_OUTPUT__BASE_PROPERTY);

		spatialEnvironmentEClass = createEClass(SPATIAL_ENVIRONMENT);
		createEAttribute(spatialEnvironmentEClass, SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME);
		createEAttribute(spatialEnvironmentEClass, SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT);
		createEReference(spatialEnvironmentEClass, SPATIAL_ENVIRONMENT__BASE_PROPERTY);

		stateVariableEClass = createEClass(STATE_VARIABLE);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__STATE_VARIABLE_NAME);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__VALUE_STATE_VARIABLE);
		createEReference(stateVariableEClass, STATE_VARIABLE__BASE_PROPERTY);

		globalVariableEClass = createEClass(GLOBAL_VARIABLE);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME);
		createEAttribute(globalVariableEClass, GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE);
		createEReference(globalVariableEClass, GLOBAL_VARIABLE__BASE_PROPERTY);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		individualOutputEClass.getESuperTypes().add(this.getOutput());
		globalOutputEClass.getESuperTypes().add(this.getOutput());
		spatialEnvironmentEClass.getESuperTypes().add(this.getVariable());
		stateVariableEClass.getESuperTypes().add(this.getVariable());
		globalVariableEClass.getESuperTypes().add(this.getVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulation_IdSimulation(), theTypesPackage.getInteger(), "idSimulation", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSimulation_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSimulation_EndDate(), ecorePackage.getEDate(), "EndDate", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSimulation_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_IdScenario(), theTypesPackage.getInteger(), "idScenario", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScenario_ScenarioName(), theTypesPackage.getString(), "scenarioName", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScenario_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_IdModel(), theTypesPackage.getInteger(), "idModel", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModel_ModelName(), theTypesPackage.getString(), "modelName", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_VariableName(), theTypesPackage.getString(), "variableName", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getVariable_TypeVariable(), theTypesPackage.getString(), "typeVariable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_IdOutput(), theTypesPackage.getInteger(), "idOutput", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOutput_OutputName(), theTypesPackage.getString(), "outputName", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOutput_TypeOutput(), theTypesPackage.getString(), "typeOutput", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutput_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_ParameterName(), theTypesPackage.getString(), "parameterName", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_TypeParameter(), theTypesPackage.getString(), "typeParameter", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_InitialValue(), theTypesPackage.getReal(), "initialValue", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(initialBlockEClass, InitialBlock.class, "InitialBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitialBlock_IdInitialBlock(), theTypesPackage.getInteger(), "idInitialBlock", null, 1, 1, InitialBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInitialBlock_InitialBlockName(), theTypesPackage.getString(), "initialBlockName", null, 1, 1, InitialBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInitialBlock_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, InitialBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(globalBlockEClass, GlobalBlock.class, "GlobalBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalBlock_IdGlobalBlock(), theTypesPackage.getInteger(), "idGlobalBlock", null, 1, 1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGlobalBlock_GlobalBlockName(), theTypesPackage.getString(), "globalBlockName", null, 1, 1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlobalBlock_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, GlobalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(individualOutputEClass, IndividualOutput.class, "IndividualOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndividualOutput_IdIndividualOutput(), theTypesPackage.getInteger(), "idIndividualOutput", null, 1, 1, IndividualOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndividualOutput_IndividualOutputName(), theTypesPackage.getString(), "individualOutputName", null, 1, 1, IndividualOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndividualOutput_TypeIndividualOutput(), theTypesPackage.getString(), "typeIndividualOutput", null, 1, 1, IndividualOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividualOutput_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, IndividualOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(globalOutputEClass, GlobalOutput.class, "GlobalOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalOutput_IdGlobalOutput(), theTypesPackage.getInteger(), "idGlobalOutput", null, 1, 1, GlobalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGlobalOutput_GlobalOutputName(), theTypesPackage.getString(), "globalOutputName", null, 1, 1, GlobalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGlobalOutput_TypeGlobalOutput(), theTypesPackage.getString(), "typeGlobalOutput", null, 1, 1, GlobalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlobalOutput_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, GlobalOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(spatialEnvironmentEClass, SpatialEnvironment.class, "SpatialEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialEnvironment_SpatialEnvironmentName(), theTypesPackage.getString(), "spatialEnvironmentName", null, 1, 1, SpatialEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpatialEnvironment_ValueSpatialEnvironment(), theTypesPackage.getReal(), "valueSpatialEnvironment", null, 1, 1, SpatialEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpatialEnvironment_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, SpatialEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateVariable_StateVariableName(), theTypesPackage.getString(), "stateVariableName", null, 1, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStateVariable_ValueStateVariable(), theTypesPackage.getReal(), "valueStateVariable", null, 1, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateVariable_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(globalVariableEClass, GlobalVariable.class, "GlobalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalVariable_GlobalVariableName(), theTypesPackage.getString(), "globalVariableName", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGlobalVariable_ValueGlobalVariable(), theTypesPackage.getReal(), "valueGlobalVariable", null, 1, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlobalVariable_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, GlobalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProfilSimulationPackageImpl
