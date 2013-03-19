jklout2 - Klout API v2 Java Wrapper
===================================

This is a java library to use the [Klout REST API V2](http://klout.com/s/developers/v2). 

Build status
------------
[![Build Status](https://buildhive.cloudbees.com/job/nbartels/job/jklout2/badge/icon)](https://buildhive.cloudbees.com/job/nbartels/job/jklout2/)

Functionality
-------------
* id mapping is supported
* influence, topics and score can be retrieved

Dependencies
------------
 * [gson library](https://code.google.com/p/google-gson/) to parse the json and generated POJOs
 * junit4 and [mockito](https://code.google.com/p/mockito/) for unittesting (not needed in productive environment)

Code examples
-------------
Using the Klout API v2 Java Wrapper is rather easy. Of course you need the API Key. 

```java

String apiKey = "<apikey>";
Klout kloutClient = new KloutFaactory().setKloutAPIkey(apiKey).build();

```


Roadmap
-------

* ~~add the mapping api (twitter, google plus to kloutid)~~
* ~~add unittests (incl. property file for the klout id)~~
* ~~remove code duplications and move the http connection code to some class~~
* ~~add mocking to unittests~~
* ~~clean up the type classes (innerEntity is not nice and rather useless)~~
* ~~move type classes to model package and add some package for classes that are no implementation and no model~~
* add example code snippets
* add deployment to github in pom.xml (or deployment via buildhive)
