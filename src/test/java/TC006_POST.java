import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TC006_POST {
    @Test
    public void test_01_post(){
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("name","Rezia");
        map.put("job","Housewife");
        System.out.println(map);
        JSONObject request=new JSONObject(map);
        System.out.println(request);
        System.out.println(request.toJSONString());

                given().
                    body(request.toJSONString()).
                when().
                    post("https://reqres.in/api/users").
                then().
                    statusCode(201);
         }

}
