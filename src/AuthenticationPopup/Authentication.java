package AuthenticationPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) {
        
		WebDriver bm = new ChromeDriver();
		bm.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String msg = bm.findElement(By.xpath("//div[@class='example']/p")).getText();
		System.out.println(msg);
		//https://username:password@abc.com
	}

}
