import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	    driver.get(URL);
	    driver.findElement(By.partialLinkText("Partial")).click();
	    System.out.println("Clicked successfully using partial link text");
	    String tag = driver.findElement(By.tagName("button")).toString();
	    System.out.println("tage name is : "+tag);
	    driver.findElement(By.linkText("Link Test")).click();
	    System.out.println("Successfully clicked on Link Test");

	}

}
