import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    String webURL = "http://demoqa.com/frames-and-windows/";
	    driver.get(webURL);
//	    driver.navigate().to(webURL);
	    driver.findElement(By.xpath("//a[text()='Hello world!']")).click();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.close();

	}

}
