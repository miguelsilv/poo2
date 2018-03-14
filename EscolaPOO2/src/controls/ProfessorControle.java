package controls;

import java.util.ArrayList;
import models.Professor;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class ProfessorControle implements EscolaControle<Professor> {

    private final ArrayList<Professor> profs;
    private int matricula;

    public ProfessorControle() {
        this.profs = new ArrayList<>();
    }

    @Override
    public void add(Professor item) {
        this.profs.add(item);
    }

    @Override
    public ArrayList<Professor> get() {
        return this.profs;
    }

    @Override
    public Professor get(int matricula) {
        for (Professor a : this.profs) {
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
