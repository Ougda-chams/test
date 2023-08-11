/**
 */
package ProjetDSL.ProfilSimulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ProjetDSL.ProfilSimulation.ProfilSimulationFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilSimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProfilSimulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ProjetDSL/ProfilSimulation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProjetDSL.ProfilSimulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilSimulationPackage eINSTANCE = ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.SimulationImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 0;

	/**
	 * The feature id for the '<em><b>Id Simulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__ID_SIMULATION = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.ScenarioImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Id Scenario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Scenario Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.ModelImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Id Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.VariableImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.OutputImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Id Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID_OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OUTPUT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.ParameterImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INITIAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__BASE_PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.InitialBlockImpl <em>Initial Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.InitialBlockImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getInitialBlock()
	 * @generated
	 */
	int INITIAL_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Id Initial Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_BLOCK__ID_INITIAL_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Initial Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_BLOCK__INITIAL_BLOCK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_BLOCK__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Initial Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Initial Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl <em>Global Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalBlock()
	 * @generated
	 */
	int GLOBAL_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Id Global Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__ID_GLOBAL_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Global Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__GLOBAL_BLOCK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl <em>Individual Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getIndividualOutput()
	 * @generated
	 */
	int INDIVIDUAL_OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Id Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__ID_OUTPUT = OUTPUT__ID_OUTPUT;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__OUTPUT_NAME = OUTPUT__OUTPUT_NAME;

	/**
	 * The feature id for the '<em><b>Type Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__TYPE_OUTPUT = OUTPUT__TYPE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__BASE_CLASS = OUTPUT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id Individual Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Individual Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Individual Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT = OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT__BASE_PROPERTY = OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Individual Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Individual Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OUTPUT_OPERATION_COUNT = OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl <em>Global Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalOutput()
	 * @generated
	 */
	int GLOBAL_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Id Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__ID_OUTPUT = OUTPUT__ID_OUTPUT;

	/**
	 * The feature id for the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__OUTPUT_NAME = OUTPUT__OUTPUT_NAME;

	/**
	 * The feature id for the '<em><b>Type Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__TYPE_OUTPUT = OUTPUT__TYPE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__BASE_CLASS = OUTPUT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id Global Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Global Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT = OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT__BASE_PROPERTY = OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Global Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Global Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OUTPUT_OPERATION_COUNT = OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl <em>Spatial Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getSpatialEnvironment()
	 * @generated
	 */
	int SPATIAL_ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__VARIABLE_NAME = VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Type Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__TYPE_VARIABLE = VARIABLE__TYPE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__BASE_CLASS = VARIABLE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Spatial Environment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Spatial Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT__BASE_PROPERTY = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spatial Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spatial Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENVIRONMENT_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.StateVariableImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VARIABLE_NAME = VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Type Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__TYPE_VARIABLE = VARIABLE__TYPE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__BASE_CLASS = VARIABLE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>State Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__STATE_VARIABLE_NAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value State Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VALUE_STATE_VARIABLE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__BASE_PROPERTY = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl
	 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__VARIABLE_NAME = VARIABLE__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Type Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE_VARIABLE = VARIABLE__TYPE_VARIABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__BASE_CLASS = VARIABLE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Global Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Global Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__BASE_PROPERTY = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see ProjetDSL.ProfilSimulation.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Simulation#getIdSimulation <em>Id Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Simulation</em>'.
	 * @see ProjetDSL.ProfilSimulation.Simulation#getIdSimulation()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_IdSimulation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Simulation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ProjetDSL.ProfilSimulation.Simulation#getStartDate()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Simulation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ProjetDSL.ProfilSimulation.Simulation#getEndDate()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_EndDate();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Simulation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.Simulation#getBase_Class()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see ProjetDSL.ProfilSimulation.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Scenario#getIdScenario <em>Id Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Scenario</em>'.
	 * @see ProjetDSL.ProfilSimulation.Scenario#getIdScenario()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_IdScenario();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Scenario#getScenarioName <em>Scenario Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.Scenario#getScenarioName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Scenario#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.Scenario#getBase_Class()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ProjetDSL.ProfilSimulation.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Model#getIdModel <em>Id Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Model</em>'.
	 * @see ProjetDSL.ProfilSimulation.Model#getIdModel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IdModel();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Model#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.Model#getModelName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ModelName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Model#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.Model#getBase_Class()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Variable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.Variable#getVariableName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Variable#getTypeVariable <em>Type Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.Variable#getTypeVariable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_TypeVariable();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Variable#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.Variable#getBase_Class()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Output#getIdOutput <em>Id Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.Output#getIdOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_IdOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Output#getOutputName <em>Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.Output#getOutputName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_OutputName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Output#getTypeOutput <em>Type Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.Output#getTypeOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_TypeOutput();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Output#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.Output#getBase_Class()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see ProjetDSL.ProfilSimulation.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Parameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.Parameter#getParameterName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Parameter#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Parameter</em>'.
	 * @see ProjetDSL.ProfilSimulation.Parameter#getTypeParameter()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypeParameter();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.Parameter#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ProjetDSL.ProfilSimulation.Parameter#getInitialValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_InitialValue();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.Parameter#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see ProjetDSL.ProfilSimulation.Parameter#getBase_Parameter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Base_Parameter();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.InitialBlock <em>Initial Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Block</em>'.
	 * @see ProjetDSL.ProfilSimulation.InitialBlock
	 * @generated
	 */
	EClass getInitialBlock();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.InitialBlock#getIdInitialBlock <em>Id Initial Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Initial Block</em>'.
	 * @see ProjetDSL.ProfilSimulation.InitialBlock#getIdInitialBlock()
	 * @see #getInitialBlock()
	 * @generated
	 */
	EAttribute getInitialBlock_IdInitialBlock();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.InitialBlock#getInitialBlockName <em>Initial Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Block Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.InitialBlock#getInitialBlockName()
	 * @see #getInitialBlock()
	 * @generated
	 */
	EAttribute getInitialBlock_InitialBlockName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.InitialBlock#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.InitialBlock#getBase_Class()
	 * @see #getInitialBlock()
	 * @generated
	 */
	EReference getInitialBlock_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Block</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalBlock
	 * @generated
	 */
	EClass getGlobalBlock();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getIdGlobalBlock <em>Id Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Global Block</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalBlock#getIdGlobalBlock()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_IdGlobalBlock();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getGlobalBlockName <em>Global Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Block Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalBlock#getGlobalBlockName()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_GlobalBlockName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.GlobalBlock#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalBlock#getBase_Class()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.IndividualOutput <em>Individual Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.IndividualOutput
	 * @generated
	 */
	EClass getIndividualOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIdIndividualOutput <em>Id Individual Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Individual Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.IndividualOutput#getIdIndividualOutput()
	 * @see #getIndividualOutput()
	 * @generated
	 */
	EAttribute getIndividualOutput_IdIndividualOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getIndividualOutputName <em>Individual Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Individual Output Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.IndividualOutput#getIndividualOutputName()
	 * @see #getIndividualOutput()
	 * @generated
	 */
	EAttribute getIndividualOutput_IndividualOutputName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getTypeIndividualOutput <em>Type Individual Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Individual Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.IndividualOutput#getTypeIndividualOutput()
	 * @see #getIndividualOutput()
	 * @generated
	 */
	EAttribute getIndividualOutput_TypeIndividualOutput();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.IndividualOutput#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ProjetDSL.ProfilSimulation.IndividualOutput#getBase_Property()
	 * @see #getIndividualOutput()
	 * @generated
	 */
	EReference getIndividualOutput_Base_Property();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.GlobalOutput <em>Global Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalOutput
	 * @generated
	 */
	EClass getGlobalOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getIdGlobalOutput <em>Id Global Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Global Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalOutput#getIdGlobalOutput()
	 * @see #getGlobalOutput()
	 * @generated
	 */
	EAttribute getGlobalOutput_IdGlobalOutput();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getGlobalOutputName <em>Global Output Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Output Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalOutput#getGlobalOutputName()
	 * @see #getGlobalOutput()
	 * @generated
	 */
	EAttribute getGlobalOutput_GlobalOutputName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getTypeGlobalOutput <em>Type Global Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Global Output</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalOutput#getTypeGlobalOutput()
	 * @see #getGlobalOutput()
	 * @generated
	 */
	EAttribute getGlobalOutput_TypeGlobalOutput();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.GlobalOutput#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalOutput#getBase_Property()
	 * @see #getGlobalOutput()
	 * @generated
	 */
	EReference getGlobalOutput_Base_Property();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment <em>Spatial Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Environment</em>'.
	 * @see ProjetDSL.ProfilSimulation.SpatialEnvironment
	 * @generated
	 */
	EClass getSpatialEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getSpatialEnvironmentName <em>Spatial Environment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial Environment Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.SpatialEnvironment#getSpatialEnvironmentName()
	 * @see #getSpatialEnvironment()
	 * @generated
	 */
	EAttribute getSpatialEnvironment_SpatialEnvironmentName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getValueSpatialEnvironment <em>Value Spatial Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Spatial Environment</em>'.
	 * @see ProjetDSL.ProfilSimulation.SpatialEnvironment#getValueSpatialEnvironment()
	 * @see #getSpatialEnvironment()
	 * @generated
	 */
	EAttribute getSpatialEnvironment_ValueSpatialEnvironment();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.SpatialEnvironment#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ProjetDSL.ProfilSimulation.SpatialEnvironment#getBase_Property()
	 * @see #getSpatialEnvironment()
	 * @generated
	 */
	EReference getSpatialEnvironment_Base_Property();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.StateVariable#getStateVariableName <em>State Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Variable Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.StateVariable#getStateVariableName()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_StateVariableName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.StateVariable#getValueStateVariable <em>Value State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value State Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.StateVariable#getValueStateVariable()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_ValueStateVariable();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.StateVariable#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ProjetDSL.ProfilSimulation.StateVariable#getBase_Property()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Base_Property();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilSimulation.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getGlobalVariableName <em>Global Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Variable Name</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalVariable#getGlobalVariableName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_GlobalVariableName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getValueGlobalVariable <em>Value Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Global Variable</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalVariable#getValueGlobalVariable()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_ValueGlobalVariable();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilSimulation.GlobalVariable#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see ProjetDSL.ProfilSimulation.GlobalVariable#getBase_Property()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EReference getGlobalVariable_Base_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfilSimulationFactory getProfilSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.SimulationImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Id Simulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__ID_SIMULATION = eINSTANCE.getSimulation_IdSimulation();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__START_DATE = eINSTANCE.getSimulation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__END_DATE = eINSTANCE.getSimulation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__BASE_CLASS = eINSTANCE.getSimulation_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.ScenarioImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Id Scenario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__ID_SCENARIO = eINSTANCE.getScenario_IdScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_NAME = eINSTANCE.getScenario_ScenarioName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__BASE_CLASS = eINSTANCE.getScenario_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.ModelImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Id Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ID_MODEL = eINSTANCE.getModel_IdModel();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MODEL_NAME = eINSTANCE.getModel_ModelName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BASE_CLASS = eINSTANCE.getModel_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.VariableImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VARIABLE_NAME = eINSTANCE.getVariable_VariableName();

		/**
		 * The meta object literal for the '<em><b>Type Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE_VARIABLE = eINSTANCE.getVariable_TypeVariable();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__BASE_CLASS = eINSTANCE.getVariable_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.OutputImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Id Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__ID_OUTPUT = eINSTANCE.getOutput_IdOutput();

		/**
		 * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__OUTPUT_NAME = eINSTANCE.getOutput_OutputName();

		/**
		 * The meta object literal for the '<em><b>Type Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE_OUTPUT = eINSTANCE.getOutput_TypeOutput();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__BASE_CLASS = eINSTANCE.getOutput_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.ParameterImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Type Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_PARAMETER = eINSTANCE.getParameter_TypeParameter();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__INITIAL_VALUE = eINSTANCE.getParameter_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__BASE_PARAMETER = eINSTANCE.getParameter_Base_Parameter();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.InitialBlockImpl <em>Initial Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.InitialBlockImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getInitialBlock()
		 * @generated
		 */
		EClass INITIAL_BLOCK = eINSTANCE.getInitialBlock();

		/**
		 * The meta object literal for the '<em><b>Id Initial Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_BLOCK__ID_INITIAL_BLOCK = eINSTANCE.getInitialBlock_IdInitialBlock();

		/**
		 * The meta object literal for the '<em><b>Initial Block Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_BLOCK__INITIAL_BLOCK_NAME = eINSTANCE.getInitialBlock_InitialBlockName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_BLOCK__BASE_CLASS = eINSTANCE.getInitialBlock_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl <em>Global Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.GlobalBlockImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalBlock()
		 * @generated
		 */
		EClass GLOBAL_BLOCK = eINSTANCE.getGlobalBlock();

		/**
		 * The meta object literal for the '<em><b>Id Global Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__ID_GLOBAL_BLOCK = eINSTANCE.getGlobalBlock_IdGlobalBlock();

		/**
		 * The meta object literal for the '<em><b>Global Block Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__GLOBAL_BLOCK_NAME = eINSTANCE.getGlobalBlock_GlobalBlockName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__BASE_CLASS = eINSTANCE.getGlobalBlock_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl <em>Individual Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.IndividualOutputImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getIndividualOutput()
		 * @generated
		 */
		EClass INDIVIDUAL_OUTPUT = eINSTANCE.getIndividualOutput();

		/**
		 * The meta object literal for the '<em><b>Id Individual Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_OUTPUT__ID_INDIVIDUAL_OUTPUT = eINSTANCE.getIndividualOutput_IdIndividualOutput();

		/**
		 * The meta object literal for the '<em><b>Individual Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_OUTPUT__INDIVIDUAL_OUTPUT_NAME = eINSTANCE.getIndividualOutput_IndividualOutputName();

		/**
		 * The meta object literal for the '<em><b>Type Individual Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_OUTPUT__TYPE_INDIVIDUAL_OUTPUT = eINSTANCE.getIndividualOutput_TypeIndividualOutput();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_OUTPUT__BASE_PROPERTY = eINSTANCE.getIndividualOutput_Base_Property();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl <em>Global Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.GlobalOutputImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalOutput()
		 * @generated
		 */
		EClass GLOBAL_OUTPUT = eINSTANCE.getGlobalOutput();

		/**
		 * The meta object literal for the '<em><b>Id Global Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_OUTPUT__ID_GLOBAL_OUTPUT = eINSTANCE.getGlobalOutput_IdGlobalOutput();

		/**
		 * The meta object literal for the '<em><b>Global Output Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_OUTPUT__GLOBAL_OUTPUT_NAME = eINSTANCE.getGlobalOutput_GlobalOutputName();

		/**
		 * The meta object literal for the '<em><b>Type Global Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_OUTPUT__TYPE_GLOBAL_OUTPUT = eINSTANCE.getGlobalOutput_TypeGlobalOutput();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_OUTPUT__BASE_PROPERTY = eINSTANCE.getGlobalOutput_Base_Property();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl <em>Spatial Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.SpatialEnvironmentImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getSpatialEnvironment()
		 * @generated
		 */
		EClass SPATIAL_ENVIRONMENT = eINSTANCE.getSpatialEnvironment();

		/**
		 * The meta object literal for the '<em><b>Spatial Environment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENVIRONMENT__SPATIAL_ENVIRONMENT_NAME = eINSTANCE.getSpatialEnvironment_SpatialEnvironmentName();

		/**
		 * The meta object literal for the '<em><b>Value Spatial Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENVIRONMENT__VALUE_SPATIAL_ENVIRONMENT = eINSTANCE.getSpatialEnvironment_ValueSpatialEnvironment();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_ENVIRONMENT__BASE_PROPERTY = eINSTANCE.getSpatialEnvironment_Base_Property();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.StateVariableImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '<em><b>State Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__STATE_VARIABLE_NAME = eINSTANCE.getStateVariable_StateVariableName();

		/**
		 * The meta object literal for the '<em><b>Value State Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__VALUE_STATE_VARIABLE = eINSTANCE.getStateVariable_ValueStateVariable();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__BASE_PROPERTY = eINSTANCE.getStateVariable_Base_Property();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilSimulation.impl.GlobalVariableImpl
		 * @see ProjetDSL.ProfilSimulation.impl.ProfilSimulationPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Global Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__GLOBAL_VARIABLE_NAME = eINSTANCE.getGlobalVariable_GlobalVariableName();

		/**
		 * The meta object literal for the '<em><b>Value Global Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__VALUE_GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable_ValueGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VARIABLE__BASE_PROPERTY = eINSTANCE.getGlobalVariable_Base_Property();

	}

} //ProfilSimulationPackage
