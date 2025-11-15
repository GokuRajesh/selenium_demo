package excercise_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://blazedemo.com/");
		WebElement heading=driver.findElement(By.xpath("//*[contains(text(),'Welcome to the Simple Travel Agency!')]"));
		System.out.println(heading.getText());
		if(heading.getText().equals("Welcome to the Simple Travel Agency!")) {
			System.out.println("verification success");
		}
		else {
			System.out.println("verification failed");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
