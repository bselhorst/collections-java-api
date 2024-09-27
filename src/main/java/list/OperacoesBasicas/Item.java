package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Nome: "+nome+" | Preço: "+ this.preco +" | Quantidade: " + quantidade + "]";
    }
    
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
