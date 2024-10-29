package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct102024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser_drivers\\chrome-win64\\chrome.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}
