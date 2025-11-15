package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class partiallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
		shopping.click();
		Thread.sleep(5000);
		driver.quit();
		}

}
