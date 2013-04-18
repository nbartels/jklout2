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

public class User {

    private String kloutId;
    private String nick;
    private SimpleScore score;
    private ScoreDelta scoreDeltas;

    /**
     * get this users klout id
     * @return klout id as String
     */
    public String getKloutId() {
        return kloutId;
    }

    /**
     * get this users nick
     * @return nick name
     */
    public String getNick() {
        return nick;
    }

    /**
     * get this users {@see Score}
     * @return Score as {@see SimpleScore}
     */
    public SimpleScore getScore() {
        return score;
    }

    /**
     * get this users {@see ScoreDelta}
     * @return ScoreDelta
     */
    public ScoreDelta getScoreDeltas() {
        return scoreDeltas;
    }
}
