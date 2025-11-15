package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement search=driver.findElement(By.name("newsletter-email")); //for name by.name("");id="newsletter-email"
		search.sendKeys("dummy items");
		WebElement searchbtn=driver.findElement(By.id("newsletter-subscribe-button"));
		searchbtn.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
