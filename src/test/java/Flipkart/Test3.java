package Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		SearchBox.sendKeys("Iphone 15 promax");
		SearchBox.submit();
		Thread.sleep(4000);
		List<WebElement>IphonePricess = driver.findElements(By.xpath("(//div[contains(.,'₹1,48,900')])"));
		System.out.println("Available Iphone Price list -" + IphonePricess.size());
		WebElement lowestPriceElement = null;
		double minPrice = Double.MAX_VALUE;

		for (WebElement priceel : IphonePricess) {
			String priceText = priceel.getText().replaceAll("[^0-9.]", "");                                                                                                  
			double price = Double.parseDouble(priceText);

			if (price < minPrice) {
				minPrice = price;
				lowestPriceElement = priceel;
			}
		}
		if (lowestPriceElement != null) {
			System.out.println("Lowest Iphone Price is - " + lowestPriceElement.getText());
			lowestPriceElement.click();
		} else {
			System.out.println("No Iphone found.");
		}

	}

}
