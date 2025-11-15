package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("file:///C:/selenium_testing/alert.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
