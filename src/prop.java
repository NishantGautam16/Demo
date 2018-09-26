import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"Desktop"+File.separator+"Test"+File.separator+"chromedriver_win32"+File.separator+"chromedriver.exe"); 
	    driver = new ChromeDriver();
	    Properties pro = new Properties();
	    FileInputStream ip = new FileInputStream("C:"+File.separator+"Users"+File.separator+"nishantgautam"+File.separator+"workspace"+File.separator+"SarthakSirQuestions"+File.separator+"test.properties");
	    pro.load(ip);
	    
	    driver.get(pro.getProperty("URL"));
	}

}
