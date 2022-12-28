package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://briantooleyracing.com/");
		System.out.println(driver.findElement(By.cssSelector("div.shipping-info")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.call-us")).getText());
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("services");
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();

		List<WebElement> elements = driver.findElements(By.cssSelector("strong.product.name.product-item-name"));
		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		driver.quit();
	}

}
