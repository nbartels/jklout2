package jKlout2;

import jKlout2.model.Identity;
import jKlout2.model.Influence;
import jKlout2.types.KloutNetwork;
import jKlout2.model.Score;
import jKlout2.model.Topic;
import jKlout2.model.User;
import java.util.List;

public interface Klout {

    /**
     * mapping from twitter id to the klout id
     *
     * @param twitterId
     * @return a {@see Identity} object to the given twitter id
     * @throws KloutException
     */
    public Identity getIdentityFromTwitterID(String twitterId) throws KloutException;

    /**
     * mapping from google plus id to the klout id
     *
     * @param googlePlusId
     * @return a {@see Identity} object to the given google plus id
     * @throws KloutException
     */
    public Identity getIdentityFromGooglePlusID(String googlePlusId) throws KloutException;

    /**
     * mapping from twitter screen name to the klout id
     *
     * @param screenName
     * @return a {@see Identity} object to the given twitter screen name
     * @throws KloutException
     */
    public Identity getIdentityFromTwitterScreenName(String screenName) throws KloutException;

    /**
     * mapping from klout id to the network id, the target network needs to be
     * provided
     *
     * @param kloutID
     * @param targetNetwork
     * @return a {@see Identity} object to the given klout id
     * @throws KloutException
     */
    public Identity getIdentityFromKloutID(String kloutID, KloutNetwork targetNetwork) throws KloutException;

    public Score getUserScore(String userId) throws KloutException;

    public User getUser(String userId) throws KloutException;

    /**
     * requests the list of topics that the user with the klout id talks about
     * in his posts (Google or Twitter)
     *
     * @param userId
     * @return a list of topics to the given klout id
     * @throws KloutException
     */
    public List<Topic> getTopics(String userId) throws KloutException;

    /**
     * requests the influencers and influencees of the given klout id if you
     * don't provide a partner api key you will only get the first 5 influencers
     * and 5 influencees
     *
     * @param userId
     * @return the {@see Influence} object to the given klout id
     * @throws KloutException
     */
    public Influence getInfluence(String userId) throws KloutException;
}