package ftx;
import navigator.NavigateToTest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FtxSearchMarketTest {

    private static final Logger logger = LogManager.getLogger(NavigateToTest.class);

    @Test
    public void searchTest() throws InterruptedException {
        System.out.println("Test started!");

        DOMConfigurator.configure("log4j.xml");
        //configure path of chromedriver /Users/kadiryalcin/IdeaProjects/SeleniumToTest/chromedriver
        System.setProperty("webdriver.chrome.chromeDriver", "chromedriver");

        //ChromeDriver instance
        WebDriver chromeDriver = new ChromeDriver();

        try {

          //url launch
          chromeDriver.get("https://www.ftx.com/");

          //Methode/Funtion unter CloseCookie aufgerufen
          CloseCookie.close(chromeDriver);

          // WebElement s = chromeDriver.findElement(By.ByCssSelector.tagName("input"));
          WebElement inputElement = chromeDriver.findElement(By.xpath("//input[@placeholder='Markt suchen']"));

          inputElement.sendKeys("CHZ");
          Thread.sleep(1000);

          List<WebElement> resultElements = chromeDriver.findElements(By.className("jss52"));

          org.junit.Assert.assertTrue(resultElements.size() == 5);

          for (WebElement forResult : resultElements) {
              String href = forResult.getAttribute("href");

              if (href.contains("nfts")) {
                  continue;
              }

              String value = forResult.findElement(By.tagName("div")).findElement(By.tagName("div"))
                      .findElement(By.tagName("span")).getText();
              String formatedValue = value.split("\\n")[0];

              System.out.println(href + " " + formatedValue);

              org.junit.Assert.assertTrue(href.endsWith(formatedValue));

          }
            chromeDriver.quit();

      } catch (Exception error) {
            //browser quit
          chromeDriver.quit();
        }
    }

}
