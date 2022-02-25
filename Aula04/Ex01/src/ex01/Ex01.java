package ex01;

import java.math.BigDecimal;

public class Ex01 {

    public static void main(String[] args) {

        Empregado empregado = new Empregado("joão Pedro", "Rua abac", "(42)8888-8888", 1, BigDecimal.valueOf(1000), BigDecimal.valueOf(3));

        empregado.calcularSalario();
    }

}
