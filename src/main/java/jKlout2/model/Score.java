package jKlout2.model;

public class Score extends SimpleScore {

    private ScoreDelta scoreDelta;

    public ScoreDelta getScoreDelta() {
        return scoreDelta;
    }

    public void setScoreDelta(ScoreDelta scoreDelta) {
        this.scoreDelta = scoreDelta;
    }
}
