package pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import step_definitions.AmazonSteps;

public class amz_po_common {
	public static WebDriver driver = AmazonSteps.driver;
	
	public static void switchToNewTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println("tabs.size()" + tabs.size());
		driver.switchTo().window(tabs.get(tabs.size() - 1));
	}

}
