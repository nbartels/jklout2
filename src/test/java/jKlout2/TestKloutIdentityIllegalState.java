/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.types.KloutNetwork;
import java.io.IOException;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIdentityIllegalState extends BaseTestKlout {

    @Test(expected = KloutException.class)
    public void testTwitterIDillegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromTwitterID("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testTwitterScreenNameillegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromTwitterScreenName("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testGooglePlusIdillegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromGooglePlusID("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testKloutIdTwitterillegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromKloutID("anyid", KloutNetwork.TWITTER);
    }
}
