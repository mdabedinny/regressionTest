package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestContactUsPageLink extends TestBase {
	@BeforeClass
	public void classSetup(){
		headerSection.contactusPageLink.click();
	}
	@Test
	public void getTitleContactUsPageLink(){
		Assert.assertEquals(driver.getTitle(), "Contact Us | EliteCareer");
	}
	

}
