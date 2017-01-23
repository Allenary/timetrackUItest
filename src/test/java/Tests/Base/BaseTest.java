package Tests.Base;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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
    
    private final String url;
    private final String username = "ninak";
    private final String password = "yS4p97JSZbVMfcxW";
    
    public BaseTest() throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(new File("")));
        url = props.getProperty("TIMETRACK_MAIN_URL");
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }
    
    @After
    public void tearDown() {
        //driver.quit();
    }
    
}
