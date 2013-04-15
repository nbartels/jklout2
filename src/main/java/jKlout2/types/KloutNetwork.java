package jKlout2.types;

/**
 * enumeration to encapsulate the long and short name,
 * that are used on the klout network
 */
public enum KloutNetwork {
    
    TWITTER("tw", "twitter"), // Twitter network
    KLOUT("kw","klout"), // Klout network
    GOOGLE_PLUS("gp","googleplus"), // Google Plus network
    INSTAGRAM("ig","instagram"),
    UNKNOWN("","");
    
    // network short name
    private final String shortName;
    
    // network long name
    private final String longName;

    
    private KloutNetwork(String shortName, String longName) {
        this.shortName = shortName;
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }
    
    public static KloutNetwork getEnumFromShortName(String shortName) {
        for(KloutNetwork network: KloutNetwork.values()) {
            if (network.getShortName().equals(shortName)) {
                return network;
            }
        }
        
        return UNKNOWN;
    }
    
}
