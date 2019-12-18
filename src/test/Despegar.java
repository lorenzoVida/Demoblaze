package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Despegar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Mozila\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.despegar.com.pe/");
		WebElement origen = driver.findElement(By.xpath("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-origin-container places-inline']//input[@placeholder='Ingresa una ciudad']"));
		       //span[@class='validation-msg'] //span[contains(text(),'Ingresa un origen')]   
		// "//div[contains(text(),'Aduanas')]"
		//System.out.println(origen);
		origen.clear();
		Thread.sleep(1000);
		origen.sendKeys("Cusco");
		Thread.sleep(1000);
		//origen.sendKeys(Keys.ARROW_DOWN);
		origen.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement destino=driver.findElement(By.xpath("//div[@class='sbox-3-input -md sbox-3-validation -top-right -icon-left sbox-destination-container'] //input[@placeholder='Ingresa una ciudad']"));
		destino.sendKeys("Lima");
		destino.sendKeys(Keys.ENTER);
	}

}
