# UML to OPC UA Model Transformation

Modeling tools for OPC UA (model-UA) is an open source project supporting developers in creating OPC UA information models. OPC UA – the successor of the well-known OPC standard – allows to access information and functions based on virtual representations of physical objects, ranging from simple temperature sensors to complex manufacturing machines. Generating OPC UA information models is a highly complex task. Therefore, model-UA provides a collection of Eclipse Plugins to generate OPC UA information models from UML diagrams by means of model transformation.

## Related work

The overall workflow is defined in 

F. Pauker, T. Fruhwirth, B. Kittl, and W. Kastner, “A systematic approach
to OPC UA information model design,” in Proceedings of the 49th CIRP
Conference on Manufacturing Systems, Stuttgart, Germany, May 2016,
pp. 321–326.

A proof of concept implementation for UML to OPC UA transformation (cf. Section [uml-to-opcua-standalone](#uml-to-opcua-standalone)) is described in

S. Wiedemann, “model-UA: Ein Open Source Tool zur Transformation
von UML zu OPC UA Modellen,” November 2018, Bachelor’s Thesis

## Prerequisites

### Install Papyrus Modeling Environment

It is suggested to use Papyrus (cf. https://www.eclipse.org/papyrus/) to design UML models, which are then transformed to OPC UA Nodesets using the Plugins provided by the model-UA project.

## Contents of this Repository

### UML to OPC UA Model Transformation Plugin

The main content of this repository is an Eclipse Plugin that contributes to the Eclipse UI. It provides menu contributions, but no actual model transformation functionality. E.g., the Plugin provides the "Transform to OPC UA" menu entry when right-clicking on a file in the Eclipse Project Explorer, but the user cannot execute this command. Instead, it is only a hook for other Plugins to add their functionality via sub-entries to the "Transform to OPC UA" menu entry. An example for such a Plugin is the model-UA/uml-to-opcua-qvto Plugin. Note that the "Transform to OPC UA" menu contribution is only visible if it contains at least one sub-entry.

### uml-to-opcua-standalone

Furthermore, this repository contains a standalone UML to OPC UA model transformation approach. Standalone, in this context, means that it is currently not implemented as Eclipse Plugin but can only be executed via command line. The software uses a programmatic approach to read a UML Model and generate an OPC UA Nodeset. Additional information is provided in ./uml-to-opcua-standalone.

## Using the Plugin

### Adding the Plugin to your Workspace

The Plugin is implemented as an Eclipse Plugin Project. To execute the Plugin you have to

1. Install and start Eclipse (or an Eclipse-based application such as Papyrus)
2. Create a new Eclipse Workspace
3. Clone this repository to your computer
4. Add the Eclipse Projects contained in this repository to your Eclipse Workspace via the "File" --> "Import..." --> "Existing Projects into Workspace" dialog
5. Clone another repository that actually adds the model transformation functionality, such as model-UA/uml-to-opcua-qvto to your computer
6. Add the Eclipse Projects contained in the newly cloned repository to your Eclipse Workspace as described in Step 4.
7. Start the Plugin by right-clicking on the "at.ac.tuwien.auto.modelua.uml2opcua.ui" Project and selecting "Run As" --> "Eclipse Application"
8. Check the result by right-clicking in the Project Explorer of the newly started Eclipse instance. It should now contain the "Transform to OPC UA" menu entry.

To gain knowledge about Eclipse Plugins in general you may want to visit https://www.vogella.com/tutorials/EclipsePlugin/article.html .

### Installing via Update Site

Coming soon.

# UML to OPC UA Model Transformation using QVTo

This repository contains an Eclipse Plugin that allows to trigger UML to OPC UA model transformations. Transformation rules are specified in QVTo.

## Prerequisites

### Install QVTo Eclipse Plugins

This Plugin uses QVTo for UML to OPC UA transformations (cf. https://wiki.eclipse.org/QVTo). Therefore, the QVTo Eclipse Plugins are required and can be installed via the Eclipse Update Site https://download.eclipse.org/mmt/qvto/updates/releases/ via "Help" --> "Install New Software...".

### Install UML to OPC UA Transformation Feature

This Plugin extends the "UML to OPC UA Transformation" Feature, which is provided via the model-UA/uml-to-opcua repository. Follow the instructions in model-UA/uml-to-opcua/README.md to install the "UML to OPC UA Transformation" Feature.

## Using the Plugin 

Have a look at "Adding the Plugin to your Workspace" in model-UA/uml-to-opcua/README.md for information about how to install this Plugin.

### Using the Plugin with pre-defined QVTo transformation rules

This Plugin adds the "Transform with QVTo" menu entry under "Transform to OPC UA" (cf. model-UA/uml-to-opcua). The model transformation can be triggered by right-clicking on a UML file and selecting "Transform to OPC UA" --> "Transform with QVTo". The QVTo files that specify the transformation rules are embedded in the Plugin and should not be changed by the user.

### Using the Plugin to define custom QVTo transformation rules

To enable users to adapt the QVTo transformation rules to their needs, the repository also provides a developer version of the QVTo transformation plugin. When installed, it adds the menu entry "Transform to OPC UA" --> "Transform with custom QVTo". This command will search the user's workspace for a QVTo Project (cf. https://wiki.eclipse.org/QVTo), which has to contain a subfolder "transformations" and a file named "Uml2Opcua.qvto". The transformation available at "model-UA/uml-to-opcua-qvto/at.ac.tuwien.auto.modelua.uml2opcua.qvto/transformations" may serve as a starting point for your customized transformation rules.

### Installing via Update Site

Coming soon.

