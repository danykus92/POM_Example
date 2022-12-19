package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
    public static void main(String[] args) throws InterruptedException {

        String projectPath =System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of Login page
        LoginPage login = new LoginPage(driver);

        //Creating object of Dashboard
        Dashboard dashboard = new Dashboard(driver);

        //Click on Login button
        home.clickLogin();

        //Enter username & password
        login.enterUsername("gunjankaushik");
        login.enterPassword("Password@123");

        //Click on login button
        login.clickLogin();
        Thread.sleep(2000);

        //Capture the page heading and print on console
        System.out.println("The page heading is --- " +dashboard.getHeading());


        //Click on Logout button
        dashboard.clickLogout();

        //Close browser instance
        driver.quit();
    }
}
