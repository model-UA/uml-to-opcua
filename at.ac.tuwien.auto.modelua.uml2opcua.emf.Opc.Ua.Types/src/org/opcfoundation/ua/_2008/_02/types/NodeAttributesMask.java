/**
 */
package org.opcfoundation.ua._2008._02.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Attributes Mask</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.opcfoundation.ua._2008._02.types.TypesPackage#getNodeAttributesMask()
 * @model extendedMetaData="name='NodeAttributesMask'"
 * @generated
 */
public enum NodeAttributesMask implements Enumerator {
	/**
	 * The '<em><b>None0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0_VALUE
	 * @generated
	 * @ordered
	 */
	NONE0(0, "None0", "None_0"),

	/**
	 * The '<em><b>Access Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_LEVEL1(1, "AccessLevel1", "AccessLevel_1"),

	/**
	 * The '<em><b>Array Dimensions2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_DIMENSIONS2_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAY_DIMENSIONS2(2, "ArrayDimensions2", "ArrayDimensions_2"),

	/**
	 * The '<em><b>Browse Name4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROWSE_NAME4_VALUE
	 * @generated
	 * @ordered
	 */
	BROWSE_NAME4(3, "BrowseName4", "BrowseName_4"),

	/**
	 * The '<em><b>Contains No Loops8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_NO_LOOPS8_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS_NO_LOOPS8(4, "ContainsNoLoops8", "ContainsNoLoops_8"),

	/**
	 * The '<em><b>Data Type16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE16_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_TYPE16(5, "DataType16", "DataType_16"),

	/**
	 * The '<em><b>Description32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION32_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION32(6, "Description32", "Description_32"),

	/**
	 * The '<em><b>Display Name64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_NAME64_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY_NAME64(7, "DisplayName64", "DisplayName_64"),

	/**
	 * The '<em><b>Event Notifier128</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_NOTIFIER128_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_NOTIFIER128(8, "EventNotifier128", "EventNotifier_128"),

	/**
	 * The '<em><b>Executable256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE256_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTABLE256(9, "Executable256", "Executable_256"),

	/**
	 * The '<em><b>Historizing512</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIZING512_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORIZING512(10, "Historizing512", "Historizing_512"),

	/**
	 * The '<em><b>Inverse Name1024</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_NAME1024_VALUE
	 * @generated
	 * @ordered
	 */
	INVERSE_NAME1024(11, "InverseName1024", "InverseName_1024"),

	/**
	 * The '<em><b>Is Abstract2048</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT2048_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ABSTRACT2048(12, "IsAbstract2048", "IsAbstract_2048"),

	/**
	 * The '<em><b>Minimum Sampling Interval4096</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_SAMPLING_INTERVAL4096_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM_SAMPLING_INTERVAL4096(13, "MinimumSamplingInterval4096", "MinimumSamplingInterval_4096"),

	/**
	 * The '<em><b>Node Class8192</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_CLASS8192_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_CLASS8192(14, "NodeClass8192", "NodeClass_8192"),

	/**
	 * The '<em><b>Node Id16384</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_ID16384_VALUE
	 * @generated
	 * @ordered
	 */
	NODE_ID16384(15, "NodeId16384", "NodeId_16384"),

	/**
	 * The '<em><b>Symmetric32768</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC32768_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC32768(16, "Symmetric32768", "Symmetric_32768"),

	/**
	 * The '<em><b>User Access Level65536</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ACCESS_LEVEL65536_VALUE
	 * @generated
	 * @ordered
	 */
	USER_ACCESS_LEVEL65536(17, "UserAccessLevel65536", "UserAccessLevel_65536"),

	/**
	 * The '<em><b>User Executable131072</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_EXECUTABLE131072_VALUE
	 * @generated
	 * @ordered
	 */
	USER_EXECUTABLE131072(18, "UserExecutable131072", "UserExecutable_131072"),

	/**
	 * The '<em><b>User Write Mask262144</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_WRITE_MASK262144_VALUE
	 * @generated
	 * @ordered
	 */
	USER_WRITE_MASK262144(19, "UserWriteMask262144", "UserWriteMask_262144"),

