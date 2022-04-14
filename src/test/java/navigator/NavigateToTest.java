package navigator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Thread.sleep(1000);
        logger.info("Page title: "+ driver.getTitle());

        //WebElement nameElement = driver.findElement(By.id("MuiButton-label"));
        //nameElement.click();

        //browser quit
        driver.quit();

    }
}
