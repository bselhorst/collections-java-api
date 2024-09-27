package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        this.itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List valoresRemovidos = new ArrayList<>();
        for (Item i: itemList){
            if(i.getNome().equals(nome)){
                valoresRemovidos.add(i);
            }
        }
        itemList.removeAll(valoresRemovidos);
    }

    public void calcularValorTotal(){
        Double valorTotal = 0.0;
        for (Item i: itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println(valorTotal.toString());
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item 1", 1.0, 1);
        carrinhoDeCompras.adicionarItem("Item 2", 2.0, 1);
        carrinhoDeCompras.adicionarItem("Item 3", 1.0, 2);

        carrinhoDeCompras.removerItem("Item 1");
        carrinhoDeCompras.removerItem("Item 2");

        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.exibirItens();
    }
}
