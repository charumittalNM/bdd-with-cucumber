package stepdefs;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefinitions {

	public static String origin,destination;
	public static RequestSpecification request;
	public static Response reponse;


	@Given("^create call directions Google APIs$")
	public void creatingGoogleAPI(DataTable locations) throws Throwable {
		RestAssured.baseURI ="https://maps.googleapis.com/maps";
		request = RestAssured.given();
		for (Map<String, String> data : locations.asMaps(String.class, String.class)) {
			this.origin = data.get("origin");
			this.destination = data.get("destination");
		}

	}

	@When("^Hit call directions Google APIs$")
	public void hittingGoogleAPI() throws Throwable {
		 reponse = request.get("/api/directions/json?origin="+origin+"&destination="+destination+"&key=AIzaSyAc0KIo754kaMCe3tCSUq6vZ_jNBZHC_Ns");
	}

	@Then("^Verify the directions Google APIs$")
	public void verifyGoogleAPI() throws Throwable {
		System.out.println(origin+" to "+destination+"response=============="+reponse.asString());
	}

}
