/**
 */
package ProjetDSL.ProfilAgroecosystem.util;

import ProjetDSL.ProfilAgroecosystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage
 * @generated
 */
public class ProfilAgroecosystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilAgroecosystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgroecosystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProfilAgroecosystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfilAgroecosystemSwitch<Adapter> modelSwitch =
		new ProfilAgroecosystemSwitch<Adapter>() {
			@Override
			public Adapter caseAgroecosystem(Agroecosystem object) {
				return createAgroecosystemAdapter();
			}
			@Override
			public Adapter casePeasant(Peasant object) {
				return createPeasantAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseFarm(Farm object) {
				return createFarmAdapter();
			}
			@Override
			public Adapter caseRotation(Rotation object) {
				return createRotationAdapter();
			}
			@Override
			public Adapter casePlot(Plot object) {
				return createPlotAdapter();
			}
			@Override
			public Adapter caseCrop(Crop object) {
				return createCropAdapter();
			}
			@Override
			public Adapter caseWeather(Weather object) {
				return createWeatherAdapter();
			}
			@Override
			public Adapter caseFarmingCalendar(FarmingCalendar object) {
				return createFarmingCalendarAdapter();
			}
			@Override
			public Adapter caseAgentClimate(AgentClimate object) {
				return createAgentClimateAdapter();
			}
			@Override
			public Adapter caseOrganisation(Organisation object) {
				return createOrganisationAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter casePlant(Plant object) {
				return createPlantAdapter();
			}
			@Override
			public Adapter caseFertilize(Fertilize object) {
				return createFertilizeAdapter();
			}
			@Override
			public Adapter caseCultivate(Cultivate object) {
				return createCultivateAdapter();
			}
			@Override
			public Adapter caseIrrigation(Irrigation object) {
				return createIrrigationAdapter();
			}
			@Override
			public Adapter caseHarvest(Harvest object) {
				return createHarvestAdapter();
			}
			@Override
			public Adapter caseTransporte(Transporte object) {
				return createTransporteAdapter();
			}
			@Override
			public Adapter caseClear(Clear object) {
				return createClearAdapter();
			}
			@Override
			public Adapter caseBuy(Buy object) {
				return createBuyAdapter();
			}
			@Override
			public Adapter caseSell(Sell object) {
				return createSellAdapter();
			}
			@Override
			public Adapter caseStock(Stock object) {
				return createStockAdapter();
			}
			@Override
			public Adapter caseTransport(Transport object) {
				return createTransportAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Agroecosystem <em>Agroecosystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Agroecosystem
	 * @generated
	 */
	public Adapter createAgroecosystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Peasant <em>Peasant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Peasant
	 * @generated
	 */
	public Adapter createPeasantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Farm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Farm
	 * @generated
	 */
	public Adapter createFarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Plot
	 * @generated
	 */
	public Adapter createPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Crop <em>Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Crop
	 * @generated
	 */
	public Adapter createCropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Weather <em>Weather</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Weather
	 * @generated
	 */
	public Adapter createWeatherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.FarmingCalendar <em>Farming Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.FarmingCalendar
	 * @generated
	 */
	public Adapter createFarmingCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.AgentClimate <em>Agent Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.AgentClimate
	 * @generated
	 */
	public Adapter createAgentClimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Organisation
	 * @generated
	 */
	public Adapter createOrganisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Fertilize <em>Fertilize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Fertilize
	 * @generated
	 */
	public Adapter createFertilizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Cultivate <em>Cultivate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Cultivate
	 * @generated
	 */
	public Adapter createCultivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Irrigation <em>Irrigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Irrigation
	 * @generated
	 */
	public Adapter createIrrigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Harvest <em>Harvest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Harvest
	 * @generated
	 */
	public Adapter createHarvestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Transporte <em>Transporte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Transporte
	 * @generated
	 */
	public Adapter createTransporteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Clear
	 * @generated
	 */
	public Adapter createClearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Buy <em>Buy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Buy
	 * @generated
	 */
	public Adapter createBuyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Sell <em>Sell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Sell
	 * @generated
	 */
	public Adapter createSellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Stock
	 * @generated
	 */
	public Adapter createStockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgroecosystem.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgroecosystem.Transport
	 * @generated
	 */
	public Adapter createTransportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProfilAgroecosystemAdapterFactory
