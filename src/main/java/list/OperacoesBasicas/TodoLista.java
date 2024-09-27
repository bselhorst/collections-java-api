package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class TodoLista {

    private List<Todo> listaTodo;

    public TodoLista(){
        this.listaTodo = new ArrayList<>();
    }

    public void adicionar(String tarefa){
        this.listaTodo.add(new Todo(tarefa));
    }

    public void remover(String tarefa){
        List<Todo> itensARemover = new ArrayList<>();
        for(Todo t: listaTodo){
            if(t.getTarefa().equals(tarefa)){
                itensARemover.add(t);
            }
        }
        listaTodo.removeAll(itensARemover);
    }

    public void mudarFinalizar(String tarefa){
        for(Todo t: listaTodo){
            if (t.getTarefa().equals(tarefa)){
                t.setFinalizado(!t.getFinalizado());
            }
        }
    }

    public void listar(){
        System.out.println(this.listaTodo);
    }



    public static void main(String[] args) {
        TodoLista todoLista = new TodoLista();
        todoLista.adicionar("Dar banho no cachorro");
        todoLista.listar();
        todoLista.mudarFinalizar("Dar banho no cachorro");
        todoLista.listar();
        todoLista.remover("Dar banho no cachorro");
        System.out.println("removido");
        todoLista.listar();
        todoLista.adicionar("Aguar as plantas");
        todoLista.listar();
        todoLista.mudarFinalizar("Aguar as plantas");
        todoLista.listar();
    }
}
