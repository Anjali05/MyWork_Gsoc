package framework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * @author Anjali
 */

//for singleton driver , so that same driver is used for checking
public class Driver 
{
	public static WebDriver Instance;

	public static void Initialize()
	{
		
		Instance =new FirefoxDriver();
		Instance.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	public static void close() 
	{
		Instance.close();
		
	}


}
