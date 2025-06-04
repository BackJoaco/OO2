package com.patterns;

public class ToDoItem {
    private String name;
    private State state;
    private Duration time;
    /**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
    public ToDoItem(String name){
        this.name = name;
        this.state = new Pending();
        state.setContext(this);
    }

    public void changeContext(State state){
        this.state = state;
        state.setContext(this);
    }

/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
    public void start(){
        state.start();
    }

/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/

    public void togglePause(){
        state.togglePause();
    }


/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
    public void finish(){
        state.finish();
    }


/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
    public void setEndTime(){
        this.time.setEndDate();
    }
    public Duration workedTime(){
        return null;
    }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario hace nada."
*/
    public void addComment(String comment){
        state.addComment(comment);
    }

}
// Falta hacer el método workedTime() y el metodo addComment(), tambien consultar si el resto está bien