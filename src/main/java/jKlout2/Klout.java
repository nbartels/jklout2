package jKlout2;

import jKlout2.types.Influence;
import jKlout2.types.Score;
import jKlout2.types.Topic;
import jKlout2.types.User;
import java.util.List;

/**
 *
 * @author bartels
 */
public interface Klout {

    public Score getUserScore(String userId) throws KloutException;

    public User getUser(String userId) throws KloutException;

    public List<Topic> getTopics(String userId) throws KloutException;

    public Influence getInfluence(String userId) throws KloutException;
}