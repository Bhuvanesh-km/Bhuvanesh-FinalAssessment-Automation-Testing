package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		
		confirmationAlert.sendKeys("Bhuvan");
		confirmationAlert.accept();
	}

}
