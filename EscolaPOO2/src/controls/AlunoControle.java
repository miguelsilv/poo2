package controls;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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

    @Override
    public DefaultTableModel atualizarTabela() {
        String[] colunas = new String[]{"Matricula", "Aluno", "Sexo", "Creditos"};

        DefaultTableModel modeloTable = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        while (modeloTable.getRowCount() > 0) {
            modeloTable.removeRow(0);
        }

        for (Aluno aluno : alunos) {
            modeloTable.addRow(new Object[]{aluno.getMatricula(), aluno.getNome(), aluno.getSexo(), aluno.getQntCred()});
        }
        return modeloTable;
    }
}
