
package org.teiid.stateservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StateInfo" type="{http://www.teiid.org/stateService/}StateInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stateInfo"
})
@XmlRootElement(name = "GetStateInfoResponse")
public class GetStateInfoResponse {

    @XmlElement(name = "StateInfo", required = true)
    protected StateInfo stateInfo;

    /**
     * Gets the value of the stateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StateInfo }
     *     
     */
    public StateInfo getStateInfo() {
        return stateInfo;
    }

    /**
     * Sets the value of the stateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateInfo }
     *     
     */
    public void setStateInfo(StateInfo value) {
        this.stateInfo = value;
    }

}
