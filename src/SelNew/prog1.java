package SelNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\JAR file\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\JAR file\\New folder\\chromedriver-win32.zip\\chromedriver-win32");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		
	}

}
