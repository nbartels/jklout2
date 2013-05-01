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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Http connector that uses a default java implementation
 */
class DefaultJavaHttpConnector implements HttpConnector {

    private String url;

    DefaultJavaHttpConnector() {
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public void setURL(String url) {
        this.url = url;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String getContent() throws IOException, IllegalStateException {
        URL link = new URL(url);
        HttpURLConnection con = (HttpURLConnection) link.openConnection();
        if (con.getResponseCode() == 200) {
            BufferedReader buff = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), Charset.forName("UTF-8")));
            return readAll(buff);
        } else {
            BufferedReader buff = new BufferedReader(new InputStreamReader(
                    con.getErrorStream(), Charset.forName("UTF-8")));
            if (con.getContentType().contains("json")) {
                throw new IllegalStateException(readAll(buff));
            } else {
                throw new IOException(readAll(buff));
            }
        }
    }

    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
