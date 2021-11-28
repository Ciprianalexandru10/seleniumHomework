package sesion3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Practice5 {

    WebDriver driver;
    Actions actions;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

//    @Test
//    public void jsAlert(){
//        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//
//        WebDriverWait wait2 = new WebDriverWait(driver,2);
//
//        WebElement jsConfirm = driver.findElement(By.tagName("button")).get(1);
//        jsConfirm.click();
//
//        wait2.until(ExpectedCondition.alertIsPresent
//    }
    @Test
    public void iFrameTest() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.id("tinymce"));
        Thread.sleep(2000);
        textArea.clear();
        Thread.sleep(2000);
        textArea.sendKeys("New Text");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
    }

    @Test
    public void windowsTest() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/windows");

        String firstWindow = driver.getWindowHandle();
        System.out.println("First Window" + firstWindow);

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Thread.sleep(2000);

        System.out.println("After Click");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());

        Set<String> allWindows = driver.getWindowHandles();

        for(String window: allWindows){
            if(!window.equals(firstWindow)){
                driver.switchTo().window(window);
            }

        }

        System.out.println("After switch");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getTitle());

        assertEquals("http://the-internet.herokuapp.com/windows/new", driver.getCurrentUrl());
//        assertEquals("",driver.getTitle());


    }

    @Test
    public void multipleSelections() throws InterruptedException {

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        Select multiple = new Select(driver.findElement(By.name("selenium_commands")));
        multiple.deselectAll();
        Thread.sleep(4000);
        List <WebElement> options = multiple.getOptions();

        actions.keyDown(Keys.CONTROL)
                .click(options.get(1))
        .click(options.get(2)).perform();


    }

}
