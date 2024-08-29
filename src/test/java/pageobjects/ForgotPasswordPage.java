package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage {
    private WebDriver driver;
    private final By authLink = By.xpath(".//a[starts-with(@class,'Auth_link')]");
    private final By modalOverlay = By.xpath(".//div[starts-with(@class, 'App_App')]/div[starts-with(@class, 'Modal_modal')]");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAuthLink() {
        waitButtonIsClickable();
        driver.findElement(authLink).click();
    }
    private void waitButtonIsClickable() {
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.invisibilityOf(driver.findElement(modalOverlay)));
    }
}
