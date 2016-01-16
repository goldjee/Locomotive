package locomotive.dota2;

import locomotive.apiManager;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Ins on 02.11.2015.
 */
public class matchAPI {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

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

        JSONObject request = new JSONObject();
        request.put("action", action);
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

        JSONObject request = new JSONObject();
        request.put("action", action);
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

        JSONObject request = new JSONObject();
        request.put("action", action);
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

        JSONObject request = new JSONObject();
        request.put("action", action);
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

        JSONObject request = new JSONObject();
        request.put("action", action);
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

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }

    public static JSONObject getMatchHistory(String apiKey) {
        String action = "get latest matches";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetMatchHistory";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format;

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }
    public static JSONObject getMatchHistory(String apiKey, JSONObject params) {
//        hero_id               uint32    The ID of the hero that must be in the matches being queried
//        game_mode             uint32    Which game mode to return matches for
//        skill	                uint32    The average skill range of the match, these can be [1-3] with lower numbers being lower skill. Ignored if an account ID is specified
//        min_players           string    Minimum number of human players that must be in a match for it to be returned
//        account_id            string    An account ID to get matches from. This will fail if the user has their match history hidden
//        league_id             string    The league ID to return games from
//        start_at_match_id     uint64    The minimum match ID to start from
//        matches_requested     string    The number of requested matches to return
//        tournament_games_only string    Whether or not tournament games should only be returned

        String action = "get latest matches";

        String methodGroup = "IDOTA2Match_570";
        String method = "GetMatchHistory";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format;

        Iterator<String> keys = params.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            url += ("&" + key + "=" + params.get(key).toString());
        }

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }
}