	/**
	 * The '<em><b>Value Rank524288</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_RANK524288_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_RANK524288(20, "ValueRank524288", "ValueRank_524288"),

	/**
	 * The '<em><b>Write Mask1048576</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_MASK1048576_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_MASK1048576(21, "WriteMask1048576", "WriteMask_1048576"),

	/**
	 * The '<em><b>Value2097152</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE2097152_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE2097152(22, "Value2097152", "Value_2097152"),

	/**
	 * The '<em><b>Data Type Definition4194304</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE_DEFINITION4194304_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_TYPE_DEFINITION4194304(23, "DataTypeDefinition4194304", "DataTypeDefinition_4194304"),

	/**
	 * The '<em><b>Role Permissions8388608</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_PERMISSIONS8388608_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_PERMISSIONS8388608(24, "RolePermissions8388608", "RolePermissions_8388608"),

	/**
	 * The '<em><b>Access Restrictions16777216</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_RESTRICTIONS16777216_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS_RESTRICTIONS16777216(25, "AccessRestrictions16777216", "AccessRestrictions_16777216"),

	/**
	 * The '<em><b>All33554431</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL33554431_VALUE
	 * @generated
	 * @ordered
	 */
	ALL33554431(26, "All33554431", "All_33554431"),

	/**
	 * The '<em><b>Base Node26501220</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_NODE26501220_VALUE
	 * @generated
	 * @ordered
	 */
	BASE_NODE26501220(27, "BaseNode26501220", "BaseNode_26501220"),

	/**
	 * The '<em><b>Object26501348</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT26501348_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT26501348(28, "Object26501348", "Object_26501348"),

	/**
	 * The '<em><b>Object Type26503268</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_TYPE26503268_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT_TYPE26503268(29, "ObjectType26503268", "ObjectType_26503268"),

	/**
	 * The '<em><b>Variable26571383</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE26571383_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE26571383(30, "Variable26571383", "Variable_26571383"),

	/**
	 * The '<em><b>Variable Type28600438</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_TYPE28600438_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE_TYPE28600438(31, "VariableType28600438", "VariableType_28600438"),

	/**
	 * The '<em><b>Method26632548</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD26632548_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD26632548(32, "Method26632548", "Method_26632548"),

	/**
	 * The '<em><b>Reference Type26537060</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TYPE26537060_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_TYPE26537060(33, "ReferenceType26537060", "ReferenceType_26537060"),

	/**
	 * The '<em><b>View26501356</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW26501356_VALUE
	 * @generated
	 * @ordered
	 */
	VIEW26501356(34, "View26501356", "View_26501356");

	/**
	 * The '<em><b>None0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE0
	 * @model name="None0" literal="None_0"
	 * @generated
	 * @ordered
	 */
	public static final int NONE0_VALUE = 0;

	/**
	 * The '<em><b>Access Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_LEVEL1
	 * @model name="AccessLevel1" literal="AccessLevel_1"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LEVEL1_VALUE = 1;

	/**
	 * The '<em><b>Array Dimensions2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAY_DIMENSIONS2
	 * @model name="ArrayDimensions2" literal="ArrayDimensions_2"
	 * @generated
	 * @ordered
	 */
	public static final int ARRAY_DIMENSIONS2_VALUE = 2;

	/**
	 * The '<em><b>Browse Name4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BROWSE_NAME4
	 * @model name="BrowseName4" literal="BrowseName_4"
	 * @generated
	 * @ordered
	 */
	public static final int BROWSE_NAME4_VALUE = 3;

	/**
	 * The '<em><b>Contains No Loops8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_NO_LOOPS8
	 * @model name="ContainsNoLoops8" literal="ContainsNoLoops_8"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_NO_LOOPS8_VALUE = 4;

	/**
	 * The '<em><b>Data Type16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE16
	 * @model name="DataType16" literal="DataType_16"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE16_VALUE = 5;

	/**
	 * The '<em><b>Description32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION32
	 * @model name="Description32" literal="Description_32"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION32_VALUE = 6;

	/**
	 * The '<em><b>Display Name64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_NAME64
	 * @model name="DisplayName64" literal="DisplayName_64"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_NAME64_VALUE = 7;

	/**
	 * The '<em><b>Event Notifier128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_NOTIFIER128
	 * @model name="EventNotifier128" literal="EventNotifier_128"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_NOTIFIER128_VALUE = 8;

	/**
	 * The '<em><b>Executable256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXECUTABLE256
	 * @model name="Executable256" literal="Executable_256"
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTABLE256_VALUE = 9;

	/**
	 * The '<em><b>Historizing512</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIZING512
	 * @model name="Historizing512" literal="Historizing_512"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORIZING512_VALUE = 10;

	/**
	 * The '<em><b>Inverse Name1024</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERSE_NAME1024
	 * @model name="InverseName1024" literal="InverseName_1024"
	 * @generated
	 * @ordered
	 */
	public static final int INVERSE_NAME1024_VALUE = 11;

