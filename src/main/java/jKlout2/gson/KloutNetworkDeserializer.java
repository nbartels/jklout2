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
package jKlout2.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jKlout2.types.KloutNetwork;
import java.lang.reflect.Type;

/**
 * Deserializer to convert a network from String in json to the KloutNetwork
 * enum
 */
class KloutNetworkDeserializer implements JsonDeserializer<KloutNetwork> {

    public KloutNetwork deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        // use static method to do the conversion
        return KloutNetwork.getEnumFromShortName(json.getAsString());
    }
}
