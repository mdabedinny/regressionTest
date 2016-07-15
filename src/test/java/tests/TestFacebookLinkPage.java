package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;


public class TestFacebookLinkPage extends TestBase {
	@BeforeClass
	public void classSetup(){
	sideBar.facebookLink.click();	
	}
	@Test
	public void testFacebookLink(){
		Assert.assertEquals(driver.getTitle(), "EliteCareer | Facebook");
	}

}
