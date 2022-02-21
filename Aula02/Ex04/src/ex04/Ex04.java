package ex04;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrdor adm = new Administrdor("Pedro Henrique", "(416325633)");

        System.out.print("Informe o salario base? ");
        adm.setSalarioBase(BigDecimal.valueOf(scanner.nextDouble()));

        System.out.print("Informe o valor da ajuda de custo? ");
        adm.setAjudaDeCusto(BigDecimal.valueOf(scanner.nextDouble()));

        adm.calcularSalario();

    }

}
