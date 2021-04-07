/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl;

import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFactory;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage;
import at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeIdsCsvPackageImpl extends EPackageImpl implements NodeIdsCsvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdsCsvRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdsCsvFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodeIdsCsvPackageImpl() {
		super(eNS_URI, NodeIdsCsvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NodeIdsCsvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NodeIdsCsvPackage init() {
		if (isInited) return (NodeIdsCsvPackage)EPackage.Registry.INSTANCE.getEPackage(NodeIdsCsvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNodeIdsCsvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NodeIdsCsvPackageImpl theNodeIdsCsvPackage = registeredNodeIdsCsvPackage instanceof NodeIdsCsvPackageImpl ? (NodeIdsCsvPackageImpl)registeredNodeIdsCsvPackage : new NodeIdsCsvPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNodeIdsCsvPackage.createPackageContents();

		// Initialize created meta-data
		theNodeIdsCsvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodeIdsCsvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NodeIdsCsvPackage.eNS_URI, theNodeIdsCsvPackage);
		return theNodeIdsCsvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeIdsCsvRow() {
		return nodeIdsCsvRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIdsCsvRow_SymbolName() {
		return (EAttribute)nodeIdsCsvRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIdsCsvRow_Identifier() {
		return (EAttribute)nodeIdsCsvRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIdsCsvRow_NodeClass() {
		return (EAttribute)nodeIdsCsvRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeIdsCsvFile() {
		return nodeIdsCsvFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeIdsCsvFile_NodeIdsCsvRows() {
		return (EReference)nodeIdsCsvFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIdsCsvFactory getNodeIdsCsvFactory() {
		return (NodeIdsCsvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nodeIdsCsvRowEClass = createEClass(NODE_IDS_CSV_ROW);
		createEAttribute(nodeIdsCsvRowEClass, NODE_IDS_CSV_ROW__SYMBOL_NAME);
		createEAttribute(nodeIdsCsvRowEClass, NODE_IDS_CSV_ROW__IDENTIFIER);
		createEAttribute(nodeIdsCsvRowEClass, NODE_IDS_CSV_ROW__NODE_CLASS);

		nodeIdsCsvFileEClass = createEClass(NODE_IDS_CSV_FILE);
		createEReference(nodeIdsCsvFileEClass, NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeIdsCsvRowEClass, NodeIdsCsvRow.class, "NodeIdsCsvRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeIdsCsvRow_SymbolName(), ecorePackage.getEString(), "SymbolName", null, 0, 1, NodeIdsCsvRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeIdsCsvRow_Identifier(), ecorePackage.getEString(), "Identifier", null, 0, 1, NodeIdsCsvRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeIdsCsvRow_NodeClass(), ecorePackage.getEString(), "NodeClass", null, 0, 1, NodeIdsCsvRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIdsCsvFileEClass, NodeIdsCsvFile.class, "NodeIdsCsvFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeIdsCsvFile_NodeIdsCsvRows(), this.getNodeIdsCsvRow(), null, "nodeIdsCsvRows", null, 0, -2, NodeIdsCsvFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NodeIdsCsvPackageImpl
