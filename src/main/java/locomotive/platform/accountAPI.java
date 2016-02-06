package locomotive.platform;

import locomotive.apiManager;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Ins on 02.11.2015.
 */
public class accountAPI {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    public static JSONObject resolveVanityURL(String apiKey, String vanityURLName) throws Exception {
        String action = "resolve vanity URL";

        String methodGroup = "ISteamUser";
        String method = "ResolveVanityURL";
        String version = "v0001";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&vanityurl=" + vanityURLName;

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }
    public static JSONObject resolveVanityURL(String apiKey, String vanityURLName, JSONObject params) throws Exception {
        // url_type - The type of vanity URL. 1 (default): Individual profile, 2: Group, 3: Official game group
        String action = "resolve vanity URL";

        String methodGroup = "ISteamUser";
        String method = "ResolveVanityURL";
        String version = "v0001";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&vanityurl=" + vanityURLName;

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

    public static JSONObject getPlayerSummaries(String apiKey, long steamID64) throws Exception {
        // Note that steamID64 = steamID32 + 76561197960265728. Why did they do so?
        String action = "get player summaries";

        String methodGroup = "ISteamUser";
        String method = "GetPlayerSummaries";
        String version = "v0002";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&steamids=" + steamID64;

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }
    public static JSONObject getPlayerSummaries(String apiKey, List<Long> steamID64s) throws Exception {
        // Note that one must not provide more than 100 ids.
        String action = "get player summaries";

        String methodGroup = "ISteamUser";
        String method = "GetPlayerSummaries";
        String version = "v0002";

        StringBuilder sb = new StringBuilder();
        sb.append(apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&steamids=");

        for (int i = 0; i < Math.min(steamID64s.size(), 101); i++) {
            Long steamID64 = steamID64s.get(i);

            sb.append(steamID64.toString());
            if (i < steamID64s.size() - 1)
                sb.append(",");
        }

        String url = sb.toString();

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }
}
