package controls;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Silva (1271106300)
 * @param <T> Tipo herdado de pessoa
 */
public interface EscolaControle<T> {

    public void add(T item);

    public ArrayList<T> get();

    public T get(int matricula);

    public int getMatricula();

    public DefaultTableModel atualizarTabela();

}
