/**
 */
package SmartCity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.DataFile#getId <em>Id</em>}</li>
 *   <li>{@link SmartCity.DataFile#getDataType <em>Data Type</em>}</li>
 *   <li>{@link SmartCity.DataFile#getDataPath <em>Data Path</em>}</li>
 * </ul>
 *
 * @see SmartCity.SmartCityPackage#getDataFile()
 * @model
 * @generated
 */
public interface DataFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see SmartCity.SmartCityPackage#getDataFile_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link SmartCity.DataFile#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see SmartCity.SmartCityPackage#getDataFile_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link SmartCity.DataFile#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' attribute.
	 * @see #setDataPath(String)
	 * @see SmartCity.SmartCityPackage#getDataFile_DataPath()
	 * @model
	 * @generated
	 */
	String getDataPath();

	/**
	 * Sets the value of the '{@link SmartCity.DataFile#getDataPath <em>Data Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' attribute.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(String value);

} // DataFile
