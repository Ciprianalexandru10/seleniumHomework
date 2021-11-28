package session4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class Practice2 {

  WebDriver driver;
  Actions action;

  @Before
  public void before(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\CPI\\Downloads\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("ingognito");
    options.addArguments("start-maximized");

    driver = new ChromeDriver(options);
    action = new Actions(driver) ;


  }

  @After
  public void afeter(){
    driver.quit();
  }

  @Test
  public void  dragAndDrop() throws InterruptedException {
    driver.get("http://webdriveruniversity.com/Actions/index.html");

    WebElement from = driver.findElement(By.id("draggable"));
    WebElement to = driver.findElement(By.id("droppable"));

    action.dragAndDrop(from,to).perform();
    Thread.sleep(3000);

    assertEquals("Dropped!",to.getText());
  }

  @Test
  public void contextClick() throws InterruptedException {

    driver.get("https://the-internet.herokuapp.com/context_menu");

    WebElement element = driver.findElement(By.id("hot-spot"));

    action.contextClick(element).perform();
    Thread.sleep(3000);

    Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

  }


  @Test
  public void keyBoardInteractions() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/key_presses");

    WebElement element = driver.findElement(By.id("target"));

    action.keyDown(Keys.SHIFT).sendKeys(element,"endava").keyUp(Keys.SHIFT).sendKeys("endava").perform();
    Thread.sleep(2000);
  }

  @Test
  public void jsExecuter() throws InterruptedException {

    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.get("http://demo.guru99.com/V4/");

    String DomainName = js.executeScript("return document.domain;").toString();
    System.out.println("Domain" +DomainName);

    String url = js.executeScript("return document.URL").toString();
    System.out.println("URL" + url);

    String title = js.executeScript("return document.title").toString();
    System.out.println("");

    js.executeScript("windows.location = 'http://demo.guru99.com/'");
    Thread.sleep(4000);


  }


  @Test
  public void jsAsync(){
    JavascriptExecutor js = (JavascriptExecutor) driver;

    driver.get("http://demo.guru99.com/V4/");

    driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

    long start_time = System.currentTimeMillis();

    js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1],5000);");

    System.out.println("Passed time:  " + (System.currentTimeMillis() - start_time));

  }

}
