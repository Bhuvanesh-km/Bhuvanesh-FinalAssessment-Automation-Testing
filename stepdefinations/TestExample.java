package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestExample {
	
	WebDriver driver = null;
	
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	//@Given("home page is displayed")
	@Then("home page is displayed")
	public void home_page_is_displayed() {
		String actualResult;
		String expectedResult="PIM";
		actualResult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualResult,expectedResult);
	}
	@Then("user is able to apply leave")
	public void user_is_able_to_apply_leave() {
	    //code to apply leave
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
	
	@Then("user to search for users")
	public void user_to_search_for_users() throws InterruptedException {
		//code to search users using methodoverloading
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
	
	@Then("user is logged out")
	public void user_logged_out() {
		WebElement web=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		
		Select select = new Select(web);
		select.selectByVisibleText("Logout");
		
		
	}


}
