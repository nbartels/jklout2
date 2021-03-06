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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jKlout2.types.KloutNetwork;
import java.util.List;

public class KloutGsonBuilder {

    public static Gson create() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(List.class, new InfluenceItemListDeserializer());
        gsonBuilder.registerTypeAdapter(KloutNetwork.class, new KloutNetworkDeserializer());
        return gsonBuilder.create();
    }
    
}
