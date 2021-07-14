package restAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.testng.annotations.Test;

public class JaksonUtility {

    @Test
    void editJsonOntheFly() throws JsonProcessingException {
        String jsonObject = "{\r\n" +
                "  \"firstname\": \"Amod\",\r\n" +
                "  \"lastname\": \"Mahajan\"\r\n" +
                "}";

        // Creating an instance of ObjectMapper class
        ObjectMapper objectMapper = new ObjectMapper();
        // Get ObjectNode representation of json as json is an Object
        ObjectNode objectNode = objectMapper.readValue(jsonObject, ObjectNode.class);
        objectNode.put("role","admin");
        objectNode.put("firstname","Abhishek");

        ObjectNode address = objectMapper.createObjectNode();
        address.put("street","Lane1");
        address.put("road","Road1");
        objectNode.set("address",address);
        System.out.println(objectNode.toPrettyString());
    }
}
