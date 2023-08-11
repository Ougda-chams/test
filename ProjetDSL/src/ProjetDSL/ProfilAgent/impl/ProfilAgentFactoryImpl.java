/**
 */
package ProjetDSL.ProfilAgent.impl;

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
import ProjetDSL.ProfilAgent.ProfilAgentFactory;
import ProjetDSL.ProfilAgent.ProfilAgentPackage;
import ProjetDSL.ProfilAgent.Ressource;
import ProjetDSL.ProfilAgent.ShareInformation;
import ProjetDSL.ProfilAgent.ShareRessource;
import ProjetDSL.ProfilAgent.UseRessource;

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
public class ProfilAgentFactoryImpl extends EFactoryImpl implements ProfilAgentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfilAgentFactory init() {
		try {
			ProfilAgentFactory theProfilAgentFactory = (ProfilAgentFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilAgentPackage.eNS_URI);
			if (theProfilAgentFactory != null) {
				return theProfilAgentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfilAgentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgentFactoryImpl() {
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
			case ProfilAgentPackage.RESSOURCE: return createRessource();
			case ProfilAgentPackage.AGENT: return createAgent();
			case ProfilAgentPackage.OBJECT: return createObject();
			case ProfilAgentPackage.CELL: return createCell();
			case ProfilAgentPackage.LOCATION: return createLocation();
			case ProfilAgentPackage.EVENT: return createEvent();
			case ProfilAgentPackage.ACTION: return createAction();
			case ProfilAgentPackage.BEHAVIOUR: return createBehaviour();
			case ProfilAgentPackage.DEAL: return createDeal();
			case ProfilAgentPackage.LIVE: return createLive();
			case ProfilAgentPackage.PERSEVE: return createPerseve();
			case ProfilAgentPackage.MOVE: return createMove();
			case ProfilAgentPackage.MIGRATE: return createMigrate();
			case ProfilAgentPackage.GET_RESSOURCE: return createGetRessource();
			case ProfilAgentPackage.SHARE_RESSOURCE: return createShareRessource();
			case ProfilAgentPackage.GET_INFORMATION: return createGetInformation();
			case ProfilAgentPackage.USE_RESSOURCE: return createUseRessource();
			case ProfilAgentPackage.SHARE_INFORMATION: return createShareInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource createRessource() {
		RessourceImpl ressource = new RessourceImpl();
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetDSL.ProfilAgent.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deal createDeal() {
		DealImpl deal = new DealImpl();
		return deal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Live createLive() {
		LiveImpl live = new LiveImpl();
		return live;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perseve createPerseve() {
		PerseveImpl perseve = new PerseveImpl();
		return perseve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Migrate createMigrate() {
		MigrateImpl migrate = new MigrateImpl();
		return migrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRessource createGetRessource() {
		GetRessourceImpl getRessource = new GetRessourceImpl();
		return getRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareRessource createShareRessource() {
		ShareRessourceImpl shareRessource = new ShareRessourceImpl();
		return shareRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInformation createGetInformation() {
		GetInformationImpl getInformation = new GetInformationImpl();
		return getInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseRessource createUseRessource() {
		UseRessourceImpl useRessource = new UseRessourceImpl();
		return useRessource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareInformation createShareInformation() {
		ShareInformationImpl shareInformation = new ShareInformationImpl();
		return shareInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilAgentPackage getProfilAgentPackage() {
		return (ProfilAgentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilAgentPackage getPackage() {
		return ProfilAgentPackage.eINSTANCE;
	}

} //ProfilAgentFactoryImpl
