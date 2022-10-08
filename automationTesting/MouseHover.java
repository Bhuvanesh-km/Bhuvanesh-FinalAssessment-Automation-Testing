package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		Actions mouse=new Actions(driver);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		mouse.moveToElement(driver.findElement(By.linkText("Plugins"))).build().perform();
		Thread.sleep(1000);	
		mouse.moveToElement(driver.findElement(By.linkText("Contribute"))).build().perform();
		Thread.sleep(1000);	
		mouse.moveToElement(driver.findElement(By.linkText("Events"))).build().perform();
		Thread.sleep(1000);	
		mouse.moveToElement(driver.findElement(By.linkText("Support"))).build().perform();
		Thread.sleep(1000);	
		mouse.moveToElement(driver.findElement(By.linkText("JS Foundation"))).build().perform();
		
		

	}

}
