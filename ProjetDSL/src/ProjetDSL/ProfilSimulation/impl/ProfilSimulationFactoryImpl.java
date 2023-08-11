/**
 */
package ProjetDSL.ProfilSimulation.impl;

import ProjetDSL.ProfilSimulation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilSimulationFactoryImpl extends EFactoryImpl implements ProfilSimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfilSimulationFactory init() {
		try {
			ProfilSimulationFactory theProfilSimulationFactory = (ProfilSimulationFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilSimulationPackage.eNS_URI);
			if (theProfilSimulationFactory != null) {
				return theProfilSimulationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfilSimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilSimulationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProfilSimulationPackage.SIMULATION: return createSimulation();
			case ProfilSimulationPackage.SCENARIO: return createScenario();
			case ProfilSimulationPackage.MODEL: return createModel();
			case ProfilSimulationPackage.VARIABLE: return createVariable();
			case ProfilSimulationPackage.OUTPUT: return createOutput();
			case ProfilSimulationPackage.PARAMETER: return createParameter();
			case ProfilSimulationPackage.INITIAL_BLOCK: return createInitialBlock();
			case ProfilSimulationPackage.GLOBAL_BLOCK: return createGlobalBlock();
			case ProfilSimulationPackage.INDIVIDUAL_OUTPUT: return createIndividualOutput();
			case ProfilSimulationPackage.GLOBAL_OUTPUT: return createGlobalOutput();
			case ProfilSimulationPackage.SPATIAL_ENVIRONMENT: return createSpatialEnvironment();
			case ProfilSimulationPackage.STATE_VARIABLE: return createStateVariable();
			case ProfilSimulationPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simulation createSimulation() {
		SimulationImpl simulation = new SimulationImpl();
		return simulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialBlock createInitialBlock() {
		InitialBlockImpl initialBlock = new InitialBlockImpl();
		return initialBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBlock createGlobalBlock() {
		GlobalBlockImpl globalBlock = new GlobalBlockImpl();
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualOutput createIndividualOutput() {
		IndividualOutputImpl individualOutput = new IndividualOutputImpl();
		return individualOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalOutput createGlobalOutput() {
		GlobalOutputImpl globalOutput = new GlobalOutputImpl();
		return globalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialEnvironment createSpatialEnvironment() {
		SpatialEnvironmentImpl spatialEnvironment = new SpatialEnvironmentImpl();
		return spatialEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable createStateVariable() {
		StateVariableImpl stateVariable = new StateVariableImpl();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilSimulationPackage getProfilSimulationPackage() {
		return (ProfilSimulationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilSimulationPackage getPackage() {
		return ProfilSimulationPackage.eINSTANCE;
	}

} //ProfilSimulationFactoryImpl
