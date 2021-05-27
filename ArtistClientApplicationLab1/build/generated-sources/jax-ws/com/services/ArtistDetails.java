
package com.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArtistDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArtistDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArtistNamePassed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArtistDetails", propOrder = {
    "artistNamePassed"
})
public class ArtistDetails {

    @XmlElement(name = "ArtistNamePassed")
    protected String artistNamePassed;

    /**
     * Gets the value of the artistNamePassed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistNamePassed() {
        return artistNamePassed;
    }

    /**
     * Sets the value of the artistNamePassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistNamePassed(String value) {
        this.artistNamePassed = value;
    }

}
