package Tests;

import Pages.BasicAuth;
import Tests.Base.BaseTest;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author NDovhobrod
 */
public class LoginTest extends BaseTest{
    //protected WebDriver driver;

     @Test
     public void test1() throws AWTException, InterruptedException, FileNotFoundException, IOException{
         new BasicAuth(driver).login(props.BASE_URL, props.ADMIN_LOGIN, props.ADMIN_PASSWORD);
      }
     
}
