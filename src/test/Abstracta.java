package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Abstracta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/");
		
		Actions actions = new Actions(driver);
		WebElement howWeWork = driver.findElement(By.xpath("//button[@class='dropbtn']//a[contains(text(),'Solutions')]"));
		
		actions.moveToElement(howWeWork).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Performance Testing")).click();
		

	}

}
