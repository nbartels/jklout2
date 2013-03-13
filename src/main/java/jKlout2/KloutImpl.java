package jKlout2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import jKlout2.types.Identity;
import jKlout2.types.Influence;
import jKlout2.types.Score;
import jKlout2.types.Topic;
import jKlout2.types.User;

class KloutImpl implements Klout {

    private static final String KLOUT_BASE_URL = "http://api.klout.com/v2/";
    private String kloutApiKey;
    private static final String IDENTITY = "identity.json";
    private static final String USER = "user.json";
    private static final String NETWORK_GOOGLE_PLUS = "gp";
    private static final String NETWORK_KLOUT = "kw";
    private static final String NETWORK_TWITTER = "tw";
    private static final String INFORMATION_INFLUENCE = "influence";
    private static final String INFORMATION_TOPICS = "topics";
    private static final String INFORMATION_SCORE = "score";
    private static Gson gson;
    private final HttpConnector connector;

    KloutImpl(String apiKey, HttpConnector connector) {
        this.kloutApiKey = apiKey;
        this.connector = connector;
        this.gson = new Gson();
    }

    @Override
    public Score getUserScore(String userId) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += USER + "/" + userId + "/" + INFORMATION_SCORE + "?key="
                + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Score s = gson.fromJson(json, Score.class);
            return s;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    @Override
    public User getUser(String userId) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += USER + "/" + userId + "?key="
                + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            User s = gson.fromJson(json, User.class);
            return s;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    @Override
    public List<Topic> getTopics(String userId) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += USER + "/" + userId + "/" + INFORMATION_TOPICS + "?key="
                + this.kloutApiKey;
        List<Topic> topicList = new ArrayList<Topic>();
        try {
            connector.setURL(url);
            String json = connector.getContent();
            JsonArray jsonO = new JsonParser().parse(json).getAsJsonArray();
            for (JsonElement jsonElement : jsonO) {
                Topic t = gson.fromJson(jsonElement, Topic.class);
                topicList.add(t);
            }
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
        return topicList;
    }

    @Override
    public Influence getInfluence(String userId) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += USER + "/" + userId + "/" + INFORMATION_INFLUENCE + "?key="
                + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Influence s = gson.fromJson(json, Influence.class);
            return s;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    public Identity getIdentityFromTwitterID(String id) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += IDENTITY + "/tw/" + id + "?key=" + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Identity i = gson.fromJson(json, Identity.class);
            return i;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    public Identity getIdentityFromGooglePlusID(String id) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += IDENTITY + "/gp/" + id + "?key=" + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Identity i = gson.fromJson(json, Identity.class);
            return i;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    public Identity getIdentityFromTwitterScreenName(String screenName) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += IDENTITY + "/tw/twitter?screenName=" + screenName + "&key=" + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Identity i = gson.fromJson(json, Identity.class);
            return i;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }

    public Identity getIdentityFromKloutID(String kloutID, String targetNetwork) throws KloutException {
        String url = KLOUT_BASE_URL;
        url += IDENTITY + "/klout/" + kloutID + "/" + targetNetwork + "?key=" + this.kloutApiKey;
        try {
            connector.setURL(url);
            String json = connector.getContent();
            Identity i = gson.fromJson(json, Identity.class);
            return i;
        } catch (IOException ex) {
            throw new KloutException("something went wrong with the connection");
        }
    }
}
