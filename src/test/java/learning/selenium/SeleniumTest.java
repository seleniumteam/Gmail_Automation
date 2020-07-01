package learning.selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	String exepath = "\\drivers\\geckodriver.exe";
	
	HashMap<String,String> map = new HashMap<String,String>();
	
	
	
	
	@Test
	public void run()
	{
		
		map.put("firefox", "webdriver.gecko.driver");
		
		System.out.println(System.getProperty("user.name"));
		String path = System.getProperty("user.dir");
		System.setProperty(map.get("firefox"), path+exepath);
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://gmail.com");
		
		System.out.println("The current page url is "+ driver.getCurrentUrl());
		
		int length = driver.getTitle().length();
		
		System.out.println(length);
		
		/*
		 * String pageSource = driver.getPageSource();
		 * 
		 * System.out.println(pageSource);
		 */
		System.getProperty("user.name");
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		
		for (Integer integer : numbers) {
			
			System.out.println(integer);
			
		}
		
	}

}
