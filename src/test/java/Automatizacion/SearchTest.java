package Automatizacion;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import net.serenitybdd.core.annotations.findby.By;

public class SearchTest {

	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.co");
	}
	
	@Test
	public void testDespegarPage() {
		WebElement searchBox = driver.findElement(By.name(""));
		searchBox.clear();
		searchBox.submit();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait ewait= new WebDriverWait(driver, 10);
		//ewait.until(ExpectedConditions.elementToBeSelected(searchBox));
	}
}
