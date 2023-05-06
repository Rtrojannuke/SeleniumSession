package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginwithBeforeMethod {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/mubarakarimiyah/eclipse-workspace/recapSession/browserFiles/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://netowsolutions.com/swadel/");	
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
	}
	
	@Test(priority=0)
	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("nuk@yopmail.com");
		
		driver.findElement(By.id("password")).sendKeys("TestPasword213$");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("nuke@yopmail.com");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("TestPassword213$");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void afterMyTest() {
		driver.quit();
	}

}
