package com.patterns;

public interface State {
    public Duration workedTime();
    public void finish();
    public void togglePause();
    public void start();
    public void setContext(ToDoItem context);
}
