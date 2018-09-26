import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get("https://hris.qainfotech.com/login.php");
//	    driver.navigate().to("https://www.google.co.in");
//	    driver.navigate().back();
//	    String str1 = driver.getCurrentUrl();
//	    System.out.println(str1);
//	    driver.navigate().forward();
//	    String str2 = driver.getCurrentUrl();
//	    System.out.println(str2);
//	    driver.navigate().refresh();
//	    driver.close();
//	    

	    driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("nishantgautam");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Nishant@123123");
	    boolean result = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
	    if(result == true)
	    {
	    	driver.findElement(By.xpath("//input[@type='submit']")).click();
	    }
	    else
	    {
	    	System.out.println("Sign in button is disabled");
	    }
	    
	    
	}

}
