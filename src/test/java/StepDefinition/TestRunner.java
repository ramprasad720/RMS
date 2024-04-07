package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"StepDefinition"},
plugin = {"pretty","html:target/HtmlReports/Htmlreports.html",
		"pretty","json:target/JsonReports/Jsonreports.json",
		"pretty","junit:target/XmlReports/Jsonreports.xml"},
tags="@Smoketest")

public class TestRunner {

}
