package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSigninPage extends TestBase {
	@BeforeClass
	public void classSetup(){
		headerSection.signinLink.click();
	}
		
	@Test
	public void testSigninWithValidCredentials() {
	
		signinPage.signin("shakil_ipe@yahoo.com", "365827");
		Assert.assertTrue(signinPage.getCurrentUrl().contains("profile.php"));
		headerSection.signoutLink.click();
	}
	
	@Test
	public void testSigninWithoutValidCredential(){
		headerSection.signinLink.click();
		signinPage.signin("shakil_ipa@yahoo.com", "36582");
		Assert.assertEquals(driver.getTitle(), "SignIn | EliteCareer");
		
	}
	
	@Test
	public void testSigninWithoutValidCredentialOne(){
		
		signinPage.signin("shakilipa@yahoo.com", "365827");
		Assert.assertEquals(driver.getTitle(), "SignIn | EliteCareer");
		
	}
	
	@Test
	public void testSigninWithoutValidCredentialTwo(){
		
		signinPage.signin("shakilipa@yahoo.com", "36582");
		Assert.assertEquals(driver.getTitle(), "SignIn | EliteCareer");
		
	}
	
	@Test
	public void testSigninWithoutValidCredentialThree(){
		
		signinPage.signin("", "365827");
		Assert.assertEquals(signinPage.errorMessage.get(0).getText(), "* Email can not be empty.");
		
	}
	
	@Test
	public void testSigninWithoutValidCredentialFour(){
		
		signinPage.signin("shakil_ipa@yahoo.com", "");
		Assert.assertEquals(signinPage.errorMessage.get(1).getText(), "* Password can not be empty.");
		
	}
	
	@Test
	public void testWithEmtyCredential(){
		signinPage.signin("", "");
		Assert.assertEquals(signinPage.errorMessage.get(0).getText(), "* Email can not be empty.");
		Assert.assertEquals(signinPage.errorMessage.get(1).getText(), "* Password can not be empty.");
	}
	
	
	
	
	
	
}
