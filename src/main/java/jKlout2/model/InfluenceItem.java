package jKlout2.model;

public class InfluenceItem {

    private String id;
    private User payload;

    /**
     * get influence id
     * @return 
     */
    public String getId() {
        return id;
    }

    /**
     * get influence information
     * @return 
     */
    public User getPayload() {
        return payload;
    }
}
