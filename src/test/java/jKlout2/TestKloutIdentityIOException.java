/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.types.KloutNetwork;
import java.io.IOException;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIdentityIOException {

    @Test(expected = KloutException.class)
    public void testTwitterIDioException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromTwitterID("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testTwitterScreenNameioException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromTwitterScreenName("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testGooglePlusIdioException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromGooglePlusID("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testKloutIdTwitterioException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromKloutID("anyid", KloutNetwork.TWITTER);
    }
}
