import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.json.JSONArray;
import org.json.JSONObject;


public class elasticRestClientSql {
    public static void main(String[] args) throws IOException {

        RestClient restClient = RestClient.builder(
                new HttpHost("localhost", 9200, "http")).build();

        Request request = new Request("POST",  "/_sql");
        request.setJsonEntity("{\"query\":\"SELECT *, data.SEX FROM pmst WHERE method = 'Populate'\"}");
        Response response = restClient.performRequest(request);
        String responseBody = EntityUtils.toString(response.getEntity());
        JSONObject obj = new JSONObject(response);
        //System.out.println(obj);
        System.out.println(responseBody);
        System.out.println(responseBody);
        restClient.close();
    }
}
