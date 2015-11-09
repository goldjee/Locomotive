package common.network;

/**
 * Created by Ins on 02.11.2015.
 */
public class Response {

    public String status;
    public String body;

    public Response(String status, String body) {
        this.status = status;
        this.body = body;
    }
}
