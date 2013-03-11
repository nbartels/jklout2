package jKlout2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import de.phpmonkeys.jklout2.types.Influence;
import de.phpmonkeys.jklout2.types.Score;
import de.phpmonkeys.jklout2.types.Topic;
import de.phpmonkeys.jklout2.types.User;

public class Klout {

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

	public Klout(String apiKey) {
		this.kloutApiKey = apiKey;
		this.gson = new Gson();
	}

	public Score getUserScore(String userId) throws IOException {
		String url = KLOUT_BASE_URL;
		url += USER + "/" + userId + "/" + INFORMATION_SCORE + "?key="
				+ this.kloutApiKey;
		URL link = new URL(url);
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		if (con.getResponseCode() == 200) {
			BufferedReader buff = new BufferedReader(new InputStreamReader(
					con.getInputStream(), Charset.forName("UTF-8")));
			String json = readAll(buff);
			Score s = gson.fromJson(json, Score.class);
			return s;
		}
		return null;
	}
	
	public User getUser(String userId) throws IOException {
		String url = KLOUT_BASE_URL;
		url += USER + "/" + userId + "?key="
				+ this.kloutApiKey;
		URL link = new URL(url);
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		if (con.getResponseCode() == 200) {
			BufferedReader buff = new BufferedReader(new InputStreamReader(
					con.getInputStream(), Charset.forName("UTF-8")));
			String json = readAll(buff);
			User s = gson.fromJson(json, User.class);
			return s;
		}
		return null;
	}
	
	public List<Topic> getTopics(String userId) throws IOException {
		String url = KLOUT_BASE_URL;
		url += USER + "/" + userId + "/" + INFORMATION_TOPICS + "?key="
				+ this.kloutApiKey;
		URL link = new URL(url);
		List<Topic> topicList = new ArrayList<Topic>();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		if (con.getResponseCode() == 200) {
			BufferedReader buff = new BufferedReader(new InputStreamReader(
					con.getInputStream(), Charset.forName("UTF-8")));
			String json = readAll(buff);
			JsonArray jsonO = new JsonParser().parse(json).getAsJsonArray();
			for (JsonElement jsonElement : jsonO) {
				Topic t = gson.fromJson(jsonElement, Topic.class);
				topicList.add(t);
			}
		}
		return topicList;
	}
	
	public Influence getInfluence(String userId) throws IOException {
		String url = KLOUT_BASE_URL;
		url += USER + "/" + userId + "/" + INFORMATION_INFLUENCE + "?key="
				+ this.kloutApiKey;
		URL link = new URL(url);
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		if (con.getResponseCode() == 200) {
			BufferedReader buff = new BufferedReader(new InputStreamReader(
					con.getInputStream(), Charset.forName("UTF-8")));
			String json = readAll(buff);
			Influence s = gson.fromJson(json, Influence.class);
			return s;
		}
		return null;
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
