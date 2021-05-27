/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artistclientapplicationlab1;

import com.models.ArtistInfoXML;
import com.services.ArtistDetails;
import com.services.ArtistDetailsBean;
import com.services.ArtistDetailsService;
import com.services.ArtistWS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Ravi
 */
public class ArtistClientApplicationLab1 {

    /**
     * @param args the command line arguments
     */
    //new
    public static void main(String[] args) {
        // TODO code application logic here

        ArtistDetailsService service = new ArtistDetailsService();
        ArtistWS port = service.getArtistWSPort();
        ArtistDetailsBean info = port.artistDetails("Neha");

        System.out.println("******************* Artist Information from Webservice**********************");
        System.out.println(String.format("Name: %s", info.getName()));
        System.out.println(String.format("No of Albums: %s", info.getNoOfAlbums()));
        System.out.println(String.format("Ratings: %s", info.getRatings()));
        System.out.println(String.format("Oscar Winner: %s", info.isOscarWinner()));
        System.out.println("-----------------------------------------------------------");

        //Marshalling
        //Generating XMlfile response.xml in test directory
        ArtistInfoXML artistXML = new ArtistInfoXML();
        artistXML.setName(info.getName());
        artistXML.setNoOfAlbums(info.getNoOfAlbums());
        artistXML.setRatings(info.getRatings());
        artistXML.setOscarWinner(info.isOscarWinner());

        try {
            JAXBContext context = JAXBContext.newInstance(ArtistInfoXML.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(artistXML, new FileOutputStream("./test/response.xml"));

        } catch (JAXBException | FileNotFoundException ex) {
            Logger.getLogger(ArtistClientApplicationLab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Unmarshalling - XML to POJO class
        File file = new File("./test/response.xml");
        ArtistInfoXML artistInfoFromXML = null;
        try {
            JAXBContext unmcontext = JAXBContext.newInstance(ArtistInfoXML.class);
            Unmarshaller um = unmcontext.createUnmarshaller();
            artistInfoFromXML = (ArtistInfoXML) um.unmarshal(file);
            //setting values for 2 extra fields present in POJO class
            artistInfoFromXML.setCreatedDate(new Date());
            artistInfoFromXML.setUsername("Payal");

            System.out.println("******************** Data Unmarshalled ********************* ");
            System.out.println("------------ Artist Information from XML file ----------------------------");
            System.out.println(String.format("Name: %s", artistInfoFromXML.getName()));
            System.out.println(String.format("No of Albums: %s", artistInfoFromXML.getNoOfAlbums()));
            System.out.println(String.format("Ratings: %s", artistInfoFromXML.getRatings()));
            System.out.println(String.format("Oscar Winner: %s", artistInfoFromXML.isOscarWinner()));
            System.out.println("-------extra parameters-------------------------");
            System.out.println(String.format("Username: %s", artistInfoFromXML.getUsername()));
            System.out.println(String.format("Date: %s", artistInfoFromXML.getCreatedDate()));
            System.out.println("-----------------------------------------------------------");

        } catch (JAXBException ex) {
            Logger.getLogger(ArtistClientApplicationLab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        //    //Marshalling
        //Generating XMlfile response.xml in test directory
        ArtistInfoXML artistXML2 = new ArtistInfoXML();
        artistXML2.setName(artistInfoFromXML.getName());
        artistXML2.setNoOfAlbums(artistInfoFromXML.getNoOfAlbums());
        artistXML2.setRatings(artistInfoFromXML.getRatings());
        artistXML2.setOscarWinner(artistInfoFromXML.isOscarWinner());

        //2 extra added parameters in POJO.
        artistXML2.setCreatedDate(new Date());
        artistXML2.setUsername("Payal");

        try {
            JAXBContext context = JAXBContext.newInstance(ArtistInfoXML.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(artistXML2, new FileOutputStream("./test/response_modified.xml"));

        } catch (JAXBException | FileNotFoundException ex) {
            Logger.getLogger(ArtistClientApplicationLab1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
