/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import jKlout2.model.Influence;
import jKlout2.model.InnerItem;
import jKlout2.model.Score;
import jKlout2.model.Topic;
import jKlout2.model.User;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestKlout {
    
    private static final double DELTA = 1e-15;

    @Test
    public void testUser() throws IOException, KloutException {
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
    
    @Test
    public void testUserScore() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/score.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Score testScore = kloutClient.getUserScore("anyid");
        
        // begin with assertions
        Assert.assertEquals(92.8064108888354, testScore.getScore(), DELTA);
        Assert.assertNotNull(testScore.getScoreDelta());
        Assert.assertEquals(0.11171073367142981D, testScore.getScoreDelta().getDayChange(), DELTA);
        Assert.assertEquals(0.19782863190633293D, testScore.getScoreDelta().getMonthChange(), DELTA);
        Assert.assertEquals(0.07298920976049317D, testScore.getScoreDelta().getWeekChange(), DELTA);
    }
    
    @Test
    public void testTopics() throws IOException, KloutException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/topics.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        List<Topic> topicList = kloutClient.getTopics("anyid");
        
        // begin with assertions
        Assert.assertEquals(5, topicList.size());
        // TODO: add more assertions
    }
    
    @Test
    public void testInfluence() throws IOException, KloutException {
         // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/influence.json");
        String myJson = IOUtils.toString(is, "UTF-8");
        
        // HttpConnector mock
        HttpConnector connector = Mockito.mock(HttpConnector.class);
        Mockito.when(connector.getContent()).thenReturn(myJson);
        
        KloutFactory factory = new KloutFactory();
        Klout kloutClient = factory.setKloutAPIkey("example").setHttpConnector(connector).build();
        Influence testScore = kloutClient.getInfluence("anyid");
        
        // begin with assertions
        Assert.assertEquals(15, testScore.getMyInfluencersCount());
        Assert.assertEquals(25, testScore.getMyInfluenceesCount());
        
        List<InnerItem> influencers = testScore.getMyInfluencers();
        
        Assert.assertEquals("100768049884337217", influencers.get(0).getEntity().getId());
        Assert.assertEquals("37436176667751638", influencers.get(1).getEntity().getId());
        Assert.assertEquals("41939776295123042", influencers.get(2).getEntity().getId());
        Assert.assertEquals("902675", influencers.get(3).getEntity().getId());
        Assert.assertEquals("879345", influencers.get(4).getEntity().getId());
        
        List<InnerItem> influencees = testScore.getMyInfluencees();
        
        Assert.assertEquals("120189822723669433", influencees.get(0).getEntity().getId());
        Assert.assertEquals("34058476947791600", influencees.get(1).getEntity().getId());
        Assert.assertEquals("41095351365245784", influencees.get(2).getEntity().getId());
        Assert.assertEquals("34621426900933220", influencees.get(3).getEntity().getId());
        Assert.assertEquals("33495526993436298", influencees.get(4).getEntity().getId());

        // TODO more assertions
    }
}
