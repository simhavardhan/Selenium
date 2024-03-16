package Calendar;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarHandling {

	public static void main(String[] args) throws InterruptedException {
        
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DEll\\Downloads\\chromedriver-win64.zip\\chromedriver-win64");
		WebDriver dt = new ChromeDriver();
		dt.get("https://rahulshettyacademy.com/dropdownsPractise/");
		dt.findElement(By.xpath("//input[contains(@name,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		dt.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
		Thread.sleep(1000);
		dt.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		dt.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
	}

}
