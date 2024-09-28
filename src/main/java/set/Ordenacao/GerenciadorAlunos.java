package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        this.alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        for (Aluno aluno : alunosSet) {
            if (aluno.getMatricula() == matricula){
                this.alunosSet.remove(aluno);
                break;
            }
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(this.alunosSet);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos() {
        System.out.println(this.alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 1111, 7.0);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 1113, 4.0);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 1112, 2.0);
        gerenciadorAlunos.adicionarAluno("Aluno a remover", 1, 4.0);

        gerenciadorAlunos.removerAluno(1);

        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

        gerenciadorAlunos.exibirAlunos();
    }
}
