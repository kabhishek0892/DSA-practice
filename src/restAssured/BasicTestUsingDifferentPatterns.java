package restAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicTestUsingDifferentPatterns {

    @Test
    void withOutBDDStyle()
    {
        RequestSpecification request =RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com/booking");
        Response response =request.get();
        System.out.println(response.asPrettyString());
    }

    @Test
    void withBDDStyle(){
       Response response = given().baseUri("https://restful-booker.herokuapp.com/booking")
                                    .when().get()
                                    .then()
                                    .extract().
                                     response();
    }

}
