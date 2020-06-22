package MainPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogInPage extends Basepage {

    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }
    //identifying locators
    protected final By signinbutton = By.xpath("//*[@id=\"header\"]/div/header/div/div/div[1]/a[1]");
    protected final By username = By.xpath("//*[@id=\"signon_form:userName\"]");
    protected final By password = By.xpath("//*[@id=\"signon_form:password_0\"]");

    protected final By signin = By.xpath("//*[@id=\"signon_form:enter_sol\"]");
    protected final By global = By.xpath("//*[@id=\"enter-scotiabank-canada\"]");
    protected final By textcomapare = By.xpath("//*[@id=\"span_msgs_5\"]/div/ul/li/span");




    public void signin() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(global).click();

        Thread.sleep(3000);
        driver.findElement(signinbutton).click();
        Thread.sleep(3000);
        driver.findElement(username).click();
        driver.findElement(username).sendKeys("johngulluru@gmail.com");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("abcd12345");
        driver.findElement(signin).click();
        String txt1 = driver.findElement(textcomapare).getText();
        Assert.assertEquals(txt1,"Either the username or password is incorrect. Please try again." );



    }

}
