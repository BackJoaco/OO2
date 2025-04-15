package com.patterns;

public class Finished implements State {
    private ToDoItem context;

    public void setContext(ToDoItem context){
        this.context = context;
    }

    public void start(){
        throw new IllegalStateException("La instancia de ToDoItem no se encuentra en estado pendiente.");
    }

    public void togglePause(){
        throw new IllegalStateException("La instancia de ToDoItem se encuentra en estado de finalizada.");
    }

    public void finish(){
        throw new IllegalStateException("La instancia de ToDoItem se encuentra en estado de finalizada.");
    }

    public Duration workedTime(){
        return this.context.getDuration();
    }
}
