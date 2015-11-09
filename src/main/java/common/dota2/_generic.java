package common.dota2;

import common.apiManager;
import common.network.Response;
import common.network.requester;
import org.json.JSONObject;

/**
 * Created by Ins on 02.11.2015.
 */
public class _generic {

    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    public static JSONObject getGeneric(String apiKey, String param) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: ");

        return new JSONObject(response.body);
    }
}
