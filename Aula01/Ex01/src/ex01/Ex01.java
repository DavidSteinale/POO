package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op = -1;

        System.out.print("Informe o seu nome?");
        String nome = scanner.nextLine();
        System.out.print("Informe o seu sobrenome?");
        String sobreNome = scanner.nextLine();
        System.out.print("Horas Trabalhadas?");
        int horas = scanner.nextInt();
        System.out.print("Valor pago por horas Trabalhadas?");
        float valorPorHora = scanner.nextFloat();

        Funcionario f1 = new Funcionario(nome, sobreNome, horas, valorPorHora);

        f1.setCidade("Curitiba");
        f1.setUf("PR");

        do {
            System.out.println("====MENU====");
            System.out.println("1 - Incrementar qtd de horas trabalhadas.");
            System.out.println("2 - Substituir o valor por horas trabalhadas.");
            System.out.println("3 - Calcular o Salário.");
            System.out.println("0 - Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("----------");
                    System.out.print("Qtd de horas trabalhadas?");
                    f1.qtdHoras(scanner.nextInt());
                    System.out.println("----------");
                    break;
                case 2:
                    System.out.println("----------");
                    System.out.print("Qual o novo Valor por Horas?");
                    f1.novoValorPorHora(scanner.nextFloat());
                    System.out.println("----------");
                    break;
                case 3:
                    f1.novoSalario(horas, valorPorHora);
                    break;
            }
        } while (op != 0);

    }

}
