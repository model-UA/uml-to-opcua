/**
 */
package org.opcfoundation.ua._2011._03.ua.node.set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UA Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getArgumentDescription <em>Argument Description</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable <em>Executable</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getMethodDeclarationId <em>Method Declaration Id</em>}</li>
 *   <li>{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable <em>User Executable</em>}</li>
 * </ul>
 *
 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAMethod()
 * @model extendedMetaData="name='UAMethod' kind='elementOnly'"
 * @generated
 */
public interface UAMethod extends UAInstance {
	/**
	 * Returns the value of the '<em><b>Argument Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethodArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Description</em>' containment reference list.
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAMethod_ArgumentDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArgumentDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UAMethodArgument> getArgumentDescription();

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #isSetExecutable()
	 * @see #unsetExecutable()
	 * @see #setExecutable(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAMethod_Executable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Executable'"
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #isSetExecutable()
	 * @see #unsetExecutable()
	 * @see #isExecutable()
	 * @generated
	 */
	void setExecutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExecutable()
	 * @see #isExecutable()
	 * @see #setExecutable(boolean)
	 * @generated
	 */
	void unsetExecutable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isExecutable <em>Executable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Executable</em>' attribute is set.
	 * @see #unsetExecutable()
	 * @see #isExecutable()
	 * @see #setExecutable(boolean)
	 * @generated
	 */
	boolean isSetExecutable();

	/**
	 * Returns the value of the '<em><b>Method Declaration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Declaration Id</em>' attribute.
	 * @see #setMethodDeclarationId(String)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAMethod_MethodDeclarationId()
	 * @model dataType="org.opcfoundation.ua._2011._03.ua.node.set.NodeId"
	 *        extendedMetaData="kind='attribute' name='MethodDeclarationId'"
	 * @generated
	 */
	String getMethodDeclarationId();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#getMethodDeclarationId <em>Method Declaration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Declaration Id</em>' attribute.
	 * @see #getMethodDeclarationId()
	 * @generated
	 */
	void setMethodDeclarationId(String value);

	/**
	 * Returns the value of the '<em><b>User Executable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Executable</em>' attribute.
	 * @see #isSetUserExecutable()
	 * @see #unsetUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @see org.opcfoundation.ua._2011._03.ua.node.set.SetPackage#getUAMethod_UserExecutable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='UserExecutable'"
	 * @generated
	 */
	boolean isUserExecutable();

	/**
	 * Sets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Executable</em>' attribute.
	 * @see #isSetUserExecutable()
	 * @see #unsetUserExecutable()
	 * @see #isUserExecutable()
	 * @generated
	 */
	void setUserExecutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable <em>User Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserExecutable()
	 * @see #isUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @generated
	 */
	void unsetUserExecutable();

	/**
	 * Returns whether the value of the '{@link org.opcfoundation.ua._2011._03.ua.node.set.UAMethod#isUserExecutable <em>User Executable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Executable</em>' attribute is set.
	 * @see #unsetUserExecutable()
	 * @see #isUserExecutable()
	 * @see #setUserExecutable(boolean)
	 * @generated
	 */
	boolean isSetUserExecutable();

} // UAMethod
