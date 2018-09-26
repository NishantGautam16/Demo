//Practice Exercise -1 (Drop Down Box/List)
//Launch new Browser
//Open “http://toolsqa.wpengine.com/automation-practice-form/”
//Select ‘Continents’ Drop down ( Use Id to identify the element )
//Select option ‘Europe’ (Use selectByIndex)
//Select option ‘Africa’ now (Use selectByVisibleText)
//Print all the options for the selected drop down and select one option of your choice
//Close the browser

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeExercise_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	    driver.get(URL);
	    Select sl = new Select(driver.findElement(By.id("continents")));
	    sl.selectByIndex(1);
	    System.out.println("Europe selected using selectByIndex");
	    sl.selectByVisibleText("Africa");
	    System.out.println("Africa selected using selectByVisibleText");
	    
	    List <WebElement> count = sl.getOptions();
	    int size = count.size();
	    for(int i =0; i<size;i++)
	    {
	    	String name = sl.getOptions().get(i).getText();
	    	System.out.println(name);
	    	if(name.equals("Africa"))
	    	{
	    		sl.selectByIndex(i);
	    		break;
	    	}
	    }
	    driver.close();
	    

	}

}
