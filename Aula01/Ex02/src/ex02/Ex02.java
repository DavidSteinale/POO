package ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.print("Informe o Título do livro:");
        livro.setTitulo(scanner.nextLine());
        System.out.print("Informe o nome do leitor:");
        livro.setNomeLeitor(scanner.nextLine());
        System.out.print("Informe a QTD de páginas que tem o livro: ");
        livro.setQtdPagTotal(scanner.nextInt());
        System.out.print("Informe a QTD de páginas já lidas: ");
        livro.setQtdPagLidas(scanner.nextInt());

        System.out.printf("Título: %s \n", livro.getTitulo());
        System.out.printf("Leitor: %s \n", livro.getNomeLeitor());
        System.out.printf("Você já leu %.2f%% do livro. \n",livro.progresso());
    }

}
