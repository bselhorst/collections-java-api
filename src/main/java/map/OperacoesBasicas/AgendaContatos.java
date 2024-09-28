package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()){
            this.agendaContatoMap.remove(nome);
        }else{
            System.out.println("Não existe nenhum elemento");
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Nome 1", 123);
        agendaContatos.adicionarContato("Nome 2", 234);
        agendaContatos.adicionarContato("Nome 3", 2345);
        System.out.println(agendaContatos.pesquisarPorNome("Nome 1"));
        agendaContatos.exibirContatos();
    }
}
