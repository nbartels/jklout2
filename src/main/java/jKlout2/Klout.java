package jKlout2;

import jKlout2.model.Identity;
import jKlout2.model.Influence;
import jKlout2.types.KloutNetwork;
import jKlout2.model.Score;
import jKlout2.model.Topic;
import jKlout2.model.User;
import java.util.List;

public interface Klout {
    
    public Identity getIdentityFromTwitterID(String twitterId) throws KloutException;
    
    public Identity getIdentityFromGooglePlusID(String googlePlusId) throws KloutException;
    
    public Identity getIdentityFromTwitterScreenName(String screenName) throws KloutException;
    
    public Identity getIdentityFromKloutID(String kloutID, KloutNetwork targetNetwork) throws KloutException;

    public Score getUserScore(String userId) throws KloutException;

    public User getUser(String userId) throws KloutException;

    public List<Topic> getTopics(String userId) throws KloutException;

    public Influence getInfluence(String userId) throws KloutException;
}