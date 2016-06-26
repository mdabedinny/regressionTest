package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import uitls.ReadProperties;

public class Driver extends ReadProperties {
	public static WebDriver driver;
	
	public void setDriver(String browserType, String appUrl){
		if(browserType.equalsIgnoreCase("firefox")){
			initFirefox();
		}else{
			initFirefox();
		}
		setDriverProperty();
		driver.get(appUrl);
	}
	
	public void setDriverProperty(){
		driver.manage().window().maximize();
		
	}
	
	private void initFirefox(){
		driver = new FirefoxDriver();
		
	}
	
	public static WebDriver getDriver(){
		
		return driver;
	}

}
