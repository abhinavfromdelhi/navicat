package openEclipse;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		
		driver.get("http://www.google.com");

	}

}
