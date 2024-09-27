package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.produtoSet);
    }

    public void exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        System.out.println(produtosPorNome);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Galinha", 3.0, 1);
        cadastroProdutos.adicionarProduto(2, "Pato", 5.0, 1);
        cadastroProdutos.adicionarProduto(3, "Boi", 2.0, 1);
        cadastroProdutos.adicionarProduto(4, "Cabra", 1.0, 1);
        cadastroProdutos.adicionarProduto(1, "Limão", 1.0, 1);

        cadastroProdutos.exibirProdutosPorPreco();
        cadastroProdutos.exibirProdutosPorNome();

        cadastroProdutos.exibirProdutos();
    }
}
