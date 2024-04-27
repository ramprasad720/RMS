package MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);

			// Switch to the frame containing the dynamic banner popup
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")));

			// Close the dynamic banner popup
			WebElement bannerPopupCloseButton = driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
			bannerPopupCloseButton.click();
			driver.switchTo().defaultContent();
			//driver.switchTo().frame(driver.findElement(By.xpath("//div[contains(@class,'bgGradient noAvifSupport')]")));
			WebElement loginPopupCloseButton = driver.findElement(By.xpath("//span[contains(@class,'close')]"));
			loginPopupCloseButton.click();


		} catch (Exception e) {
			e.printStackTrace();

		}
		WebElement From=driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
		From.click();
		WebElement fromData = driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		fromData.sendKeys("Lucknow");
		//Thread.sleep(3000);
		WebElement LKO=driver.findElement(By.xpath("//p[text()='Lucknow, India']"));
		LKO.click();
		//WebElement kolkata=driver.findElement(By.xpath("//p[text()='Kolkata, India']"));
		//kolkata.click();
		WebElement To=driver.findElement(By.xpath("//label[@for='toCity']"));
		To.click();
		WebElement ToData=driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		ToData.sendKeys("Pune");
		WebElement PUNE=driver.findElement(By.xpath("//p[text()='Pune, India']"));
		PUNE.click();
		Thread.sleep(4000);

	}
}
