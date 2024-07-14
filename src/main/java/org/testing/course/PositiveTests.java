package org.testing.course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PositiveTests {
    @Test
    public void loginTest(){
        // create a drive
        WebDriver driver = new EdgeDriver();
        sleep(1);

        // Open a Web Page
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        sleep(1);

        driver.manage().window().maximize();

        sleep(1);
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
