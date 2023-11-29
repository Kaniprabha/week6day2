package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;

public class w3schoolStep{
	
	public static RemoteWebDriver driver;
	
	@Given("Launch the Browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("Load w3Url")
	public void w3url() {
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	}
	@When("Given the frame")
	public void frame() {
		WebElement framew3 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 driver.switchTo().frame(framew3);
	}
	@Given("Given the fName as (.*)$")
	public void fname(String Name) {
		 driver.findElement(By.id("fname")).sendKeys(Name);
	}
	@And("Given the Email as (.*)$")
	public void schEmail(String Mail) {
		driver.findElement(By.id("email")).sendKeys(Mail);
	}
	@And("Given the Address as (.*)$")
	public void address(String Address) {
		driver.findElement(By.id("adr")).sendKeys(Address);
	}
	@And("Given the City as (.*)$")
	public void city(String city) {
		driver.findElement(By.id("city")).sendKeys(city);
	}
	@And("Given the State as (.*)$")
	public void state(String state) {
		driver.findElement(By.id("state")).sendKeys(state);
	}
	@And("Given the Zip as (.*)$")
	public void zip(String zip) {
		 driver.findElement(By.id("zip")).sendKeys(zip);
	}
	@And("Given the ExYear as (.*)$")
	public void exyear(String year) {
		driver.findElement(By.id("expyear")).sendKeys(year);
	}
	@And("Given the CVV as (.*)$")
	public void cvv(String CVV) {
		 driver.findElement(By.id("cvv")).sendKeys(CVV);
	}
	@And("Given the ExMonth as (.*)$")
	public void exMonth(String month) {
		 driver.findElement(By.id("expmonth")).sendKeys(month);
	}
	@And("Given the CreditNumber as (.*)$")
	public void cdtNum(String creNum) {
		driver.findElement(By.id("ccnum")).sendKeys(creNum);
	}
	@And("Given the CreditName as (.*)$")
	public void cdtName(String cardName) {
		driver.findElement(By.id("cname")).sendKeys(cardName);
		System.out.println("Registration on the W3Schools Portal: Registration Completed.");
	}
	@Then("Then Close the browser")
	public void closeDriver() {
		driver.close();
	}


}
