/**
 */
package ProjetDSL.ProfilAgroecosystem;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getIdCrop <em>Id Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getCropName <em>Crop Name</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getTypeCrop <em>Type Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getYield <em>Yield</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getDateCrop <em>Date Crop</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getArea <em>Area</em>}</li>
 *   <li>{@link ProjetDSL.ProfilAgroecosystem.Crop#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop()
 * @model
 * @generated
 */
public interface Crop extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Crop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Crop</em>' attribute.
	 * @see #setIdCrop(int)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_IdCrop()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getIdCrop();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getIdCrop <em>Id Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Crop</em>' attribute.
	 * @see #getIdCrop()
	 * @generated
	 */
	void setIdCrop(int value);

	/**
	 * Returns the value of the '<em><b>Crop Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crop Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crop Name</em>' attribute.
	 * @see #setCropName(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_CropName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCropName();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getCropName <em>Crop Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crop Name</em>' attribute.
	 * @see #getCropName()
	 * @generated
	 */
	void setCropName(String value);

	/**
	 * Returns the value of the '<em><b>Type Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Crop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Crop</em>' attribute.
	 * @see #setTypeCrop(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_TypeCrop()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTypeCrop();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getTypeCrop <em>Type Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Crop</em>' attribute.
	 * @see #getTypeCrop()
	 * @generated
	 */
	void setTypeCrop(String value);

	/**
	 * Returns the value of the '<em><b>Yield</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield</em>' attribute.
	 * @see #setYield(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_Yield()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getYield();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getYield <em>Yield</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield</em>' attribute.
	 * @see #getYield()
	 * @generated
	 */
	void setYield(String value);

	/**
	 * Returns the value of the '<em><b>Date Crop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Crop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Crop</em>' attribute.
	 * @see #setDateCrop(Date)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_DateCrop()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDateCrop();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getDateCrop <em>Date Crop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Crop</em>' attribute.
	 * @see #getDateCrop()
	 * @generated
	 */
	void setDateCrop(Date value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_Area()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see ProjetDSL.ProfilAgroecosystem.ProfilAgroecosystemPackage#getCrop_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link ProjetDSL.ProfilAgroecosystem.Crop#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Crop
