package jKlout2.model;

/**
 * error class, to convert a klout error into a some java object
 */
public class KloutError {

    private int error;
    private String description;

    /**
     * get the klout network error code
     *
     * @return klout error id
     */
    public int getError() {
        return error;
    }

    /**
     * get the description of the retrieved error code
     *
     * @return klout error message
     */
    public String getDescription() {
        return description;
    }
}
