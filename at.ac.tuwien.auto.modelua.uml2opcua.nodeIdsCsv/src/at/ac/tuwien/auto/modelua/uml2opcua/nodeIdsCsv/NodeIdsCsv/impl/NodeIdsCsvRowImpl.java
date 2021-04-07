/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl#getNodeClass <em>Node Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeIdsCsvRowImpl extends MinimalEObjectImpl.Container implements NodeIdsCsvRow {
	/**
	 * The default value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbolName() <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolName()
	 * @generated
	 * @ordered
	 */
	protected String symbolName = SYMBOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeClass() <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeClass() <em>Node Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeClass()
	 * @generated
	 * @ordered
	 */
	protected String nodeClass = NODE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeIdsCsvRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodeIdsCsvPackage.Literals.NODE_IDS_CSV_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbolName() {
		return symbolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbolName(String newSymbolName) {
		String oldSymbolName = symbolName;
		symbolName = newSymbolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeIdsCsvPackage.NODE_IDS_CSV_ROW__SYMBOL_NAME, oldSymbolName, symbolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeIdsCsvPackage.NODE_IDS_CSV_ROW__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeClass() {
		return nodeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeClass(String newNodeClass) {
		String oldNodeClass = nodeClass;
		nodeClass = newNodeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodeIdsCsvPackage.NODE_IDS_CSV_ROW__NODE_CLASS, oldNodeClass, nodeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__SYMBOL_NAME:
				return getSymbolName();
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__IDENTIFIER:
				return getIdentifier();
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__NODE_CLASS:
				return getNodeClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__SYMBOL_NAME:
				setSymbolName((String)newValue);
				return;
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__NODE_CLASS:
				setNodeClass((String)newValue);
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
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__SYMBOL_NAME:
				setSymbolName(SYMBOL_NAME_EDEFAULT);
				return;
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__NODE_CLASS:
				setNodeClass(NODE_CLASS_EDEFAULT);
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
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__SYMBOL_NAME:
				return SYMBOL_NAME_EDEFAULT == null ? symbolName != null : !SYMBOL_NAME_EDEFAULT.equals(symbolName);
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case NodeIdsCsvPackage.NODE_IDS_CSV_ROW__NODE_CLASS:
				return NODE_CLASS_EDEFAULT == null ? nodeClass != null : !NODE_CLASS_EDEFAULT.equals(nodeClass);
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
		result.append(" (SymbolName: ");
		result.append(symbolName);
		result.append(", Identifier: ");
		result.append(identifier);
		result.append(", NodeClass: ");
		result.append(nodeClass);
		result.append(')');
		return result.toString();
	}

} //NodeIdsCsvRowImpl
