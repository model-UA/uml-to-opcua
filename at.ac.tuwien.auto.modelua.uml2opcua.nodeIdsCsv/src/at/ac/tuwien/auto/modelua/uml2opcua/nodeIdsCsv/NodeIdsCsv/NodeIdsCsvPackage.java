/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv;

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
 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFactory
 * @model kind="package"
 * @generated
 */
public interface NodeIdsCsvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NodeIdsCsv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at.ac.tuwien.auto.modelua.uml2opcua.NodeIdsCsv.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "NodeIdsCsv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodeIdsCsvPackage eINSTANCE = at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvPackageImpl#getNodeIdsCsvRow()
	 * @generated
	 */
	int NODE_IDS_CSV_ROW = 0;

	/**
	 * The feature id for the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_ROW__SYMBOL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_ROW__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Node Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_ROW__NODE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_ROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvFileImpl
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvPackageImpl#getNodeIdsCsvFile()
	 * @generated
	 */
	int NODE_IDS_CSV_FILE = 1;

	/**
	 * The feature id for the '<em><b>Node Ids Csv Rows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_IDS_CSV_FILE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow
	 * @generated
	 */
	EClass getNodeIdsCsvRow();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getSymbolName <em>Symbol Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Name</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getSymbolName()
	 * @see #getNodeIdsCsvRow()
	 * @generated
	 */
	EAttribute getNodeIdsCsvRow_SymbolName();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getIdentifier()
	 * @see #getNodeIdsCsvRow()
	 * @generated
	 */
	EAttribute getNodeIdsCsvRow_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getNodeClass <em>Node Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Class</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvRow#getNodeClass()
	 * @see #getNodeIdsCsvRow()
	 * @generated
	 */
	EAttribute getNodeIdsCsvRow_NodeClass();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile
	 * @generated
	 */
	EClass getNodeIdsCsvFile();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile#getNodeIdsCsvRows <em>Node Ids Csv Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Ids Csv Rows</em>'.
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile#getNodeIdsCsvRows()
	 * @see #getNodeIdsCsvFile()
	 * @generated
	 */
	EReference getNodeIdsCsvFile_NodeIdsCsvRows();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodeIdsCsvFactory getNodeIdsCsvFactory();

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
		 * The meta object literal for the '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvRowImpl
		 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvPackageImpl#getNodeIdsCsvRow()
		 * @generated
		 */
		EClass NODE_IDS_CSV_ROW = eINSTANCE.getNodeIdsCsvRow();

		/**
		 * The meta object literal for the '<em><b>Symbol Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_IDS_CSV_ROW__SYMBOL_NAME = eINSTANCE.getNodeIdsCsvRow_SymbolName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_IDS_CSV_ROW__IDENTIFIER = eINSTANCE.getNodeIdsCsvRow_Identifier();

		/**
		 * The meta object literal for the '<em><b>Node Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_IDS_CSV_ROW__NODE_CLASS = eINSTANCE.getNodeIdsCsvRow_NodeClass();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvFileImpl
		 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.impl.NodeIdsCsvPackageImpl#getNodeIdsCsvFile()
		 * @generated
		 */
		EClass NODE_IDS_CSV_FILE = eINSTANCE.getNodeIdsCsvFile();

		/**
		 * The meta object literal for the '<em><b>Node Ids Csv Rows</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_IDS_CSV_FILE__NODE_IDS_CSV_ROWS = eINSTANCE.getNodeIdsCsvFile_NodeIdsCsvRows();

	}

} //NodeIdsCsvPackage
