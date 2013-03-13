package jKlout2.types;

public class InfluenceItem {

    private String id;
    private User payload;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getPayload() {
        return payload;
    }

    public void setPayload(User payload) {
        this.payload = payload;
    }
}
