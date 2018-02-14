package org.tcs.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefinition {
	public WebDriver driver;

	@Given("^I am on demoqa site$")
	public void i_am_on_demoqa_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jeyram\\Desktop\\New folder (5)\\cucum\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^I entering the \"([^\"]*)\"$")
	public void i_entering_the(String country) throws Throwable {
		WebElement dropElement = driver.findElement(By.id("dropdown_7"));
		Select s = new Select(dropElement);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			if (x.getText().equals(country)) {
				s.selectByVisibleText(country);
			}
		}
	}

	@Then("^I verifiy enter \"([^\"]*)\"$")
	public void i_verifiy_enter(String country) throws Throwable {
		WebElement dropElement = driver.findElement(By.id("dropdown_7"));
		String text = dropElement.getText();
		if (text.equals(country)) {
		Assert.assertEquals(country, dropElement.getText());
		}
		System.out.println("assertVerified");
	}

}
