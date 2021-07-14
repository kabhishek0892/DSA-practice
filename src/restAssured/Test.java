package restAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.client.methods.RequestBuilder;

import java.util.List;

import static io.restassured.RestAssured.*;

public class Test {

    public static void main(String[] args) {
        RestAssured.get();
//       RestAssured.baseURI="https://api.github.com/users";
//        RestAssured. basePath="mojombo";
//
////    RequestSpecification requestSpecification = null;
////        requestSpecification.basePath("mojombo");
////        requestSpecification.baseUri("https://api.github.com/users");
//      Response response = get();
//      response.prettyPrint();
Response response = (Response) given().when().get().then();
        Response respo =given().
                when().
                get("https://jsonplaceholder.typicode.com/users").
                then()
                .extract()
                .response();


        JsonPath jpath = new JsonPath(respo.asString());
       List<String> l = respo.jsonPath().getList("username");

        System.out.println(respo.getStatusLine());

        System.out.println("Response time is " );

        given().
                baseUri("https://api.github.com/users").
                when().
                get("/mojombo").
                then().
                assertThat()
                .statusCode(200).
                and().
                body("id", equalTo(1));
        ;
given().

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON).
                and().
                header("Content-Length", equalTo("4551"));


        long time = given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then()
                .extract()
                .response()
                .time();
        System.out.println("Response time is " +time);

//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode tree1 = mapper.readTree(response.asString());
//        JsonNode tree2 = mapper.readTree(jsonFileData);
//        Assert.assertTrue(tree1.equals(tree2));
//

        ResponseSpecification checkStatusCodeAndContentType =
                new ResponseSpecBuilder().
                        expectStatusCode(200).
                        expectContentType(ContentType.JSON).
                        build();

//        RequestSpecification requestSpecification = new RequestBuilder().addHeader("Header1","header1").()
//
//        String s1 = "{ \"employee\": { \"id\": \"1212\", \"fullName\": \"John Miles\",
//    \"age\": 34 } }";
//        String s2 = "{ \"employee\": { \"id\": \"1212\", \"age\": 34, \"fullName\": \"John
//        Miles\" } }";
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode s1Json = mapper.readTree(s1);
//        JsonNode s2Json = mapper.readTree(s2);
//        System.out.println(s1Json.equals(s2Json));
//

        // Creating an object of RequestSpecBuilder
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        // Setting Base URI
        reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
        // Setting Base Path
        reqBuilder.setBasePath("/booking");

        // Getting RequestSpecification reference using builder() method
        RequestSpecification reqSpec = reqBuilder.build();

        // Usage in different styles
        // We can directly call http verbs on RequestSpecification
        Response res1= reqSpec.get();
        System.out.println(res1.asString());
        System.out.println("======================");

        // We can also pass RequestSpecification reference variable in overloaded given() method
        Response res2 = RestAssured.given(reqSpec).get();
        System.out.println(res2.asString());
        System.out.println("======================");

        // We can also pass RequestSpecification using spec() method
        Response res3 = RestAssured.given().spec(reqSpec).get();
        System.out.println(res3.asString());
    }

}
