/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComponents;

import TestData.Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NDovhobrod
 */
public class TaskRow extends AbstractPageComponent{
    @FindBy(css = "td [name=key]")
    WebElement name;
    @FindBy(css = "td [name=title]")
    WebElement title;
    @FindBy(css = "td [name=timeSpent]")
    WebElement timeSpent;
    @FindBy(css = "td [name=comment]")
    WebElement comment;
    
    public TaskRow(WebDriver driver) {
        super(driver);
    }
    public void fillTask(Task task){
        name.sendKeys(task.getKey());
        title.sendKeys(task.getTitle());
        timeSpent.sendKeys(String.valueOf(task.getTimeSpent()));
        comment.sendKeys(task.getComment());
    }
    
    
}
