package day2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {
	
	static WebDriver driver;
	static int i=1;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		specificScreenshot();
		takeScreenshot();
		driver.findElement(By.linkText("Register")).click();
		takeScreenshot();
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		takeScreenshot();
		driver.findElement(By.id("LastName")).sendKeys("def");
		takeScreenshot();
		Thread.sleep(5000);
		driver.quit();
	}
	
	static void takeScreenshot() throws IOException {
		System.out.println("Taking Screenshot");
		File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile,new File("C:\\Test_results\\steps"+i+".jpeg"));
		i++;
		
	}
	static void specificScreenshot() throws IOException {
		System.out.println("Taking Screenshot");
		File specificFile;
		WebElement register=driver.findElement(By.linkText("Register"));
		specificFile=register.getScreenshotAs(OutputType.FILE);
		Files.copy(specificFile,new File("C:\\Test_results\\steps_registration_"+i+".jpeg"));
		i++;
	}

}
