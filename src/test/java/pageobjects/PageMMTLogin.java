package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import step_definitions.Hooks;

import org.openqa.selenium.WebElement;


public class PageMMTLogin{// extends BaseClass{

	public static WebDriver driver = Hooks.driver;
	
	public static WebElement FromCity() {
		return driver.findElement(By.id("hp-widget__sfrom"));
	}
	
	public static WebElement ToCity() {
		return driver.findElement(By.cssSelector("#hp-widget__sTo"));
	}

	public static WebElement DepartDate() {
		return driver.findElement(By.id("hp-widget__depart"));
	}
	
	public static WebElement ReturnDate() {
		return driver.findElement(By.id("hp-widget__return"));
	}
	
	public static WebElement RoundTrip() {
		return driver.findElement(By.xpath("//div[.='round trip']"));
	}
	
	public static WebElement Search() {
		return driver.findElement(By.id("searchBtn"));
	}
	

	public static void enterSourceCity(String sourceCity) {
		FromCity().sendKeys(sourceCity);
	}
	
	public static void enterDestinationCity(String destinationCity) {
		ToCity().sendKeys(destinationCity);
	}
	
	public static void enterDepartDate(String departDate) {
		driver = Hooks.driver;
		DepartDate().sendKeys(departDate);
	}
	
	public static void enterReturnDate(String returnDate) {
		driver = Hooks.driver;
		ReturnDate().sendKeys(returnDate);
	}
	
	public static void selectRoundTrip() {
		driver = Hooks.driver;
		RoundTrip().click();
	}
		
	
	
}
