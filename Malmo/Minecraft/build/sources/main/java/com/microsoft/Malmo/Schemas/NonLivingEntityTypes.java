//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 02:32:43 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonLivingEntityTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonLivingEntityTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minecart"/>
 *     &lt;enumeration value="Boat"/>
 *     &lt;enumeration value="ArmorStand"/>
 *     &lt;enumeration value="ItemFrame"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonLivingEntityTypes")
@XmlEnum
public enum NonLivingEntityTypes {

    @XmlEnumValue("Minecart")
    MINECART("Minecart"),
    @XmlEnumValue("Boat")
    BOAT("Boat"),
    @XmlEnumValue("ArmorStand")
    ARMOR_STAND("ArmorStand"),
    @XmlEnumValue("ItemFrame")
    ITEM_FRAME("ItemFrame");
    private final String value;

    NonLivingEntityTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonLivingEntityTypes fromValue(String v) {
        for (NonLivingEntityTypes c: NonLivingEntityTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
