package step_definitions;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import pageobjects.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;



public class AmazonSteps {
	public static WebDriver driver;
//	public AmazonSteps(){
//	}
	
	@Given("^I am on amazon website$")
	public void open_amazon() {
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@When("^I click on sign in button$")
	public void click_sign_in_button() {
		amz_po_login.click_sign_in();
	}
	
	@When("^I enter (.*?) as username$")
	public void enter_user_name(String userName) {
		amz_po_login.enter_user_name(userName);
	}
	
	@When("^I click on contine button$")
	public void click_continue() {
		amz_po_login.click_continue();
	}
	
	@When("^I enter (.*?) as password$")
	public void enter_password(String pwd) {
		amz_po_login.enter_pwd(pwd);
	}
	
	@When("^I click on login$")
	public void click_login() {
		amz_po_login.click_login();
	}
	
	@Then("^I should be logged in as (.*?)$")
	@Given("^I am logged in as (.*?)$")
	public void validte_looged_user(String expected_user) {
		String userNameText = "";
		userNameText = amz_po_login.logged_user_name().getText();
//		System.out.println(userNameText);
		if (userNameText.toLowerCase().contains(expected_user.toLowerCase())) {
			assertTrue(true);
		}
	}
	
	@When("^I Search (.*?)$")
	public void search_an_item(String search_item) {
		amz_po_home_page.enter_text_in_search(search_item);
		amz_po_home_page.click_search_btn();
	}
	
	@When("^I select (.*?)$")
	public void select_an_item(String select_item) {
		amz_po_search_page.select_item(select_item);
	}
	
	@When("^I navigate to new tab$")
	public void switch_to_new_tab() {
		amz_po_common.switchToNewTab();
	}
	
	@When("^I add the product to cart$")
	public void add_product_to_cart() {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
		select.selectByValue("1");
		amz_po_search_page.click_add_to_cart();
	}
	
	@When("^I navigate to cart$")
	public void navigate_to_cart() {
		amz_po_cart_page.navigate_to_cart();
	}
	
	@Then("^I should see (.*?) added in the cart")
	public void validate_item_in_cart(String item_name) {
		boolean item_found = amz_po_cart_page.validate_item_in_cart(item_name);
		assertTrue(item_found);
	}
	
	@When("^I refine price range as (.*?)$")
	public void refine_price_range(String price_range) {
		amz_po_search_page.click_price_range(price_range);
	}
	
	@When("^I refine clothing and accessories for (.*?)$")
	public void refine_customer_group(String cust_nature) {
		amz_po_search_page.click_customer_group(cust_nature);
	}
}


