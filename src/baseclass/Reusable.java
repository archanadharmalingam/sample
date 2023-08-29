package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {
static WebDriver driver;
	
		public static void browserlaunch() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://web.whatsapp.com/");
			
	}
		
		public static void maximaize() {
		driver.manage().window().maximize();
		}
		
		public static void printurl() {
			System.out.println(driver.getCurrentUrl());
		}
		
		public static void gettitle() {
			System.out.println(driver.getTitle());
		}
		
		

}
