package jKlout2.model;

import jKlout2.types.KloutNetwork;

public class Identity {

    private String id;
    private KloutNetwork network;

    /**
     * get the user id
     * @return user id
     */
    public String getId() {
        return id;
    }

    /**
     * get the network 
     * @return network
     */
    public KloutNetwork getNetwork() {
        return network;
    }
}
