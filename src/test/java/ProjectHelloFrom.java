import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class ProjectHelloFrom {
    @Test
    public void testHellFrom() {
        System.out.println("Hello from Evgenia");
    }

    @Test
    public void testText() {
        Response response = RestAssured.get("https://playground.learnqa.ru/api/get_text").andReturn();
        response.prettyPrint();
    }
}