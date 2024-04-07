package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.CommonFunctions;
public class Google {
	private CommonFunctions cs;

	// Constructor to pass CommonFunctions instance
	public Google(CommonFunctions cs) {
		this.cs = cs;
	    
	}

	String Search_box = "//textarea[@aria-label='Search']";

	public void Searchbox() 
	{
		cs.getWebElement("XPATH", Search_box).click();
	}
    public void pagesource() {
    	cs.getpagesource("Text");
    	
    }
	
	public void sendKeysToSearchBox(String keysToSend) {
		cs.getWebElement("XPATH", Search_box).sendKeys(keysToSend);
	}

	public void EnterToSearchBox(String keysToSend) {
		cs.getWebElement("XPATH", Search_box).sendKeys(Keys.ENTER);
	}
}
