package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import data.ReadProperties;
import pages.LoginPage;

public class LoginWithMissingPassword extends TestBase{

	LoginPage loginPageObj;

	String validUserId= ReadProperties.data.getProperty("UserId");
	
	@Test (priority = 1)
	private void loginWithInvalidData() throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		loginPageObj = new LoginPage(driver);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.userIdTxtBox));
		loginPageObj.setUserId(validUserId);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.loginBtn));
		loginPageObj.ClickOnLoginBtn();
		assertEquals(driver.switchTo().alert().getText(), "User or Password is not valid");
		driver.switchTo().alert().dismiss();
	}
}
