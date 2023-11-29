package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/login.feature",
                 glue = "stepDefinition",
                 monochrome = true,
                 publish = true)

public class LoginRunner extends AbstractTestNGCucumberTests{
	
	
}
