package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
public static WebDriver driver;
public static String Email = Helper.GenerateRandomString(5)+"@yahoo.com";
	
	@BeforeSuite
	public void startDriver() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");	
    }
	
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}

}
