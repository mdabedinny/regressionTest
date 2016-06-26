package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestJobSearchPage extends TestBase {
    @BeforeClass
	public void classSetup(){
		headerSection.jobSearch.click();
	}
	
	@Test(priority = 1)
	public void testNewJobCount(){
		
		Assert.assertEquals(jobSearchPage.jobCount.getText(), "New Jobs (Total: 35 Jobs)");
	}
	
	@Test(priority = 0)
	public void testPageTitle(){
		
		Assert.assertEquals(jobSearchPage.getTitle(), "Job Search, Employment and Careers | EliteCareer");
	}
	

}
