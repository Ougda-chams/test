/**
 */
package ProjetDSL.ProfilAgent;

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
 * @see ProjetDSL.ProfilAgent.ProfilAgentFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilAgentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProfilAgent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ProjetDSL/ProfilAgent.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProjetDSL.ProfilAgent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilAgentPackage eINSTANCE = ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.RessourceImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__ID_RESSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Ressource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__RESSOURCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Ressource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TYPE_RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.AgentImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Id Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID_AGENT = 0;

	/**
	 * The feature id for the '<em><b>Agent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AGENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.ObjectImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.CellImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 3;

	/**
	 * The feature id for the '<em><b>Id Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ID_CELL = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CONNECTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__BASE_CLASS = 4;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.LocationImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Id Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ID_CELL = CELL__ID_CELL;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LENGTH = CELL__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__WIDTH = CELL__WIDTH;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONNECTIVITY = CELL__CONNECTIVITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__BASE_CLASS = CELL__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Length Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LENGTH_LOCATION = CELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__WIDTH_LOCATION = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = CELL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.EventImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 5;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.ActionImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Id Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BASE_ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.BehaviourImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 7;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__ID_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__BEHAVIOUR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__BASE_BEHAVIOR = 2;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.DealImpl <em>Deal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.DealImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getDeal()
	 * @generated
	 */
	int DEAL = 8;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEAL__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEAL__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEAL__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Deal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEAL_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEAL_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.LiveImpl <em>Live</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.LiveImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getLive()
	 * @generated
	 */
	int LIVE = 9;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Live</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Live</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.PerseveImpl <em>Perseve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.PerseveImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getPerseve()
	 * @generated
	 */
	int PERSEVE = 10;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSEVE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSEVE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSEVE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Perseve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSEVE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Perseve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSEVE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.MoveImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 11;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.MigrateImpl <em>Migrate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.MigrateImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getMigrate()
	 * @generated
	 */
	int MIGRATE = 12;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Migrate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Migrate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.GetRessourceImpl <em>Get Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.GetRessourceImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getGetRessource()
	 * @generated
	 */
	int GET_RESSOURCE = 13;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RESSOURCE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RESSOURCE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RESSOURCE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Get Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RESSOURCE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_RESSOURCE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.ShareRessourceImpl <em>Share Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.ShareRessourceImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getShareRessource()
	 * @generated
	 */
	int SHARE_RESSOURCE = 14;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_RESSOURCE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_RESSOURCE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_RESSOURCE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Share Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_RESSOURCE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Share Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_RESSOURCE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.GetInformationImpl <em>Get Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.GetInformationImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getGetInformation()
	 * @generated
	 */
	int GET_INFORMATION = 15;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFORMATION__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFORMATION__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFORMATION__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Get Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFORMATION_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_INFORMATION_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.UseRessourceImpl <em>Use Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.UseRessourceImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getUseRessource()
	 * @generated
	 */
	int USE_RESSOURCE = 16;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_RESSOURCE__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_RESSOURCE__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_RESSOURCE__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Use Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_RESSOURCE_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Use Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_RESSOURCE_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgent.impl.ShareInformationImpl <em>Share Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgent.impl.ShareInformationImpl
	 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getShareInformation()
	 * @generated
	 */
	int SHARE_INFORMATION = 17;

	/**
	 * The feature id for the '<em><b>Id Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_INFORMATION__ID_BEHAVIOUR = BEHAVIOUR__ID_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Behaviour Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_INFORMATION__BEHAVIOUR_NAME = BEHAVIOUR__BEHAVIOUR_NAME;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_INFORMATION__BASE_BEHAVIOR = BEHAVIOUR__BASE_BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Share Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_INFORMATION_FEATURE_COUNT = BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Share Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_INFORMATION_OPERATION_COUNT = BEHAVIOUR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Ressource#getIdRessource <em>Id Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.Ressource#getIdRessource()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_IdRessource();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Ressource#getRessourceName <em>Ressource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ressource Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Ressource#getRessourceName()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_RessourceName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Ressource#getTypeRessource <em>Type Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.Ressource#getTypeRessource()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_TypeRessource();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Ressource#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgent.Ressource#getBase_Class()
	 * @see #getRessource()
	 * @generated
	 */
	EReference getRessource_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see ProjetDSL.ProfilAgent.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Agent#getIdAgent <em>Id Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Agent</em>'.
	 * @see ProjetDSL.ProfilAgent.Agent#getIdAgent()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_IdAgent();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Agent#getAgentName <em>Agent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Agent#getAgentName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_AgentName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Agent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgent.Agent#getBase_Class()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see ProjetDSL.ProfilAgent.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Object#getIdObject <em>Id Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Object</em>'.
	 * @see ProjetDSL.ProfilAgent.Object#getIdObject()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_IdObject();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Object#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Object#getObjectName()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_ObjectName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Object#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgent.Object#getBase_Class()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Cell#getIdCell <em>Id Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Cell</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell#getIdCell()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_IdCell();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Cell#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell#getLength()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Length();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Cell#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell#getWidth()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Width();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Cell#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectivity</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell#getConnectivity()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Connectivity();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Cell#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgent.Cell#getBase_Class()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see ProjetDSL.ProfilAgent.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Location#getLengthLocation <em>Length Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Location</em>'.
	 * @see ProjetDSL.ProfilAgent.Location#getLengthLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LengthLocation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Location#getWidthLocation <em>Width Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Location</em>'.
	 * @see ProjetDSL.ProfilAgent.Location#getWidthLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_WidthLocation();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see ProjetDSL.ProfilAgent.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Event#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Event#getEventName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Event#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgent.Event#getBase_Class()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ProjetDSL.ProfilAgent.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Action#getIdAction <em>Id Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Action</em>'.
	 * @see ProjetDSL.ProfilAgent.Action#getIdAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IdAction();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Action#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Action#getActionName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Action#getBase_Action <em>Base Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Action</em>'.
	 * @see ProjetDSL.ProfilAgent.Action#getBase_Action()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Base_Action();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see ProjetDSL.ProfilAgent.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Behaviour#getIdBehaviour <em>Id Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Behaviour</em>'.
	 * @see ProjetDSL.ProfilAgent.Behaviour#getIdBehaviour()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_IdBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgent.Behaviour#getBehaviourName <em>Behaviour Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour Name</em>'.
	 * @see ProjetDSL.ProfilAgent.Behaviour#getBehaviourName()
	 * @see #getBehaviour()
	 * @generated
	 */
	EAttribute getBehaviour_BehaviourName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgent.Behaviour#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see ProjetDSL.ProfilAgent.Behaviour#getBase_Behavior()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Base_Behavior();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Deal <em>Deal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deal</em>'.
	 * @see ProjetDSL.ProfilAgent.Deal
	 * @generated
	 */
	EClass getDeal();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Live <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live</em>'.
	 * @see ProjetDSL.ProfilAgent.Live
	 * @generated
	 */
	EClass getLive();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Perseve <em>Perseve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perseve</em>'.
	 * @see ProjetDSL.ProfilAgent.Perseve
	 * @generated
	 */
	EClass getPerseve();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see ProjetDSL.ProfilAgent.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.Migrate <em>Migrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migrate</em>'.
	 * @see ProjetDSL.ProfilAgent.Migrate
	 * @generated
	 */
	EClass getMigrate();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.GetRessource <em>Get Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.GetRessource
	 * @generated
	 */
	EClass getGetRessource();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.ShareRessource <em>Share Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Share Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.ShareRessource
	 * @generated
	 */
	EClass getShareRessource();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.GetInformation <em>Get Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Information</em>'.
	 * @see ProjetDSL.ProfilAgent.GetInformation
	 * @generated
	 */
	EClass getGetInformation();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.UseRessource <em>Use Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Ressource</em>'.
	 * @see ProjetDSL.ProfilAgent.UseRessource
	 * @generated
	 */
	EClass getUseRessource();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgent.ShareInformation <em>Share Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Share Information</em>'.
	 * @see ProjetDSL.ProfilAgent.ShareInformation
	 * @generated
	 */
	EClass getShareInformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfilAgentFactory getProfilAgentFactory();

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
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.RessourceImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Id Ressource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__ID_RESSOURCE = eINSTANCE.getRessource_IdRessource();

		/**
		 * The meta object literal for the '<em><b>Ressource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__RESSOURCE_NAME = eINSTANCE.getRessource_RessourceName();

		/**
		 * The meta object literal for the '<em><b>Type Ressource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__TYPE_RESSOURCE = eINSTANCE.getRessource_TypeRessource();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESSOURCE__BASE_CLASS = eINSTANCE.getRessource_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.AgentImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Id Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ID_AGENT = eINSTANCE.getAgent_IdAgent();

		/**
		 * The meta object literal for the '<em><b>Agent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__AGENT_NAME = eINSTANCE.getAgent_AgentName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__BASE_CLASS = eINSTANCE.getAgent_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.ObjectImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Id Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__ID_OBJECT = eINSTANCE.getObject_IdObject();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_NAME = eINSTANCE.getObject_ObjectName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__BASE_CLASS = eINSTANCE.getObject_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.CellImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Id Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ID_CELL = eINSTANCE.getCell_IdCell();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__LENGTH = eINSTANCE.getCell_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__WIDTH = eINSTANCE.getCell_Width();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CONNECTIVITY = eINSTANCE.getCell_Connectivity();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__BASE_CLASS = eINSTANCE.getCell_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.LocationImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Length Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LENGTH_LOCATION = eINSTANCE.getLocation_LengthLocation();

		/**
		 * The meta object literal for the '<em><b>Width Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__WIDTH_LOCATION = eINSTANCE.getLocation_WidthLocation();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.EventImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__BASE_CLASS = eINSTANCE.getEvent_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.ActionImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Id Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ID_ACTION = eINSTANCE.getAction_IdAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_NAME = eINSTANCE.getAction_ActionName();

		/**
		 * The meta object literal for the '<em><b>Base Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__BASE_ACTION = eINSTANCE.getAction_Base_Action();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.BehaviourImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Id Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__ID_BEHAVIOUR = eINSTANCE.getBehaviour_IdBehaviour();

		/**
		 * The meta object literal for the '<em><b>Behaviour Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR__BEHAVIOUR_NAME = eINSTANCE.getBehaviour_BehaviourName();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__BASE_BEHAVIOR = eINSTANCE.getBehaviour_Base_Behavior();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.DealImpl <em>Deal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.DealImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getDeal()
		 * @generated
		 */
		EClass DEAL = eINSTANCE.getDeal();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.LiveImpl <em>Live</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.LiveImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getLive()
		 * @generated
		 */
		EClass LIVE = eINSTANCE.getLive();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.PerseveImpl <em>Perseve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.PerseveImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getPerseve()
		 * @generated
		 */
		EClass PERSEVE = eINSTANCE.getPerseve();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.MoveImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.MigrateImpl <em>Migrate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.MigrateImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getMigrate()
		 * @generated
		 */
		EClass MIGRATE = eINSTANCE.getMigrate();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.GetRessourceImpl <em>Get Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.GetRessourceImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getGetRessource()
		 * @generated
		 */
		EClass GET_RESSOURCE = eINSTANCE.getGetRessource();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.ShareRessourceImpl <em>Share Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.ShareRessourceImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getShareRessource()
		 * @generated
		 */
		EClass SHARE_RESSOURCE = eINSTANCE.getShareRessource();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.GetInformationImpl <em>Get Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.GetInformationImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getGetInformation()
		 * @generated
		 */
		EClass GET_INFORMATION = eINSTANCE.getGetInformation();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.UseRessourceImpl <em>Use Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.UseRessourceImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getUseRessource()
		 * @generated
		 */
		EClass USE_RESSOURCE = eINSTANCE.getUseRessource();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgent.impl.ShareInformationImpl <em>Share Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgent.impl.ShareInformationImpl
		 * @see ProjetDSL.ProfilAgent.impl.ProfilAgentPackageImpl#getShareInformation()
		 * @generated
		 */
		EClass SHARE_INFORMATION = eINSTANCE.getShareInformation();

	}

} //ProfilAgentPackage
