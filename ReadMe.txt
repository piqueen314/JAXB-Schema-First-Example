This is a small project to demonstrate JAXB schema first code generation via xjc.
The classes in the generated directory were created by running xjc zoo.xsd.
The TestHarness class loads data into the schema generated classes and then marshals them to XML.
The XML is than printed to standard out (the screen).
The JAXB generated classes have been slightly altered, all projected variable were changed to public.
The builder.sh file complies all the java classes in the correct order and than runs TestHarness.java.



 
