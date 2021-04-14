package com.company;

public class Task implements Comparable<Task> {

    private String title;
    private String description;
    //Intiger can be sorted like title
    private int priority;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "\tTask " + title + "\n Description: " + description + "\n Priority: " + priority;
    }

    @Override
    public int compareTo(Task o) {
        int compareResults = this.title.compareTo(o.title);

        return compareResults;
    }

}
