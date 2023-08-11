/**
 */
package ProjetDSL.ProfilAgroecosystem;

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
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilAgroecosystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProfilAgroecosystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ProjetDSL/ProfilAgroecosystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProjetDSL.ProfilAgroecosystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilAgroecosystemPackage eINSTANCE = ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AgroecosystemImpl <em>Agroecosystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.AgroecosystemImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAgroecosystem()
	 * @generated
	 */
	int AGROECOSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROECOSYSTEM__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Agroecosystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROECOSYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agroecosystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROECOSYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl <em>Peasant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPeasant()
	 * @generated
	 */
	int PEASANT = 1;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEASANT__ID_PEASANT = 0;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEASANT__PEASANT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEASANT__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Peasant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEASANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Peasant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEASANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.AssetImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 2;

	/**
	 * The feature id for the '<em><b>Id Asset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID_ASSET = 0;

	/**
	 * The feature id for the '<em><b>Asset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Asset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TYPE_ASSET = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl <em>Farm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.FarmImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFarm()
	 * @generated
	 */
	int FARM = 3;

	/**
	 * The feature id for the '<em><b>Id Farm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__ID_FARM = 0;

	/**
	 * The feature id for the '<em><b>Farm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__FARM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Farm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__TYPE_FARM = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Farm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Farm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.RotationImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 4;

	/**
	 * The feature id for the '<em><b>Rotation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ROTATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__DATE_ROTATION = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.PlotImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 5;

	/**
	 * The feature id for the '<em><b>Id Plot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__ID_PLOT = 0;

	/**
	 * The feature id for the '<em><b>Plot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__PLOT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl <em>Crop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.CropImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getCrop()
	 * @generated
	 */
	int CROP = 6;

	/**
	 * The feature id for the '<em><b>Id Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__ID_CROP = 0;

	/**
	 * The feature id for the '<em><b>Crop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__CROP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__TYPE_CROP = 2;

	/**
	 * The feature id for the '<em><b>Yield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__YIELD = 3;

	/**
	 * The feature id for the '<em><b>Date Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__DATE_CROP = 4;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__AREA = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__BASE_CLASS = 6;

	/**
	 * The number of structural features of the '<em>Crop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Crop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl <em>Weather</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getWeather()
	 * @generated
	 */
	int WEATHER = 7;

	/**
	 * The feature id for the '<em><b>Id Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__ID_WEATHER = 0;

	/**
	 * The feature id for the '<em><b>Weather Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__WEATHER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__PROBABILITY = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Weather</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEATHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl <em>Farming Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFarmingCalendar()
	 * @generated
	 */
	int FARMING_CALENDAR = 8;

	/**
	 * The feature id for the '<em><b>Farming Calendar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMING_CALENDAR__FARMING_CALENDAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMING_CALENDAR__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMING_CALENDAR__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Farming Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMING_CALENDAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Farming Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMING_CALENDAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl <em>Agent Climate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAgentClimate()
	 * @generated
	 */
	int AGENT_CLIMATE = 9;

	/**
	 * The feature id for the '<em><b>Id Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__ID_WEATHER = WEATHER__ID_WEATHER;

	/**
	 * The feature id for the '<em><b>Weather Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__WEATHER_NAME = WEATHER__WEATHER_NAME;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__PROBABILITY = WEATHER__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__BASE_CLASS = WEATHER__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Id Agent Climate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__ID_AGENT_CLIMATE = WEATHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent Climate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE__AGENT_CLIMATE_NAME = WEATHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Agent Climate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE_FEATURE_COUNT = WEATHER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Agent Climate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLIMATE_OPERATION_COUNT = WEATHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.OrganisationImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 10;

	/**
	 * The feature id for the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ORGANIZATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__BASE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.OperationImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BASE_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.TimeImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 12;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__DAY = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__MONTH = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__YEAR = 3;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.PlantImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 13;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__OPERATION_NAME = OPERATION__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__BASE_ACTIVITY = OPERATION__BASE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FertilizeImpl <em>Fertilize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.FertilizeImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFertilize()
	 * @generated
	 */
	int FERTILIZE = 14;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERTILIZE__OPERATION_NAME = OPERATION__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERTILIZE__BASE_ACTIVITY = OPERATION__BASE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Fertilize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERTILIZE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fertilize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FERTILIZE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.CultivateImpl <em>Cultivate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.CultivateImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getCultivate()
	 * @generated
	 */
	int CULTIVATE = 15;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATE__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATE__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATE__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Cultivate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATE_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cultivate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATE_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.IrrigationImpl <em>Irrigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.IrrigationImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getIrrigation()
	 * @generated
	 */
	int IRRIGATION = 16;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRIGATION__OPERATION_NAME = OPERATION__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRIGATION__BASE_ACTIVITY = OPERATION__BASE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Type Irrigation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRIGATION__TYPE_IRRIGATION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Irrigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRIGATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Irrigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRRIGATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.HarvestImpl <em>Harvest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.HarvestImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getHarvest()
	 * @generated
	 */
	int HARVEST = 17;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVEST__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVEST__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVEST__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Harvest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVEST_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Harvest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARVEST_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TransporteImpl <em>Transporte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.TransporteImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTransporte()
	 * @generated
	 */
	int TRANSPORTE = 18;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transporte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTE_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.ClearImpl <em>Clear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ClearImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getClear()
	 * @generated
	 */
	int CLEAR = 19;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR__OPERATION_NAME = OPERATION__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR__BASE_ACTIVITY = OPERATION__BASE_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Clear Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR__CLEAR_TYPE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.BuyImpl <em>Buy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.BuyImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getBuy()
	 * @generated
	 */
	int BUY = 20;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Buy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.SellImpl <em>Sell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.SellImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getSell()
	 * @generated
	 */
	int SELL = 21;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELL__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELL__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELL__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Sell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELL_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELL_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.StockImpl <em>Stock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.StockImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getStock()
	 * @generated
	 */
	int STOCK = 22;

	/**
	 * The feature id for the '<em><b>Id Peasant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__ID_PEASANT = PEASANT__ID_PEASANT;

	/**
	 * The feature id for the '<em><b>Peasant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__PEASANT_NAME = PEASANT__PEASANT_NAME;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__BASE_CLASS = PEASANT__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_FEATURE_COUNT = PEASANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_OPERATION_COUNT = PEASANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjetDSL.ProfilAgroecosystem.impl.TransportImpl
	 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 23;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__OPERATION_NAME = OPERATION__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__BASE_ACTIVITY = OPERATION__BASE_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Agroecosystem <em>Agroecosystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agroecosystem</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Agroecosystem
	 * @generated
	 */
	EClass getAgroecosystem();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Agroecosystem#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Agroecosystem#getBase_Package()
	 * @see #getAgroecosystem()
	 * @generated
	 */
	EReference getAgroecosystem_Base_Package();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Peasant <em>Peasant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peasant</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Peasant
	 * @generated
	 */
	EClass getPeasant();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getIdPeasant <em>Id Peasant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Peasant</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Peasant#getIdPeasant()
	 * @see #getPeasant()
	 * @generated
	 */
	EAttribute getPeasant_IdPeasant();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getPeasantName <em>Peasant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peasant Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Peasant#getPeasantName()
	 * @see #getPeasant()
	 * @generated
	 */
	EAttribute getPeasant_PeasantName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Peasant#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Peasant#getBase_Class()
	 * @see #getPeasant()
	 * @generated
	 */
	EReference getPeasant_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Asset#getIdAsset <em>Id Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Asset</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset#getIdAsset()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_IdAsset();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Asset#getAssetName <em>Asset Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset#getAssetName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Asset#getTypeAsset <em>Type Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Asset</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset#getTypeAsset()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_TypeAsset();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Asset#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset#getBase_Class()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Farm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Farm</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm
	 * @generated
	 */
	EClass getFarm();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Farm#getIdFarm <em>Id Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Farm</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm#getIdFarm()
	 * @see #getFarm()
	 * @generated
	 */
	EAttribute getFarm_IdFarm();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Farm#getFarmName <em>Farm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farm Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm#getFarmName()
	 * @see #getFarm()
	 * @generated
	 */
	EAttribute getFarm_FarmName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Farm#getTypeFarm <em>Type Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Farm</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm#getTypeFarm()
	 * @see #getFarm()
	 * @generated
	 */
	EAttribute getFarm_TypeFarm();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Farm#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm#getBase_Class()
	 * @see #getFarm()
	 * @generated
	 */
	EReference getFarm_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getRotationName <em>Rotation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Rotation#getRotationName()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_RotationName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getDateRotation <em>Date Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Rotation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Rotation#getDateRotation()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_DateRotation();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Rotation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Rotation#getBase_Class()
	 * @see #getRotation()
	 * @generated
	 */
	EReference getRotation_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Plot#getIdPlot <em>Id Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Plot</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Plot#getIdPlot()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_IdPlot();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Plot#getPlotName <em>Plot Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plot Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Plot#getPlotName()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_PlotName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Plot#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Plot#getBase_Class()
	 * @see #getPlot()
	 * @generated
	 */
	EReference getPlot_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Crop <em>Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crop</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop
	 * @generated
	 */
	EClass getCrop();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getIdCrop <em>Id Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Crop</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getIdCrop()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_IdCrop();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getCropName <em>Crop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crop Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getCropName()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_CropName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getTypeCrop <em>Type Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Crop</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getTypeCrop()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_TypeCrop();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getYield <em>Yield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yield</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getYield()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_Yield();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getDateCrop <em>Date Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Crop</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getDateCrop()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_DateCrop();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Crop#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getArea()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_Area();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Crop#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop#getBase_Class()
	 * @see #getCrop()
	 * @generated
	 */
	EReference getCrop_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weather</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather
	 * @generated
	 */
	EClass getWeather();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Weather#getIdWeather <em>Id Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Weather</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather#getIdWeather()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_IdWeather();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Weather#getWeatherName <em>Weather Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weather Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather#getWeatherName()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_WeatherName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Weather#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather#getProbability()
	 * @see #getWeather()
	 * @generated
	 */
	EAttribute getWeather_Probability();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Weather#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather#getBase_Class()
	 * @see #getWeather()
	 * @generated
	 */
	EReference getWeather_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar <em>Farming Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Farming Calendar</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.FarmingCalendar
	 * @generated
	 */
	EClass getFarmingCalendar();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getFarmingCalendarName <em>Farming Calendar Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farming Calendar Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getFarmingCalendarName()
	 * @see #getFarmingCalendar()
	 * @generated
	 */
	EAttribute getFarmingCalendar_FarmingCalendarName();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getYear()
	 * @see #getFarmingCalendar()
	 * @generated
	 */
	EAttribute getFarmingCalendar_Year();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.FarmingCalendar#getBase_Class()
	 * @see #getFarmingCalendar()
	 * @generated
	 */
	EReference getFarmingCalendar_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate <em>Agent Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Climate</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.AgentClimate
	 * @generated
	 */
	EClass getAgentClimate();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getIdAgentClimate <em>Id Agent Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Agent Climate</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.AgentClimate#getIdAgentClimate()
	 * @see #getAgentClimate()
	 * @generated
	 */
	EAttribute getAgentClimate_IdAgentClimate();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate#getAgentClimateName <em>Agent Climate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Climate Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.AgentClimate#getAgentClimateName()
	 * @see #getAgentClimate()
	 * @generated
	 */
	EAttribute getAgentClimate_AgentClimateName();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Organisation#getOrganizationName <em>Organization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Organisation#getOrganizationName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_OrganizationName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Organisation#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Organisation#getBase_Class()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Base_Class();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Operation#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Operation#getOperationName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationName();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Operation#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Operation#getBase_Activity()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Base_Activity();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the reference '{@link ProjetDSL.ProfilAgroecosystem.Time#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Time#getBase_Class()
	 * @see #getTime()
	 * @generated
	 */
	EReference getTime_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Time#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Time#getDay()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Day();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Time#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Time#getMonth()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Month();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Time#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Time#getYear()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Year();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Fertilize <em>Fertilize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fertilize</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Fertilize
	 * @generated
	 */
	EClass getFertilize();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Cultivate <em>Cultivate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cultivate</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Cultivate
	 * @generated
	 */
	EClass getCultivate();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Irrigation <em>Irrigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Irrigation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Irrigation
	 * @generated
	 */
	EClass getIrrigation();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Irrigation#getTypeIrrigation <em>Type Irrigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Irrigation</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Irrigation#getTypeIrrigation()
	 * @see #getIrrigation()
	 * @generated
	 */
	EAttribute getIrrigation_TypeIrrigation();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Harvest <em>Harvest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harvest</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Harvest
	 * @generated
	 */
	EClass getHarvest();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Transporte <em>Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transporte</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Transporte
	 * @generated
	 */
	EClass getTransporte();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Clear
	 * @generated
	 */
	EClass getClear();

	/**
	 * Returns the meta object for the attribute '{@link ProjetDSL.ProfilAgroecosystem.Clear#getClearType <em>Clear Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear Type</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Clear#getClearType()
	 * @see #getClear()
	 * @generated
	 */
	EAttribute getClear_ClearType();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Buy <em>Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buy</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Buy
	 * @generated
	 */
	EClass getBuy();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Sell <em>Sell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sell</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Sell
	 * @generated
	 */
	EClass getSell();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Stock
	 * @generated
	 */
	EClass getStock();

	/**
	 * Returns the meta object for class '{@link ProjetDSL.ProfilAgroecosystem.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see ProjetDSL.ProfilAgroecosystem.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfilAgroecosystemFactory getProfilAgroecosystemFactory();

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
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AgroecosystemImpl <em>Agroecosystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.AgroecosystemImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAgroecosystem()
		 * @generated
		 */
		EClass AGROECOSYSTEM = eINSTANCE.getAgroecosystem();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGROECOSYSTEM__BASE_PACKAGE = eINSTANCE.getAgroecosystem_Base_Package();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl <em>Peasant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.PeasantImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPeasant()
		 * @generated
		 */
		EClass PEASANT = eINSTANCE.getPeasant();

		/**
		 * The meta object literal for the '<em><b>Id Peasant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEASANT__ID_PEASANT = eINSTANCE.getPeasant_IdPeasant();

		/**
		 * The meta object literal for the '<em><b>Peasant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PEASANT__PEASANT_NAME = eINSTANCE.getPeasant_PeasantName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PEASANT__BASE_CLASS = eINSTANCE.getPeasant_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.AssetImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id Asset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID_ASSET = eINSTANCE.getAsset_IdAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_NAME = eINSTANCE.getAsset_AssetName();

		/**
		 * The meta object literal for the '<em><b>Type Asset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__TYPE_ASSET = eINSTANCE.getAsset_TypeAsset();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__BASE_CLASS = eINSTANCE.getAsset_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FarmImpl <em>Farm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.FarmImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFarm()
		 * @generated
		 */
		EClass FARM = eINSTANCE.getFarm();

		/**
		 * The meta object literal for the '<em><b>Id Farm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARM__ID_FARM = eINSTANCE.getFarm_IdFarm();

		/**
		 * The meta object literal for the '<em><b>Farm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARM__FARM_NAME = eINSTANCE.getFarm_FarmName();

		/**
		 * The meta object literal for the '<em><b>Type Farm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARM__TYPE_FARM = eINSTANCE.getFarm_TypeFarm();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARM__BASE_CLASS = eINSTANCE.getFarm_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.RotationImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>Rotation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__ROTATION_NAME = eINSTANCE.getRotation_RotationName();

		/**
		 * The meta object literal for the '<em><b>Date Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__DATE_ROTATION = eINSTANCE.getRotation_DateRotation();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATION__BASE_CLASS = eINSTANCE.getRotation_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.PlotImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '<em><b>Id Plot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__ID_PLOT = eINSTANCE.getPlot_IdPlot();

		/**
		 * The meta object literal for the '<em><b>Plot Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__PLOT_NAME = eINSTANCE.getPlot_PlotName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLOT__BASE_CLASS = eINSTANCE.getPlot_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.CropImpl <em>Crop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.CropImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getCrop()
		 * @generated
		 */
		EClass CROP = eINSTANCE.getCrop();

		/**
		 * The meta object literal for the '<em><b>Id Crop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__ID_CROP = eINSTANCE.getCrop_IdCrop();

		/**
		 * The meta object literal for the '<em><b>Crop Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__CROP_NAME = eINSTANCE.getCrop_CropName();

		/**
		 * The meta object literal for the '<em><b>Type Crop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__TYPE_CROP = eINSTANCE.getCrop_TypeCrop();

		/**
		 * The meta object literal for the '<em><b>Yield</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__YIELD = eINSTANCE.getCrop_Yield();

		/**
		 * The meta object literal for the '<em><b>Date Crop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__DATE_CROP = eINSTANCE.getCrop_DateCrop();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__AREA = eINSTANCE.getCrop_Area();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROP__BASE_CLASS = eINSTANCE.getCrop_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl <em>Weather</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.WeatherImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getWeather()
		 * @generated
		 */
		EClass WEATHER = eINSTANCE.getWeather();

		/**
		 * The meta object literal for the '<em><b>Id Weather</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__ID_WEATHER = eINSTANCE.getWeather_IdWeather();

		/**
		 * The meta object literal for the '<em><b>Weather Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__WEATHER_NAME = eINSTANCE.getWeather_WeatherName();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEATHER__PROBABILITY = eINSTANCE.getWeather_Probability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEATHER__BASE_CLASS = eINSTANCE.getWeather_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl <em>Farming Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.FarmingCalendarImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFarmingCalendar()
		 * @generated
		 */
		EClass FARMING_CALENDAR = eINSTANCE.getFarmingCalendar();

		/**
		 * The meta object literal for the '<em><b>Farming Calendar Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARMING_CALENDAR__FARMING_CALENDAR_NAME = eINSTANCE.getFarmingCalendar_FarmingCalendarName();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARMING_CALENDAR__YEAR = eINSTANCE.getFarmingCalendar_Year();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARMING_CALENDAR__BASE_CLASS = eINSTANCE.getFarmingCalendar_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl <em>Agent Climate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.AgentClimateImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getAgentClimate()
		 * @generated
		 */
		EClass AGENT_CLIMATE = eINSTANCE.getAgentClimate();

		/**
		 * The meta object literal for the '<em><b>Id Agent Climate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CLIMATE__ID_AGENT_CLIMATE = eINSTANCE.getAgentClimate_IdAgentClimate();

		/**
		 * The meta object literal for the '<em><b>Agent Climate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_CLIMATE__AGENT_CLIMATE_NAME = eINSTANCE.getAgentClimate_AgentClimateName();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.OrganisationImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Organization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__ORGANIZATION_NAME = eINSTANCE.getOrganisation_OrganizationName();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__BASE_CLASS = eINSTANCE.getOrganisation_Base_Class();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.OperationImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_NAME = eINSTANCE.getOperation_OperationName();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BASE_ACTIVITY = eINSTANCE.getOperation_Base_Activity();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.TimeImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME__BASE_CLASS = eINSTANCE.getTime_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__DAY = eINSTANCE.getTime_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__MONTH = eINSTANCE.getTime_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__YEAR = eINSTANCE.getTime_Year();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.PlantImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.FertilizeImpl <em>Fertilize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.FertilizeImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getFertilize()
		 * @generated
		 */
		EClass FERTILIZE = eINSTANCE.getFertilize();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.CultivateImpl <em>Cultivate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.CultivateImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getCultivate()
		 * @generated
		 */
		EClass CULTIVATE = eINSTANCE.getCultivate();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.IrrigationImpl <em>Irrigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.IrrigationImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getIrrigation()
		 * @generated
		 */
		EClass IRRIGATION = eINSTANCE.getIrrigation();

		/**
		 * The meta object literal for the '<em><b>Type Irrigation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IRRIGATION__TYPE_IRRIGATION = eINSTANCE.getIrrigation_TypeIrrigation();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.HarvestImpl <em>Harvest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.HarvestImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getHarvest()
		 * @generated
		 */
		EClass HARVEST = eINSTANCE.getHarvest();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TransporteImpl <em>Transporte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.TransporteImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTransporte()
		 * @generated
		 */
		EClass TRANSPORTE = eINSTANCE.getTransporte();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.ClearImpl <em>Clear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ClearImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getClear()
		 * @generated
		 */
		EClass CLEAR = eINSTANCE.getClear();

		/**
		 * The meta object literal for the '<em><b>Clear Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEAR__CLEAR_TYPE = eINSTANCE.getClear_ClearType();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.BuyImpl <em>Buy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.BuyImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getBuy()
		 * @generated
		 */
		EClass BUY = eINSTANCE.getBuy();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.SellImpl <em>Sell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.SellImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getSell()
		 * @generated
		 */
		EClass SELL = eINSTANCE.getSell();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.StockImpl <em>Stock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.StockImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getStock()
		 * @generated
		 */
		EClass STOCK = eINSTANCE.getStock();

		/**
		 * The meta object literal for the '{@link ProjetDSL.ProfilAgroecosystem.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjetDSL.ProfilAgroecosystem.impl.TransportImpl
		 * @see ProjetDSL.ProfilAgroecosystem.impl.ProfilAgroecosystemPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

	}

} //ProfilAgroecosystemPackage
