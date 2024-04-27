package MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BooklowestFlight {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		try {
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")));

			Thread.sleep(2000);
			WebElement close_popup = driver.findElement(By.cssSelector("a.close"));
			WebElement popup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
			close_popup.click();
			popup.click();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
