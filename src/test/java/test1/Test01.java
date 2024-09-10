package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test01 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void hi()
    {
        System.out.println("hello");
        driver.get("https://in.bookmyshow.com/");


    }

    @AfterTest
    public void wrapup()
    {
        driver.quit();
    }
}
