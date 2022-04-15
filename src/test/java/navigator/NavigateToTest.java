package navigator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class NavigateToTest {

    private static final Logger logger = LogManager.getLogger(NavigateToTest.class);

    @Test
    public void test() throws InterruptedException  {

        DOMConfigurator.configure("log4j.xml");
        //configure path of chromedriver /Users/kadiryalcin/IdeaProjects/SeleniumToTest/chromedriver
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        logger.info("get set of properties");
        logger.debug("tehere is a debug");
        //ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        //url launch
        driver.get("https://www.ftx.com/");
        logger.error("get set of driver + sleeping");
        //Thread.sleep(1000);
        System.out.println("Page title: "+ driver.getTitle());

        String title = driver.getTitle();

        assertEquals("FTX Cryptocurrency Derivatives Exchange", title);

        //WebElement cookieButton = driver.findElement(By.className("jss636"));
        //cookieButton.click();

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            System.out.println(button.getText());
            if (button.getText().equals("ACCEPT ALL COOKIES")) {
                button.click();
            }
        }

        //browser quit
        driver.quit();

    }

    @Test
    public void test2() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        System.out.println("das ist test 2");

    }

}
