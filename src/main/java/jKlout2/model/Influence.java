package jKlout2.model;

import java.util.List;

public class Influence {

    private List<InfluenceItem> myInfluencers;
    private List<InfluenceItem> myInfluencees;
    private int myInfluencersCount;
    private int myInfluenceesCount;

    public List<InfluenceItem> getMyInfluencers() {
        return myInfluencers;
    }

    public List<InfluenceItem> getMyInfluencees() {
        return myInfluencees;
    }

    public int getMyInfluencersCount() {
        return myInfluencersCount;
    }

    public int getMyInfluenceesCount() {
        return myInfluenceesCount;
    }
}
