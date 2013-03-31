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

//    public void setMyInfluencers(List<InfluenceItem> myInfluencers) {
//        this.myInfluencers = myInfluencers;
//    }

    public List<InfluenceItem> getMyInfluencees() {
        return myInfluencees;
    }

//    public void setMyInfluencees(List<InfluenceItem> myInfluencees) {
//        this.myInfluencees = myInfluencees;
//    }

    public int getMyInfluencersCount() {
        return myInfluencersCount;
    }

//    public void setMyInfluencersCount(int myInfluencersCount) {
//        this.myInfluencersCount = myInfluencersCount;
//    }

    public int getMyInfluenceesCount() {
        return myInfluenceesCount;
    }

//    public void setMyInfluenceesCount(int myInfluenceesCount) {
//        this.myInfluenceesCount = myInfluenceesCount;
//    }
}
