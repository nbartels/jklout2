package jKlout2;

/**
 * factory class to generate a Klout object
 */
public class KloutFactory {

    private String apiKey;
    private HttpConnector connector = new HttpConnector();

    /**
     * set the Klout API key.
     * 
     * @param apiKey
     * @return a KloutFactory
     */
    public KloutFactory setKloutAPIkey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * set the HttpConnector.
     * 
     * mostly used for testing 
     * 
     * 
     * @param connector
     * @return KloutFactory
     */
    public KloutFactory setHttpConnector(HttpConnector connector) {
        this.connector = connector;
        return this;
    }

    /**
     * generate a Klout-object
     * 
     * @return KloutImpl
     */
    public Klout build() {
        return new KloutImpl(this.apiKey, this.connector);
    }
}
