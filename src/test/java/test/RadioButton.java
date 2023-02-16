package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().deleteAllCookies();
		WebElement x = driver.findElement(By.xpath("//button[@Id=\"cookieBannerClose\"]"));
		x.click();
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("(//span[@class=\"control\"])[3]"));
		if(!radioButton.isSelected())
			radioButton.click();
		
		WebElement clearValue = driver.findElement(By.xpath("(//input[contains(@name,'originAirport')])[1]"));
		clearValue.clear();
	}

}

