package jKlout2;

import de.phpmonkeys.jklout2.types.Influence;
import de.phpmonkeys.jklout2.types.Score;
import de.phpmonkeys.jklout2.types.Topic;
import de.phpmonkeys.jklout2.types.User;
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