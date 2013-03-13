package jKlout2.types;

public class Score extends SimpleScore {

    private ScoreDelta scoreDelta;

    public ScoreDelta getScoreDelta() {
        return scoreDelta;
    }

    public void setScoreDelta(ScoreDelta scoreDelta) {
        this.scoreDelta = scoreDelta;
    }
}
