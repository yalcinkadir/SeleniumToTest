package Facebook;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

    static WebDriver chromeDriver = new ChromeDriver();

    @BeforeAll
    public static void setUpClass() {
        //executed only once, before the first test
        //ChromeDriver instance
        System.setProperty("webdriver.chrome.chromeDriver", "chromedriver");
        chromeDriver.manage().window().maximize();
        System.out.println("Go to Facebook");
        chromeDriver.get("https://www.facebook.com/");
    }

    private void setFacebookUsername(String username) {

        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@data-testid='royal_email']"));
        inputEmail.sendKeys(username);
        System.out.println("username added");
    }

    private void setFacebookPassword(String password) {
        WebElement inputPassword = chromeDriver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
        inputPassword.sendKeys(password);
        System.out.println("password added");
    }

    private void clickLogin() throws InterruptedException {
        WebElement buttonLogin = chromeDriver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
        buttonLogin.click();
        Thread.sleep(1000);
        System.out.println("Login In");
    }

    private void facebookClosePopup() {

        WebElement buttonElement = chromeDriver.findElement(By.xpath("//button[@data-testid='cookie-policy-manage-dialog-accept-button']"));
        buttonElement.click();
        System.out.println("Pop-Up closed");
    }

    @Test
    public void wrongUserAndPassword() throws InterruptedException {

        this.facebookClosePopup();

        this.setFacebookUsername("mail@mail.com");

        this.setFacebookPassword("Test1234");

        this.clickLogin();

        WebElement errorMessage = chromeDriver.findElement(By.className("_9ay7"));
        System.out.println(errorMessage.getText());
        boolean errorMessageTrue = errorMessage.getText().equals("Das von dir eingegebene Passwort ist falsch. Passwort vergessen?");
        System.out.println("Error Text is: " + errorMessageTrue);
        org.junit.jupiter.api.Assertions.assertTrue(errorMessageTrue);

        WebElement passwordForgetButton = chromeDriver.findElement(By.className("_97w4"));
        System.out.println(passwordForgetButton.getText());
        boolean passwordForgetTrue = passwordForgetButton.getText().equals("Passwort vergessen?");
        System.out.println("Password Button: " + passwordForgetTrue);
        org.junit.jupiter.api.Assertions.assertTrue(passwordForgetTrue);

        Thread.sleep(10000);

    }

    @Test
    public void correctUsernameAndPassword() throws InterruptedException {

        this.facebookClosePopup();
        this.setFacebookUsername("mail@mail.com");
        this.setFacebookPassword("password");
        this.clickLogin();
        Thread.sleep(1000);

        WebElement konto = chromeDriver.findElement(By.xpath("//div[@aria-label='Konto']"));
        System.out.println(konto);
        konto.click();
        org.junit.jupiter.api.Assertions.assertNotNull(konto);

    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("After All cleanUp() method called");
        chromeDriver.quit();
    }
}




