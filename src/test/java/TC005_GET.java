import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TC005_GET {
        @Test
        public void testcase_1_get(){
given().
        get("https://reqres.in/api/users?page=2").
 then().
        statusCode(200).
        body("data.id[1]",equalTo(8)).
        log().all();
        }
}
