/**
 */
package SmartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.SmartCityBase#getCityName <em>City Name</em>}</li>
 *   <li>{@link SmartCity.SmartCityBase#getCityDevices <em>City Devices</em>}</li>
 *   <li>{@link SmartCity.SmartCityBase#getInstitutions <em>Institutions</em>}</li>
 * </ul>
 *
 * @see SmartCity.SmartCityPackage#getSmartCityBase()
 * @model
 * @generated
 */
public interface SmartCityBase extends EObject {
	/**
	 * Returns the value of the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Name</em>' attribute.
	 * @see #setCityName(String)
	 * @see SmartCity.SmartCityPackage#getSmartCityBase_CityName()
	 * @model
	 * @generated
	 */
	String getCityName();

	/**
	 * Sets the value of the '{@link SmartCity.SmartCityBase#getCityName <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' attribute.
	 * @see #getCityName()
	 * @generated
	 */
	void setCityName(String value);

	/**
	 * Returns the value of the '<em><b>City Devices</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.CityDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Devices</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getSmartCityBase_CityDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<CityDevice> getCityDevices();

	/**
	 * Returns the value of the '<em><b>Institutions</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.Institution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institutions</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getSmartCityBase_Institutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Institution> getInstitutions();

} // SmartCityBase
