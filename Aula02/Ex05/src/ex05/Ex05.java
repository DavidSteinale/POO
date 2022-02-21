package ex05;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Operario operario = new Operario("Marcos Cesar", "(416325633)");

        System.out.print("Informe o salario base? ");
        operario.setSalarioBase(BigDecimal.valueOf(scanner.nextDouble()));

        System.out.print("Informe o valor da produção: ");
        operario.setValorProducao(scanner.nextBigDecimal());
        
        System.out.print("Informe o percentual da comissão: ");
        operario.setComissao((scanner.nextBigDecimal()));

        operario.calcularSalario();
        
    }
    
}
