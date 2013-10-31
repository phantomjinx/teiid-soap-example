This example demonstrates accessing a SOAP service as a source of data for 
a Teiid VDB.

It consists of the following projects:
	StateService - The StateService SOAP implementation
	StateServiceEAR - The StateService SOAP Service EAR
	US_States- A Teiid Project that invokes the StateService SOAP Service

Follow these steps to explore the example.
1.  Deploy the StateServiceEAR to your JBoss Enterprise Data Services server.
2.  Validate the deployment by browsing to 
      http://localhost:8080/StateService/StateService?wsdl and confirming 
      that the WSDL is returned.
3.  Deploy the stateService-ds.xml to the same server.
4.  Create a Teiid Admin connection in the Teiid Designer perspective to the
      server.
5.  In the Model Explorer view right click on the USStates.vdb and select 
      Modeling->Execute VDB to deploy the VDB to the server and bring up the
      Database Development perspective.
6.  Execute the SQL in the test.sql file to query the VDB. 
	
Details of the US_States VDB

The US_States VDB contains the following models.

stateService.xmi - This physical model provides the invoke procedure exposed 
  by the ws translator.

stateServiceXML.xmi - This virtual model provides procedures to create the 
  XML required by the StateService as parameters, and procedures to extract the
  values from the XML returned by the StateService.  There is a catalog for each
  operation exposed by the service, and the procedures are contained within their
  respective catalog.
  
StatesView.xmi - This virtual model provides procedures that combine the creation of
  the requests to the service, the execution of the request, and the extraction of
  the values from the result.  This is the only model exposed to the user in the 
  USStates VDB.  The getState and getAllStates procedures provide an abstraction 
  that conceals the web service implementation behind relational semantics.  
  The getAllStatesXML procedure exposes the raw XML of the response body content to
  the user.

