package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Mouse;

import step_definitions.AmazonSteps;
//import step_definitions.Hooks;

public class amz_po_login {
	public static WebDriver driver = AmazonSteps.driver;

	public static WebElement menu_list() {
		return driver.findElement(By.xpath("//span[@class='nav-line-2' and .='Your Orders']"));
	}

	public static WebElement sign_in() {
		return driver.findElement(
				By.xpath("//div[@id='nav-flyout-yourAccount']//span[@class='nav-action-inner' and .='Sign in']"));
	}

	public static WebElement user_name() {
		return driver.findElement(By.id("ap_email"));
	}

	public static WebElement cotinue() {
		return driver.findElement(By.cssSelector("input#continue"));
	}

	public static WebElement password() {
		return driver.findElement(By.cssSelector("input#ap_password"));
	}

	public static WebElement login() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public static WebElement logged_user_name() {
		return driver.findElement(By.cssSelector("a#nav-link-yourAccount span.nav-line-1"));
	}

	public static void click_menu_list() {
		Actions actions = new Actions(driver);
		actions.moveToElement(menu_list()).build().perform();
	}

	public static void click_sign_in() {
		click_menu_list();
		sign_in().click();
	}

	public static void enter_user_name(String userName) {
		user_name().sendKeys(userName);
	}

	public static void click_continue() {
		cotinue().click();
	}

	public static void enter_pwd(String pwd) {
		password().sendKeys(pwd);
	}

	public static void click_login() {
		login().click();
	}
	
}
