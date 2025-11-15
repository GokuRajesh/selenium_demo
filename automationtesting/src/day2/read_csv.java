package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class read_csv {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String datafile="C:\\Selenium demo\\fil1.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		while((line=br.readLine())!=null) {
			
			String[] data=line.split(cvsSplitBy);
			driver=new EdgeDriver();
			
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("FirstName")).sendKeys(data[0]);
			driver.findElement(By.id("LastName")).sendKeys(data[1]);
			driver.findElement(By.id("Email")).sendKeys(data[2]);
			System.out.println(data[0]+data[1]);
			Thread.sleep(5000);
			driver.quit();
		}
	}

}
