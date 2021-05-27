/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ravi
 */
@XmlRootElement 
public class ArtistInfoXML {
    
    
     private String name;
    private int noOfAlbums;
    private double ratings;
    private boolean oscarWinner;
    
    private String username;
    private Date createdDate;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

       @XmlElement
    public int getNoOfAlbums() {
        return noOfAlbums;
    }

    public void setNoOfAlbums(int noOfAlbums) {
        this.noOfAlbums = noOfAlbums;
    }

       @XmlElement
    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

       @XmlElement
    public boolean isOscarWinner() {
        return oscarWinner;
    }

    public void setOscarWinner(boolean oscarWinner) {
        this.oscarWinner = oscarWinner;
    }

       @XmlElement
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

       @XmlElement
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
    
    
    
}
