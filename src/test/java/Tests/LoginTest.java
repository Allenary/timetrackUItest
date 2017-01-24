package Tests;

import PageComponents.LeftNavigationPane;
import Pages.BasicAuth;
import Tests.Base.BaseTest;
import java.awt.AWTException;
import org.junit.Test;

/**
 *
 * @author NDovhobrod
 */
public class LoginTest extends BaseTest{
    //protected WebDriver driver;

     @Test
     public void test1() throws AWTException{
         new BasicAuth(driver).login(props.BASE_URL, props.ADMIN_LOGIN, props.ADMIN_PASSWORD);
         new LeftNavigationPane(driver).clickForTaxes();
      }
     
}
