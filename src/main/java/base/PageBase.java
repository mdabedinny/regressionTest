package base;

public class PageBase extends Driver {
	public String getTitle(){
		return driver.getTitle();
			
	}
	
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}

}
