/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import java.io.IOException;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIllegalState extends BaseTestKlout {

    @Test(expected = KloutException.class)
    public void testUserKloutExceptionByIllegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getUser("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testUserScoreKloutExceptionByIllegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getUserScore("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testTopicsKloutExceptionByIllegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
       
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getTopics("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testInfluenceKloutExceptionByIllegalStateException() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("error.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IllegalStateException(myJson));
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getInfluence("anyid");
    }
}
