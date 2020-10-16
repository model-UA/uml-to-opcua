/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Path Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getRemainingPathIndex <em>Remaining Path Index</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathTarget()
 * @model extendedMetaData="name='BrowsePathTarget' kind='elementOnly'"
 * @generated
 */
public interface BrowsePathTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' containment reference.
	 * @see #isSetTargetId()
	 * @see #unsetTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathTarget_TargetId()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetId' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedNodeId getTargetId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' containment reference.
	 * @see #isSetTargetId()
	 * @see #unsetTargetId()
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(ExpandedNodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getTargetId <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetId()
	 * @see #getTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @generated
	 */
	void unsetTargetId();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getTargetId <em>Target Id</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Id</em>' containment reference is set.
	 * @see #unsetTargetId()
	 * @see #getTargetId()
	 * @see #setTargetId(ExpandedNodeId)
	 * @generated
	 */
	boolean isSetTargetId();

	/**
	 * Returns the value of the '<em><b>Remaining Path Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Path Index</em>' attribute.
	 * @see #isSetRemainingPathIndex()
	 * @see #unsetRemainingPathIndex()
	 * @see #setRemainingPathIndex(long)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePathTarget_RemainingPathIndex()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='RemainingPathIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	long getRemainingPathIndex();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getRemainingPathIndex <em>Remaining Path Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Path Index</em>' attribute.
	 * @see #isSetRemainingPathIndex()
	 * @see #unsetRemainingPathIndex()
	 * @see #getRemainingPathIndex()
	 * @generated
	 */
	void setRemainingPathIndex(long value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getRemainingPathIndex <em>Remaining Path Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemainingPathIndex()
	 * @see #getRemainingPathIndex()
	 * @see #setRemainingPathIndex(long)
	 * @generated
	 */
	void unsetRemainingPathIndex();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePathTarget#getRemainingPathIndex <em>Remaining Path Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remaining Path Index</em>' attribute is set.
	 * @see #unsetRemainingPathIndex()
	 * @see #getRemainingPathIndex()
	 * @see #setRemainingPathIndex(long)
	 * @generated
	 */
	boolean isSetRemainingPathIndex();

} // BrowsePathTarget
