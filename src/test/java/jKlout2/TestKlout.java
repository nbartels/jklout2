/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKlout {

    @Test
    public void testShowUser() throws IOException, KloutException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/showUser.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Assert.assertNotNull(kloutClient.getUser("anyid"));
    }
}
