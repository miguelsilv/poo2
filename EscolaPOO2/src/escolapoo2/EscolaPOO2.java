package escolapoo2;

import controls.AlunoControle;
import controls.ProfessorControle;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import models.Aluno;
import models.Professor;

/**
 *
 * @author Miguel Silva (1271106300)
 *
 * Não tinha nenhuma regra de como deveria ser o calculo do salario do
 * professor, então adotei que seria proporcional a quantos creditos teria no
 * semestre salario = hora_aula * credito_semestre
 */
public class EscolaPOO2 {

    public final static void limparTela() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // CTRL. 
            pressbot.keyPress(76); // L.
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
            System.out.println("\n\n\n");
        } catch (AWTException ex) {
            System.out.println("Não foi possivel limpar a tela, desculpa a sujeira");
        }
    }

    public static void main(String[] args) {
        int op;
        Scanner ler = new Scanner(System.in);
        AlunoControle ac = new AlunoControle();
        ProfessorControle pc = new ProfessorControle();

        do {
            System.out.println("_________Opções_________ \n"
                    + "1- Cadastrar aluno \n"
                    + "2- Cadastrar professor \n"
                    + "3- Listar alunos \n"
                    + "4- Listar professor \n"
                    + "___________________________ \n"
                    + "(qualquer tecla) - Sair");
            System.out.print("Digite a opção: ");
            op = ler.nextInt();

            String nome;
            int cred;
            switch (op) {
                case 1: //cadastrar aluno
                    System.out.print("\nPreencha os dados");
                    System.out.print("\nNome: ");
                    nome = ler.next();
                    System.out.print("Créditos do semestre atual: ");
                    cred = ler.nextInt();
                    ac.add(new Aluno(ac.getMatricula(), nome, cred));
                    break;
                case 2: //Cadastrar Prof
                    System.out.print("Preencha os dados");
                    System.out.print("\nNome: ");
                    nome = ler.next();
                    System.out.print("Créditos do semestre atual: ");
                    cred = ler.nextInt();
                    System.out.print("Valor da hora/aula: ");
                    double horaAula = ler.nextDouble();
                    pc.add(new Professor(ac.getMatricula(), nome, cred, horaAula));
                    break;
                case 3: //listar alunos
                    System.out.println("LISTA DE ALUNOS");
                    ac.get().forEach((a) -> {
                        System.out.println("Matricula:" + a.getMatricula() + "\n"
                                + "Nome:" + a.getNome() + "\n"
                                + "Creditos do semestre: " + a.getQntCred() + "\n"
                                + "___________________________ \n");
                    });
                    System.out.print("APERTE 'QUALQUER NÚMERO' PARA VOLTAR OU 0 PARA SAIR \n");
                    op = ler.nextInt();
                    break;
                case 4: //listar Prof
                    System.out.println("LISTA DE PROFESSORES");
                    pc.get().forEach((a) -> {
                        System.out.println("Matricula:" + a.getMatricula() + "\n"
                                + "Nome:" + a.getNome() + "\n"
                                + "Creditos do semestre: " + a.getQntCred() + "\n"
                                + "Hora/Aula: " + a.getValorHora() + "\n"
                                + "Salário: " + a.getSalario() + "\n"
                                + "___________________________ \n");
                    });
                    System.out.print("APERTE 'QUALQUER NÚMERO' PARA VOLTAR OU 0 PARA SAIR \n");
                    op = ler.nextInt();
                    break;
                default:
                    op = 0;
            }
            limparTela();
        } while (op != 0);
    }

}
