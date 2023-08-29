
 				//								DAY 5
 				//							*************



package kiruthu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\intel\\eclipse-workspace\\kiruthu\\driver\\chromedriver.exe ");
		WebDriver dri = new ChromeDriver();

		dri.get("https://www.amazon.in/");
		
		WebElement mob = dri.findElement(By.xpath("//a[text()='Mobiles'] "));
		
		//ACTIONS CLASS
		Actions ac = new Actions(dri);

		
		//MOVE TO ELEMENT
		ac.moveToElement(mob).perform();
		
		
/*		//CONTEXTCLICK(RIGHT CLICK)
		ac.contextClick().perform();  
		
		 
		//DRAG AND DROP
		
		dri.get("https://demoqa.com/droppable");
		
		WebElement drag = dri.findElement(By.id("draggable"));
		WebElement drop = dri.findElement(By.id("droppable"));
		
		Actions ac = new Actions(dri);
		
		ac.dragAndDrop(drag, drop).perform();       
		
		
		//DOUBLE CLICK
		
		dri.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement one = dri.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement  two = dri.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions ac = new Actions(dri);
		
		ac.doubleClick(one).perform();
		ac.contextClick(two).perform();
		
	
*/
}
}