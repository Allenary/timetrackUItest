package Tests.Base;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.auth.AuthType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author NDovhobrod
 */
public class BaseTest {
    protected WebDriver driver;
    
    private BrowserMobProxy proxy;
    
    private final String host = "timetrack";
    private final String username = "ninak";
    private final String password = "yS4p97JSZbVMfcxW";
    
    public BaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        proxy = new BrowserMobProxyServer();
        proxy.start(0);
        proxy.autoAuthorization(host,username,password, AuthType.BASIC);
        driver = new ChromeDriver(getCapabilities());
    }
    
    @After
    public void tearDown() {
        proxy.stop();
        //driver.quit();
    }
    
    private DesiredCapabilities getCapabilities(){
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
        
        return capabilities;
    }

}
