package opcuaserializer;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class OpcuaSerializer {
	public void writeNodeset(Resource resource, File outputFile) throws IOException {
		// set metadata options, in particular utf-8 encoding attribute
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resource.getResourceSet().getPackageRegistry());
		Map<Object,Object> options = new HashMap<Object,Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
		options.put(XMLResource.OPTION_ENCODING, "utf-8");
		options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE); // omit xsi:schemaLocation in the output file
		// Try to set the xmlns to the OPC UA Namespace Uri
		if(extendedMetaData.demandPackage("http://opcfoundation.org/UA/2011/03/UANodeSet.xsd") != null)
			extendedMetaData.demandPackage("http://opcfoundation.org/UA/2011/03/UANodeSet.xsd").setNsPrefix("");
		
		
		// serialize/persist the model to a nodeset XML file
		URI nodesetURI = URI.createFileURI(outputFile.getAbsolutePath());
		resource.setURI(nodesetURI);
		resource.save(options);

		System.out.println("Nodeset written to " + outputFile.getAbsolutePath());
	}
}
