package at.ac.tuwien.auto.modelua.uml2opcua.qvto;

import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.m2m.qvt.oml.util.Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

// import org.eclipse.m2m.qvt.oml.blackbox.java.Module;

// @Module(packageURIs={"http://www.eclipse.org/emf/2002/Ecore"})
public class Uml2OpcuaBlackbox {
	public String saySomething() {
		System.out.println("Blackbox function saySomething returns something");
		return "Something";
	}
	
	public Dictionary<String, String> readNodeIdsCsv(String filename) throws Exception {
		System.out.println("Blackbox function for reading OPC UA NodeId file");
		Dictionary<String, String> d = Utils.createDictionary();

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(filename);
		
		if(inputStream == null)
			throw new FileNotFoundException("Could not load NodeId file " + filename + ". File not found!");

		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		line = reader.readLine();
		while(line != null) {
			String[] lineSplitted = line.split(",");
			if(lineSplitted.length != 3)
				continue;
			if(lineSplitted[1].matches("-?\\d+")) // check if the node id is an integer number
				d.put(lineSplitted[0], "i=" + lineSplitted[1]);
			else
				d.put(lineSplitted[0], "s=" + lineSplitted[1]);
			line = reader.readLine();
		}
		reader.close();

		return d;
	}
}
