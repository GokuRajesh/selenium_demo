package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.linkText("Enter the Store")).click();
		WebElement fish=driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		fish.click();
		WebElement firstrow=driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[1]"));
		List<WebElement> cols=firstrow.findElements(By.tagName("th"));
		System.out.println("no of column "+cols.size());
		WebElement tablefirstrow=driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody"));
		List<WebElement> countrow=tablefirstrow.findElements(By.tagName("tr"));
		System.out.println("no of rows "+countrow.size());
		Thread.sleep(5000);
		driver.quit();
	}

}
