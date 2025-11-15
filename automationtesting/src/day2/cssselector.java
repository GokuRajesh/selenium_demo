package day2;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselector {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement email=driver.findElement(By.cssSelector("input#Email"));
		Random random=new Random();
		int randomNumber=random.nextInt();
		email.sendKeys(randomNumber+"tester@test.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
