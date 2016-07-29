package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestJobSeekerPage extends TestBase {
	@BeforeClass
	public void classSetup(){
		headerSection.jobSearchLink.click();
	}
	
	@Test
	public void testjobSeekerPage(){
		Assert.assertEquals(driver.getTitle(), "Job Search, Employment and Careers | EliteCareer");
	}
	
	

}
