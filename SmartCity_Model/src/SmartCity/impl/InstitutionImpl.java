/**
 */
package SmartCity.impl;

import SmartCity.DataFile;
import SmartCity.Institution;
import SmartCity.Location;
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
 * An implementation of the model object '<em><b>Institution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.impl.InstitutionImpl#getId <em>Id</em>}</li>
 *   <li>{@link SmartCity.impl.InstitutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link SmartCity.impl.InstitutionImpl#getResponsibility <em>Responsibility</em>}</li>
 *   <li>{@link SmartCity.impl.InstitutionImpl#getDataFiles <em>Data Files</em>}</li>
 *   <li>{@link SmartCity.impl.InstitutionImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstitutionImpl extends MinimalEObjectImpl.Container implements Institution {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibility() <em>Responsibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibility()
	 * @generated
	 * @ordered
	 */
	protected String responsibility = RESPONSIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataFiles() <em>Data Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFile> dataFiles;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartCityPackage.Literals.INSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.INSTITUTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.INSTITUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibility() {
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibility(String newResponsibility) {
		String oldResponsibility = responsibility;
		responsibility = newResponsibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.INSTITUTION__RESPONSIBILITY, oldResponsibility, responsibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFile> getDataFiles() {
		if (dataFiles == null) {
			dataFiles = new EObjectContainmentEList<DataFile>(DataFile.class, this, SmartCityPackage.INSTITUTION__DATA_FILES);
		}
		return dataFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmartCityPackage.INSTITUTION__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmartCityPackage.INSTITUTION__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmartCityPackage.INSTITUTION__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCityPackage.INSTITUTION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartCityPackage.INSTITUTION__DATA_FILES:
				return ((InternalEList<?>)getDataFiles()).basicRemove(otherEnd, msgs);
			case SmartCityPackage.INSTITUTION__LOCATION:
				return basicSetLocation(null, msgs);
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
			case SmartCityPackage.INSTITUTION__ID:
				return getId();
			case SmartCityPackage.INSTITUTION__NAME:
				return getName();
			case SmartCityPackage.INSTITUTION__RESPONSIBILITY:
				return getResponsibility();
			case SmartCityPackage.INSTITUTION__DATA_FILES:
				return getDataFiles();
			case SmartCityPackage.INSTITUTION__LOCATION:
				return getLocation();
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
			case SmartCityPackage.INSTITUTION__ID:
				setId((Integer)newValue);
				return;
			case SmartCityPackage.INSTITUTION__NAME:
				setName((String)newValue);
				return;
			case SmartCityPackage.INSTITUTION__RESPONSIBILITY:
				setResponsibility((String)newValue);
				return;
			case SmartCityPackage.INSTITUTION__DATA_FILES:
				getDataFiles().clear();
				getDataFiles().addAll((Collection<? extends DataFile>)newValue);
				return;
			case SmartCityPackage.INSTITUTION__LOCATION:
				setLocation((Location)newValue);
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
			case SmartCityPackage.INSTITUTION__ID:
				setId(ID_EDEFAULT);
				return;
			case SmartCityPackage.INSTITUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmartCityPackage.INSTITUTION__RESPONSIBILITY:
				setResponsibility(RESPONSIBILITY_EDEFAULT);
				return;
			case SmartCityPackage.INSTITUTION__DATA_FILES:
				getDataFiles().clear();
				return;
			case SmartCityPackage.INSTITUTION__LOCATION:
				setLocation((Location)null);
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
			case SmartCityPackage.INSTITUTION__ID:
				return id != ID_EDEFAULT;
			case SmartCityPackage.INSTITUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmartCityPackage.INSTITUTION__RESPONSIBILITY:
				return RESPONSIBILITY_EDEFAULT == null ? responsibility != null : !RESPONSIBILITY_EDEFAULT.equals(responsibility);
			case SmartCityPackage.INSTITUTION__DATA_FILES:
				return dataFiles != null && !dataFiles.isEmpty();
			case SmartCityPackage.INSTITUTION__LOCATION:
				return location != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", responsibility: ");
		result.append(responsibility);
		result.append(')');
		return result.toString();
	}

} //InstitutionImpl
