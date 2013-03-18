package jKlout2;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jKlout2.model.InfluenceItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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
