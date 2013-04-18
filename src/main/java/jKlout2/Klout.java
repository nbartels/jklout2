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
package jKlout2;

import jKlout2.model.Identity;
import jKlout2.model.Influence;
import jKlout2.types.KloutNetwork;
import jKlout2.model.Score;
import jKlout2.model.Topic;
import jKlout2.model.User;
import java.util.List;

public interface Klout {

    /**
     * mapping from twitter id to the klout id.
     *
     * Twitter provides to every user a twitter user id. This is some numeric
     * value that can be found in some ways. For developers it is rather easy to
     * retrieve this information via the twitter api. Every other person can use
     * some service, that can be found on the internet.
     *
     * @param twitterId numeric id of a twitter account
     * @return a {
     * @see Identity} object to the given twitter id
     * @throws KloutException twitter id cannot be found at klout service, or
     * service down ...
     */
    Identity getIdentityFromTwitterID(String twitterId) throws KloutException;

    /**
     * mapping from google plus id to the klout id.
     *
     * Every Google+ user has some id. This is the number you find in the url,
     * if you look at this users timeline or profile page.
     *
     * @param googlePlusId numeric value that represents the google+ user
     * @return a {
     * @see Identity} object to the given google plus id
     * @throws KloutException
     */
    Identity getIdentityFromGooglePlusID(String googlePlusId) throws KloutException;

    /**
     * mapping from twitter screen name to the klout id.
     *
     * The screen name is rather common. This is the text after the
     *
     * @-sign. Some advertisements and tv shows provide this information
     * already. And every twitter user should know what a screen name is.
     *
     * @param screenName
     * @return a {
     * @see Identity} object to the given twitter screen name
     * @throws KloutException
     */
    Identity getIdentityFromTwitterScreenName(String screenName) throws KloutException;
    
    /**
     * mapping from instagram id to the klout id
     * @param instagramId
     * @return a identity object
     * @throws KloutException 
     */
    Identity getIdentityFromInstagramId(String instagramId) throws KloutException;

    /**
     * mapping from klout id to the network id, the target network needs to be
     * provided.
     *
     * this method is some kind of reverse lookup for a klout id. you can get
     * the corresponding information about the given network.
     *
     * @param kloutID
     * @param targetNetwork
     * @return a {
     * @see Identity} object to the given klout id
     * @throws KloutException
     */
    Identity getIdentityFromKloutID(String kloutID, KloutNetwork targetNetwork) throws KloutException;

    /**
     * request a {@see Score} object to the given klout user id.
     *
     * @param userId klout user id
     * @return Score object
     * @throws KloutException if klout user id cannot be found, network down or
     * something else
     */
    Score getUserScore(String userId) throws KloutException;

    /**
     * requests a {@see User} object with the given klout user id from the Klout Service.
     *
     * @param userId klout user id (use some identity method to get the klout
     * user id)
     * @return User object to the user
     * @throws KloutException if user id cannot be found, network is down or
     * something else
     */
    User getUser(String userId) throws KloutException;

    /**
     * requests the list of topics that the user with the klout id talks about
     * in his posts (Google or Twitter)
     *
     * @param userId the klout user id
     * @return a list of topics to the given klout id
     * @throws KloutException
     */
    List<Topic> getTopics(String userId) throws KloutException;

    /**
     * requests the influencers and influencees of the given klout id if you
     * don't provide a partner api key you will only get the first 5 influencers
     * and 5 influencees
     *
     * @param userId the klout user id
     * @return the {
     * @see Influence} object to the given klout id
     * @throws KloutException
     */
    Influence getInfluence(String userId) throws KloutException;
}