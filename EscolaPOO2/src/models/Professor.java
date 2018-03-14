package models;

/**
 *
 * @author Miguel Silva (1271106300)
 */
/*
Os professores possuem
    • Matrícula
    • Nome
    • Quantidade de créditos do semestre atual
    • Valor da hora/aula
 */
public class Professor extends Pessoa {

    double valorHora;

    public Professor(int matricula, String nome, int qntCred, double valorHora) {
        super(matricula, nome, qntCred);
        this.valorHora = valorHora;
    }

    public Professor(Pessoa p, double valorHora) {
        super(p.matricula, p.nome, p.qntCred);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getSalario() {
        return valorHora * qntCred;
    }
}
