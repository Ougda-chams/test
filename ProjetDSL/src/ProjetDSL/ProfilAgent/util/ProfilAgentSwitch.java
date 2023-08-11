/**
 */
package ProjetDSL.ProfilAgent.util;

import ProjetDSL.ProfilAgent.Action;
import ProjetDSL.ProfilAgent.Agent;
import ProjetDSL.ProfilAgent.Behaviour;
import ProjetDSL.ProfilAgent.Cell;
import ProjetDSL.ProfilAgent.Deal;
import ProjetDSL.ProfilAgent.Event;
import ProjetDSL.ProfilAgent.GetInformation;
import ProjetDSL.ProfilAgent.GetRessource;
import ProjetDSL.ProfilAgent.Live;
import ProjetDSL.ProfilAgent.Location;
import ProjetDSL.ProfilAgent.Migrate;
import ProjetDSL.ProfilAgent.Move;
import ProjetDSL.ProfilAgent.Perseve;
import ProjetDSL.ProfilAgent.ProfilAgentPackage;
import ProjetDSL.ProfilAgent.Ressource;
import ProjetDSL.ProfilAgent.ShareInformation;
import ProjetDSL.ProfilAgent.ShareRessource;
import ProjetDSL.ProfilAgent.UseRessource;

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
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage
 * @generated
 */
public class ProfilAgentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilAgentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgentSwitch() {
		if (modelPackage == null) {
			modelPackage = ProfilAgentPackage.eINSTANCE;
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
			case ProfilAgentPackage.RESSOURCE: {
				Ressource ressource = (Ressource)theEObject;
				T result = caseRessource(ressource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.OBJECT: {
				ProjetDSL.ProfilAgent.Object object = (ProjetDSL.ProfilAgent.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseCell(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.BEHAVIOUR: {
				Behaviour behaviour = (Behaviour)theEObject;
				T result = caseBehaviour(behaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.DEAL: {
				Deal deal = (Deal)theEObject;
				T result = caseDeal(deal);
				if (result == null) result = caseBehaviour(deal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.LIVE: {
				Live live = (Live)theEObject;
				T result = caseLive(live);
				if (result == null) result = caseBehaviour(live);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.PERSEVE: {
				Perseve perseve = (Perseve)theEObject;
				T result = casePerseve(perseve);
				if (result == null) result = caseBehaviour(perseve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = caseBehaviour(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.MIGRATE: {
				Migrate migrate = (Migrate)theEObject;
				T result = caseMigrate(migrate);
				if (result == null) result = caseBehaviour(migrate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.GET_RESSOURCE: {
				GetRessource getRessource = (GetRessource)theEObject;
				T result = caseGetRessource(getRessource);
				if (result == null) result = caseBehaviour(getRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.SHARE_RESSOURCE: {
				ShareRessource shareRessource = (ShareRessource)theEObject;
				T result = caseShareRessource(shareRessource);
				if (result == null) result = caseBehaviour(shareRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.GET_INFORMATION: {
				GetInformation getInformation = (GetInformation)theEObject;
				T result = caseGetInformation(getInformation);
				if (result == null) result = caseBehaviour(getInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.USE_RESSOURCE: {
				UseRessource useRessource = (UseRessource)theEObject;
				T result = caseUseRessource(useRessource);
				if (result == null) result = caseBehaviour(useRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilAgentPackage.SHARE_INFORMATION: {
				ShareInformation shareInformation = (ShareInformation)theEObject;
				T result = caseShareInformation(shareInformation);
				if (result == null) result = caseBehaviour(shareInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(ProjetDSL.ProfilAgent.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviour(Behaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeal(Deal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLive(Live object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perseve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perseve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerseve(Perseve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migrate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migrate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrate(Migrate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetRessource(GetRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Share Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Share Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareRessource(ShareRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetInformation(GetInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseRessource(UseRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Share Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Share Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShareInformation(ShareInformation object) {
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

} //ProfilAgentSwitch
