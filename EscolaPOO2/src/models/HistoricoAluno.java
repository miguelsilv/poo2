package models;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class HistoricoAluno {

    private Disciplina disciplina;
    private double[] nota;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
    
    
}
