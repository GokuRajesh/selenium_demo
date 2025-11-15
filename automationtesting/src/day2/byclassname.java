package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class byclassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("email")).sendKeys("abc");
		driver.quit();
	}

}
