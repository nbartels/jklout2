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

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jKlout2.model.InfluenceItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Deserializer to convert the influence item json into a better java object
 */
class InfluenceItemListDeserializer implements JsonDeserializer<List<InfluenceItem>> {

    public List<InfluenceItem> deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        
        List<InfluenceItem> output = new ArrayList<InfluenceItem>();
        
        JsonArray items = je.getAsJsonArray();
        for (int i = 0; i < items.size(); i++) {
            JsonElement row = items.get(i);
            JsonElement innerItem = row.getAsJsonObject().get("entity");
            InfluenceItem iItem = jdc.deserialize(innerItem, InfluenceItem.class);
            output.add(iItem);
        }
        
        return output;
    }
    
}
