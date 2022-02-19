package ex03;

import java.math.BigDecimal;

public class Ex03 {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("joao", "(416325633)");

        empregado.setSalarioBase(BigDecimal.valueOf(4785));
        empregado.setImposto(BigDecimal.valueOf(5));
        empregado.calcularSalario();
    }

}
