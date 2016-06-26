package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import pages.ContactUsPageLink;
import pages.EmployerPage;
import pages.HeaderSection;
import pages.JobSeekerPage;
import pages.JobSearchPage;
import pages.SigninPage;



@Listeners(listeners.TestListener.class)
public class TestBase extends Driver {
	
	
	String browserType = getBrowserType();
	String appUrl = getEnvProperty("appUrl");
	protected static HeaderSection headerSection;
	protected static JobSearchPage jobSearchPage;
	protected static SigninPage signinPage;
	protected static JobSeekerPage jobSeekerPage;
	protected static EmployerPage employerPage;
	protected static ContactUsPageLink contactusPageLink;
	
	
	@BeforeTest
	
	public void setUp(){
		try{
			setDriver(browserType, appUrl);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		headerSection = PageFactory.initElements(driver, HeaderSection.class);
		jobSearchPage = PageFactory.initElements(driver, JobSearchPage.class);
		//jobSearchPage = new JobSearchPage;
		signinPage = PageFactory.initElements(driver, SigninPage.class);
		jobSeekerPage = PageFactory.initElements(driver,JobSeekerPage.class);
		employerPage = PageFactory.initElements(driver, EmployerPage.class);
		contactusPageLink = PageFactory.initElements(driver, ContactUsPageLink.class);
		
	}
	
	@AfterTest
	
	public void tearDown(){
		getDriver().quit();
	}

}
