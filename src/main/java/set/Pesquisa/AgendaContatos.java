package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(this.contatoSet);
    }

    public void pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        System.out.println(contatosPorNome);
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
            };
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pessoa 1", 123123);
        agendaContatos.adicionarContato("Pessoa 2", 121212);
        agendaContatos.adicionarContato("Pessoa 3", 313131);

        agendaContatos.pesquisarPorNome("Pessoa 1");
        agendaContatos.pesquisarPorNome("Pessoa");
        agendaContatos.atualizarNumeroContato("Pessoa 1", 530444);

        agendaContatos.exibirContatos();
    }
}
