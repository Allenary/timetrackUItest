/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestData;

/**
 *
 * @author NDovhobrod
 */
public class Task {
    private String key;
    private String title;
    private String comment;
    private double timeSpent;
    public Task(){}
    public Task(String key, String title, double timeSpent, String comment){
        setKey(key);
        setTitle(title);
        setTimeSpent(timeSpent);
        setComment(comment);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }
    
}
