/*
 * Copyright 2013 Norbert Bartels
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
