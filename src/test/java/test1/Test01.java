package test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Test01 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup(); // Call setup here
        driver = new ChromeDriver(); // Initialize driver here
    }

    @Test
    public void hi() {
        System.out.println("hello");
        driver.get("https://in.bookmyshow.com/");
    }

    @AfterTest
    public void wrapup() {
        driver.quit();
    }
}