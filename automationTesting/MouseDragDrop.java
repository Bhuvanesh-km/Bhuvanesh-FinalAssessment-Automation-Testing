package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/droppable/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		   Actions mouse=new Actions(driver);
		   WebElement src = driver.findElement(By.id("draggable"));
		   WebElement dest = driver.findElement(By.id("droppable"));
		  Thread.sleep(500);
		   mouse.dragAndDrop(src, dest).build().perform();
	}

}
