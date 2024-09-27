package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeroLista;

    public SomaNumeros() {
        numeroLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroLista.add(new Numero(numero));
    }

    public void calcularSoma(){
        int soma = 0;
        for (Numero n: numeroLista){
            soma += n.getNumero();
        }
        System.out.println(soma);
    }

    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for (Numero n: numeroLista){
            if(n.getNumero() > maiorNumero){
                maiorNumero = n.getNumero();
            }
        }
        System.out.println(maiorNumero);
    }

    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Numero n: numeroLista){
            if (n.getNumero() < menorNumero){
                menorNumero = n.getNumero();
            }
        }
        System.out.println(menorNumero);

    }

    public void exibirNumeros(){
        System.out.println(this.numeroLista);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);

        somaNumeros.exibirNumeros();

        somaNumeros.calcularSoma();
    }
}

/**
 * Numero
 */
class Numero {
    private int numero;
    
    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "" + numero + "";
    }
}
