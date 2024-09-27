package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!this.livrosList.isEmpty()){
            for (Livro livro: livrosList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!this.livrosList.isEmpty()){
            for (Livro livro: livrosList){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!this.livrosList.isEmpty()){
            for (Livro livro: this.livrosList){
                if (livro.getTitulo().equals(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O homem mal", "teste", 2000);
        catalogoLivros.adicionarLivro("O homem bom", "teste2", 2002);
        catalogoLivros.adicionarLivro("O homem neutro", "teste3", 2004);

        System.out.println(catalogoLivros.livrosList+"\n");

        System.out.println(catalogoLivros.pesquisarPorAutor("teste")+"\n");

        System.out.println(catalogoLivros.pesquisarPorTitulo("O homem bom")+"\n");

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2002)+"\n");

    }
}
