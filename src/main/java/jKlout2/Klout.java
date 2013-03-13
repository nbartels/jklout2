package jKlout2;

import jKlout2.types.Identity;
import jKlout2.types.Influence;
import jKlout2.types.Score;
import jKlout2.types.Topic;
import jKlout2.types.User;
import java.util.List;

public interface Klout {
    
    public Identity getIdentityFromTwitterID(String id) throws KloutException;
    
    public Identity getIdentityFromGooglePlusID(String id) throws KloutException;
    
    public Identity getIdentityFromTwitterScreenName(String screenName) throws KloutException;
    
    public Identity getIdentityFromKloutID(String kloutID, String targetNetwork) throws KloutException;

    public Score getUserScore(String userId) throws KloutException;

    public User getUser(String userId) throws KloutException;

    public List<Topic> getTopics(String userId) throws KloutException;

    public Influence getInfluence(String userId) throws KloutException;
}