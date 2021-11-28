package session4;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
;

public class Practice1 {

    @Test
    public void  screenShotTest() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/broken_images");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot,new File("src/main/resources/Screen.jpg"));

        driver.quit();
    }

}
