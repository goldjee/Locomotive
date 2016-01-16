package locomotive.platform;

import locomotive.apiManager;
import org.json.JSONObject;

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
}
