package com.mepro.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mepro.util.TestUtil;
import com.mepro.util.WebEventListener;

public class SessionInitiator {

	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public SessionInitiator()
	{
		try
		{
			prop = new Properties();
			//FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/knoxteams/config/config.properties");
			FileInputStream ip = new FileInputStream("C:\\Users\\ARVAS\\eclipse-workspace\\Liqvid\\src\\main\\java\\com\\mepro\\config\\config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browserName= prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARVAS\\eclipse-workspace\\chromedriver.exe");
//			  ChromeOptions options = new ChromeOptions();
//			  options.addArguments("--no-sandbox");
			  driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARVAS\\eclipse-workspace\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("internetexplorer"))
		{

		}
		 
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implict_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		

	}
	

}
