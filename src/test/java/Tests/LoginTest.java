package Tests;

import helpers.RobotHelper;
import java.awt.AWTException;
import java.awt.Robot;
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
    
    private final String username = "";
    private final String password = "";
    private final String url ="";
    
   
     @Test
     public void test1() throws AWTException, InterruptedException{
        driver = new ChromeDriver();
        driver.get(url);
        Robot robot = new Robot();
        Thread.sleep(2000);
        RobotHelper robotHelper = new RobotHelper(robot);
        robotHelper.type(username+"\t"+password+"\t\n");
        
      }
     @After
     public void cleanUp(){
        //driver.quit();
//        proxy.stop();
     }
}
