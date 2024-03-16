import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentToSiblings {

	public static void main(String[] args) {
		
		WebDriver v = new ChromeDriver();
		v.manage().window().maximize();
		v.get("https://rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(v.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
	    System.out.println(v.findElement(By.xpath("//header/div/button/parent::div/child::button[3]")).getText());
		

	}

}
