package main.java.list.OperacoesBasicas;

public class Todo {
    
    private String tarefa;
    private boolean finalizado = false;

    public Todo(String tarefa){
        this.tarefa = tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    public boolean getFinalizado(){
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Tarefa: " + tarefa + " | finalizado: " + finalizado +"]";
    }

}
