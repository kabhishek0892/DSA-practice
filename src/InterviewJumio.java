import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

public class InterviewJumio {

    public static void main(String[] args) {


        RestAssured.baseURI = "https://reqres.in/api/";

   String s  =RestAssured.
                given().baseUri("https://reqres.in/api/users").queryParam("page",2)
               .when().get().asPrettyString();

      JsonPath jp = new JsonPath(s);
    }
}


