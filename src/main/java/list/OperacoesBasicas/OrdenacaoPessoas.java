package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoasLista;

    public OrdenacaoPessoas() {
        this.pessoasLista = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoasLista.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasLista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 36, 1.82);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 32, 1.90);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 30, 1.85);

        System.out.println(ordenacaoPessoas.pessoasLista);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
