package controls;

import java.util.ArrayList;
import models.Aluno;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class AlunoControle implements EscolaControle<Aluno> {

    private final ArrayList<Aluno> alunos;
    private int matricula;

    public AlunoControle() {
        this.alunos = new ArrayList<>();
        this.matricula = 0;
    }

    @Override
    public void add(Aluno item) {
        this.alunos.add(item);
        this.matricula++;
    }

    @Override
    public ArrayList<Aluno> get() {
        return this.alunos;
    }

    @Override
    public Aluno get(int matricula) {
        for (Aluno a : this.alunos) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }

    @Override
    public int getMatricula() {
        return this.matricula;
    }
}
