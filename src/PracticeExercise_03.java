import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
	    driver.get(URL);
	    driver.findElement(By.name("firstname")).sendKeys("Lakshay");
	    driver.findElement(By.name("lastname")).sendKeys("Sharma");
	    driver.findElement(By.id("submit")).click();

	}

}
