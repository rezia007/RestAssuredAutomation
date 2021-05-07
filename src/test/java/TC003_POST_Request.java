import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class TC003_POST_Request {

    @Test
    public void post_request() {
        JSONObject request = new JSONObject();
        request.put("firstName", "Tomy");
        request.put("lasName", "Casper");
        request.put("subjectID", 1);

        baseURI = "http://localhost:3000/";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("/users").
                then().
                statusCode(201).log().all();
    }
}
