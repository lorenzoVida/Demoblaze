package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scrum {
	static final String URL = "https://www.scrum.org/classes";
	static final String PAIS = "Perú";
	static final String DISTANCIA = "50 KM";
	
	public static void main(String[] args) throws InterruptedException{
		//ruta del driver del navegador
	
		
				System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get(URL);
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				
				driver.findElement(By.cssSelector("#edit_country_chosen")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='edit_country_chosen']//input")).sendKeys(PAIS);
				
				Select s = new Select(driver.findElement(By.id("edit-proximity")));
				s.selectByVisibleText(DISTANCIA);
				
				driver.findElement(By.xpath("//input[@id='edit-scrumorg-geocoder-postal']")).sendKeys("15046");

				//driver.findElement(By.xpath("//div[@id='edit_country_chosen']//div[@class='chosen-search']")).sendKeys("Perú");
				//driver.findElement(By.xpath("//")).click();
				
				/*
				driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Lorenzo19");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#email")).sendKeys("lorenzo.v.more@gmail.com");
				driver.findElement(By.cssSelector("input[id='password']")).sendKeys("KayaNow86");
				driver.findElement(By.cssSelector("#confirm")).sendKeys("KayaNow86");
				Thread.sleep(1000);
				Select s = new Select(driver.findElement(By.cssSelector("#aboutyou")));
				//s.selectByVisibleText("I don't have a website");
				s.selectByIndex(0);
				driver.findElement(By.cssSelector(".btn.blue.valid")).click();
				*/
	}
}
