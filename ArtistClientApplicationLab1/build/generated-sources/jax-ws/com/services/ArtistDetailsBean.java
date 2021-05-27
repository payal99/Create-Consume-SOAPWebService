
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for artistDetailsBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artistDetailsBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfAlbums" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oscarWinner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ratings" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artistDetailsBean", propOrder = {
    "name",
    "noOfAlbums",
    "oscarWinner",
    "ratings"
})
public class ArtistDetailsBean {

    protected String name;
    protected int noOfAlbums;
    protected boolean oscarWinner;
    protected double ratings;

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
     * Gets the value of the noOfAlbums property.
     * 
     */
    public int getNoOfAlbums() {
        return noOfAlbums;
    }

    /**
     * Sets the value of the noOfAlbums property.
     * 
     */
    public void setNoOfAlbums(int value) {
        this.noOfAlbums = value;
    }

    /**
     * Gets the value of the oscarWinner property.
     * 
     */
    public boolean isOscarWinner() {
        return oscarWinner;
    }

    /**
     * Sets the value of the oscarWinner property.
     * 
     */
    public void setOscarWinner(boolean value) {
        this.oscarWinner = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     */
    public double getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     */
    public void setRatings(double value) {
        this.ratings = value;
    }

}
