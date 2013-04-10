package jKlout2.types;

/**
 * enumeration to encapsulate the long and short name,
 * that are used on the klout network
 */
public enum KloutNetwork {
    TWITTER("tw", "twitter"), KLOUT("kw","klout"), GOOGLE_PLUS("gp","googleplus");
    
    private final String shortName;
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
    
}
