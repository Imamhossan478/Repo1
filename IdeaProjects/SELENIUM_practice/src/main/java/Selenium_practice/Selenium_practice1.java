package Selenium_practice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_practice1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src/main/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        Thread.sleep(5000);
        driver.close();





    }
}
