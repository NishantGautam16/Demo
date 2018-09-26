import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	    driver.get(URL);
	    List<WebElement> rd = driver.findElements(By.name("sex"));
	    boolean b = false;
	    for(int i=0; i<rd.size();i++)
	    {
	    b = rd.get(0).isSelected();
	    System.out.println(b+"  checking 1");
	    
	   	    	if(b==true)
	    	{
	    		rd.get(1).click();
	    		System.out.println("Second");
	    	}
	   	    	else
	   	    	{
	   	    		rd.get(0).click();
	   	    		System.out.println("First");
	   	    	}
	    }
	   WebElement rd_exp = driver.findElement(By.id("exp-2"));
	   rd_exp.click();
	   System.out.println("3rd experience radio button clicked");
	   
	   
	   List<WebElement> box = driver.findElements(By.name("profession"));
	   
	    for(int i=0; i<box.size();i++)
	    {
	    	String value = box.get(i).getAttribute("value");
	    	if(value.equalsIgnoreCase("Automation tester"))
	    	{
	    		box.get(i).click();
	    		break;
	    	}
	    }
	    driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();;
	    

	}

}
