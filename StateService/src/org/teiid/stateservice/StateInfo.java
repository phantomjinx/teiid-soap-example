
package org.teiid.stateservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Abbreviation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Capital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="YearOfStatehood" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateInfo", propOrder = {
    "name",
    "abbreviation",
    "capital",
    "yearOfStatehood"
})
public class StateInfo {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Abbreviation", required = true)
    protected String abbreviation;
    @XmlElement(name = "Capital", required = true)
    protected String capital;
    @XmlElement(name = "YearOfStatehood", required = true)
    protected BigInteger yearOfStatehood;

    public StateInfo(){
    }
    
    public StateInfo(String name, String abbrev, String year, String capital) {
		setName(name);
		setAbbreviation(abbrev);
		setYearOfStatehood(new BigInteger(year));
		setCapital(capital);
	}

	/**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Gets the value of the yearOfStatehood property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearOfStatehood() {
        return yearOfStatehood;
    }

    /**
     * Sets the value of the yearOfStatehood property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearOfStatehood(BigInteger value) {
        this.yearOfStatehood = value;
    }

}
