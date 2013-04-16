jklout2 - Klout API v2 Java Wrapper
===================================

This is a java library to use the [Klout REST API V2](http://klout.com/s/developers/v2). 

[![Build Status](https://buildhive.cloudbees.com/job/nbartels/job/jklout2/badge/icon)](https://buildhive.cloudbees.com/job/nbartels/job/jklout2/)

Functionality
-------------
* id mapping between klout id and twitter or google plus is supported
* influence (incl influencers and influencees), topics and score can be retrieved

Dependencies
------------
 * [gson library](https://code.google.com/p/google-gson/) to parse the json and generated POJOs
 * junit4, [mockito](https://code.google.com/p/mockito/) and [Apache commons-io](http://commons.apache.org/proper/commons-io/) for unittesting (not needed in productive environment)

Code examples
=============

Using the Klout API v2 Java Wrapper is rather easy. Of course you need the API Key. 

```java

String apiKey = "<apikey>";
Klout kloutClient = new KloutFactory().setKloutAPIkey(apiKey).build();
```
Now we have a instance of the Klout object and can work with it.

Get User-object from twitter screen name
----------------------------------------

```java

Klout kloutClient;
String kloutId = kloutClient.getIdentityFromTwitterScreenName("jtimberlake").getId();
User kloutUser = kloutClient.getUser(kloutId);
```

Get Influence-object from google plus id
----------------------------------------

```java

Klout kloutClient;
String kloutId = kloutClient.getIdentityFromGooglePlusID("112620727907435773834").getId();
Influence influence = kloutClient.getInfluence(kloutId);
```


Changelog and Roadmap
=====================

Version 1.2 (Snapshot)
----------------------
* better readme
* more comments

Version 1.1
-----------
* Instagram support added
* bugfix: retrieving identity ba twitter screenname

Version 1.0 (not published due to a bug)
----------------------------------------
* initial release
* support for twitter
* support for google plus