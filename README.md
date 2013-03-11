jklout2
=======

This library is work in progress and far from being a real library.

It is a java wrapper for the klout rest api version 2. The API has to be used since january 2013.

Functionality
=============

if you have a klout id you can already receive all information for it (influence, score, user and topics)


Roadmap
=======

* add the mapping api (twitter, google plus to kloutid)
* add unittests (incl. property file for the klout id)
* remove code duplications and move the http connection code to some class
* add mocking to unittests
* clean up the tyspe classes (innerEntity is not nice and rather useless)
