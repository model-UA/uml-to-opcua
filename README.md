# uml-to-opcua: UML to OPC UA Model Transformation

Modeling tools for OPC UA (model-UA) is an open source project supporting developers in creating OPC UA Information Models. OPC UA – the successor of the well-known OPC standard – allows to access information and functions based on virtual representations of physical objects, ranging from simple temperature sensors to complex manufacturing machines. Generating OPC UA information models is a highly complex task. model-UA tries to simplify OPC UA information modeling by providing a collection of Eclipse Plugins: 

* papyrus-opcua-plugin: An extension to the Papyrus Modeling Environment enabling the creation of OPC UA Information Models available at https://github.com/model-UA/papyrus-opcua-plugin .
* uml-to-opcua: A set of Eclipse plugins that allow to generate OPC UA Information Models from UML diagrams by means of model transformation available at https://github.com/model-UA/uml-to-opcua . uml-to-opcua can also be used as a plugin in the Papyrus Modeling Environment.



## Related work

The overall workflow is defined in 

F. Pauker, T. Fruhwirth, B. Kittl, and W. Kastner, “A systematic approach to OPC UA information model design,” in Proceedings of the 49th CIRP Conference on Manufacturing Systems, Stuttgart, Germany, May 2016, pp. 321–326.

A proof of concept implementation for UML to OPC UA transformation (cf. Section [uml-to-opcua-standalone](#uml-to-opcua-standalone)) is described in S. Wiedemann, “model-UA: Ein Open Source Tool zur Transformation von UML zu OPC UA Modellen,” November 2018, Bachelor’s Thesis



## Prerequisites

### Java Version

The Plugin requires at least Java version 11.

### Install Papyrus Modeling Environment

It is suggested to use Papyrus (cf. https://www.eclipse.org/papyrus/) to design UML models, which are then transformed to OPC UA Nodesets using the Plugins provided by the model-UA project.



## Installation

### Adding Update-Site

The Plugin is provided via the model-ua update site :  https://model-ua.auto.tuwien.ac.at/updates/releases/ 

Open Papyrus and go to Help-->Install New Software, click on Add and enter the link. Check the "UML to OPC UA Model Transformation" category, click "Next" and follow the instructions to install the uml-to-opcua plugins. You might also want to install the "OPC UA Modeling Tools" (cf. https://github.com/model-UA/papyrus-opcua-plugin). When the installation is done restart Papyrus.

![](/doc/img/add_update_site.png)


### Adding Archive as Update-Site

Alternatively the releases can be downloaded here as archives : https://github.com/model-UA/papyrus-opcua-plugin/releases/ 

Open Papyrus and go to Help-->Install New Software, click on Add and then on Local or Archive depending if you extracted the archive or not.



## Usage

### Transforming a Class Diagram or State Machine Diagram to OPC UA

The uml-to-opcua plugin supports transformation of UML Class Diagrams or UML State Machine Diagrams (or a combination thereof) to OPC UA information models. You may want to start with a simple UML Class Diagram. Open Papyrus and got to "File" --> "New" --> "Papyrus Project". In the dialog shown below, select the "UML" Model and click "Next". 

![](/doc/img/create_new_project_1.png)



Enter a Project name, e.g. MyFirstProject" as shown below and click "Next".

![](/doc/img/create_new_project_2.png)



Select the diagram types you need. At the moment, the UML Class Diagram and the UML State Machine Diagram can be transformed to OPC UA. As a first starting point, you may want to select the "Class Diagram" and click "Finish".

![](/doc/img/create_new_project_3.png)



The UML model editor opens and you can start modeling by dragging and dropping Nodes and Edges from the Palette. Create a simple UML Class Diagram like the one shown below. The little asterisk on the top left indicates that you should save your diagram before continuing.

![](/doc/img/simple_class_diagram.png)



The next step is to initiate the UML to OPC UA model transformation for this simple UML Class Diagram. Expand your project in the Project Explorer until you see the a file called "uml". Right-click on this file and click on "Transform to OPC UA" --> "Transform with QVTo".

![](/doc/img/transform_class_diagram_1.png)



Depending on the size of your diagram, the transformation may take a while. After is has been completed, a new file called "xml" will appear in the Project Explorer. This is the OPC UA Information Model stored as Nodeset XML file. You can take this file and do some useful things like

* Check its contents by right-clicking on the file --> "Show In" --> "Text Editor"
* Load it into the papyrus-opcua-plugin https://github.com/model-UA/papyrus-opcua-plugin to visualize the Information Model and possibly add changes
* Use the OPC UA stack of your choice to load the Nodeset XML file and create your custom OPC UA server

![](/doc/img/transform_class_diagram_2.png)



Information about the transformation is provided via the "Console". This may be useful, in particular, if the transformation produces a result different from what you expect. To open the "Console", select "Window" --> "Show View" --> "Other..." --> search for "Console" and click "Open". The "Console" view will now be available at the bottom of Papyrus. If no output is shown in the "Console", you may have to start the transformation again or select a different console via the GUI element highlighted by the red arrow in the figure below.

![](/doc/img/transform_class_diagram_3.png)



## Create your own transformation rules

You may have noticed the "Transform with custom QVTo" option above. The uml-to-opcua plugin comes with predefined transformation rules that cannot be changed by the user. "Transform with QVTo" always uses these internal transformation rules. More experienced users may, however, want to change the outcome of the transformation, e.g., because they do not want the "Vehicle" of the above diagram get the "Type" suffix. For this purpose, you can install QVTo via the QVTo update site https://download.eclipse.org/mmt/qvto/updates/releases/latest/ .

Next, you need to create a new QVTo project named "QvtoTransformationRules" with a subfolder "transforms" and the file "Uml2Opcua.qvto" containing your transformation. Note that you have use exactly this naming scheme. You can use the QVTo project provided at https://github.com/model-UA/uml-to-opcua/tree/master/QvtoTransformationRules as a starting point to create your own transformation rules.

![](/doc/img/transform_with_custom_qvto_1.png)

## Additional contents of this Repository

### QVToTransformationRules

The QVTo project specifying the transformation rules is available under "QvtoTransformationRules".

### Transformation rules documentation

Documentation of the transformation rules is provided under "Documentation/UML to OPC UA transformation rules". You may want to have a look there to get some indication which UML modeling concepts are supported by the transformation.

### Transformation examples

The transformation has been tested and documented using the examples provided under "Uml2OpcuaTransformationTests". It contains a Papyrus project with many different models, each corresponding to a very specific UML modeling concept.

### uml-to-opcua-standalone

Furthermore, this repository contains a standalone UML to OPC UA model transformation approach. Standalone, in this context, means that it is currently not implemented as Eclipse Plugin but can only be executed via command line. The software uses a programmatic approach to read a UML Model and generate an OPC UA Nodeset. Additional information is provided in ./uml-to-opcua-standalone/.

## Contributing

A way to contribute to this project is by testing the transformation and submitting an issue if you encounter some unexpected behavior or error in the UML to OPC UA transformation.

Instructions on how to clone this repository and contribute to underlying software (Eclipse plugins, etc.) the will be added some time in the future. The instructions below are not up-to-date but may serve as a starting point for the time being.

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



