package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite){
                this.convidadosSet.remove(convidado);
                break;
            }
        }
    }

    public void contarConvidados() {
        System.out.println(convidadosSet.size());
    }

    public void exibirConvidados() {
        System.out.println(this.convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Bruno", 1);
        conjuntoConvidados.adicionarConvidado("Bruno 2", 2);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.contarConvidados();
    }
}
