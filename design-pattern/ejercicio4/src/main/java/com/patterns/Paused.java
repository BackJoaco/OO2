package com.patterns;

public class Paused implements State{
    private ToDoItem context;
    private String comment;

    public void setContext(ToDoItem context){
        this.context = context;
    }

    public void start(){
        throw new IllegalStateException("La instancia de ToDoItem no se encuentra en estado pendiente.");
    }

    public void togglePause(){
        context.changeContext(new InProgress());
    }

    public void finish(){
        context.changeContext(new Finished());
        context.setEndTime();
    }
    public void addComment(String comment){
        this.comment=comment;
    }
}
