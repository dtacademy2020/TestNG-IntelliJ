package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
private static WebDriver driver ;
	
	
	private Driver() {};
	
	
	public   static WebDriver getDriver() {

		if(driver == null) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
				

		
		return driver;
		
				
		
	}
	
	

	
	
	
	public  static void quit() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		
	}
	
	
	
	
	

}
