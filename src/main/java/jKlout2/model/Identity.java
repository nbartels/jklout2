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

import jKlout2.types.KloutNetwork;

public class Identity {

    private String id;
    private KloutNetwork network;

    /**
     * get the user id
     * @return user id
     */
    public String getId() {
        return id;
    }

    /**
     * get the network 
     * @return network
     */
    public KloutNetwork getNetwork() {
        return network;
    }
}
