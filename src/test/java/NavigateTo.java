import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigateTo {

    public static void main(String[] args) {

        //configure path of chromedriver /Users/kadiryalcin/IdeaProjects/SeleniumToTest/chromedriver
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        //ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        //url launch
        driver.get
                ("https://www.ftx.com/");
        System.out.println("Page title: "+ driver.getTitle());
        //browser quit
        driver.quit();

    }
}
