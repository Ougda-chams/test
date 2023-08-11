/**
 */
package ProjetDSL.ProfilAgroecosystem.util;

import ProjetDSL.ProfilAgroecosystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage
 * @generated
 */
public class ProfilAgroecosystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilAgroecosystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgroecosystemSwitch() {
		if (modelPackage == null) {
			modelPackage = ProfilAgroecosystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProfilAgroecosystemPackage.AGROECOSYSTEM: {
				Agroecosystem agroecosystem = (Agroecosystem)theEObject;
				T result = caseAgroecosystem(agroecosystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.PEASANT: {
				Peasant peasant = (Peasant)theEObject;
				T result = casePeasant(peasant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.FARM: {
				Farm farm = (Farm)theEObject;
				T result = caseFarm(farm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.ROTATION: {
				Rotation rotation = (Rotation)theEObject;
				T result = caseRotation(rotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.PLOT: {
				Plot plot = (Plot)theEObject;
				T result = casePlot(plot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.CROP: {
				Crop crop = (Crop)theEObject;
				T result = caseCrop(crop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.WEATHER: {
				Weather weather = (Weather)theEObject;
				T result = caseWeather(weather);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.FARMING_CALENDAR: {
				FarmingCalendar farmingCalendar = (FarmingCalendar)theEObject;
				T result = caseFarmingCalendar(farmingCalendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.AGENT_CLIMATE: {
				AgentClimate agentClimate = (AgentClimate)theEObject;
				T result = caseAgentClimate(agentClimate);
				if (result == null) result = caseWeather(agentClimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.ORGANISATION: {
				Organisation organisation = (Organisation)theEObject;
				T result = caseOrganisation(organisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null) result = caseOperation(plant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.FERTILIZE: {
				Fertilize fertilize = (Fertilize)theEObject;
				T result = caseFertilize(fertilize);
				if (result == null) result = caseOperation(fertilize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.CULTIVATE: {
				Cultivate cultivate = (Cultivate)theEObject;
				T result = caseCultivate(cultivate);
				if (result == null) result = casePeasant(cultivate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.IRRIGATION: {
				Irrigation irrigation = (Irrigation)theEObject;
				T result = caseIrrigation(irrigation);
				if (result == null) result = caseOperation(irrigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.HARVEST: {
				Harvest harvest = (Harvest)theEObject;
				T result = caseHarvest(harvest);
				if (result == null) result = casePeasant(harvest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.TRANSPORTE: {
				Transporte transporte = (Transporte)theEObject;
				T result = caseTransporte(transporte);
				if (result == null) result = casePeasant(transporte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.CLEAR: {
				Clear clear = (Clear)theEObject;
				T result = caseClear(clear);
				if (result == null) result = caseOperation(clear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.BUY: {
				Buy buy = (Buy)theEObject;
				T result = caseBuy(buy);
				if (result == null) result = casePeasant(buy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.SELL: {
				Sell sell = (Sell)theEObject;
				T result = caseSell(sell);
				if (result == null) result = casePeasant(sell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.STOCK: {
				Stock stock = (Stock)theEObject;
				T result = caseStock(stock);
				if (result == null) result = casePeasant(stock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgroecosystemPackage.TRANSPORT: {
				Transport transport = (Transport)theEObject;
				T result = caseTransport(transport);
				if (result == null) result = caseOperation(transport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agroecosystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agroecosystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgroecosystem(Agroecosystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peasant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peasant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeasant(Peasant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Farm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Farm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFarm(Farm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotation(Rotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlot(Plot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrop(Crop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weather</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeather(Weather object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Farming Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Farming Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFarmingCalendar(FarmingCalendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Climate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Climate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentClimate(AgentClimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fertilize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fertilize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFertilize(Fertilize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cultivate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cultivate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCultivate(Cultivate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Irrigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Irrigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIrrigation(Irrigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harvest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harvest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarvest(Harvest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transporte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transporte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransporte(Transporte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClear(Clear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuy(Buy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSell(Sell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStock(Stock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransport(Transport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProfilAgroecosystemSwitch
