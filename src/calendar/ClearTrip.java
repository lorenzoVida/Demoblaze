package calendar;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//select RoundTrip
	//	driver.findElement(By.id("RoundTrip")).click();
		
		//Select three in same time: one way, round trip and multi-city
		
		//From
		WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("Lima");
		Thread.sleep(5000);
	//	from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.TAB);
		
		//To
		WebElement to = driver.findElement(By.id("ToTag"));
		to.sendKeys("Limnos");
		Thread.sleep(5000);
	//	from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.TAB);
		//para realizar Zoom al navegador
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("document.body.style.zoom='200%'");
		//calendar	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//		Select drpAdults = new Select(driver.findElement(By.id("Adults")));
//		drpAdults.selectByVisibleText("2");
//		
		Select cboChildren = new Select(driver.findElement(By.id("Childrens")));
		cboChildren.selectByValue("2");
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		Select classOfTravel = new Select (driver.findElement(By.id("Class")));
		classOfTravel.selectByVisibleText("First");
		
		driver.findElement(By.id("SearchBtn")).click();
		//Highlighter.HighlightElement(driver,buscar);
		String mensaje = driver.findElement(By.linkText("Sorry, there aren't any flights available for your search")).getText();
		
//		
//		driver.findElement(By.partialLinkText("More options")).click();
//		
//		Select drpClass = new Select(driver.findElement(By.id("Class")));
//		drpClass.selectByVisibleText("Business");
		
//		String mensaje = driver.findElement(By.id("homeErrorMessage")).getText();
//		System.out.println(mensaje);
		
	}

}
