package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//li[contains(text(),'Item 2')]
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions mouse=new Actions(driver);
		mouse.click(driver.findElement(By.xpath("//li[contains(text(),'Item 5')]"))).build().perform();
	}

}
