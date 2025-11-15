package excercise_2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://blazedemo.com/");
		WebElement link=driver.findElement(By.partialLinkText("destination"));
		link.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
