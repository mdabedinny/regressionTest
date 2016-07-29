package base;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase extends Driver {
	public String getTitle() {
		return driver.getTitle();

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public  String selectDropdownListElementByValue(WebElement locator, String value) {
		Select sl = new Select(locator);
		sl.selectByValue(value);
		return sl.getFirstSelectedOption().getText();
	}
	
	public int getRandomNumber(int max, int min){
		int randomNumber=0;
		Random rand = new Random();
		randomNumber = rand.nextInt(max) +1;
		return randomNumber;
	}
	
	public void refreshCurrentPage(){
		driver.navigate().refresh();
	}

}
