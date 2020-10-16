/**
 */
package org.opcfoundation.ua._2008._02.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browse Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getStartingNode <em>Starting Node</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getRelativePath <em>Relative Path</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePath()
 * @model extendedMetaData="name='BrowsePath' kind='elementOnly'"
 * @generated
 */
public interface BrowsePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Node</em>' containment reference.
	 * @see #isSetStartingNode()
	 * @see #unsetStartingNode()
	 * @see #setStartingNode(NodeId)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePath_StartingNode()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='StartingNode' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeId getStartingNode();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getStartingNode <em>Starting Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Node</em>' containment reference.
	 * @see #isSetStartingNode()
	 * @see #unsetStartingNode()
	 * @see #getStartingNode()
	 * @generated
	 */
	void setStartingNode(NodeId value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getStartingNode <em>Starting Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartingNode()
	 * @see #getStartingNode()
	 * @see #setStartingNode(NodeId)
	 * @generated
	 */
	void unsetStartingNode();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getStartingNode <em>Starting Node</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Starting Node</em>' containment reference is set.
	 * @see #unsetStartingNode()
	 * @see #getStartingNode()
	 * @see #setStartingNode(NodeId)
	 * @generated
	 */
	boolean isSetStartingNode();

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' containment reference.
	 * @see #isSetRelativePath()
	 * @see #unsetRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getBrowsePath_RelativePath()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RelativePath' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativePath getRelativePath();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' containment reference.
	 * @see #isSetRelativePath()
	 * @see #unsetRelativePath()
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(RelativePath value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getRelativePath <em>Relative Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativePath()
	 * @see #getRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @generated
	 */
	void unsetRelativePath();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2008._02.types.BrowsePath#getRelativePath <em>Relative Path</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Path</em>' containment reference is set.
	 * @see #unsetRelativePath()
	 * @see #getRelativePath()
	 * @see #setRelativePath(RelativePath)
	 * @generated
	 */
	boolean isSetRelativePath();

} // BrowsePath
