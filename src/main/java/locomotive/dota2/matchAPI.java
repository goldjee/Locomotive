package locomotive.dota2;

import locomotive.apiManager;
import org.json.JSONObject;

/**
 * Created by Ins on 02.11.2015.
 */
public class matchAPI {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    static String[] JSONGetTemplate = {"url"};
    static String[] JSONPostTemplate = {"url", "body"};

    public static JSONObject getRealtimeStats(String apiKey, long serverSteamID) {
        String action = "get realtime stats";

        String methodGroup = "IDOTA2MatchStats_570";
        String method = "GetRealtimeStats";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&server_steam_id=" + String.valueOf(serverSteamID);

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }

    public static JSONObject getLeagueListing(String apiKey) {
        String action = "get leagues";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetLeagueListing";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }

    public static JSONObject getLiveLeagueGames(String apiKey) {
        String action = "get live league games";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetLiveLeagueGames";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }
    public static JSONObject getLiveLeagueGames(String apiKey, int leagueID) {
        String action = "get live league games";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetLiveLeagueGames";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&league_id=" + leagueID;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }
    public static JSONObject getLiveLeagueGames(String apiKey, int leagueID, long matchID) {
        String action = "get live league games";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetLiveLeagueGames";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&league_id=" + leagueID +
                "&match_id=" + matchID;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }

    public static JSONObject getMatchDetails(String apiKey, long matchID) {
        String action = "get match details";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetMatchDetails";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&match_id=" + matchID;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }
}
