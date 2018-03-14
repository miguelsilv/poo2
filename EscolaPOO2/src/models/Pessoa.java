package models;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Pessoa {

    protected int matricula;
    protected String nome;
    protected int qntCred;

    public Pessoa(int matricula, String nome, int qntCred) {
        this.matricula = matricula;
        this.nome = nome;
        this.qntCred = qntCred;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getQntCred() {
        return qntCred;
    }

}
