package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPS {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chrome Profile
		DesiredCapabilities dcap = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		dcap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dcap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//navegador local
		ChromeOptions c = new ChromeOptions();
		c.merge(dcap);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://opencart.abstracta.us/");
		driver.get("https://www.cacert.org/");
		
	}

}
