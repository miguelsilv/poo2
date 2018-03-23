package models;

import java.util.ArrayList;

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

    ArrayList<HistoricoAluno> historico;

    public Aluno(int matricula, String nome, int qntCred, String sexo) {
        super(matricula, nome, qntCred, sexo);
        this.historico = new ArrayList<>();
    }

    public Aluno(Pessoa p) {
        super(p.matricula, p.nome, p.qntCred, p.sexo);
    }

    public boolean addNota(int codigoDisciplina, double... notas) {
        for (HistoricoAluno ha : historico) {
            if (ha.getDisciplina().getCodigo() == codigoDisciplina) {
                ha.setNota(notas);
                return true;
            }
        }
        return false;
    }

}
