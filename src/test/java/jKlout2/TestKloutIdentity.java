/*
 * Copyright 2013 Norbert Bartels
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
