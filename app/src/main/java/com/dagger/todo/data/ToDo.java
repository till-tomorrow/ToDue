package com.dagger.todo.data;

/**
 * Created by Harshit on 05/12/16
 */

public class ToDo {

    private String title;
    private String content;
    private int isComplete;
    private String dueDate;
    private int priority;
    private long timeOfAddition;

    public String getDueDate() {
        return dueDate;
    }

    public ToDo(String title, String content, int isComplete, String date, int priority, long timeOfAddition) {
        this.title = title;
        this.content = content;
        this.isComplete = isComplete;
        this.dueDate = date;
        this.priority = priority;
        this.timeOfAddition = timeOfAddition;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public int isComplete() {
        return isComplete;
    }

    public long getTimeOfAddition() {
        return timeOfAddition;
    }
}
