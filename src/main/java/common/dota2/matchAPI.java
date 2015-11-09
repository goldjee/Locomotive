package common.dota2;

import common.apiManager;
import common.network.Response;
import common.network.requester;

/**
 * Created by Ins on 02.11.2015.
 */
public class matchAPI {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    public static String getRealtimeStats(String apiKey, long serverSteamID) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }

    public static String getLeagueListing(String apiKey) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }

    public static String getLiveLeagueGames(String apiKey) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }
    public static String getLiveLeagueGames(String apiKey, int leagueID) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }
    public static String getLiveLeagueGames(String apiKey, int leagueID, long matchID) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }

    public static String getMatchDetails(String apiKey, long matchID) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: HTTP code " + response.status);

        return response.body;
    }
}
