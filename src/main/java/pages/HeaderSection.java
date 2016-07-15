package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class HeaderSection extends PageBase  {
	
	@FindBy(css="a[href='signin.php']")
	public WebElement signinLink;
	
	@FindBy(xpath=".//*[@id='header_content']")
	public WebElement jobSearchLink;
	
	@FindBy(linkText = "Logout")
	public WebElement signoutLink;
	
	@FindBy(css = "a[href='employer.php']")
	public WebElement employerLink;
	
	@FindBy(css = "a[href='contactus.php']")
	public WebElement contactusPageLink;
	
	@FindBy(linkText = "Register")
	public WebElement registerPageLink;
	
	@FindBy(css ="a[href='aboutus.php']")
	public WebElement aboutUsLink;

	

}
