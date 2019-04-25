package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.authentication.OAuthSignature;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", plugin = { "pretty",
		"html:target/cucumber-html-report","json:target/cucumber-json-report.json" }, glue = { "TwitterDefinations" }, tags = {})
public class RunCukesTest {

}

