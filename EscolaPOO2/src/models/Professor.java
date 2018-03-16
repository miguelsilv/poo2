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

    public Professor(int matricula, String nome, int qntCred, String sexo, double valorHora) {
        super(matricula, nome, qntCred, sexo);
        this.valorHora = valorHora;
    }

    public Professor(Pessoa p, double valorHora) {
        super(p.matricula, p.nome, p.qntCred, p.sexo);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getSalario() {
        return valorHora * qntCred;
    }

    @Override
    public boolean isEmpty() {
        return this.valorHora == 0 && super.isEmpty();
    }

}
