package Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	private WebDriver driver;
	public void init()
	{
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();

	}

	public void navigateTo(String url) {
		driver.get(url);
	}
	public void close()
	{
		driver.close();
	}
	public void getpagesource(String Text) {
		driver.getPageSource();
	}
	
	

	public WebElement getWebElement(String identifierType, String identifierValue)
	{
		switch(identifierType) {
		case "XPATH":
			return driver.findElement(By.xpath(identifierValue));
		case "CSS":
			return driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return driver.findElement(By.id(identifierValue));
		case "NAME":
			return driver.findElement(By.name(identifierValue));
		default:
			return null;

		}
	}


	public List<WebElement> getWebElements(String identifierType, String identifierValue)
	{
		switch(identifierType) {
		case "XPATH":
			return driver.findElements(By.xpath(identifierValue));
		case "CSS":
			return driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return driver.findElements(By.id(identifierValue));
		case "NAME":
			return driver.findElements(By.name(identifierValue));
		default:
			return null;

		}

	}
	


}