package pageobjects;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import step_definitions.AmazonSteps;

public class amz_po_cart_page {
	public static WebDriver driver = AmazonSteps.driver;
	
	public static WebElement cart() {
		return driver.findElement(By.id("nav-cart"));
	}
	
	public static ArrayList< WebElement>products_in_cart() {
		return new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@id='sc-active-cart']//span[@class='a-list-item']/a/span")));
	}
	
	public static void navigate_to_cart() {
		cart().click();
	}
	
	public static boolean validate_item_in_cart(String item_name) {
		Iterator<WebElement> iter = products_in_cart().iterator();
		boolean locaFlag = false;
		while(iter.hasNext()) {
			WebElement item = iter.next();
			String current_item_name = item.getText();

			if(current_item_name.toLowerCase().trim().replace(" ", "").equals(item_name.toLowerCase().trim().replace(" ", ""))) {
				locaFlag = true;
				break;
			}
		}
//		System.out.println(locaFlag);
		return locaFlag;
	}
	

}
