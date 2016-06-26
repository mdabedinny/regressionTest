package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SigninPage extends PageBase {
	
	/*
	 * WebElements
	 */
	@FindBy(name = "Email")
	private WebElement emailTextField;
	
	@FindBy(name = "Password")
	private WebElement passwordTextField;
	
	@FindBy(name = "submit")
	private WebElement signinButton;
	
	/*
	 * Supporting Method
	 */
	
	public void signin(String email, String password){
		emailTextField.clear();
    	emailTextField.sendKeys(email);
    	passwordTextField.clear();
    	passwordTextField.sendKeys(password);
    	signinButton.click();
    	//errorMeassage.getText();
    	
    	
    }
	
	/*
	 * For Multiple Elements
	 */
	@FindBy(id = "error")
	public List<WebElement> errorMessage;
	

}
