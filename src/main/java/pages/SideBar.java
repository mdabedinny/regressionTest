package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SideBar extends PageBase {
	@FindBy(css ="img[src='image/new/facebook.jpg']")
	public WebElement facebookLink;
	
	@FindBy(css ="img[src='image/new/linkedin.jpg']")
	public WebElement linkedinLink;
	
	@FindBy(css ="img[src='image/new/twitter.jpg']")
	public WebElement twitterLink;

}
