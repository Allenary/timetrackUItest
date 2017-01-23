/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComponents;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author NDovhobrod
 */
public class LeftNavigationPane  extends AbstractPageComponent{
    @FindBy(id = "hide-navigation-tree")
    WebElement navigationTreeBtn;
    @FindBy(id = "navigation-tree")
    WebElement navigationTree;
//    @FindBy(className = "dynatree-title")
//    List<WebElement> menuItems;
    
    public LeftNavigationPane(WebDriver driver) {
        super(driver);
    }
    
    public void openLeftMenu(){
        navigationTreeBtn.click();
    }
    
    public boolean isNavigationTreeOpened(){
        String strWidth = navigationTree.getCssValue("width");
        double width = Double.parseDouble(strWidth.substring(0,strWidth.length()-2));
        System.out.println(width);
        return width>10;
    }
    
    public void clickForTaxes(){
        WebDriverWait w = new WebDriverWait(driver, 10);
        List<WebElement> menuItems = w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("dynatree-title")));
        menuItems.get(5).click();
    }
    
    
}
