package com.demo.inditex.demoinditex;

import org.hamcrest.Matchers;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static com.demo.inditex.demoinditex.TestConstants.*;

public class PreciosControllerTest extends RestAssuredBase {

    private JSONObject requestJson;
    @Test
    public void test1Ok() throws JSONException {
        requestJson = new JSONObject();
        requestJson.put(FECHA_APLICACION, "2020-06-14T10:00:00");
        requestJson.put(PRODUCT_ID, "35455");
        requestJson.put(BRAND_ID, "1");

        request.body(requestJson.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(START_DATE, Matchers.hasItem("2020-06-14T00:00:00"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"));
    }

    @Test
    public void test2Ok() throws JSONException {
        requestJson = new JSONObject();
        requestJson.put(FECHA_APLICACION, "2020-06-14T16:00:00");
        requestJson.put(PRODUCT_ID, "35455");
        requestJson.put(BRAND_ID, "1");

        request.body(requestJson.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(START_DATE, Matchers.hasItem("2020-06-14T00:00:00"))
                .body(START_DATE, Matchers.hasItem("2020-06-14T15:00:00"))
                .body(START_DATE, Matchers.hasItem("2020-06-14T15:00:00"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"))
                .body(END_DATE, Matchers.hasItem("2020-06-14T18:30:00"))
                .body(END_DATE, Matchers.hasItem("2020-06-15T11:00:00"));
    }

    @Test
    public void test3Ok() throws JSONException {
        requestJson = new JSONObject();
        requestJson.put(FECHA_APLICACION, "2020-06-14T21:00:00");
        requestJson.put(PRODUCT_ID, "35455");
        requestJson.put(BRAND_ID, "1");

        request.body(requestJson.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(START_DATE, Matchers.hasItem("2020-06-14T00:00:00"))
                .body(START_DATE, Matchers.hasItem("2020-06-14T15:00:00"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"))
                .body(END_DATE, Matchers.hasItem("2020-06-15T11:00:00"));
    }

    @Test
    public void test4Ok() throws JSONException {
        requestJson = new JSONObject();
        requestJson.put(FECHA_APLICACION, "2020-06-15T10:00:00");
        requestJson.put(PRODUCT_ID, "35455");
        requestJson.put(BRAND_ID, "1");

        request.body(requestJson.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(START_DATE, Matchers.hasItem("2020-06-14T00:00:00"))
                .body(START_DATE, Matchers.hasItem("2020-06-14T15:00:00"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"))
                .body(END_DATE, Matchers.hasItem("2020-06-15T11:00:00"));
    }

    @Test
    public void test5Ok() throws JSONException {
        requestJson = new JSONObject();
        requestJson.put(FECHA_APLICACION, "2020-06-16T21:00:00");
        requestJson.put(PRODUCT_ID, "35455");
        requestJson.put(BRAND_ID, "1");

        request.body(requestJson.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(START_DATE, Matchers.hasItem("2020-06-14T00:00:00"))
                .body(START_DATE, Matchers.hasItem("2020-06-15T16:00:00"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"))
                .body(END_DATE, Matchers.hasItem("2020-12-31T23:59:59"));
    }
}
