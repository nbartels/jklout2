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

import java.io.IOException;

/**
 * Connector interface for http connectors
 * 
 */
interface HttpConnector {

    /**
     * set the url that is called to retrieve content
     * @param url content url 
     */
    public void setURL(String url);

    /**
     * retrieve the content from the url that had been set by <code>setURL</code>
     * @return
     * @throws IOException
     * @throws IllegalStateException 
     */
    public String getContent() throws IOException, IllegalStateException;
}
