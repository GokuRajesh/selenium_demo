package excercise_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://blazedemo.com/");
		WebElement home=driver.findElement(By.linkText("home"));
		home.click();
		WebElement checkbox=driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
		System.out.println(checkbox.getText());
		if(checkbox.getText()!=null) {
			System.out.println("verification success");
		}
		else {
			System.out.println("verification failed");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