	/**
	 * The '<em><b>Is Abstract2048</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ABSTRACT2048
	 * @model name="IsAbstract2048" literal="IsAbstract_2048"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ABSTRACT2048_VALUE = 12;

	/**
	 * The '<em><b>Minimum Sampling Interval4096</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMUM_SAMPLING_INTERVAL4096
	 * @model name="MinimumSamplingInterval4096" literal="MinimumSamplingInterval_4096"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_SAMPLING_INTERVAL4096_VALUE = 13;

	/**
	 * The '<em><b>Node Class8192</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_CLASS8192
	 * @model name="NodeClass8192" literal="NodeClass_8192"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_CLASS8192_VALUE = 14;

	/**
	 * The '<em><b>Node Id16384</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_ID16384
	 * @model name="NodeId16384" literal="NodeId_16384"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_ID16384_VALUE = 15;

	/**
	 * The '<em><b>Symmetric32768</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMMETRIC32768
	 * @model name="Symmetric32768" literal="Symmetric_32768"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC32768_VALUE = 16;

	/**
	 * The '<em><b>User Access Level65536</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_ACCESS_LEVEL65536
	 * @model name="UserAccessLevel65536" literal="UserAccessLevel_65536"
	 * @generated
	 * @ordered
	 */
	public static final int USER_ACCESS_LEVEL65536_VALUE = 17;

	/**
	 * The '<em><b>User Executable131072</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_EXECUTABLE131072
	 * @model name="UserExecutable131072" literal="UserExecutable_131072"
	 * @generated
	 * @ordered
	 */
	public static final int USER_EXECUTABLE131072_VALUE = 18;

	/**
	 * The '<em><b>User Write Mask262144</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_WRITE_MASK262144
	 * @model name="UserWriteMask262144" literal="UserWriteMask_262144"
	 * @generated
	 * @ordered
	 */
	public static final int USER_WRITE_MASK262144_VALUE = 19;

	/**
	 * The '<em><b>Value Rank524288</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_RANK524288
	 * @model name="ValueRank524288" literal="ValueRank_524288"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_RANK524288_VALUE = 20;

	/**
	 * The '<em><b>Write Mask1048576</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_MASK1048576
	 * @model name="WriteMask1048576" literal="WriteMask_1048576"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_MASK1048576_VALUE = 21;

	/**
	 * The '<em><b>Value2097152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE2097152
	 * @model name="Value2097152" literal="Value_2097152"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE2097152_VALUE = 22;

	/**
	 * The '<em><b>Data Type Definition4194304</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_TYPE_DEFINITION4194304
	 * @model name="DataTypeDefinition4194304" literal="DataTypeDefinition_4194304"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE_DEFINITION4194304_VALUE = 23;

	/**
	 * The '<em><b>Role Permissions8388608</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_PERMISSIONS8388608
	 * @model name="RolePermissions8388608" literal="RolePermissions_8388608"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_PERMISSIONS8388608_VALUE = 24;

	/**
	 * The '<em><b>Access Restrictions16777216</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_RESTRICTIONS16777216
	 * @model name="AccessRestrictions16777216" literal="AccessRestrictions_16777216"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_RESTRICTIONS16777216_VALUE = 25;

	/**
	 * The '<em><b>All33554431</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL33554431
	 * @model name="All33554431" literal="All_33554431"
	 * @generated
	 * @ordered
	 */
	public static final int ALL33554431_VALUE = 26;

	/**
	 * The '<em><b>Base Node26501220</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE_NODE26501220
	 * @model name="BaseNode26501220" literal="BaseNode_26501220"
	 * @generated
	 * @ordered
	 */
	public static final int BASE_NODE26501220_VALUE = 27;

	/**
	 * The '<em><b>Object26501348</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT26501348
	 * @model name="Object26501348" literal="Object_26501348"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT26501348_VALUE = 28;

	/**
	 * The '<em><b>Object Type26503268</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_TYPE26503268
	 * @model name="ObjectType26503268" literal="ObjectType_26503268"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_TYPE26503268_VALUE = 29;

	/**
	 * The '<em><b>Variable26571383</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE26571383
	 * @model name="Variable26571383" literal="Variable_26571383"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE26571383_VALUE = 30;

	/**
	 * The '<em><b>Variable Type28600438</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_TYPE28600438
	 * @model name="VariableType28600438" literal="VariableType_28600438"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_TYPE28600438_VALUE = 31;

	/**
	 * The '<em><b>Method26632548</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD26632548
	 * @model name="Method26632548" literal="Method_26632548"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD26632548_VALUE = 32;

	/**
	 * The '<em><b>Reference Type26537060</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TYPE26537060
	 * @model name="ReferenceType26537060" literal="ReferenceType_26537060"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_TYPE26537060_VALUE = 33;

	/**
	 * The '<em><b>View26501356</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW26501356
	 * @model name="View26501356" literal="View_26501356"
	 * @generated
	 * @ordered
	 */
	public static final int VIEW26501356_VALUE = 34;

