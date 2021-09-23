package selenium_practice.maven_git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_login {
	
	
	@Test
	public void run()
	{ System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    // browser type and chromedrover.exe path as parameters
  
    String url = "https://opensource-demo.orangehrmlive.com/";
    driver.get(url);
    


    
    

	}
	
	
	
}
