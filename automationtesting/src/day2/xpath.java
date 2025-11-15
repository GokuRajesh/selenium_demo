package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement username=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input"));
		username.sendKeys("abx");
		Thread.sleep(5000);
		driver.quit();
	}

}
