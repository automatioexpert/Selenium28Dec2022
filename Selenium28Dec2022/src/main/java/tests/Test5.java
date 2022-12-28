package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://briantooleyracing.com/customer/account/create/");
		System.out.println(driver.findElement(By.cssSelector("div.store-address")).getText());

		System.out.println(driver.findElement(By.cssSelector("input[name='q']")).getAttribute("placeholder"));
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("User454994575"+Keys.ENTER);
		System.out.println("Test Case completed");
		driver.quit();
	}

}
