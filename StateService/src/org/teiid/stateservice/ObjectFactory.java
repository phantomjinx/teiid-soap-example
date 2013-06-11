
package org.teiid.stateservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.teiid.stateservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.teiid.stateservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllStateInfo }
     * 
     */
    public GetAllStateInfo createGetAllStateInfo() {
        return new GetAllStateInfo();
    }

    /**
     * Create an instance of {@link StateInfo }
     * 
     */
    public StateInfo createStateInfo() {
        return new StateInfo();
    }

    /**
     * Create an instance of {@link GetAllStateInfoResponse }
     * 
     */
    public GetAllStateInfoResponse createGetAllStateInfoResponse() {
        return new GetAllStateInfoResponse();
    }

    /**
     * Create an instance of {@link GetStateInfo }
     * 
     */
    public GetStateInfo createGetStateInfo() {
        return new GetStateInfo();
    }

    /**
     * Create an instance of {@link GetStateInfoFault }
     * 
     */
    public GetStateInfoFault createGetStateInfoFault() {
        return new GetStateInfoFault();
    }

    /**
     * Create an instance of {@link GetStateInfoResponse }
     * 
     */
    public GetStateInfoResponse createGetStateInfoResponse() {
        return new GetStateInfoResponse();
    }

}
