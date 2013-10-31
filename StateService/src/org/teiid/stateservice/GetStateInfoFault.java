
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
 *         &lt;element name="GetStateInfoFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "getStateInfoFault"
})
@XmlRootElement(name = "GetStateInfoFault")
public class GetStateInfoFault {

    @XmlElement(name = "GetStateInfoFault", required = true)
    protected String getStateInfoFault;

    /**
     * Gets the value of the getStateInfoFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetStateInfoFault() {
        return getStateInfoFault;
    }

    /**
     * Sets the value of the getStateInfoFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetStateInfoFault(String value) {
        this.getStateInfoFault = value;
    }

}
