package automationTesting;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HrmMethodOverloading {
	WebDriver driver = null;
	@Test
    public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
    }
	
	@Test
    public void testCase2() throws InterruptedException {
		search("Peter.Anderson");
		Thread.sleep(5000);
		search("Admin", "Paul Collings");
    }
	
	public void search(String userName) {
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	public void search(String userName,String empName) {
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
