package jKlout2.model;

/**
 * Container for score and bucket
 * the bucket is a interval the score is located in
 */
public class SimpleScore {

    private double score;
    private String bucket;

    /**
     * get the score
     * @return klout score
     */
    public double getScore() {
        return score;
    }

    /**
     * get the bucket, a bucket is a value interval the score
     * is located in, so you can categorize the users in buckets 
     * @return 
     */
    public String getBucket() {
        return bucket;
    }
}
