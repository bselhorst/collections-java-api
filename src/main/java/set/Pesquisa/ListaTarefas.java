package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));   
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                this.tarefaSet.remove(t);
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if(tarefa.getConcluido() == true){
                tarefasConcluidas.add(tarefa);
            }
        }
        System.out.println(tarefasConcluidas);
    }
    
    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if(tarefa.getConcluido() == false){
                tarefasPendentes.add(tarefa);
            }
        }
        System.out.println(tarefasPendentes);
    }

    public void marcarTarefaConcluidas(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("t1");
        listaTarefas.adicionarTarefa("t2");
        listaTarefas.adicionarTarefa("t3");
        listaTarefas.marcarTarefaConcluidas("t1");
        listaTarefas.marcarTarefaConcluidas("t2");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaPendente("t2");
        listaTarefas.exibirTarefas();
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
