package jKlout2;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

class BaseTestKlout {
    
    protected String getJsonResAsString(String jsonFile) throws IOException {
        // load json file into string
        InputStream is = getClass().getClassLoader().getResourceAsStream("jKlout2/" + jsonFile);
        return IOUtils.toString(is, "UTF-8");
    }
}
