/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIOException {
    
    private static final double DELTA = 1e-15;

    @Test(expected = KloutException.class)
    public void testUserKloutExceptionByIOException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getUser("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testUserScoreKloutExceptionByIOException() throws IOException, KloutException {
       // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getUserScore("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testTopicsKloutExceptionByIOException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getTopics("anyid");
    }
    
    @Test(expected = KloutException.class)
    public void testInfluenceKloutExceptionByIOException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getInfluence("anyid");
    }
}
