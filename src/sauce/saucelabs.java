package sauce;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class saucelabs {
	public static final String USERNAME = "lorenzovida";
	public static final String ACCESS_KEY = "15b061a6-42d1-4492-84e1-fb371bd7a36d";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 7");
	    caps.setCapability("version", "51.0");
	    
		// TODO Auto-generated method stub
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.servex.com.pe/");
	}

}
