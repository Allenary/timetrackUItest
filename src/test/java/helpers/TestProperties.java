package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author NDovhobrod
 */
public class TestProperties {
    public final String BASE_URL;
    public final String ADMIN_LOGIN;
    public final String ADMIN_PASSWORD;
    
    public final int SELENIUM_IMPLICIT_TIMEOUT_MSEC;
    public final int SELENIUM_EXPLICIT_TIMEOUT_MSEC; 
    
    public TestProperties() throws FileNotFoundException, IOException{
        this("src/main/resources/TestSettings.properties");
    }
    
    public TestProperties(String url) throws FileNotFoundException, IOException{
        Properties props = new Properties();
        props.load(new FileInputStream(new File(url)));
        BASE_URL = props.getProperty("TIMETRACK_MAIN_URL");
        ADMIN_LOGIN = props.getProperty("ADMIN_LOGIN");
        ADMIN_PASSWORD = props.getProperty("ADMIN_PASSWORD");
        SELENIUM_IMPLICIT_TIMEOUT_MSEC = Integer.valueOf(props.getProperty("SELENIUM_IMPLICIT_TIMEOUT_MSEC"));
        SELENIUM_EXPLICIT_TIMEOUT_MSEC = Integer.valueOf(props.getProperty("SELENIUM_EXPLICIT_TIMEOUT_MSEC"));
    }
    
}
