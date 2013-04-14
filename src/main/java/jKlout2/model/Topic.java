package jKlout2.model;

public class Topic {

    private String id;
    private String displayName;
    private String name;
    private String slug;
    private String imageUrl;
    private String topicType;

    /**
     * get the topic id
     * @return topic id as String
     */
    public String getId() {
        return id;
    }

    /**
     * get the topic name in human readable format
     * @return topic name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * get the topic name
     * @return topic name
     */
    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    /**
     * get the image to this topic
     * @return image url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * get the topic type
     * @return topic type
     */
    public String getTopicType() {
        return topicType;
    }
}
