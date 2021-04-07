/**
 */
package at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile#getNodeIdsCsvRows <em>Node Ids Csv Rows</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage#getNodeIdsCsvFile()
 * @model
 * @generated
 */
public interface NodeIdsCsvFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Ids Csv Rows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Ids Csv Rows</em>' reference.
	 * @see #setNodeIdsCsvRows(NodeIdsCsvRow)
	 * @see at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvPackage#getNodeIdsCsvFile_NodeIdsCsvRows()
	 * @model upper="-2"
	 * @generated
	 */
	NodeIdsCsvRow getNodeIdsCsvRows();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.auto.modelua.uml2opcua.nodeIdsCsv.NodeIdsCsv.NodeIdsCsvFile#getNodeIdsCsvRows <em>Node Ids Csv Rows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Ids Csv Rows</em>' reference.
	 * @see #getNodeIdsCsvRows()
	 * @generated
	 */
	void setNodeIdsCsvRows(NodeIdsCsvRow value);

} // NodeIdsCsvFile
