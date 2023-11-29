package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class RedHat{
	
	public static RemoteWebDriver driver;
	
	@Given("LaunchChrome")
	public void Chrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Then("Load the redhatUrl")
	public void redhatUrl() {
		driver.get("https://sso.redhat.com/");
	}
	@When("Click the Notification")
	public void cross() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("truste-consent-button")).click();
	}
	@And("Click Registration Link")
	public void register() {
		driver.findElement(By.id("rh-registration-link")).click();
	}
	@Given("redhat UserName as (.*)$")
	public void redhatUname(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@And("redhat Password as (.*)$")
	public void redhatPwd(String pwd){
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@And("redhat Email as (.*)$")
	public void redhatEmail(String Email) {
		driver.findElement(By.id("email")).sendKeys(Email);
	}
	@And("redhat phNum as (.*)$")
	public void redhatPhnum(String phNum) {
		driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(phNum);
	}
	@Then("Then Close the chrome")
	public void closeChrome() {
		driver.close();
	}

}
