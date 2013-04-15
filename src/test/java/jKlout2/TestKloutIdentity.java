/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.model.Identity;
import jKlout2.types.KloutNetwork;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIdentity extends BaseTestKlout {

    @Test
    public void testTwitterID() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("identity_twitter.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromTwitterID("anyid");
        
        // begin with assertions
        Assert.assertEquals("54887627490056592", testIdentity.getId());
        Assert.assertEquals(KloutNetwork.KLOUT, testIdentity.getNetwork());
    }
    
    @Test
    public void testTwitterScreenName() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("identity_twitter_screen.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromTwitterScreenName("anyid");
        
        // begin with assertions
        Assert.assertEquals("635263", testIdentity.getId());
        Assert.assertEquals(KloutNetwork.KLOUT, testIdentity.getNetwork());
    }
    
    @Test
    public void testGooglePlusId() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("identity_googleplus.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromGooglePlusID("anyid");
        
        // begin with assertions
        Assert.assertEquals("103083", testIdentity.getId());
        Assert.assertEquals(KloutNetwork.KLOUT, testIdentity.getNetwork());
    }
    
    @Test
    public void testKloutIdTwitter() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("identity_klout_tw.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromKloutID("anyid", KloutNetwork.TWITTER);
        
        // begin with assertions
        Assert.assertEquals("26565946", testIdentity.getId());
        Assert.assertEquals(KloutNetwork.TWITTER, testIdentity.getNetwork());
    }
    
    @Test
    public void testKloutIdInstagram() throws IOException, KloutException {
        // load json file into string
        String myJson = getJsonResAsString("identity_instagram.json");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromInstagramId("anyid");
        
        // begin with assertions
        Assert.assertEquals("68495", testIdentity.getId());
        Assert.assertEquals(KloutNetwork.KLOUT, testIdentity.getNetwork());
    }
}
