package ex02;

import enums.TipoJornadaEmpregado;
import java.math.BigDecimal;

public class Ex02 {

    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("joão Pedro", "Rua abac", "(42)8888-8888", 1, BigDecimal.valueOf(1000), BigDecimal.valueOf(3), TipoJornadaEmpregado.PERIODO_COMPLETO);
        Empregado empregado2 = new Empregado("Pedro henrique", "Rua 2563", "(42)8888-8888", 1, BigDecimal.valueOf(1000), BigDecimal.valueOf(3), TipoJornadaEmpregado.MEIO_PERIODO);

        //empregado.calcularSalario();
        System.out.println(empregado1.toString());
        System.out.println(empregado2.toString());
    }

}
