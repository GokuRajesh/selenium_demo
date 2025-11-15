package excercise_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement link=driver.findElement(By.linkText("Enter the Store"));
		link.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
