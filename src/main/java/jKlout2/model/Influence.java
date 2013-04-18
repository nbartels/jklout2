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

import java.util.List;

public class Influence {

    private List<InfluenceItem> myInfluencers;
    private List<InfluenceItem> myInfluencees;
    private int myInfluencersCount;
    private int myInfluenceesCount;

    /**
     * Get the list of influencers. if you don't have a partner api key you can
     * only get the first 5 influencers
     *
     * @return List of {@see InfluenceItem}
     */
    public List<InfluenceItem> getMyInfluencers() {
        return myInfluencers;
    }

    /**
     * get the list of influencees. if you don't have a partner api key you can
     * only get the first 5 influencees
     *
     * @return List of {@see InfluenceItem}
     */
    public List<InfluenceItem> getMyInfluencees() {
        return myInfluencees;
    }

    /**
     * return real count of influencers
     *
     * @return count of influencers
     */
    public int getMyInfluencersCount() {
        return myInfluencersCount;
    }

    /**
     * return real count of influencees
     *
     * @return count of influencees
     */
    public int getMyInfluenceesCount() {
        return myInfluenceesCount;
    }
}
