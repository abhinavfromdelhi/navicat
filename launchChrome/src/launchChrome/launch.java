package launchChrome;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static ChromeDriver driver;
	
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver(); **code does'nt work if ChromeDriver is instantiated here and not before main method

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhibaja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
       
        // Visit Google
        driver.get("http://www.google.com");
	}

}
