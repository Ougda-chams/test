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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ProjetDSL.ProfilAgent.ProfilAgentPackage
 * @generated
 */
public class ProfilAgentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilAgentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProfilAgentPackage.eINSTANCE;
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
	protected ProfilAgentSwitch<Adapter> modelSwitch =
		new ProfilAgentSwitch<Adapter>() {
			@Override
			public Adapter caseRessource(Ressource object) {
				return createRessourceAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseObject(ProjetDSL.ProfilAgent.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseBehaviour(Behaviour object) {
				return createBehaviourAdapter();
			}
			@Override
			public Adapter caseDeal(Deal object) {
				return createDealAdapter();
			}
			@Override
			public Adapter caseLive(Live object) {
				return createLiveAdapter();
			}
			@Override
			public Adapter casePerseve(Perseve object) {
				return createPerseveAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseMigrate(Migrate object) {
				return createMigrateAdapter();
			}
			@Override
			public Adapter caseGetRessource(GetRessource object) {
				return createGetRessourceAdapter();
			}
			@Override
			public Adapter caseShareRessource(ShareRessource object) {
				return createShareRessourceAdapter();
			}
			@Override
			public Adapter caseGetInformation(GetInformation object) {
				return createGetInformationAdapter();
			}
			@Override
			public Adapter caseUseRessource(UseRessource object) {
				return createUseRessourceAdapter();
			}
			@Override
			public Adapter caseShareInformation(ShareInformation object) {
				return createShareInformationAdapter();
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
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Ressource
	 * @generated
	 */
	public Adapter createRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Behaviour
	 * @generated
	 */
	public Adapter createBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Deal <em>Deal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Deal
	 * @generated
	 */
	public Adapter createDealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Live <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Live
	 * @generated
	 */
	public Adapter createLiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Perseve <em>Perseve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Perseve
	 * @generated
	 */
	public Adapter createPerseveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.Migrate <em>Migrate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.Migrate
	 * @generated
	 */
	public Adapter createMigrateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.GetRessource <em>Get Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.GetRessource
	 * @generated
	 */
	public Adapter createGetRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.ShareRessource <em>Share Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.ShareRessource
	 * @generated
	 */
	public Adapter createShareRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.GetInformation <em>Get Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.GetInformation
	 * @generated
	 */
	public Adapter createGetInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.UseRessource <em>Use Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.UseRessource
	 * @generated
	 */
	public Adapter createUseRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ProjetDSL.ProfilAgent.ShareInformation <em>Share Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ProjetDSL.ProfilAgent.ShareInformation
	 * @generated
	 */
	public Adapter createShareInformationAdapter() {
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

} //ProfilAgentAdapterFactory
