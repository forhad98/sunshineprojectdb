package sunshineUtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Baseclass {

	public static WebDriver driver;
	public static Properties sunshinepro;
	public Baseclass() {
		
		try {
			FileInputStream sunshinefile= new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\sunshineConfiguration\\SunshineConfig.Properties");
			 sunshinepro = new Properties();
			 sunshinepro.load(sunshinefile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("please check your code");
			e.printStackTrace();
		}
	}
	
	public void SunshineBrowser() {
		String browser=	sunshinepro.getProperty("sunBrowser1 ");
		if (browser.equalsIgnoreCase("Edge browser")){
			
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"/edgedriver/msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
}

		else if (browser.equalsIgnoreCase("chrome"));
	}
	
	public static void sunshineURL(String URL) {
		
	driver.get("https://www.demoblaze.com/");	
	}
	
}
	