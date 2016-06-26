package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class HeaderSection extends PageBase  {
	
	@FindBy(css="a[href='signin.php']")
	public WebElement signinLink;
	
	@FindBy(css="a[href='http://elitecareer.net']")
	public WebElement jobSearch;
	
	@FindBy(linkText = "Logout")
	public WebElement signoutLink;
	
	@FindBy(css = "a[href='employer.php']")
	public WebElement employer;
	
	@FindBy(css = "a[href='contactus.php']")
	public WebElement contactusPageLink;
	
	@FindBy(linkText = "Register")
	public WebElement registerPageLink;

	

}
