package main.java.map.OperacoesBasicas;

import java.util.HashMap;

public class Dicionario {

    private HashMap<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(this.dicionarioMap);
    }

    public void pesquisarPorPalavra(String palavra) {
        String pesquisaPorPalavra = null;
        pesquisaPorPalavra = this.dicionarioMap.get(palavra);
        System.out.println(pesquisaPorPalavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Branco", "Cor branca");
        dicionario.adicionarPalavra("Preto", "Cor preta");
        dicionario.adicionarPalavra("Azul", "Cor azul");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Azul");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Branco");
    }
}
