package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhuvanesh\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//to click on simple alert button
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		// To get message displayed on alert window
		String alert =simpleAlert.getText();
		System.out.println(alert);
		//To click OK button on alert window
		simpleAlert.accept();
		
	}

}
