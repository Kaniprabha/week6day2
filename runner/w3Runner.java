package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
                 glue = "stepDefinition",
                 monochrome = true,
                 publish = true,
                 tags ="@school")

public class w3Runner extends AbstractTestNGCucumberTests{
	
	
}
