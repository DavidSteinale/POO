package ex02;

import java.math.BigDecimal;

public class Ex02 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("David Stein", "rua julia Skora", "(41)9999-9999");
        Empregado empregado = new Empregado("joão Pedro", "Rua abac", "(42)8888-8888", 1, BigDecimal.valueOf(2500), BigDecimal.valueOf(3));
        Administrdor administrador = new Administrdor("Adm Maria lucia", "rua ABOC", "(042)7777-777", 2, BigDecimal.valueOf(3500), BigDecimal.valueOf(3), BigDecimal.valueOf(50));
        Operario operario = new Operario("Op Carlos", "rua AB", "(042)8888-777", 3, BigDecimal.valueOf(4500), BigDecimal.valueOf(3), BigDecimal.valueOf(1000), BigDecimal.valueOf(350));
        Vendedor vendedor = new Vendedor("Op Carlos", "rua AB", "(042)8888-777", 3, BigDecimal.valueOf(4500), BigDecimal.valueOf(3), BigDecimal.valueOf(5000), BigDecimal.valueOf(3));

        System.out.println(pessoa.toString());
        System.out.println(empregado.toString());
        System.out.println(administrador.toString());
        System.out.println(operario.toString());
    }

}
