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

    public Aluno(int matricula, String nome, int qntCred, String sexo) {
        super(matricula, nome, qntCred, sexo);
    }

    public Aluno(Pessoa p) {
        super(p.matricula, p.nome, p.qntCred, p.sexo);
    }

}
