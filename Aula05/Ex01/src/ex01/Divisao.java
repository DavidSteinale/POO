package ex01;

public class Divisao {

    public void calcular(int valorA, int valorB) {
        try {
            System.out.println("Divisão: " + (valorA / valorB));
        } catch (ArithmeticException erro) {
            System.out.println("Divisão: Não é possivel DIVIDIR por 'ZERO' | " + erro);
        }

    }

}
