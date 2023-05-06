package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class foxTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/mubarakarimiyah/eclipse-workspace/recapSession/browserFiles/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netowsolutions.com/swadel/");
		
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("nuke@yopmail.com");
		
		driver.findElement(By.id("password")).sendKeys("TestPassword213$");
		
		driver.findElement(By.name("login")).click();
	}

}
