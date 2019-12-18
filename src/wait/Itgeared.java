package wait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itgeared {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Explicit wait
		
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
//		WebDriverWait w = new WebDriverWait(driver,3);
//		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement resultado = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				if( driver.findElement(By.xpath("//div[@id='results']")).isDisplayed())
				{
					return driver.findElement(By.xpath("//div[@id='results']"));
				}else
					return null;
			}
			
		});
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		// 
	}

}
