package restAssured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ObjectMapperDemo {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode node =objectMapper.createArrayNode();

        ObjectNode map = objectMapper.createObjectNode();
        map.put("name","Abhishek");
        map.put("phoneNumber","2475147");
        map.put("email","abc@gmail.com");

        ObjectNode childmap = objectMapper.createObjectNode();
        childmap.put("address1","White House");
        childmap.put("city","Gaya");

        map.set("address",childmap);

        //map.remove("phoneNumber");
        map.put("email","xyz@gmail.com");
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        System.out.println(json);
    }
}
