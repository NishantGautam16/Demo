//Practice Exercise – 1
//Launch a new Firefox browser.
//Open Store.DemoQA.com
//Get Page Title name and Title length
//Print Page Title and Title length on the Eclipse Console.
//Get Page URL and verify if the it is a correct page opened
//Get Page Source (HTML Source code) and Page Source length
//Print Page Length on Eclipse Console.
//Close the Browser.


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticExercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
		String webURL = "http://www.store.demoqa.com";
		driver.get(webURL);
		String title = driver.getTitle();
		int titleLengh = driver.getTitle().length();
		
		System.out.println("Page title is : "+ title+"and its lengh is : "+titleLengh);
		
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(webURL))
		{
			System.out.println("We have opened correct URL");
		}
		else
		{
			System.out.println("We are on incorrect URL Expected URL is : "+webURL+" But opened another URL i.e. :"+ actualURL);
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = driver.getPageSource().length();
		System.out.println("Length of page source is : "+ pageSourceLength);
		driver.close();

	}

}
