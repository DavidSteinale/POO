package ex06;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vendedor vendedor = new Vendedor("Maria Paula", "(416325633)");

        System.out.print("Informe o salario base: ");
        vendedor.setSalarioBase(BigDecimal.valueOf(scanner.nextDouble()));

        System.out.print("Informe o valor das vendas: ");
        vendedor.setValorVendas(scanner.nextBigDecimal());

        System.out.print("Informe o percentual da comissão: ");
        vendedor.setComissao((scanner.nextBigDecimal()));

        vendedor.calcularSalario();

    }

}
