package jKlout2.model;

import java.util.List;

public class Influence {

    private List<InfluenceItem> myInfluencers;
    private List<InfluenceItem> myInfluencees;
    private int myInfluencersCount;
    private int myInfluenceesCount;

    /**
     * Get the list of influencers. if you don't have a partner api key you can
     * only get the first 5 influencers
     *
     * @return List of {@see InfluenceItem}
     */
    public List<InfluenceItem> getMyInfluencers() {
        return myInfluencers;
    }

    /**
     * get the list of influencees. if you don't have a partner api key you can
     * only get the first 5 influencees
     *
     * @return List of {@see InfluenceItem}
     */
    public List<InfluenceItem> getMyInfluencees() {
        return myInfluencees;
    }

    /**
     * return real count of influencers
     *
     * @return count of influencers
     */
    public int getMyInfluencersCount() {
        return myInfluencersCount;
    }

    /**
     * return real count of influencees
     *
     * @return count of influencees
     */
    public int getMyInfluenceesCount() {
        return myInfluenceesCount;
    }
}
