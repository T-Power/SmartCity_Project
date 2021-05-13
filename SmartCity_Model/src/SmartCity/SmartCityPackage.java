/**
 */
package SmartCity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SmartCity.SmartCityFactory
 * @model kind="package"
 * @generated
 */
public interface SmartCityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SmartCity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/tnt/smartcity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.tnt.smartcity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartCityPackage eINSTANCE = SmartCity.impl.SmartCityPackageImpl.init();

	/**
	 * The meta object id for the '{@link SmartCity.impl.SmartCityBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.SmartCityBaseImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getSmartCityBase()
	 * @generated
	 */
	int SMART_CITY_BASE = 0;

	/**
	 * The feature id for the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_BASE__CITY_NAME = 0;

	/**
	 * The feature id for the '<em><b>City Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_BASE__CITY_DEVICES = 1;

	/**
	 * The feature id for the '<em><b>Institutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_BASE__INSTITUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.CityDeviceImpl <em>City Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.CityDeviceImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getCityDevice()
	 * @generated
	 */
	int CITY_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__SENSORS = 4;

	/**
	 * The feature id for the '<em><b>Control Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE__CONTROL_UNITS = 5;

	/**
	 * The number of structural features of the '<em>City Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>City Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.SensorImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIMESTAMP = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.ControlUnitImpl <em>Control Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.ControlUnitImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getControlUnit()
	 * @generated
	 */
	int CONTROL_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.LocationImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.PropertyImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.InstitutionImpl <em>Institution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.InstitutionImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getInstitution()
	 * @generated
	 */
	int INSTITUTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__RESPONSIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Data Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__DATA_FILES = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__LOCATION = 4;

	/**
	 * The number of structural features of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SmartCity.impl.DataFileImpl <em>Data File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SmartCity.impl.DataFileImpl
	 * @see SmartCity.impl.SmartCityPackageImpl#getDataFile()
	 * @generated
	 */
	int DATA_FILE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE__DATA_PATH = 2;

	/**
	 * The number of structural features of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SmartCity.SmartCityBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see SmartCity.SmartCityBase
	 * @generated
	 */
	EClass getSmartCityBase();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.SmartCityBase#getCityName <em>City Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Name</em>'.
	 * @see SmartCity.SmartCityBase#getCityName()
	 * @see #getSmartCityBase()
	 * @generated
	 */
	EAttribute getSmartCityBase_CityName();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.SmartCityBase#getCityDevices <em>City Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City Devices</em>'.
	 * @see SmartCity.SmartCityBase#getCityDevices()
	 * @see #getSmartCityBase()
	 * @generated
	 */
	EReference getSmartCityBase_CityDevices();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.SmartCityBase#getInstitutions <em>Institutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Institutions</em>'.
	 * @see SmartCity.SmartCityBase#getInstitutions()
	 * @see #getSmartCityBase()
	 * @generated
	 */
	EReference getSmartCityBase_Institutions();

	/**
	 * Returns the meta object for class '{@link SmartCity.CityDevice <em>City Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Device</em>'.
	 * @see SmartCity.CityDevice
	 * @generated
	 */
	EClass getCityDevice();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.CityDevice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SmartCity.CityDevice#getId()
	 * @see #getCityDevice()
	 * @generated
	 */
	EAttribute getCityDevice_Id();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.CityDevice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.CityDevice#getName()
	 * @see #getCityDevice()
	 * @generated
	 */
	EAttribute getCityDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.CityDevice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SmartCity.CityDevice#getDescription()
	 * @see #getCityDevice()
	 * @generated
	 */
	EAttribute getCityDevice_Description();

	/**
	 * Returns the meta object for the containment reference '{@link SmartCity.CityDevice#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see SmartCity.CityDevice#getLocation()
	 * @see #getCityDevice()
	 * @generated
	 */
	EReference getCityDevice_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.CityDevice#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see SmartCity.CityDevice#getSensors()
	 * @see #getCityDevice()
	 * @generated
	 */
	EReference getCityDevice_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.CityDevice#getControlUnits <em>Control Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Units</em>'.
	 * @see SmartCity.CityDevice#getControlUnits()
	 * @see #getCityDevice()
	 * @generated
	 */
	EReference getCityDevice_ControlUnits();

	/**
	 * Returns the meta object for class '{@link SmartCity.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see SmartCity.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Sensor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SmartCity.Sensor#getId()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Id();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Sensor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SmartCity.Sensor#getDescription()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Description();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Sensor#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see SmartCity.Sensor#getTimestamp()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Timestamp();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Sensor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see SmartCity.Sensor#getProperties()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Properties();

	/**
	 * Returns the meta object for class '{@link SmartCity.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Unit</em>'.
	 * @see SmartCity.ControlUnit
	 * @generated
	 */
	EClass getControlUnit();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.ControlUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SmartCity.ControlUnit#getId()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.ControlUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.ControlUnit#getName()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.ControlUnit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SmartCity.ControlUnit#getDescription()
	 * @see #getControlUnit()
	 * @generated
	 */
	EAttribute getControlUnit_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.ControlUnit#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see SmartCity.ControlUnit#getProperties()
	 * @see #getControlUnit()
	 * @generated
	 */
	EReference getControlUnit_Properties();

	/**
	 * Returns the meta object for class '{@link SmartCity.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see SmartCity.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see SmartCity.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see SmartCity.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for class '{@link SmartCity.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see SmartCity.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SmartCity.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link SmartCity.Institution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institution</em>'.
	 * @see SmartCity.Institution
	 * @generated
	 */
	EClass getInstitution();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Institution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SmartCity.Institution#getId()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Id();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Institution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SmartCity.Institution#getName()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Name();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.Institution#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsibility</em>'.
	 * @see SmartCity.Institution#getResponsibility()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Responsibility();

	/**
	 * Returns the meta object for the containment reference list '{@link SmartCity.Institution#getDataFiles <em>Data Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Files</em>'.
	 * @see SmartCity.Institution#getDataFiles()
	 * @see #getInstitution()
	 * @generated
	 */
	EReference getInstitution_DataFiles();

	/**
	 * Returns the meta object for the containment reference '{@link SmartCity.Institution#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see SmartCity.Institution#getLocation()
	 * @see #getInstitution()
	 * @generated
	 */
	EReference getInstitution_Location();

	/**
	 * Returns the meta object for class '{@link SmartCity.DataFile <em>Data File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data File</em>'.
	 * @see SmartCity.DataFile
	 * @generated
	 */
	EClass getDataFile();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.DataFile#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see SmartCity.DataFile#getId()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_Id();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.DataFile#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see SmartCity.DataFile#getDataType()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_DataType();

	/**
	 * Returns the meta object for the attribute '{@link SmartCity.DataFile#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Path</em>'.
	 * @see SmartCity.DataFile#getDataPath()
	 * @see #getDataFile()
	 * @generated
	 */
	EAttribute getDataFile_DataPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartCityFactory getSmartCityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SmartCity.impl.SmartCityBaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.SmartCityBaseImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getSmartCityBase()
		 * @generated
		 */
		EClass SMART_CITY_BASE = eINSTANCE.getSmartCityBase();

		/**
		 * The meta object literal for the '<em><b>City Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CITY_BASE__CITY_NAME = eINSTANCE.getSmartCityBase_CityName();

		/**
		 * The meta object literal for the '<em><b>City Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY_BASE__CITY_DEVICES = eINSTANCE.getSmartCityBase_CityDevices();

		/**
		 * The meta object literal for the '<em><b>Institutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY_BASE__INSTITUTIONS = eINSTANCE.getSmartCityBase_Institutions();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.CityDeviceImpl <em>City Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.CityDeviceImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getCityDevice()
		 * @generated
		 */
		EClass CITY_DEVICE = eINSTANCE.getCityDevice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_DEVICE__ID = eINSTANCE.getCityDevice_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_DEVICE__NAME = eINSTANCE.getCityDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_DEVICE__DESCRIPTION = eINSTANCE.getCityDevice_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_DEVICE__LOCATION = eINSTANCE.getCityDevice_Location();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_DEVICE__SENSORS = eINSTANCE.getCityDevice_Sensors();

		/**
		 * The meta object literal for the '<em><b>Control Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_DEVICE__CONTROL_UNITS = eINSTANCE.getCityDevice_ControlUnits();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.SensorImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ID = eINSTANCE.getSensor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__DESCRIPTION = eINSTANCE.getSensor_Description();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TIMESTAMP = eINSTANCE.getSensor_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PROPERTIES = eINSTANCE.getSensor_Properties();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.ControlUnitImpl <em>Control Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.ControlUnitImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getControlUnit()
		 * @generated
		 */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__ID = eINSTANCE.getControlUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__NAME = eINSTANCE.getControlUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_UNIT__DESCRIPTION = eINSTANCE.getControlUnit_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_UNIT__PROPERTIES = eINSTANCE.getControlUnit_Properties();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.LocationImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.PropertyImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.InstitutionImpl <em>Institution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.InstitutionImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getInstitution()
		 * @generated
		 */
		EClass INSTITUTION = eINSTANCE.getInstitution();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__ID = eINSTANCE.getInstitution_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__NAME = eINSTANCE.getInstitution_Name();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__RESPONSIBILITY = eINSTANCE.getInstitution_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Data Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTION__DATA_FILES = eINSTANCE.getInstitution_DataFiles();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTITUTION__LOCATION = eINSTANCE.getInstitution_Location();

		/**
		 * The meta object literal for the '{@link SmartCity.impl.DataFileImpl <em>Data File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SmartCity.impl.DataFileImpl
		 * @see SmartCity.impl.SmartCityPackageImpl#getDataFile()
		 * @generated
		 */
		EClass DATA_FILE = eINSTANCE.getDataFile();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__ID = eINSTANCE.getDataFile_Id();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__DATA_TYPE = eINSTANCE.getDataFile_DataType();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FILE__DATA_PATH = eINSTANCE.getDataFile_DataPath();

	}

} //SmartCityPackage
