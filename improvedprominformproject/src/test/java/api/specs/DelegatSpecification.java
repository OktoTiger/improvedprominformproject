package api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static tests.LoginTest.accessToken;

public class DelegatSpecification {
    public static RequestSpecification delegateRequestSpec = with()
            .filter(withCustomTemplates())
            .header("Authorization", "Bearer " + accessToken)
            .log().uri()
            .log().headers()
            .log().body()
            .contentType(ContentType.JSON)
            .baseUri("http://172.16.3.98:1313");


    public static ResponseSpecification delegateResponseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.STATUS)
            .log(LogDetail.BODY)
            .build();
}
