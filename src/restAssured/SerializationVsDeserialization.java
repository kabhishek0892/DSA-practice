package restAssured;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.restassured.RestAssured;

import java.io.File;

import static io.restassured.RestAssured.*;

public class SerializationVsDeserialization {

    public static void main(String[] args) {
       /* RestAssured.baseURI="https://reqres.in/api/";
        given().when().get("unknown/2").then().extract().response().toString();
*/
        /*String response1= given().basePath("https://dummy.restapiexample.com/api/").when().get("v1/employee/426").then().extract().response().toString();
        System.out.println(response1);*/
        try {

            //Serialization
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("renault", "red","alloy");
            objectMapper.writeValue(new File("target/car.json"), car);
            String x= objectMapper.writeValueAsString(car);
            
            System.out.println(x);

            //Deserialization -- String to JSON
           // Car car1= objectMapper.readValue(x,Car.class);
            JsonNode jsonNode = objectMapper.readTree(x);
            String benz =jsonNode.get("brand").asText();
            benz = "benzamin";

            objectMapper.writeValue(new File("target/car_new.json"),car);
/*          To compare json
            JsonNode actualObj1 = mapper.readTree(s1);
            JsonNode actualObj2 = mapper.readTree(s2);

            assertNotEquals(actualObj1, actualObj2);*/







        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
