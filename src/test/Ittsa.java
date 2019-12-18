package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ittsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ittsabus.com/");
		driver.manage().deleteAllCookies();
		//Sample Implicitly wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Select the origin
		
		Select origen = new Select(driver.findElement(By.id("origen_lg")));
		origen.selectByVisibleText("LIMA");
		
		Select destino = new Select(driver.findElement(By.id("destino_lg")));
		destino.selectByVisibleText("CHICLAYO");
		
		//Xpath relativo y Absoluto
		//driver.findElement(By.xpath("//form[@class='row booking-form']/div[3]")).click();
		//driver.findElement(By.xpath("//select[@id='destino_lg']")).click();
		//
		//WebDriverWait ewait = new WebDriverWait(driver, 5);
	}

}
