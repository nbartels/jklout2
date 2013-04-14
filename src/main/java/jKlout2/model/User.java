package jKlout2.model;

public class User {

    private String kloutId;
    private String nick;
    private SimpleScore score;
    private ScoreDelta scoreDeltas;

    /**
     * get this users klout id
     * @return klout id as String
     */
    public String getKloutId() {
        return kloutId;
    }

    /**
     * get this users nick
     * @return nick name
     */
    public String getNick() {
        return nick;
    }

    /**
     * get this users {@see Score}
     * @return Score as {@see SimpleScore}
     */
    public SimpleScore getScore() {
        return score;
    }

    /**
     * get this users {@see ScoreDelta}
     * @return ScoreDelta
     */
    public ScoreDelta getScoreDeltas() {
        return scoreDeltas;
    }
}
