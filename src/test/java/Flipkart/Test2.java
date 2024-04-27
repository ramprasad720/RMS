package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

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
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (White Titanium, 256 GB)']")).click();
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        Thread.sleep(4000);
	}

}
