					//						DAY 3
					//				*********************

package kiruthu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\intel\\eclipse-workspace\\kiruthu\\driver\\chromedriver.exe ");
			WebDriver dri = new ChromeDriver();

			dri.get("https://www.facebook.com/");

			// MAXIMAIZE
			dri.manage().window().maximize();
			
			
			//XPATH USING ATTRIBUTE
			WebElement user = dri.findElement(By.xpath("//input[@type = 'text']"));
			user.sendKeys("archanadharmalingam");
			
			WebElement pass = dri.findElement(By.xpath("//input[@type='password']"));
			pass.sendKeys("456546788");
			
			
			//XPATH USING TEXT
			WebElement text1 = dri.findElement(By.xpath("//h2[text() = 'Facebook helps you connect and share with the people in your life.']"));
			String text2 = text1.getText();
			System.out.println(text2);
			
			//XPATH USING CONTAINS
			WebElement text3 = dri.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
			String text4 = text3.getText();
			System.out.println(text4);
			
	}

}
