package Tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class loginTests extends BaseTest {
	
	@Test
	public void loginTest() {
		RestAssured.baseURI = "https://vmos2.vmos-demo.com/";
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject j = new JSONObject();
		j.put("email","nnkpiyush@gmail.com");
		j.put("password", "piyush123");
		req.body(j.toJSONString());
		
		Response res  = req.post("user/v1/auth");
		int statusCode  = res.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		System.out.println(res.asString());
		
	}

}
