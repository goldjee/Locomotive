package common.dota2;

import common.VDF;
import common.apiManager;
import common.network.Response;
import common.network.requester;
import org.json.JSONObject;

/**
 * Created by Ins on 08.11.2015.
 */
public class itemAPI {
    static String apiBase = apiManager.apiBase;
    static String format = apiManager.format;

    public static JSONObject getPlayerItems(String apiKey, long steamID) throws Exception {
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
//        System.out.println(url);
        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: ");

        return new JSONObject(response.body);
    }

    public static JSONObject getSchemaURL(String apiKey) throws Exception {
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

        Response response = requester.sendGet(url);
        // handle response statuses
        if (!response.status.equals("200"))
            throw new Exception("Failed to " + action + ". Reason: ");

        return new JSONObject(response.body);
    }

    public static JSONObject getSchema(String URL) throws Exception {
        String action = "get schema contents";

        Response response = requester.sendGet(URL);

        JSONObject schema = VDF.toJSONObject(response.body, true);

        return schema;
    }
}
