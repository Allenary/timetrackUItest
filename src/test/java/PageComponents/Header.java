/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NDovhobrod
 */
public class Header extends AbstractPageComponent{
    @FindBy(id = "curWeekDateRange")
    private WebElement currentWeek;
    @FindBy(id = "curMonthDateRange")
    private WebElement currentMonth;
    @FindBy(id = "curWeekDateRange")
    private WebElement customDateRange;
    
    
    public Header(WebDriver driver) {
        super(driver);
    }
    
    
    
}
