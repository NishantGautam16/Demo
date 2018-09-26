
//Practice Exercise -2 (Multiple Selection Box/List)
//Launch new Browser
//Open “http://toolsqa.wpengine.com/automation-practice-form/”
//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
//Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
//Print and select all the options for the selected Multiple selection list.
//Deselect all options
//Close the browser

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	    driver.get(URL);
	    Select sl = new Select(driver.findElement(By.name("selenium_commands")));
	    sl.selectByIndex(0);
	    System.out.println("Browser command selected by using SelectByIndex");
	    Thread.sleep(2000);
	    sl.deselectByIndex(0);
	    System.out.println("Browser command deselected by using SelectByIndex");
	    sl.selectByVisibleText("Navigation Commands");
	    System.out.println("Navigation command selected by using SelectByVisibleText");
	    Thread.sleep(2000);
	    sl.deselectByVisibleText("Navigation Commands");
	    System.out.println("Navigation command deselected by using SelectByVisibleText");
	    
	    
	   List<WebElement> list = sl.getOptions();
	    for(int i=0;i<list.size();i++)
	    {
	    	String text = sl.getOptions().get(i).getText();
	    	System.out.println(text);
	    	sl.selectByIndex(i);
	    }
	    driver.close();

	}

}
