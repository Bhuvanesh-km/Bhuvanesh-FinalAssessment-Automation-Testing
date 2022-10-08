package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//To maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		// To get message displayed on alert window
		String alert = confirmationAlert.getText();
		System.out.println(alert);
		//To click cancel button on alert window
		confirmationAlert.dismiss();
		
	}

}
