package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> palavras;

    public ContagemPalavra() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String linguagem, Integer contagem) {
        this.palavras.put(linguagem, contagem);
    }

    public void removerPalavra() {
        
    }

    public void exibirContagemPalavras() {
        
    }

    public void encontrarPalavraMaisFrequente() {
        
    }

    public void exibirTodos() {
        System.out.println(this.palavras);
    }

    public static void main(String[] args) {
        ContagemPalavra contagemPalavra = new ContagemPalavra();

        contagemPalavra.adicionarPalavra("teste", 1);
        contagemPalavra.adicionarPalavra("teste", 1);
        contagemPalavra.exibirTodos();
    }
}
