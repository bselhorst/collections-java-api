package main.java.list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return descricao;
    }
}
