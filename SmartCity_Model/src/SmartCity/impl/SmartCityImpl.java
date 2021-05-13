/**
 */
package SmartCity.impl;

import SmartCity.CityDevice;
import SmartCity.Institution;
import SmartCity.SmartCity;
import SmartCity.SmartCityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.impl.SmartCityImpl#getCityName <em>City Name</em>}</li>
 *   <li>{@link SmartCity.impl.SmartCityImpl#getCityDevices <em>City Devices</em>}</li>
 *   <li>{@link SmartCity.impl.SmartCityImpl#getInstitutions <em>Institutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartCityImpl extends MinimalEObjectImpl.Container implements SmartCity {
	/**
	 * The default value of the '{@link #getCityName() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityName() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityName()
	 * @generated
	 * @ordered
	 */
	protected String cityName = CITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCityDevices() <em>City Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<CityDevice> cityDevices;

	/**
	 * The cached value of the '{@link #getInstitutions() <em>Institutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Institution> institutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartCityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartCityPackage.Literals.SMART_CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCityName(String newCityName) {
		String oldCityName = cityName;
		cityName = newCityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.SMART_CITY__CITY_NAME, oldCityName, cityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CityDevice> getCityDevices() {
		if (cityDevices == null) {
			cityDevices = new EObjectContainmentEList<CityDevice>(CityDevice.class, this, SmartCityPackage.SMART_CITY__CITY_DEVICES);
		}
		return cityDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Institution> getInstitutions() {
		if (institutions == null) {
			institutions = new EObjectContainmentEList<Institution>(Institution.class, this, SmartCityPackage.SMART_CITY__INSTITUTIONS);
		}
		return institutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartCityPackage.SMART_CITY__CITY_DEVICES:
				return ((InternalEList<?>)getCityDevices()).basicRemove(otherEnd, msgs);
			case SmartCityPackage.SMART_CITY__INSTITUTIONS:
				return ((InternalEList<?>)getInstitutions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartCityPackage.SMART_CITY__CITY_NAME:
				return getCityName();
			case SmartCityPackage.SMART_CITY__CITY_DEVICES:
				return getCityDevices();
			case SmartCityPackage.SMART_CITY__INSTITUTIONS:
				return getInstitutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartCityPackage.SMART_CITY__CITY_NAME:
				setCityName((String)newValue);
				return;
			case SmartCityPackage.SMART_CITY__CITY_DEVICES:
				getCityDevices().clear();
				getCityDevices().addAll((Collection<? extends CityDevice>)newValue);
				return;
			case SmartCityPackage.SMART_CITY__INSTITUTIONS:
				getInstitutions().clear();
				getInstitutions().addAll((Collection<? extends Institution>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmartCityPackage.SMART_CITY__CITY_NAME:
				setCityName(CITY_NAME_EDEFAULT);
				return;
			case SmartCityPackage.SMART_CITY__CITY_DEVICES:
				getCityDevices().clear();
				return;
			case SmartCityPackage.SMART_CITY__INSTITUTIONS:
				getInstitutions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmartCityPackage.SMART_CITY__CITY_NAME:
				return CITY_NAME_EDEFAULT == null ? cityName != null : !CITY_NAME_EDEFAULT.equals(cityName);
			case SmartCityPackage.SMART_CITY__CITY_DEVICES:
				return cityDevices != null && !cityDevices.isEmpty();
			case SmartCityPackage.SMART_CITY__INSTITUTIONS:
				return institutions != null && !institutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cityName: ");
		result.append(cityName);
		result.append(')');
		return result.toString();
	}

} //SmartCityImpl
