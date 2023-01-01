package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginWithInvalidData extends TestBase{

	LoginPage loginPageObj;

	String invalidUserId= "test";
	String invalidPassword= "1234";
	
	@Test (priority = 1)
	private void loginWithInvalidData() throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		loginPageObj = new LoginPage(driver);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.userIdTxtBox));
		loginPageObj.setUserId(invalidUserId);
		loginPageObj.setPassword(invalidPassword);
		wait.until(ExpectedConditions.visibilityOf(loginPageObj.loginBtn));
		loginPageObj.ClickOnLoginBtn();
		assertEquals(driver.switchTo().alert().getText(), "User or Password is not valid");
		driver.switchTo().alert().dismiss();
	}
}
