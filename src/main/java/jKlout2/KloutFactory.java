package jKlout2;

/**
 * factory class to generate a Klout object
 */
public class KloutFactory {

    private String apiKey;

    public KloutFactory setKloutAPIkey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public KloutImpl build() {
        return new KloutImpl(this.apiKey);
    }
}
