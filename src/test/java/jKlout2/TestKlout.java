/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.types.User;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKlout {
    
    private static final double DELTA = 1e-15;

    @Test
    public void testShowUser() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/showUser.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        User testUser = kloutClient.getUser("anyid");
        
        // begin with assertions
        Assert.assertEquals("jtimberlake", testUser.getNick());
        Assert.assertEquals("635263", testUser.getKloutId());
        Assert.assertNotNull(testUser.getScore());
        Assert.assertEquals(92.8064108888354D, testUser.getScore().getScore(), DELTA);
        Assert.assertNotNull(testUser.getScoreDeltas());
        Assert.assertEquals(0.11171073367142981D, testUser.getScoreDeltas().getDayChange(), DELTA);
        Assert.assertEquals(0.19782863190633293D, testUser.getScoreDeltas().getMonthChange(), DELTA);
        Assert.assertEquals(0.07298920976049317D, testUser.getScoreDeltas().getWeekChange(), DELTA);
        
    }
}
