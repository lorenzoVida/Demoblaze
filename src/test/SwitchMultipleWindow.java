package test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
	    //ruta del driver del navegador
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//Seleccionar Cliente Demo
		  Thread.sleep(1000);	
		 
		  driver.findElement(By.xpath("//a[contains(text(),'Automation Practice Switch Windows')]")).click();
		  Thread.sleep(1000);	
		  driver.findElement(By.xpath("//button[@id='button1']")).click();
		  
		  
		  String parentWindowHandle = driver.getWindowHandle();
		  Set handles = driver.getWindowHandles();
		  System.out.println(handles);
		  

	         for (String handle1 : driver.getWindowHandles()) {
	 
	          System.out.println(handle1);
	          driver.switchTo().window(handle1);
	 
	          }
	         driver.manage().window().maximize();
	  
	         driver.switchTo().window(parentWindowHandle);
	         driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
	 
	}

}
