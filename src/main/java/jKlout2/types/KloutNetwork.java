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
package jKlout2.types;

/**
 * enumeration to encapsulate the long and short name,
 * that are used on the klout network
 */
public enum KloutNetwork {
    
    TWITTER("tw", "twitter"), // Twitter network
    KLOUT("ks","klout"), // Klout network
    GOOGLE_PLUS("gp","googleplus"), // Google Plus network
    INSTAGRAM("ig","instagram"), // Instagram network
    UNKNOWN("","");
    
    // network short name
    private final String shortName;
    
    // network long name
    private final String longName;

    
    private KloutNetwork(String shortName, String longName) {
        this.shortName = shortName;
        this.longName = longName;
    }

    /**
     * get the network short name
     * @return 
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * get the network long name
     * @return 
     */
    public String getLongName() {
        return longName;
    }
    
    /**
     * convert network shortname to the KloutNetwork enum,
     * or UNKNOWN as fallback if the short name cannot be resolved
     * @param shortName network shortname string
     * @return kloutnetwork enum
     */
    public static KloutNetwork getEnumFromShortName(String shortName) {
        for(KloutNetwork network: KloutNetwork.values()) {
            if (network.getShortName().equals(shortName)) {
                return network;
            }
        }
        
        return UNKNOWN;
    }
    
}
