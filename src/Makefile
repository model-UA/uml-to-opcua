##@author Sebastian WIEDEMANN 1425647
CC = javac
DEFS = 
CFLAGS = 
LDFLAGS =
JAVACLASSES = UMLXMIanalyzer.class OPCUADocument.class uml2opcua.class
EXECS = 
.PHONY: all clean

all: $(JAVACLASSES)

%.class: %.java
	$(CC) $<

clean:
	rm -f *.class
