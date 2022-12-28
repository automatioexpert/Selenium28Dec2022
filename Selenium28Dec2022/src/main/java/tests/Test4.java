package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://briantooleyracing.com/customer/account/login");
		System.out.println(driver.findElement(By.cssSelector("strong#block-new-customer-heading")).getText());
		driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]")).click();
		System.out.println(driver.findElement(By.cssSelector("span.base")).getText());
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("user784545456");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("P@djsd4559475475");
		System.out.println("Test Case passed");

	}

}
