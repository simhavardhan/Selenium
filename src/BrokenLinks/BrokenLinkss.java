package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkss {

	public static void main(String[] args) throws MalformedURLException, IOException{
		
		WebDriver ra = new ChromeDriver();
		ra.manage().window().maximize();
		ra.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ra.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = ra.findElements(By.xpath("//li[@class='gf-li']//a"));
		SoftAssert asserts = new SoftAssert();
		for(WebElement link :links) {
		String	url = link.getAttribute("href");
		HttpURLConnection connection =(HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode =  connection.getResponseCode();
		if(responseCode > 400) {
			System.out.println("The " + link.getText() + "link is broken with status code : " + responseCode +":"+ link.getAttribute("href"));
			//Assert.assertTrue(false);
		}
		
		}
		asserts.assertAll();

	}

}
