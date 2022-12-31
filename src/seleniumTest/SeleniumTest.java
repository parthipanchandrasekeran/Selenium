package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	WebDriver driver;

	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.get("https://google.com");

		System.out.println("Launch Browser Ran");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SeleniumTest obj = new SeleniumTest();
		obj.launchBrowser();

	}

}