	/**
	 * An array of all the '<em><b>Node Attributes Mask</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeAttributesMask[] VALUES_ARRAY =
		new NodeAttributesMask[] {
			NONE0,
			ACCESS_LEVEL1,
			ARRAY_DIMENSIONS2,
			BROWSE_NAME4,
			CONTAINS_NO_LOOPS8,
			DATA_TYPE16,
			DESCRIPTION32,
			DISPLAY_NAME64,
			EVENT_NOTIFIER128,
			EXECUTABLE256,
			HISTORIZING512,
			INVERSE_NAME1024,
			IS_ABSTRACT2048,
			MINIMUM_SAMPLING_INTERVAL4096,
			NODE_CLASS8192,
			NODE_ID16384,
			SYMMETRIC32768,
			USER_ACCESS_LEVEL65536,
			USER_EXECUTABLE131072,
			USER_WRITE_MASK262144,
			VALUE_RANK524288,
			WRITE_MASK1048576,
			VALUE2097152,
			DATA_TYPE_DEFINITION4194304,
			ROLE_PERMISSIONS8388608,
			ACCESS_RESTRICTIONS16777216,
			ALL33554431,
			BASE_NODE26501220,
			OBJECT26501348,
			OBJECT_TYPE26503268,
			VARIABLE26571383,
			VARIABLE_TYPE28600438,
			METHOD26632548,
			REFERENCE_TYPE26537060,
			VIEW26501356,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Attributes Mask</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeAttributesMask> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Attributes Mask</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeAttributesMask get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeAttributesMask result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Attributes Mask</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeAttributesMask getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeAttributesMask result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Attributes Mask</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeAttributesMask get(int value) {
		switch (value) {
			case NONE0_VALUE: return NONE0;
			case ACCESS_LEVEL1_VALUE: return ACCESS_LEVEL1;
			case ARRAY_DIMENSIONS2_VALUE: return ARRAY_DIMENSIONS2;
			case BROWSE_NAME4_VALUE: return BROWSE_NAME4;
			case CONTAINS_NO_LOOPS8_VALUE: return CONTAINS_NO_LOOPS8;
			case DATA_TYPE16_VALUE: return DATA_TYPE16;
			case DESCRIPTION32_VALUE: return DESCRIPTION32;
			case DISPLAY_NAME64_VALUE: return DISPLAY_NAME64;
			case EVENT_NOTIFIER128_VALUE: return EVENT_NOTIFIER128;
			case EXECUTABLE256_VALUE: return EXECUTABLE256;
			case HISTORIZING512_VALUE: return HISTORIZING512;
			case INVERSE_NAME1024_VALUE: return INVERSE_NAME1024;
			case IS_ABSTRACT2048_VALUE: return IS_ABSTRACT2048;
			case MINIMUM_SAMPLING_INTERVAL4096_VALUE: return MINIMUM_SAMPLING_INTERVAL4096;
			case NODE_CLASS8192_VALUE: return NODE_CLASS8192;
			case NODE_ID16384_VALUE: return NODE_ID16384;
			case SYMMETRIC32768_VALUE: return SYMMETRIC32768;
			case USER_ACCESS_LEVEL65536_VALUE: return USER_ACCESS_LEVEL65536;
			case USER_EXECUTABLE131072_VALUE: return USER_EXECUTABLE131072;
			case USER_WRITE_MASK262144_VALUE: return USER_WRITE_MASK262144;
			case VALUE_RANK524288_VALUE: return VALUE_RANK524288;
			case WRITE_MASK1048576_VALUE: return WRITE_MASK1048576;
			case VALUE2097152_VALUE: return VALUE2097152;
			case DATA_TYPE_DEFINITION4194304_VALUE: return DATA_TYPE_DEFINITION4194304;
			case ROLE_PERMISSIONS8388608_VALUE: return ROLE_PERMISSIONS8388608;
			case ACCESS_RESTRICTIONS16777216_VALUE: return ACCESS_RESTRICTIONS16777216;
			case ALL33554431_VALUE: return ALL33554431;
			case BASE_NODE26501220_VALUE: return BASE_NODE26501220;
			case OBJECT26501348_VALUE: return OBJECT26501348;
			case OBJECT_TYPE26503268_VALUE: return OBJECT_TYPE26503268;
			case VARIABLE26571383_VALUE: return VARIABLE26571383;
			case VARIABLE_TYPE28600438_VALUE: return VARIABLE_TYPE28600438;
			case METHOD26632548_VALUE: return METHOD26632548;
			case REFERENCE_TYPE26537060_VALUE: return REFERENCE_TYPE26537060;
			case VIEW26501356_VALUE: return VIEW26501356;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NodeAttributesMask(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NodeAttributesMask
