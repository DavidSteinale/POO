package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        System.out.print("Informe o ptimrito valor: ");
        int valorA = scanner.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valorB = scanner.nextInt();

        System.out.println();
        soma.calcular(valorA, valorB);
        subtracao.calcular(valorA, valorB);
        multiplicacao.calcular(valorA, valorB);
        divisao.calcular(valorA, valorB);

    }

}
