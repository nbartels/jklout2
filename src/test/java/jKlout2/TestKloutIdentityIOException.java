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
    
    @Test(expected = KloutException.class)
    public void testKloutIdInstagramioException() throws IOException, KloutException {
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenThrow(new IOException());
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        kloutClient.getIdentityFromInstagramId("anyid");
    }
}
