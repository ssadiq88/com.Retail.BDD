package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// Implicit wait and we gonna add pageload wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/javascript-alerts");
	
		WebElement alertButton = driver.findElement(By.id("alertBtn"));
		alertButton.click();
		
		 String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText + " This is text from the alert");
		driver.switchTo().alert().accept();
		 Thread.sleep(5000);
		WebElement confirmAlert = driver.findElement(By.id("confirmBtn"));
		confirmAlert.click();
		driver.switchTo().alert().dismiss();
		 Thread.sleep(5000);
		WebElement promtpAlert = driver.findElement(By.id("promptBtn"));
		 promtpAlert.click();
		Alert alert2 = (Alert) driver.switchTo().alert();
		 Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is some value");
		alert.accept();
		driver.navigate().to("https://tek-retail-ui.azurewebsites.net/selenium/alert");
	 WebElement deletePhoto = driver.findElement(By.xpath("//button[text()='Delete Photo']"));
	deletePhoto.click();
		 driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
	WebElement successMessage = driver.findElement(By.xpath("//div[text()='Photo deleted successfully']"));
		System.out.println(successMessage.isDisplayed());
		
			
			
		}
			


	
}
