package PermissionPopup;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermisionPopUps {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String,Integer> contentsettings = new HashMap<String,Integer>();
		HashMap<String,Object> profile = new HashMap<String,Object>();
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		contentsettings.put("geolocation",0);
		profile.put("managed_default_content_settings", contentsettings);
		prefs.put("profile",profile);
	    options.setExperimentalOption("prefs", prefs);
	    WebDriver m = new ChromeDriver(options);
	    m.get("https://whatmylocation.com/");

	}

}
