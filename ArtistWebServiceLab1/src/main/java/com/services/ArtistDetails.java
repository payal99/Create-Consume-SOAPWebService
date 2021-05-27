/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.models.ArtistDetailsBean;
import java.util.Random;
import javax.jws.WebParam;

/**
 *
 * @author Ravi
 */

@WebService(name = "ArtistWS")
public class ArtistDetails {
    
    @WebMethod(operationName = "WelcomeArtists")
    public String getStarted(){
        
        return "Welcome!";
    }
    
   
    @WebMethod(operationName = "ArtistDetails")
    public ArtistDetailsBean getArtistInfo(@WebParam(name = "ArtistNamePassed") String artistName)
    {
        
        ArtistDetailsBean artist = new ArtistDetailsBean();
        artist.setName(artistName);
        artist.setNoOfAlbums((int)(Math.random() * 30)+1);
        artist.setRatings((int)(Math.random() * 10)+1);
        Random rd = new Random();
        artist.setOscarWinner(rd.nextBoolean());
        return artist;
    }
    
    
}
