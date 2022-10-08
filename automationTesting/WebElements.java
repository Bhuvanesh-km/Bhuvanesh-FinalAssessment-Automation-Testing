package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//-To Find web elements using Locators in orangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//webelement for username using xpath locator
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//webelement for username field using name locator
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//webelement for password field using xpath locator
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//webelement for username using name locator
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//webelement for login button using xpath locator
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//webelement for login button using linktext
		//driver.findElement(By.linkText("login")).clear();
		
		//-To Find web elements using Locators in orangeHRM Dashboard page
		//element-> Leave
		driver.findElement(By.xpath("//aside/nav/div[2]/ul/li[3]")).click();
		
		//element-> Admin
		driver.findElement(By.xpath("//aside/nav/div[2]/ul/li[1]")).click();
		
		//element-> Time
		driver.findElement(By.xpath("//aside/nav/div[2]/ul/li[4]")).click();
		
		//element-> OrangeHRM logo
		driver.findElement(By.xpath("//a[@class='oxd-brand']")).click();
	}

}
