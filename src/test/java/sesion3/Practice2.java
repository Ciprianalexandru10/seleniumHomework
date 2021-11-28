package sesion3;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Practice2 {
        @Test
        public void firstSeleniumTest() throws InterruptedException {

         System.setProperty("webdriver.chrome.driver","C:\\Users\\CPI\\Downloads\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.get("http://the-internet.herokuapp.com/");

            Dimension d1 = driver.manage().window().getSize();
            System.out.println("Dimension" + d1);

            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.navigate().refresh();
            Thread.sleep(2000);

            Dimension d2 = new Dimension(300,200);
            driver.manage().window().setSize(d2);

            Thread.sleep(2000);



            driver.close();




        }
}
