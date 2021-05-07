import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class TC003_GET_Request {
    @BeforeSuite
    void setUp(){
        System.out.println("Setup");
    }

    @Test
    public void get_request(){
        baseURI="http://localhost:3000/";
        given().
                param("name","Java").
                get("/subjects").
                then().
                statusCode(200).log().all();
    }

    @AfterSuite
    void tearDown(){
        System.out.println("TearDpown");
    }


}
