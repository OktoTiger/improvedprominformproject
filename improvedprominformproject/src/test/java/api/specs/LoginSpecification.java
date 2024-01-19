package api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;

public class LoginSpecification {
    public static RequestSpecification loginRequestSpec = with()
            .filter(withCustomTemplates())
            .contentType(ContentType.JSON)
            .log().uri()
            .log().headers()
            .log().body()
            .baseUri("http://172.16.3.98:1313");

    public static ResponseSpecification loginResponseSpecOK200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .build();

    public static ResponseSpecification loginResponseSpecUnauthorized401 = new ResponseSpecBuilder()
            .expectStatusCode(401)
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .build();

}
