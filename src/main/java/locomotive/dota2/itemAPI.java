package locomotive.dota2;

import locomotive.apiManager;
import org.json.JSONObject;

/**
 * Created by Ins on 08.11.2015.
 */
public class itemAPI {
    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    static String[] JSONGetTemplate = {"url"};
    static String[] JSONPostTemplate = {"url", "body"};

    public static JSONObject getPlayerItems(String apiKey, long steamID) {
        String action = "get contents of player backpack";

        String methodGroup = "IEconItems_570";
        String method = "GetPlayerItems";
        String version = "v0001";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&steamid=" + steamID;

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }

    public static JSONObject getSchemaURL(String apiKey) {
        String action = "get URL to current schema";

        String methodGroup = "IEconItems_570";
        String method = "GetSchemaURL";
        String version = "v0001";

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

    public static JSONObject getSchema(String url) {
        String action = "get schema contents";

        JSONObject request = new JSONObject(JSONGetTemplate);
        request.put("url", url);

        return request;
    }
}
