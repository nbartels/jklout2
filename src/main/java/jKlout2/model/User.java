package jKlout2.model;

public class User {

    private String kloutId;
    private String nick;
    private SimpleScore score;
    private ScoreDelta scoreDeltas;

    public String getKloutId() {
        return kloutId;
    }

    public String getNick() {
        return nick;
    }

    public SimpleScore getScore() {
        return score;
    }

    public ScoreDelta getScoreDeltas() {
        return scoreDeltas;
    }
}
