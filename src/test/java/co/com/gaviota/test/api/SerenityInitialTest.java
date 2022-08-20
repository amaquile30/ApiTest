package co.com.gaviota.test.api;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SerenityInitialTest {

    private static final String REST_API_URL = "https://reqres.in/api";

    @Test
    public void getUsers(){
        Actor ana = Actor.named("Ana María").whoCan(CallAnApi.at(REST_API_URL));

        ana.attemptsTo(Get.resource("/users?page=2"));

        Assert.assertEquals(HttpStatus.SC_OK, SerenityRest.lastResponse().statusCode());
    }
}
