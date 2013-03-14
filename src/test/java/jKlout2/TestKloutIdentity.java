/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.model.Identity;
import jKlout2.types.KloutNetwork;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKloutIdentity {

    @Test
    public void testTwitterID() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/identity_twitter.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromTwitterID("anyid");
        
        // begin with assertions
        Assert.assertEquals("54887627490056592", testIdentity.getId());
        Assert.assertEquals("ks", testIdentity.getNetwork());
    }
    
    @Test
    public void testTwitterScreenName() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/identity_twitter_screen.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromTwitterScreenName("anyid");
        
        // begin with assertions
        Assert.assertEquals("635263", testIdentity.getId());
        Assert.assertEquals("ks", testIdentity.getNetwork());
    }
    
    @Test
    public void testGooglePlusId() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/identity_googleplus.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromGooglePlusID("anyid");
        
        // begin with assertions
        Assert.assertEquals("103083", testIdentity.getId());
        Assert.assertEquals("ks", testIdentity.getNetwork());
    }
    
    @Test
    public void testKloutIdTwitter() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/identity_klout_tw.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Identity testIdentity = kloutClient.getIdentityFromKloutID("anyid", KloutNetwork.TWITTER);
        
        // begin with assertions
        Assert.assertEquals("26565946", testIdentity.getId());
        Assert.assertEquals("tw", testIdentity.getNetwork());
    }
}
