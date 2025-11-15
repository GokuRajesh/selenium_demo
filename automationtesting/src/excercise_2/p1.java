package excercise_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://blazedemo.com/");
		Select selector=new Select(driver.findElement(By.name("fromPort")));
		selector=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		WebElement op1=selector.getFirstSelectedOption();
		String option1=op1.getText();
		System.out.println("first option "+option1);
		Thread.sleep(5000);
		driver.quit();
		///html/body/div[3]/form/select[1]
	}

}
