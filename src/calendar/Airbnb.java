package calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airbnb {

	static final String DONDE = "Cusco";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Navegador/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airbnb.com.pe/");
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//for (int i=0; i<2; i++)
		//Thread.sleep(1000);
		WebElement donde = driver.findElement(By.xpath("//div[@class='_bujmdv']//div//label//div[2]//input"));
		donde.sendKeys(DONDE);
		donde.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='checkin_input']")).click();
		int count = driver.findElements(By.className("_16zigr23")).size();
		
		for (int i=0;i<count;i++) {
			String text = driver.findElements(By.className("_16zigr23")).get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("11"))
			{
				driver.findElements(By.className("_16zigr23")).get(i).click();
				break;
			}
		}
		
//		driver.findElement(By.xpath("//input[@class='checkout_input']")).click();
//		driver.findElement(By.xpath("//input[@class='checkout_input']")).sendKeys("26/12/2019");
//		driver.findElement(By.id("lp-guestpicker")).click();
//		js.executeScript("window.scrollBy(0,350)");
//		driver.findElement(By.xpath("//body[@class='with-new-header']/div/div/main[@id='site-content']/section/div[@id='FMP-target']/div[@class='_u9d8zz']/div[@class='_ogalm0']/div[@class='_djxl322']/div[@class='_ni9axhe']/div[@class='_ctrm83']/div[@class='_26hc67j']/div[@class='_1n8ekdm']/div/div[@class='_slilk2']/form/div/div/div[@class='_e296pg']/div/div[@class='_9cfq872']/div/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]/span[1]/*[1]")).click();
//		driver.findElement(By.xpath("//button[@class='_b0ybw8s']")).click();
	}

}
