package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public void launchTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://briantooleyracing.com/dealer-membership/");
		driver.findElement(By.cssSelector("a[href*='login']")).click();
		System.out.println(driver.findElement(By.cssSelector("li.item.login")).getText());
		driver.findElement(By.cssSelector("input[name='login[username]']")).sendKeys("user2323");
		driver.findElement(By.cssSelector("input[name='login[password]']")).sendKeys("P@ssw0rd3493");
		driver.quit();

	}

}
