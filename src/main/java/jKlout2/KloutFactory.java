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

/**
 * factory class to generate a Klout object
 */
public class KloutFactory {

    private String apiKey;
    private HttpConnector connector = new HttpConnector();

    /**
     * set the Klout API key.
     * 
     * @param apiKey
     * @return a KloutFactory
     */
    public KloutFactory setKloutAPIkey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    
    /**
     * set the HttpConnector.
     * 
     * mostly used for testing 
     * 
     * 
     * @param connector
     * @return KloutFactory
     */
    public KloutFactory setHttpConnector(HttpConnector connector) {
        this.connector = connector;
        return this;
    }

    /**
     * generate a Klout-object
     * 
     * @return KloutImpl
     */
    public Klout build() {
        return new KloutImpl(this.apiKey, this.connector);
    }
}
