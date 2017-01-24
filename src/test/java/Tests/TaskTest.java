package Tests;

import PageComponents.LeftNavigationPane;
import PageComponents.TaskRow;
import PageComponents.TaskTable;
import TestData.Task;
import Tests.Base.BaseTest;
import java.awt.AWTException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.Keys;

/**
 *
 * @author NDovhobrod
 */
public class TaskTest extends BaseTest{
    
    @Before
    public void testPrecondition() throws AWTException {
        loginAsAdmin();
        String menuName = new LeftNavigationPane(driver).getTextOfActiveMenuItem();
        assertEquals("My tasks", menuName);
    }
    

    @Test
    public void AddTaskByInsertTest() {
       TaskTable taskTable = new TaskTable(driver);
       int countTasksInitial = taskTable.getCountTasks();

       taskTable.addNewTaskUsing(getValidTask(), Keys.INSERT);
       driver.navigate().refresh();
       
       assertEquals(countTasksInitial+1, taskTable.getCountTasks()); 
       //TODO: add verification that exactly same task is added
    }
    
    @Test
    public void AddTaskByDownTest() {
       TaskTable taskTable = new TaskTable(driver);
       int countTasksInitial = taskTable.getCountTasks();

       taskTable.addNewTaskUsing(getValidTask(), Keys.DOWN);
       driver.navigate().refresh();
       
       assertEquals(countTasksInitial+1, taskTable.getCountTasks());      
       //TODO: add verification that exactly same task is added
    }
     
    private Task getValidTask(){
        return new Task("TEST_KEY-1", "TEST_TITLE",1, "TEST_COMMENT");
    } 
}
