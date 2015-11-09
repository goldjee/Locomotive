package common.network;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

import java.util.List;

/**
 * Created by Ins on 02.11.2015.
 */
public class requester {

    public static Response sendGet(String targetURI, List<String[]> headers) throws Exception {
        GetRequest a = Unirest.get(targetURI);

        if (headers.size() > 0) {
            for (String[] h : headers)
                a.header(h[0], h[1]);
        }

        HttpResponse<String> response = a.asString();
        return new Response(String.valueOf(response.getStatus()), response.getBody());
    }
    public static Response sendGet(String targetURI) throws Exception {
        GetRequest a = Unirest.get(targetURI);

        HttpResponse<String> response = a.asString();
        return new Response(String.valueOf(response.getStatus()), response.getBody());
    }

    public Response sendPost(String targetURI, String postString, List<String[]> headers) throws Exception {
        HttpRequestWithBody a = Unirest.post(targetURI);

        if (headers.size() > 0) {
            for (String[] h : headers)
                a.header(h[0], h[1]);
        }
        a.body(postString);

        HttpResponse<String> response = a.asString();
        return new Response(String.valueOf(response.getStatus()), response.getBody());
    }
    public Response sendPost(String targetURI, String postString) throws Exception {
        HttpRequestWithBody a = Unirest.post(targetURI);
        a.body(postString);

        HttpResponse<String> response = a.asString();
        return new Response(String.valueOf(response.getStatus()), response.getBody());
    }
}
