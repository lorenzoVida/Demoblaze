package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adidas {
	//Explicit Wait & WebElement
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adidas.pe/");
		//Explicit Wait
		WebDriverWait w = new WebDriverWait(driver,5);
		WebDriverWait x = new WebDriverWait(driver,2);
			
	//	driver.findElement(By.xpath("//*[@id='close']")).click();
		
		//WebElement MHombre = driver.findElement(By.xpath("//div[@data-auto-id='glass-navigation-flyout'][@xpath='1']"));
		WebElement MHombre = driver.findElement(By.partialLinkText("HOMBRE"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(MHombre).perform();
		
		//driver.findElement(By.partialLinkText("Novedades")).click();
		//Thread.sleep(2000);
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header___3wNCY gl-is-sticky fixed___3ea04']//div[2]//ul[1]//li[2]//a[1]")));
		WebElement Novedades = driver.findElement(By.xpath("//div[@class='header___3wNCY gl-is-sticky fixed___3ea04']//div[2]//ul[1]//li[2]//a[1]"));
		Novedades.click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Talla')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Talla')]")).click();
		


	}

}
