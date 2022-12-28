package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://briantooleyracing.com/customer/account/create/");
		
		driver.findElement(By.cssSelector("a[href*='financing']")).click();
		System.out.println(driver.findElement(By.cssSelector("p strong span")).getText());
		List<WebElement> ele=driver.findElements(By.cssSelector("p.p1"));
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
		driver.quit();
	}

}
