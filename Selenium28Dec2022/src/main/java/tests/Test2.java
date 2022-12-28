package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://briantooleyracing.com/");
		System.out.println(driver.findElement(By.cssSelector("div.shipping-info")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.call-us")).getText());
		driver.findElement(By.cssSelector("a[href*='dealer-member']")).click();

		List<WebElement> elements = driver.findElements(By.cssSelector("div ul li"));
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		driver.quit();

	}

}
