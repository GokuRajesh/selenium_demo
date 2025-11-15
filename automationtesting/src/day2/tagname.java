package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tagname {

	public static void main(String args[]) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> allimages=driver.findElements(By.tagName("img"));
		int total=allimages.size();
		System.out.println("total images in the page are "+total);
		
		List<WebElement> allinks=driver.findElements(By.tagName("a"));
		int totallinks=allinks.size();
		System.out.println(totallinks);
		
		driver.quit();
	}
}
