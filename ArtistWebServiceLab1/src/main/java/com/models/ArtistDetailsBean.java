/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author Ravi
 */
public class ArtistDetailsBean {
    
    
    private String name;
  
    private int noOfAlbums;
    private double ratings;
    private boolean oscarWinner;

    
    
    //getter-setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNoOfAlbums() {
        return noOfAlbums;
    }

    public void setNoOfAlbums(int noOfAlbums) {
        this.noOfAlbums = noOfAlbums;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public boolean isOscarWinner() {
        return oscarWinner;
    }

    public void setOscarWinner(boolean oscarWinner) {
        this.oscarWinner = oscarWinner;
    }
   
    
    
    
    
    
    
}
