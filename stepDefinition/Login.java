package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Login {
	
	public RemoteWebDriver driver;
	
	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Enter the UserName as {string}")
	public void uName(String usrName) {
		driver.findElement(By.id("username")).sendKeys(usrName);
	}
	@And("Enter the pwd as {string}")
	public void pwd(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on the LoginButton")
	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login success")
	public void confirmlogin() {
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Successfully Login. Title Verified.");
		}else {
			System.out.println("Login Failed");
		}
	}
	@When("Click on the crmsfa link")
	public void crmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("CloseDriver")
	public void driverClose() {
		driver.close();
	}

}
