package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import step_definitions.AmazonSteps;

public class amz_po_search_page {
	public static WebDriver driver = AmazonSteps.driver;
	
	public static WebElement item_name(String itemsName) {
		return driver.findElement(By.xpath("//h2[.='"+ itemsName +"']"));
	}
	
	public static WebElement add_to_cart() {
		return driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	}
	
	public static WebElement price_range(String price_range) {
		String [] arr_price_range = price_range.split("-");
		System.out.println("//span[contains(text(), '" + arr_price_range[0] + "') and contains(text(), '" + arr_price_range[1] + "') and @class='a-size-small a-color-base']");
		return (WebElement)By.xpath("//span[contains(text(), '" + arr_price_range[0] + "') and contains(text(), '" + arr_price_range[1] + "') and @class='a-size-small a-color-base']");
//		return driver.findElement(By.xpath("//h4[.='Price']/following-sibling::ul//span[@class='a-size-small a-color-base' and .='"+ price_range +"']"));
	}
	
	public static WebElement customer_group(String cust_group) {
		return (WebElement) By.xpath("//span[@class='a-size-small a-color-base' and .='"+ cust_group +"']");	
	}
	
	public static WebElement add_to_wishlist() {
		return (WebElement)By.id("add-to-wishlist-button-submit");
	}
	
	public static void select_item(String item_name) {
		int iter = 0;
		while(item_name(item_name).isDisplayed() && iter <5 ) {
			iter++;
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,100)", "");
		}
		
		item_name(item_name).click();
	}
	
	public static void click_add_to_cart() {
		add_to_cart().click();
	}
	
	public static void click_price_range(String price_range) {
		price_range(price_range).click();
	}
	
	public static void click_customer_group(String cust_group) {
		customer_group(cust_group).click();
	}
	
	
	
}
