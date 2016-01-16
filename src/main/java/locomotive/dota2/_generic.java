package locomotive.dota2;

import locomotive.apiManager;
import org.json.JSONObject;

/**
 * Created by Ins on 02.11.2015.
 */
public class _generic {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    static String[] JSONGetTemplate = {"url"};
    static String[] JSONPostTemplate = {"url", "body"};

    public static JSONObject getGeneric(String apiKey, String param) {
        String action = "send generic request to api";

        String methodGroup = "";
        String method = "";
        String version = "";

        String url = apiBase +
                methodGroup + "/" +
                method + "/" +
                version + "/?" +
                "key=" + apiKey +
                "&format=" + format +
                "&param=" + param;

        JSONObject request = new JSONObject();
        request.put("url", url);

        return request;
    }
}
