package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Implicit wait and we gonna add pageload wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("//div[contains(@role,'button')] "));
		WebElement target = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));
		Thread.sleep(3000);
		action.dragAndDrop(source, target).build().perform();
	
		
		
	}

}

