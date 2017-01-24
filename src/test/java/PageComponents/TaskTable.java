/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComponents;

import TestData.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author NDovhobrod
 */
public class TaskTable  extends AbstractPageComponent{
    @FindBy(id = "taskTable")
    private WebElement table;
    
    public TaskTable(WebDriver driver) {
        super(driver);
    }
    
    public int getCountTasks(){
        return driver.findElements(By.xpath("//td[@aria-describedby='taskTable_taskId'][@title!='-1']/..")).size();
    }
    public void pressFunctionalKey(CharSequence... keys){
        table.sendKeys(keys);
    }
    
    public void addNewTaskUsing(Task task, CharSequence... keys){
        pressFunctionalKey(keys);
        new TaskRow(driver).fillTask(task);
        pressFunctionalKey(Keys.CONTROL, "s");
    }
}
