package jKlout2.types;

public class User {

    private String kloutId;
    private String nick;
    private BaseScore score;
    private ScoreDelta scoreDeltas;

    public String getKloutId() {
        return kloutId;
    }

    public void setKloutId(String kloutId) {
        this.kloutId = kloutId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public BaseScore getScore() {
        return score;
    }

    public void setScore(BaseScore score) {
        this.score = score;
    }

    public ScoreDelta getScoreDeltas() {
        return scoreDeltas;
    }

    public void setScoreDeltas(ScoreDelta scoreDeltas) {
        this.scoreDeltas = scoreDeltas;
    }
}
