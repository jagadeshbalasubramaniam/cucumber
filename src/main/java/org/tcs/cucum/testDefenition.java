package org.tcs.cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testDefenition {
	public WebDriver driver;

	@Given("^I am on demoqa site$")
	public void i_am_on_demoqa_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jeyram\\Desktop\\New folder (5)\\cucum\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^I enter firsname and lastname$")
	public void i_enter_firsname_and_lastname() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("name_3_firstname")).sendKeys("jagadesh");
		driver.findElement(By.id("name_3_lastname")).sendKeys("balasubramaniam");
	}

	@Then("^I verifiy enter firstname and lastname$")
	public void i_verifiy_enter_firstname_and_lastname() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
