package jKlout2;

/**
 * every problem with the klout service is provided as KloutException
 */
public class KloutException extends Exception {

    public KloutException(String message) {
        super(message);
    }
}
