package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class MyFirstTestCase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {

		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		
		Thread.sleep(5000);
	
		
		driver.findElement(By.name("Seven")).click();
		driver.findElement(By.id("plusButton")).click();
		driver.findElement(By.id("num8Button")).click();
		driver.findElement(By.id("equalButton")).click();
		
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		
		System.out.println("The result is " + output);
		//dfgsdiughidsfgdf

	}

}
