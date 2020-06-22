package Testcases;

import MainPages.Basepage;
import MainPages.LogInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class login extends Basepage {

//@BeforeTest

//public void beforeTest() throws IOException, IOException {
    //driver = initalizeDriver();
   // driver.get(application);
    //System.out.println("This is before class");
//}

    @Test
    public void signinscotia() throws InterruptedException, IOException {
        driver = initalizeDriver();
        driver.get(application);
    LogInPage login = new LogInPage(driver);
    login.signin();

    System.out.println("This is my test");

}
    @AfterTest
    public void dummyAfterTest(){
        driver.quit();
        System.out.println("This is after class");
    }
}


