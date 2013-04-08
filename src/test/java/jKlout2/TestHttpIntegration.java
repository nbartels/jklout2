/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TestHttpIntegration {
    
    private static final String TEST_URL = "https://raw.github.com/nbartels/jklout2/master/success.txt";
    
    @Test
    public void testContentRetrieval() throws IOException {
        HttpConnector connector = new HttpConnector();
        connector.setURL(TEST_URL);
        String content = connector.getContent();
        Assert.assertEquals("success", content.trim());
    }
    
}
