package jKlout2;

/**
 * factory class to generate a Klout object
 */
public class KloutFactory {

    private String apiKey;
    private HttpConnector connector = new HttpConnector();

    public KloutFactory setKloutAPIkey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    public KloutFactory setHttpConnector(HttpConnector connector) {
        this.connector = connector;
        return this;
    }

    public KloutImpl build() {
        return new KloutImpl(this.apiKey, this.connector);
    }
}
