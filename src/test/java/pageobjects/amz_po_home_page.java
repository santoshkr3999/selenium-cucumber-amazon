package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import step_definitions.AmazonSteps;

public class amz_po_home_page {
	public static WebDriver driver = AmazonSteps.driver;
	
	public static WebElement search_text_field() {
		return driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	}
	
	public static WebElement search_btn() {
		return driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
	}
	
	public static void enter_text_in_search(String item) {
		search_text_field().sendKeys(item);
	}
	
	public static void click_search_btn() {
		search_btn().click();
	}
}
