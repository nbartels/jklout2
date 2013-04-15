/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jKlout2;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import jKlout2.types.KloutNetwork;
import java.lang.reflect.Type;

public class KloutNetworkDeserializer implements JsonDeserializer<KloutNetwork>{

    public KloutNetwork deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        return KloutNetwork.getEnumFromShortName(json.getAsString());
    }
    
}
