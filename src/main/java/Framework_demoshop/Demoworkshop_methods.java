package Framework_demoshop;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Registerpage;

	
public class Demoworkshop_methods {
static WebDriver driver;

public static WebDriver openBrowser() {
	        System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        //driver.get("http://demowebshop.tricentis.com/register");//
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;
	    }

public static WebDriver closeBrowser() {
driver.close();
return driver;
	}

public static void clickButton(WebElement web){
web.click();
}

public static String Message(WebElement web){
return(web.getText());
}

public static void sendData(WebElement web,String data){
web.sendKeys(data);
}
}