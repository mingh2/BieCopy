//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.01 at 11:19:08 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         Variants of block types, item types, entities etc
 *       
 * 
 * <p>Java class for Variation simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="Variation">
 *   &lt;union memberTypes=" {http://ProjectMalmo.microsoft.com}StoneTypes {http://ProjectMalmo.microsoft.com}WoodTypes {http://ProjectMalmo.microsoft.com}FlowerTypes {http://ProjectMalmo.microsoft.com}EntityTypes {http://ProjectMalmo.microsoft.com}ShapeTypes {http://ProjectMalmo.microsoft.com}MonsterEggTypes {http://ProjectMalmo.microsoft.com}HalfTypes">
 *   &lt;/union>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variation", propOrder = {
    "value"
})
public class Variation {

    @XmlValue
    protected String value;

    /**
     * 
     *         Variants of block types, item types, entities etc
     *       
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
