package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestRegistrationPage extends TestBase {

	@BeforeClass
	public void classSetup() {
		
		headerSection.registerPageLink.click();
	}

	@Test
	public void testRegistrationWithValidData() {
		registrationPage.firstNameField.clear();
		registrationPage.firstNameField.sendKeys("Ruhul");

		registrationPage.lastNameField.clear();
		registrationPage.lastNameField.sendKeys("Amin");

		registrationPage.selectDropdownListElementByValue(registrationPage.genderDropdownList, "Male");

		registrationPage.dateOfBirthField.clear();
		registrationPage.dateOfBirthField.sendKeys("1980-05-10");

		registrationPage.phoneNoField.clear();
		registrationPage.phoneNoField.sendKeys("347-251-3210");

		registrationPage.selectDropdownListElementByValue(registrationPage.userTypeDropdownList, "Jobseeker");

		registrationPage.emailField.clear();
		int rand = registrationPage.getRandomNumber(100000, 100);
		String email = "MdAbedinny"+rand +"@gmail.com";
		registrationPage.emailField.sendKeys(email);
		System.out.println(email);
		
		registrationPage.passwordField.clear();
		registrationPage.passwordField.sendKeys("Mithu1981");

		registrationPage.confirmPasswordField.clear();
		registrationPage.confirmPasswordField.sendKeys("Mithu1981");

		if (!registrationPage.privacyField.isSelected()) {
			registrationPage.privacyField.click();
		}

		if (!registrationPage.subscribCheckbox.isSelected()) {
			registrationPage.subscribCheckbox.click();
		}

		registrationPage.submitButton.click();
		
		boolean condition = registrationPage.getCurrentUrl().contains("profile.php");
		
		Assert.assertTrue(condition);
		
		// TODO Logout
		//TODO click again register link to come back registration page

	}
	
	@Test
	public void testRegistrationWithAllFieldsEmpty() {
		headerSection.registerPageLink.click();
		registrationPage.submitButton.click();
		
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(0).getText(), "* FirstName can not be empty.");
		
		Assert.assertEquals(errorList.get(1).getText(), "* LastName can not be empty.");
		Assert.assertEquals(errorList.get(2).getText(), "* Gender can not be empty.");
		Assert.assertEquals(errorList.get(3).getText(), "* DateOfBirth can not be empty.");
		Assert.assertEquals(errorList.get(4).getText(), "* PhoneNo can not be empty.");
		Assert.assertEquals(errorList.get(5).getText(), "* UserType can not be empty.");
		Assert.assertEquals(errorList.get(6).getText(), "* Email can not be empty.");
		Assert.assertEquals(errorList.get(7).getText(), "* Password can not be empty.");
		Assert.assertEquals(errorList.get(8).getText(), "* ConfirmPassword can not be empty.");
		
		boolean condition = registrationPage.getCurrentUrl().contains("/register.php");

		Assert.assertTrue(condition);

	}
	
	@Test
	public void testRegistrationFirstNameFieldWithMinChar(){
		registrationPage.firstNameField.sendKeys("Md");
		registrationPage.submitButton.click();
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(0).getText(), "*");
		
	}
	
	@Test
	public void testRegistrationFirstNameFieldWithOneLessThanMinChar(){
		registrationPage.firstNameField.sendKeys("M");
		registrationPage.submitButton.click();
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(0).getText(), "* FirstName can not be less than 2 character.");
		
	}
	
	@Test
	public void testRegistrationLastNameFieldWithMaxChar(){
		registrationPage.lastNameField.sendKeys("Mdbcaihdakvjvjvkbkjbkklkjhgfds");
		registrationPage.submitButton.click();
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(1).getText(), "*");
		
	}
	
	@Test
	public void testRegistrationLastNameFieldWithGreaterThanMaxChar(){
		registrationPage.lastNameField.sendKeys("Mdbcaihdakvjvjvkbkjbkklkjhgfdse");
		registrationPage.submitButton.click();
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(1).getText(), "* LastName can not be greater than 30 character.");
		
	}
	
	@Test
	public void testRegistrationFirstNameFieldDataValidation(){
		registrationPage.firstNameField.sendKeys("");
		registrationPage.submitButton.click();
		List<WebElement> errorList = registrationPage.errorWebElementList;
		Assert.assertEquals(errorList.get(0).getText(), "*");
		
	}

	
	


//	@AfterClass
//	public void classTearDown() {
//		headerSection.jobSearchLink.click();
//	}

}
