/**
 */
package SmartCity.impl;

import SmartCity.*;

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
public class SmartCityFactoryImpl extends EFactoryImpl implements SmartCityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartCityFactory init() {
		try {
			SmartCityFactory theSmartCityFactory = (SmartCityFactory)EPackage.Registry.INSTANCE.getEFactory(SmartCityPackage.eNS_URI);
			if (theSmartCityFactory != null) {
				return theSmartCityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartCityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityFactoryImpl() {
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
			case SmartCityPackage.SMART_CITY: return createSmartCity();
			case SmartCityPackage.CITY_DEVICE: return createCityDevice();
			case SmartCityPackage.SENSOR: return createSensor();
			case SmartCityPackage.CONTROL_UNIT: return createControlUnit();
			case SmartCityPackage.LOCATION: return createLocation();
			case SmartCityPackage.PROPERTY: return createProperty();
			case SmartCityPackage.INSTITUTION: return createInstitution();
			case SmartCityPackage.DATA_FILE: return createDataFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCity createSmartCity() {
		SmartCityImpl smartCity = new SmartCityImpl();
		return smartCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityDevice createCityDevice() {
		CityDeviceImpl cityDevice = new CityDeviceImpl();
		return cityDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlUnit createControlUnit() {
		ControlUnitImpl controlUnit = new ControlUnitImpl();
		return controlUnit;
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution createInstitution() {
		InstitutionImpl institution = new InstitutionImpl();
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFile createDataFile() {
		DataFileImpl dataFile = new DataFileImpl();
		return dataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCityPackage getSmartCityPackage() {
		return (SmartCityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartCityPackage getPackage() {
		return SmartCityPackage.eINSTANCE;
	}

} //SmartCityFactoryImpl
