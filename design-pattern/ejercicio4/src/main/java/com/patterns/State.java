package com.patterns;

public interface State {
    public void finish();
    public void togglePause();
    public void start();
    public void setContext(ToDoItem context);
    public void addComment(String comment);
}
