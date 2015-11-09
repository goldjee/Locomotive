package common;

import common.network.Response;
import common.network.requester;

/**
 * Created by Ins on 02.11.2015.
 */
public class apiManager {

    public static String apiBase = "https://api.steampowered.com/";
    public static String format = "json";

    // Generic method reference
    public static String getGeneric(String apiKey, String param) throws Exception {
        String action = "send _generic request to api";

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

        return response.body;
    }
}
