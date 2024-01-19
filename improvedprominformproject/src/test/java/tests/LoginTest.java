package tests;

import api.model.LoginRequestBody;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static api.specs.LoginSpecification.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class LoginTest {

    public static String accessToken;

    @Test
    void successfulLogin() {
        LoginRequestBody authData = new LoginRequestBody();
        authData.setArmType("DELEGAT")
                .setLogin("0")
                .setPassword("321")
                .setUid("423979A3-50E4-48CD-9FB3-BC6DED03A37E");

        Response response = (Response) given(loginRequestSpec)
                .body(authData)

            .when()
                .post("http://172.16.3.98:1313/api/common/auth")
            .then()
                .spec(loginResponseSpecOK200);

        accessToken = response.body().asString();
        System.out.println("Это токен " + accessToken);
    }


    @Test
    void unSuccessfulLoginTest() {
        LoginRequestBody authData = new LoginRequestBody();
        authData.setArmType("DELEGAT")
                .setLogin("0")
                .setPassword("32")
                .setUid("423979A3-50E4-48CD-9FB3-BC6DED03A37E");

            given(loginRequestSpec)
                .body(authData)

            .when()
                .post("/api/common/auth")
            .then()
                .spec(loginResponseSpecUnauthorized401)
                .body("errorMessage", is("Некорректные учетные данные"));
    }


}
