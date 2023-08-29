package kiruthu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ele2.click();
		Thread.sleep(3000);
		
		
		Alert two = driver.switchTo().alert();
		two.accept();			
	}

}
