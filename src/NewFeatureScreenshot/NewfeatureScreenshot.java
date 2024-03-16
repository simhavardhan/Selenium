package NewFeatureScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class NewfeatureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver v = new ChromeDriver();
		v.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		v.manage().window().maximize();
		v.get("https://rahulshettyacademy.com/angularpractice/");
		v.switchTo().newWindow(WindowType.TAB);
		Set<String> windowss = v.getWindowHandles();
		Iterator<String> it= windowss.iterator();
		String parentwindoww =it.next();
		String childwindoww =it.next();
		v.switchTo().window(childwindoww);
		v.get("https://rahulshettyacademy.com/");
		String coursename = v.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		v.switchTo().window(parentwindoww);
		WebElement element =v.findElement(By.xpath("//input[@minlength='2']"));
		element.sendKeys(coursename);
		File src = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("elementscreenshot.png"));
		//getting Demesions
		System.out.println(element.getRect().height);
		System.out.println(element.getRect().width);
		

	}

}
