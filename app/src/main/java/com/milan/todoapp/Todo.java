package com.milan.todoapp;

public class Todo {
    private Long id;
    private String title;
    private String date;
    private String category;
    private Integer priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Todo(Long id, String title, String date, String category, Integer priority) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.category = category;
        this.priority = priority;
    }

}
