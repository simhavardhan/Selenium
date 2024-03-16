import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsBrowserActivities {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.co.in/");
		dr.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		dr.navigate().back();
		dr.navigate().forward();

	}

}
