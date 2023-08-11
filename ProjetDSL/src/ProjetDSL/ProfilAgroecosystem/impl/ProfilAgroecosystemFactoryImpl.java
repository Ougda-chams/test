/**
 */
package ProjetDSL.ProfilAgroecosystem.impl;

import ProjetDSL.ProfilAgroecosystem.*;

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
public class ProfilAgroecosystemFactoryImpl extends EFactoryImpl implements ProfilAgroecosystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfilAgroecosystemFactory init() {
		try {
			ProfilAgroecosystemFactory theProfilAgroecosystemFactory = (ProfilAgroecosystemFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilAgroecosystemPackage.eNS_URI);
			if (theProfilAgroecosystemFactory != null) {
				return theProfilAgroecosystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfilAgroecosystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgroecosystemFactoryImpl() {
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
			case ProfilAgroecosystemPackage.AGROECOSYSTEM: return createAgroecosystem();
			case ProfilAgroecosystemPackage.PEASANT: return createPeasant();
			case ProfilAgroecosystemPackage.ASSET: return createAsset();
			case ProfilAgroecosystemPackage.FARM: return createFarm();
			case ProfilAgroecosystemPackage.ROTATION: return createRotation();
			case ProfilAgroecosystemPackage.PLOT: return createPlot();
			case ProfilAgroecosystemPackage.CROP: return createCrop();
			case ProfilAgroecosystemPackage.WEATHER: return createWeather();
			case ProfilAgroecosystemPackage.FARMING_CALENDAR: return createFarmingCalendar();
			case ProfilAgroecosystemPackage.AGENT_CLIMATE: return createAgentClimate();
			case ProfilAgroecosystemPackage.ORGANISATION: return createOrganisation();
			case ProfilAgroecosystemPackage.OPERATION: return createOperation();
			case ProfilAgroecosystemPackage.TIME: return createTime();
			case ProfilAgroecosystemPackage.PLANT: return createPlant();
			case ProfilAgroecosystemPackage.FERTILIZE: return createFertilize();
			case ProfilAgroecosystemPackage.CULTIVATE: return createCultivate();
			case ProfilAgroecosystemPackage.IRRIGATION: return createIrrigation();
			case ProfilAgroecosystemPackage.HARVEST: return createHarvest();
			case ProfilAgroecosystemPackage.TRANSPORTE: return createTransporte();
			case ProfilAgroecosystemPackage.CLEAR: return createClear();
			case ProfilAgroecosystemPackage.BUY: return createBuy();
			case ProfilAgroecosystemPackage.SELL: return createSell();
			case ProfilAgroecosystemPackage.STOCK: return createStock();
			case ProfilAgroecosystemPackage.TRANSPORT: return createTransport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agroecosystem createAgroecosystem() {
		AgroecosystemImpl agroecosystem = new AgroecosystemImpl();
		return agroecosystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peasant createPeasant() {
		PeasantImpl peasant = new PeasantImpl();
		return peasant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm createFarm() {
		FarmImpl farm = new FarmImpl();
		return farm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plot createPlot() {
		PlotImpl plot = new PlotImpl();
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crop createCrop() {
		CropImpl crop = new CropImpl();
		return crop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weather createWeather() {
		WeatherImpl weather = new WeatherImpl();
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FarmingCalendar createFarmingCalendar() {
		FarmingCalendarImpl farmingCalendar = new FarmingCalendarImpl();
		return farmingCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClimate createAgentClimate() {
		AgentClimateImpl agentClimate = new AgentClimateImpl();
		return agentClimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fertilize createFertilize() {
		FertilizeImpl fertilize = new FertilizeImpl();
		return fertilize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cultivate createCultivate() {
		CultivateImpl cultivate = new CultivateImpl();
		return cultivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Irrigation createIrrigation() {
		IrrigationImpl irrigation = new IrrigationImpl();
		return irrigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Harvest createHarvest() {
		HarvestImpl harvest = new HarvestImpl();
		return harvest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transporte createTransporte() {
		TransporteImpl transporte = new TransporteImpl();
		return transporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clear createClear() {
		ClearImpl clear = new ClearImpl();
		return clear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buy createBuy() {
		BuyImpl buy = new BuyImpl();
		return buy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sell createSell() {
		SellImpl sell = new SellImpl();
		return sell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stock createStock() {
		StockImpl stock = new StockImpl();
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transport createTransport() {
		TransportImpl transport = new TransportImpl();
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgroecosystemPackage getProfilAgroecosystemPackage() {
		return (ProfilAgroecosystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilAgroecosystemPackage getPackage() {
		return ProfilAgroecosystemPackage.eINSTANCE;
	}

} //ProfilAgroecosystemFactoryImpl
