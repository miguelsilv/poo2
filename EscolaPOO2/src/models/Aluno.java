package models;

/**
 *
 * @author Miguel Silva (1271106300)
 */
/*
Os alunos possuem
    • Matrícula
    • Nome
    • Quantidade de créditos do semestre atual
 */
public class Aluno extends Pessoa {

    public Aluno(int matricula, String nome, int qntCred) {
        super(matricula, nome, qntCred);
    }

    public Aluno(Pessoa p) {
        super(p.matricula, p.nome, p.qntCred);
    }

}
