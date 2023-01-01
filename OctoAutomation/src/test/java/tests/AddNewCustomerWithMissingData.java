package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.Helper;
import data.ReadProperties;
import pages.CustomerDataPage;
import pages.HomePage;
import pages.NewCustomerFormPage;

public class AddNewCustomerWithMissingData extends TestBase{

	HomePage homePageObj;
	NewCustomerFormPage newCustPageObj;
	CustomerDataPage customerDataPageObj;

	String customerName= Helper.GenerateRandomString(8);
	String dateOfBirth= ReadProperties.data.getProperty("DateOfBirth");
	String address= ReadProperties.data.getProperty("Address");
	String city= ReadProperties.data.getProperty("City");
	String state= ReadProperties.data.getProperty("State");
	String pin= Helper.GenerateRandomNo(6);
	String mobileNumber= ReadProperties.data.getProperty("MobileNumber");
//	String email= ReadProperties.data.getProperty("Email");
	String customerPassword= Helper.GenerateRandomString(8);

	@Test (priority = 1)
	private void addNewCustomer() throws InterruptedException {

		homePageObj = new HomePage(driver);
		newCustPageObj =new NewCustomerFormPage(driver);
		customerDataPageObj = new CustomerDataPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOf(homePageObj.newCustomerBtn));
		homePageObj.ClickOnNewCustomerBtn();

		if (!driver.findElements(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")).isEmpty()) {

			driver.switchTo().frame("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0");

			if (!driver.findElements(By.id("ad_iframe")).isEmpty()) {

				driver.switchTo().frame("ad_iframe");

				wait.until(ExpectedConditions.visibilityOf(newCustPageObj.adsCloseBtn));
				newCustPageObj.clickOnCloseBtn();
				driver.switchTo().defaultContent();
			}else {
				wait.until(ExpectedConditions.visibilityOf(newCustPageObj.closeBtnAds));
				newCustPageObj.closeBtnAds.click();
				driver.switchTo().defaultContent();
			}


		}
		wait.until(ExpectedConditions.visibilityOf(newCustPageObj.customerNameTxtBox));
		newCustPageObj.setCustomerName(customerName);
		newCustPageObj.setCustomerGender();
		//newCustPageObj.setCustomerDateofBirth(dateOfBirth);
		//newCustPageObj.setCustomerAddress(address);
		newCustPageObj.setCustomerCity(city);
		newCustPageObj.setCustomerState(state);
		newCustPageObj.setCustomerPin(pin);
		newCustPageObj.setCustomerMobileNumber(mobileNumber);
		newCustPageObj.setCustomerEmail(Email);
		newCustPageObj.setCustomerPassword(customerPassword);
		newCustPageObj.clickOnSubmitBtn();

		assertEquals(driver.switchTo().alert().getText(), "please fill all fields");

		driver.switchTo().alert().dismiss();

	}
}
