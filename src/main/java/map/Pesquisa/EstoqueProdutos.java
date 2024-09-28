package main.java.map.Pesquisa;

import java.util.HashMap;

public class EstoqueProdutos {

    private HashMap<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public void calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!this.estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        System.out.println(valorTotalEstoque);
    }

    public void obterProdutosMaisCaros() {
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    }

    public void obterProdutosMaisBaratos() {
        Produto produtoMaisCaro = null;
        Double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        System.out.println("Produto mais barato: " + produtoMaisCaro);
    }

    public void obterProdutoMaiorQuantidadeValorNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        Integer maiorQuantidade = Integer.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getQuantidade() > maiorQuantidade) {
                maiorQuantidade = p.getQuantidade();
                produtoMaiorQuantidade = p;
            }
        }
        System.out.println("Produto maior quantidade: " + produtoMaiorQuantidade);
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "P1", 1, 10.0);
        estoqueProdutos.adicionarProduto(2, "P2", 10, 3.0);
        estoqueProdutos.adicionarProduto(3, "P3", 2, 7.0);

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.calcularValorTotalEstoque();
        estoqueProdutos.obterProdutosMaisCaros();
        estoqueProdutos.obterProdutosMaisBaratos();
        estoqueProdutos.obterProdutoMaiorQuantidadeValorNoEstoque();
    }
}
