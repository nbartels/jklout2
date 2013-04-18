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
