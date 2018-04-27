package step_definitions;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import pageobjects.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import cucumber.api.java.en.*;

public class StepMMTEndToEnd{
	public WebDriver driver;
	
	public StepMMTEndToEnd(){
		driver = Hooks.driver;
	}
	
	@Given("^User launches MMT$")
	public void user_launches_mmt() {
		driver.get("https://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@When("^User enters (.*?) as source city$")
	public void user_enters_source_city(String sourceCity) {
		PageMMTLogin.enterSourceCity(sourceCity);
	}
	
	@When("^User enters (.*?) as destination city$")
	public void user_enters_destination_city(String destinationCity) {
		PageMMTLogin.enterDestinationCity(destinationCity);
	}
	
	@When("^User selects Round Trip$")//User enters (.*?) as departure date$")
	public void user_selects_round_trip() {
		PageMMTLogin.selectRoundTrip();
	}
	
	@When("^User enters (.*?) as departure date$")
	public void user_enters_depart_date(String departureDate) {
		PageMMTLogin.enterDepartDate(departureDate);
	}
	
	@When("^User enters (.*?) as return date$")
	public void user_enters_retur_date(String returnDate) {
		PageMMTLogin.enterReturnDate(returnDate);
	}
			
	@When("User clicks on search button$")
	public void user_clicks_search_buttom() {
		PageMMTLogin.Search().click();
	}
	
	@When("^User waits for (.*?) seconds$")
	public void user_waits(int waitTime) {
//		driver.findElement(By.xpath(""));
	}
	
	@Then("^User should be able to see flight list$")
	public boolean flight_list_displayed() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = null;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		boolean elementDisplayed = element.isDisplayed();
		assertTrue(elementDisplayed);
		
		return true;
	}
	

}
