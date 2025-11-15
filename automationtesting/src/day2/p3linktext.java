package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p3linktext {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.co.in");
		WebElement about=driver.findElement(By.linkText("About"));
		about.click();
		Thread.sleep(5000);
		driver.quit();
	}
}
