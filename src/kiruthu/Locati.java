				//							DAY 1 & 2
				//					**************************

package kiruthu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locati {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\intel\\eclipse-workspace\\kiruthu\\driver\\chromedriver.exe ");
		WebDriver dri = new ChromeDriver();

		dri.get("https://www.facebook.com/");

		// MAXIMAIZE
		dri.manage().window().maximize();

		// GET TITLE
		String title = dri.getTitle();
		System.out.println(title);

		// PRINT CURRENT URL
		String currentUrl = dri.getCurrentUrl();
		System.out.println(currentUrl);

		// SEND VALUE
/*		WebElement username = dri.findElement(By.id("email"));
		username.sendKeys("archanadharmaligam");

		WebElement password = dri.findElement(By.id("pass"));
		password.sendKeys("234567ybu");

		WebElement button = dri.findElement(By.name("login"));
		button.click();

		// SLEEP
		Thread.sleep(3000);

		// CLOSE THE BROWSER
		dri.quit();*/

	}
}
