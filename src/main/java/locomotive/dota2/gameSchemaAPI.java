package locomotive.dota2;

import locomotive.apiManager;
import org.json.JSONObject;

/**
 * Created by Ins on 19.01.2016.
 */
public class gameSchemaAPI {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    public static JSONObject getHeroes(String apiKey) {
        String action = "get up-to-date list of heroes";

        String methodGroup = "IEconDOTA2_570";
        String method = "GetHeroes";
        String version = "v0001";

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
    public static JSONObject getHeroes(String apiKey, String language) {
        // language - en_us for example
        String action = "get up-to-date list of heroes";

        String methodGroup = "IEconDOTA2_570";
        String method = "GetHeroes";
        String version = "v0001";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&language=" + language;

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }

    public static JSONObject getGameItems(String apiKey) {
        String action = "get up-to-date list of items";

        String methodGroup = "IEconDOTA2_570";
        String method = "GetGameItems";
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
    public static JSONObject getGameItems(String apiKey, String language) {
        // language - en_us for example
        String action = "get up-to-date list of items";

        String methodGroup = "IEconDOTA2_570";
        String method = "GetGameItems";
        String version = "v1";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&language=" + language;

        JSONObject request = new JSONObject();
        request.put("action", action);
        request.put("url", url);

        return request;
    }


}
