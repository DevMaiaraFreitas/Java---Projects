
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        String nome;
        double nota;
        double salario;
        String Nturma;
        int idade;
        int opcao;

        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Turma turma = new Turma();
        Scanner scan = new Scanner(System.in);

        opcao= 0;
        while (opcao !=5){
            System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO");
            System.out.println("1 - Adicionar turma\n2 - Adicionar aluno\n3 - Adicionar Professor\n4 - Visualizar turma\n5 - Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome da turma que deseja adicionar:");
                     Nturma = scan.next();
                     turma.setNomeTurma(Nturma);
                }
                case 2 -> {
                    System.out.println("Digite o nome do aluno que deseja adicionar:");
                    nome = scan.next();
                    System.out.println("Digite a idade do aluno que deseja adicionar:");
                    idade = scan.nextInt();
                    System.out.println("Digite a nota do aluno que deseja adicionar:");
                    nota = scan.nextDouble();
                    aluno.cadastrarAluno(nome,idade,nota);
                    turma.adicionarAluno(aluno);
                }

                case 3 -> {
                    System.out.println("Digite o nome do professor que deseja adicionar:");
                    nome = scan.next();
                    System.out.println("Digite a idade do professor que deseja adicionar:");
                    idade = scan.nextInt();
                    System.out.println("Digite o salario do professor que deseja adicionar:");
                    salario = scan.nextDouble();
                    professor.cadastrarProfessor(nome,idade,salario);
                    turma.adicionarProfessor(professor);
                }
                case 4 -> turma.visualizarTurma(turma.getListaAlunos(),professor);

                case 5 -> System.out.println("Finalizando sistema...");

                default -> System.out.println("Opção inválida!");
            }
        }

    }
}
