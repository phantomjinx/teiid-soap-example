package org.teiid.stateservice;


import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.teiid.stateservice.StateService;
import javax.jws.WebService;

@WebService(serviceName = "stateService", endpointInterface = "org.teiid.stateservice.StateService", targetNamespace = "http://www.teiid.org/stateService/")
public class StateServiceImpl implements StateService {
	
	StateData stateData = new StateData();
	
	public java.util.List<org.teiid.stateservice.StateInfo> getAllStateInfo() {
		return stateData.getAll();
	}

	public org.teiid.stateservice.StateInfo getStateInfo(
			java.lang.String stateCode) throws GetStateInfoFault_Exception {
		StateInfo info = stateData.getData(stateCode);
		if(null == info) {
			throw new GetStateInfoFault_Exception(stateCode + " is not a valid state abbreviation");
		}
		return info;
	}
}