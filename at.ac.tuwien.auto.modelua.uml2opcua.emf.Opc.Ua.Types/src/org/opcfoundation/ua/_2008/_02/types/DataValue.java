/**
 */
package org.opcfoundation.ua._2008._02.types;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getStatusCode <em>Status Code</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourceTimestamp <em>Source Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourcePicoseconds <em>Source Picoseconds</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerTimestamp <em>Server Timestamp</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerPicoseconds <em>Server Picoseconds</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue()
 * @model extendedMetaData="name='DataValue' kind='elementOnly'"
 * @generated
 */
public interface DataValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Variant)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	Variant getValue();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variant value);

	/**
	 * Returns the value of the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Code</em>' containment reference.
	 * @see #setStatusCode(StatusCode)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_StatusCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusCode getStatusCode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getStatusCode <em>Status Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Code</em>' containment reference.
	 * @see #getStatusCode()
	 * @generated
	 */
	void setStatusCode(StatusCode value);

	/**
	 * Returns the value of the '<em><b>Source Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Timestamp</em>' attribute.
	 * @see #setSourceTimestamp(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_SourceTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='SourceTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getSourceTimestamp();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourceTimestamp <em>Source Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Timestamp</em>' attribute.
	 * @see #getSourceTimestamp()
	 * @generated
	 */
	void setSourceTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Source Picoseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Picoseconds</em>' attribute.
	 * @see #isSetSourcePicoseconds()
	 * @see #unsetSourcePicoseconds()
	 * @see #setSourcePicoseconds(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_SourcePicoseconds()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='SourcePicoseconds' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSourcePicoseconds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourcePicoseconds <em>Source Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Picoseconds</em>' attribute.
	 * @see #isSetSourcePicoseconds()
	 * @see #unsetSourcePicoseconds()
	 * @see #getSourcePicoseconds()
	 * @generated
	 */
	void setSourcePicoseconds(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourcePicoseconds <em>Source Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourcePicoseconds()
	 * @see #getSourcePicoseconds()
	 * @see #setSourcePicoseconds(int)
	 * @generated
	 */
	void unsetSourcePicoseconds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getSourcePicoseconds <em>Source Picoseconds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Picoseconds</em>' attribute is set.
	 * @see #unsetSourcePicoseconds()
	 * @see #getSourcePicoseconds()
	 * @see #setSourcePicoseconds(int)
	 * @generated
	 */
	boolean isSetSourcePicoseconds();

	/**
	 * Returns the value of the '<em><b>Server Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Timestamp</em>' attribute.
	 * @see #setServerTimestamp(XMLGregorianCalendar)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_ServerTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ServerTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getServerTimestamp();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerTimestamp <em>Server Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Timestamp</em>' attribute.
	 * @see #getServerTimestamp()
	 * @generated
	 */
	void setServerTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Server Picoseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Picoseconds</em>' attribute.
	 * @see #isSetServerPicoseconds()
	 * @see #unsetServerPicoseconds()
	 * @see #setServerPicoseconds(int)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getDataValue_ServerPicoseconds()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='element' name='ServerPicoseconds' namespace='##targetNamespace'"
	 * @generated
	 */
	int getServerPicoseconds();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerPicoseconds <em>Server Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Picoseconds</em>' attribute.
	 * @see #isSetServerPicoseconds()
	 * @see #unsetServerPicoseconds()
	 * @see #getServerPicoseconds()
	 * @generated
	 */
	void setServerPicoseconds(int value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerPicoseconds <em>Server Picoseconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerPicoseconds()
	 * @see #getServerPicoseconds()
	 * @see #setServerPicoseconds(int)
	 * @generated
	 */
	void unsetServerPicoseconds();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.DataValue#getServerPicoseconds <em>Server Picoseconds</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Picoseconds</em>' attribute is set.
	 * @see #unsetServerPicoseconds()
	 * @see #getServerPicoseconds()
	 * @see #setServerPicoseconds(int)
	 * @generated
	 */
	boolean isSetServerPicoseconds();

} // DataValue
