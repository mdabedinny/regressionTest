package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestEmployerPage extends TestBase {
	@BeforeClass
	public void classSetup(){
		headerSection.employerLink.click();
	}
	@Test
	public void testEmployerPage(){
		Assert.assertEquals(driver.getCurrentUrl(), "http://qa.elitecareer.net/employer.php");
	}

}
