package Flipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		WebElement El = driver.findElement(By.xpath("//img[contains(@alt,'Fashion')]"));
		action.moveToElement(El).perform();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),\"Men's T-Shirts\")]")).click();
		Thread.sleep(5000);
		List<WebElement>TshirtPricess = driver.findElements(By.xpath("(//div[@class='Nx9bqj'])"));
		System.out.println("Available Tshirt Price list -" + TshirtPricess.size());
		WebElement lowestPriceElement = null;
		double minPrice = Double.MAX_VALUE;

		for (WebElement priceel : TshirtPricess) {
			String priceText = priceel.getText().replaceAll("[^0-9.]", "");                                                                                                  
			double price = Double.parseDouble(priceText);

			if (price < minPrice) {
				minPrice = price;
				lowestPriceElement = priceel;
			}
		}
		if (lowestPriceElement != null) {
			System.out.println("Lowest Tshirt Price is - " + lowestPriceElement.getText());
			lowestPriceElement.click();
		} else {
			System.out.println("No T-shirts found.");
		}

		driver.quit();
	}

}
