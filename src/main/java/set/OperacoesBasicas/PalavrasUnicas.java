package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {

    Set<String> palavrasSet; 

    public PalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String p : palavrasSet) {
            if (p.equals(palavra)){
                this.palavrasSet.remove(p);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        String palavraExiste = null;
        for (String p : palavrasSet) {
            if (p.equals(palavra)){
                palavraExiste = p;
            }
        }
        if(palavraExiste != null){
            System.out.println("Palavra '"+ palavra +"' existe");
        }else
            System.out.println("Palavra '"+ palavra +"' não existe");
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasSet);
    }

    public static void main(String[] args) {
        PalavrasUnicas palavrasUnicas = new PalavrasUnicas();

        palavrasUnicas.adicionarPalavra("teste");
        palavrasUnicas.adicionarPalavra("teste 2");
        palavrasUnicas.adicionarPalavra("teste 3");
        palavrasUnicas.verificarPalavra("teste 3");
        palavrasUnicas.verificarPalavra("teste 4");
        palavrasUnicas.removerPalavra("teste 3");
        palavrasUnicas.verificarPalavra("teste 3");
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
