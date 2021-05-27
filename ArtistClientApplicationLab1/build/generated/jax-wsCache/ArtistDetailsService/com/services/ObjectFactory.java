
package com.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArtistDetails_QNAME = new QName("http://services.com/", "ArtistDetails");
    private final static QName _ArtistDetailsResponse_QNAME = new QName("http://services.com/", "ArtistDetailsResponse");
    private final static QName _WelcomeArtistsResponse_QNAME = new QName("http://services.com/", "WelcomeArtistsResponse");
    private final static QName _WelcomeArtists_QNAME = new QName("http://services.com/", "WelcomeArtists");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArtistDetails }
     * 
     */
    public ArtistDetails createArtistDetails() {
        return new ArtistDetails();
    }

    /**
     * Create an instance of {@link ArtistDetailsResponse }
     * 
     */
    public ArtistDetailsResponse createArtistDetailsResponse() {
        return new ArtistDetailsResponse();
    }

    /**
     * Create an instance of {@link WelcomeArtistsResponse }
     * 
     */
    public WelcomeArtistsResponse createWelcomeArtistsResponse() {
        return new WelcomeArtistsResponse();
    }

    /**
     * Create an instance of {@link WelcomeArtists }
     * 
     */
    public WelcomeArtists createWelcomeArtists() {
        return new WelcomeArtists();
    }

    /**
     * Create an instance of {@link ArtistDetailsBean }
     * 
     */
    public ArtistDetailsBean createArtistDetailsBean() {
        return new ArtistDetailsBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtistDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "ArtistDetails")
    public JAXBElement<ArtistDetails> createArtistDetails(ArtistDetails value) {
        return new JAXBElement<ArtistDetails>(_ArtistDetails_QNAME, ArtistDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArtistDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "ArtistDetailsResponse")
    public JAXBElement<ArtistDetailsResponse> createArtistDetailsResponse(ArtistDetailsResponse value) {
        return new JAXBElement<ArtistDetailsResponse>(_ArtistDetailsResponse_QNAME, ArtistDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WelcomeArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "WelcomeArtistsResponse")
    public JAXBElement<WelcomeArtistsResponse> createWelcomeArtistsResponse(WelcomeArtistsResponse value) {
        return new JAXBElement<WelcomeArtistsResponse>(_WelcomeArtistsResponse_QNAME, WelcomeArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WelcomeArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "WelcomeArtists")
    public JAXBElement<WelcomeArtists> createWelcomeArtists(WelcomeArtists value) {
        return new JAXBElement<WelcomeArtists>(_WelcomeArtists_QNAME, WelcomeArtists.class, null, value);
    }

}
