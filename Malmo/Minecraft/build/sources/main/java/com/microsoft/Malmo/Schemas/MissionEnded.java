//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.01 at 11:19:08 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Status" type="{http://ProjectMalmo.microsoft.com}MissionResult"/>
 *         &lt;element name="HumanReadableStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}Reward" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "humanReadableStatus",
    "reward"
})
@XmlRootElement(name = "MissionEnded")
public class MissionEnded {

    @XmlElement(name = "Status", required = true)
    protected MissionResult status;
    @XmlElement(name = "HumanReadableStatus", required = true)
    protected String humanReadableStatus;
    @XmlElement(name = "Reward")
    protected Reward reward;
    @XmlAttribute(name = "SchemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MissionResult }
     *     
     */
    public MissionResult getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissionResult }
     *     
     */
    public void setStatus(MissionResult value) {
        this.status = value;
    }

    /**
     * Gets the value of the humanReadableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumanReadableStatus() {
        return humanReadableStatus;
    }

    /**
     * Sets the value of the humanReadableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumanReadableStatus(String value) {
        this.humanReadableStatus = value;
    }

    /**
     * Gets the value of the reward property.
     * 
     * @return
     *     possible object is
     *     {@link Reward }
     *     
     */
    public Reward getReward() {
        return reward;
    }

    /**
     * Sets the value of the reward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reward }
     *     
     */
    public void setReward(Reward value) {
        this.reward = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
