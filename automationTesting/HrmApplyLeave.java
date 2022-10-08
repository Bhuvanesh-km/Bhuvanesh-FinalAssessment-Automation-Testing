package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HrmApplyLeave {
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

    // test case 2
    @Test
    public void testCase2() {
    	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    	driver.findElement(By.xpath("//aside/nav/div[2]/ul/li[3]")).click();
		driver.findElement(By.xpath("//div[2]/nav/ul/li/a")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//div/textarea")).click();
		driver.findElement(By.xpath("//div/textarea")).sendKeys("suffering from feaver");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
