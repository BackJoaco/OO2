package com.patterns;

public class Pending implements State{
    private ToDoItem context;
    private String comment;

    public void setContext(ToDoItem context){
        this.context = context;
    }

    public void start(){
        context.changeContext(new InProgress());
    }

    public void togglePause(){
        throw new IllegalStateException("La instancia de ToDoItem se encuentra en estado pendiente.");
    }

    public void finish(){
        throw new IllegalStateException("La instancia de ToDoItem se encuentra en estado pendiente.");
    }
    public Duration workedTime(){
        throw new IllegalStateException("La instancia de ToDoItem se encuentra en estado pendiente.");
    }
    public void addComment(String comment){
        this.comment = comment;
    }
}
