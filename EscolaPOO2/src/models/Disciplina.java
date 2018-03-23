package models;

import java.util.ArrayList;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Disciplina {

    private int codigo;
    private String nome;
    private int qntCred;
    private Professor prof;
    private ArrayList<Aluno> alunos;

    public Disciplina(int codigo, String nome, int qntCred, Professor prof) {
        this.codigo = codigo;
        this.nome = nome;
        this.qntCred = qntCred;
        this.prof = prof;
        this.alunos = new ArrayList<>();
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQntCred() {
        return qntCred;
    }

    public Professor getProf() {
        return prof;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

}
