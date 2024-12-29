package ObjectMapperExample;
//commenting code as this ObjectMapper available with Spring dependency with JDK we canit import this
//import com.fasterxml.jackson.databind.ObjectMapper;
public class Test {
    public static void main(String[] args) {
        // Create an ObjectMapper instance
      /*  ObjectMapper objectMapper = new ObjectMapper();

        // Convert Java object to JSON
        Person person = new Person("John", 30);
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json); // Output: {"name":"John","age":30}

        // Convert JSON to Java object
        String jsonInput = "{\"name\":\"Jane\",\"age\":25}";
        Person personFromJson = objectMapper.readValue(jsonInput, Person.class);
        System.out.println(personFromJson.getName()); */// Output: Jane
    }
}
