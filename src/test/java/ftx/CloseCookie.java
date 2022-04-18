package ftx;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CloseCookie {

    public static void close (WebDriver webDriver){
        List<WebElement> buttons = webDriver.findElements(By.tagName("button"));

        for (WebElement button : buttons) {
            if (button.getText().equals("ACCEPT ALL COOKIES")) {
                button.click();
            }
        }
    }


}
