package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosList = new ArrayList<>(this.numerosList);
        Collections.sort(numerosOrdenadosList);
        return numerosOrdenadosList;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosReversoList = new ArrayList<>(this.numerosList);
        numerosOrdenadosReversoList.sort(Collections.reverseOrder());
        return numerosOrdenadosReversoList;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(30);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
        
    }
}
