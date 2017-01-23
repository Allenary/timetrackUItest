package Tests;

import helpers.RobotHelper;
import helpers.TestProperties;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NDovhobrod
 */
public class LoginTest {
    protected WebDriver driver;

     @Test
     public void test1() throws AWTException, InterruptedException, FileNotFoundException, IOException{
        TestProperties props = new TestProperties();
        driver = new ChromeDriver();
        driver.get(props.BASE_URL);
        Robot robot = new Robot();
        Thread.sleep(props.ROBOT_TIMEOUT_MSEC);
        RobotHelper robotHelper = new RobotHelper(robot);
        robotHelper.type(props.ADMIN_LOGIN+"\t"+props.ADMIN_PASSWORD+"\t\n");
        
      }
     @After
     public void cleanUp(){
        //driver.quit();
//        proxy.stop();
     }
}
