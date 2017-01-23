/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import helpers.RobotHelper;
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author NDovhobrod
 */
public class BasicAuth extends BasePage{

    public BasicAuth(WebDriver driver) {
        super(driver);
    }
    
    public void login(String url, String login, String password) throws AWTException{
        driver.get(url);
        RobotHelper robotHelper = new RobotHelper();
        robotHelper.type(login+"\t"+password+"\t\n");
    }
}
