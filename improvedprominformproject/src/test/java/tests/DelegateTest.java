package tests;

import api.model.DelegateRequestBodyModel;
import api.model.DelegateResponseBodyModel;
import helpers.WriteObject;
import org.junit.jupiter.api.*;

import static api.specs.DelegatSpecification.delegateRequestSpec;
import static api.specs.DelegatSpecification.delegateResponseSpec;
import static helpers.ReadObject.readIdInDelegateObject;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.class)
public class DelegateTest {

    LoginTest login = new LoginTest();

    @BeforeEach
    void beforeEach() {
        login.successfulLogin();
    }

    @Test
    @Order(1)
    void createDelegateTest() {
        DelegateRequestBodyModel newDelegate = DelegateRequestBodyModel.builder()
                .setFirstName("Аластер")
                .setLastName("Грюм")
                .setMiddleName("Грозный глаз")
                .setShortFio("Грюммм")
                .setPalateId(12)
                .setFractionId(102)
                .build();

        DelegateResponseBodyModel delegateResponse = given(delegateRequestSpec)
                .body(newDelegate)

            .when()
                .post("/api/delegate")

            .then()
                .spec(delegateResponseSpec)
                .extract().as(DelegateResponseBodyModel.class);

        WriteObject.writeObject(delegateResponse);
        System.out.println(delegateResponse.getIdd());
        assertThat("Аластер").isEqualTo(delegateResponse.getFirstName());
    }

    @Test
    @Order(3)
    void deleteDelegateTest() {
        given(delegateRequestSpec)
            .when()
                .delete(String.format("/api/delegate/%d", readIdInDelegateObject()))

            .then()
                .spec(delegateResponseSpec);

    }

    @Test
    @Order(2)
    void editDelegate() {
        DelegateRequestBodyModel editDelegete = DelegateRequestBodyModel.builder()
                .setFirstName("Гэндальф")
                .setLastName("Серый")
                .setShortFio("Гэндальф С.В.")
                .setPalateId(113)
                .setId(936)
                .setIdd(797)
                .build();

        DelegateResponseBodyModel editedDelegatResponse = given(delegateRequestSpec)
                .body(editDelegete)
            .when()
                .put("/api/delegate")
            .then()
                .spec(delegateResponseSpec)
                .extract().as(DelegateResponseBodyModel.class);

        assertThat("Серый").isEqualTo(editedDelegatResponse.getLastName());

    }
}
