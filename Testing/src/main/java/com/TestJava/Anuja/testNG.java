package com.TestJava.Anuja;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class testNG {
   public static void main(String[] args) {         
	   WebDriver driver = new ChromeDriver();
	   System.setProperty("webdriver.chrome.driver","chromedriver/chromedriver.exe");
       driver.get("Google.com");
    
}

}