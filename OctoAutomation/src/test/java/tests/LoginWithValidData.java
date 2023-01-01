package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.HomePage;
import pages.LoginPage;

public class LoginWithValidData extends TestBase{

	LoginPage loginPageObj;
	HomePage homePageObj;
	

	String validUserId= ReadProperties.data.getProperty("UserId");
	String validPassword= ReadProperties.data.getProperty("Password");
	
	@Test (priority = 1)
	private void loginWithValidData() throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		loginPageObj = new LoginPage(driver);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.userIdTxtBox));
		loginPageObj.setUserId(validUserId);
		loginPageObj.setPassword(validPassword);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.loginBtn));
		loginPageObj.ClickOnLoginBtn();
		
		homePageObj = new HomePage(driver);
		wait.until(ExpectedConditions.visibilityOf(homePageObj.mangerId));
		assertTrue(homePageObj.mangerId.getText().contains(validUserId));		

	}
	
}
