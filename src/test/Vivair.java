package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vivair {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vivaair.com/pe/es");
		
		driver.findElement(By.xpath("//input[@id='criteria-passenger-select-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3]//div[2]//div[1]//button[2]")).click();

	}

}
