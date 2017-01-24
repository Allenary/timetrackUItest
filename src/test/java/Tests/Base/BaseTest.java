package Tests.Base;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pages.BasicAuth;
import helpers.TestProperties;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NDovhobrod
 */
public class BaseTest {
    protected WebDriver driver;

    protected static TestProperties props;

    public void login(String username, String password) throws AWTException{
        new BasicAuth(driver).login(props.BASE_URL, username, password);
    }
    public void loginAsAdmin() throws AWTException{
        login(props.ADMIN_LOGIN, props.ADMIN_PASSWORD);
    }
    @BeforeClass
    public static void setUpClass() throws IOException {
        props = new TestProperties();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(props.SELENIUM_IMPLICIT_TIMEOUT_MSEC,TimeUnit.MILLISECONDS);
    }
    
    @After
    public void tearDown() {
       // driver.quit();
       //driver = null;
    }
        
}
