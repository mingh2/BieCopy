//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 08:14:59 AM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Specify a line by start and end coordinates and thickness.
 *       
 * 
 * <p>Java class for DrawLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrawLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ProjectMalmo.microsoft.com}DrawBlockBasedObjectType">
 *       &lt;attribute name="x1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="y1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="z1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="x2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="y2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="z2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="steptype" type="{http://ProjectMalmo.microsoft.com}BlockType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawLine")
public class DrawLine
    extends DrawBlockBasedObjectType
{

    @XmlAttribute(name = "x1", required = true)
    protected int x1;
    @XmlAttribute(name = "y1", required = true)
    protected int y1;
    @XmlAttribute(name = "z1", required = true)
    protected int z1;
    @XmlAttribute(name = "x2", required = true)
    protected int x2;
    @XmlAttribute(name = "y2", required = true)
    protected int y2;
    @XmlAttribute(name = "z2", required = true)
    protected int z2;
    @XmlAttribute(name = "steptype")
    protected BlockType steptype;

    /**
     * Gets the value of the x1 property.
     * 
     */
    public int getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     */
    public void setX1(int value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the y1 property.
     * 
     */
    public int getY1() {
        return y1;
    }

    /**
     * Sets the value of the y1 property.
     * 
     */
    public void setY1(int value) {
        this.y1 = value;
    }

    /**
     * Gets the value of the z1 property.
     * 
     */
    public int getZ1() {
        return z1;
    }

    /**
     * Sets the value of the z1 property.
     * 
     */
    public void setZ1(int value) {
        this.z1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     */
    public int getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     */
    public void setX2(int value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the y2 property.
     * 
     */
    public int getY2() {
        return y2;
    }

    /**
     * Sets the value of the y2 property.
     * 
     */
    public void setY2(int value) {
        this.y2 = value;
    }

    /**
     * Gets the value of the z2 property.
     * 
     */
    public int getZ2() {
        return z2;
    }

    /**
     * Sets the value of the z2 property.
     * 
     */
    public void setZ2(int value) {
        this.z2 = value;
    }

    /**
     * Gets the value of the steptype property.
     * 
     * @return
     *     possible object is
     *     {@link BlockType }
     *     
     */
    public BlockType getSteptype() {
        return steptype;
    }

    /**
     * Sets the value of the steptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockType }
     *     
     */
    public void setSteptype(BlockType value) {
        this.steptype = value;
    }

}
