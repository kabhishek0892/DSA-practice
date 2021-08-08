package restAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class IMDBAPiDemo {

    @Test
    void hitGetRequest(){

        RequestSpecification reqSpec = new RequestSpecBuilder()
       .setBaseUri("http://www.omdbapi.com/")
        .addQueryParam("s", "Harry Potter").
                        addQueryParam("apikey", "b1983733")
       .build();
        Response res1= reqSpec.get();
        System.out.println(res1.asString());
        System.out.println("======================");
    }

    @Test
    void hitGetRequestGiven() {
        given().when().get("http://www.omdbapi.com/?s=Harry Potter&apikey=b1983733").prettyPrint();
    }

    @Test
    public void queryParameter() {

        RestAssured.baseURI ="http://www.omdbapi.com/";
        RequestSpecification request = RestAssured.given();

        Response response = request.queryParam("s", "Harry Potter")
                .queryParam("apikey", "b1983733")
                .get();

        String jsonString = response.asString();
        System.out.println(jsonString);
        }

    }


