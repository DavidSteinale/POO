/**
 * FOI UTILIZADO COMO CATEGORIA DE POLIMOSFISMO A SOBRECARGA, POIS COMO EXITE ATRIBUTOS QUE SÓ EXISTE DENTRO DA SUBCLASSE,
 * FOI NECESSÁRIO ENTÃO ADICIONAR NO toString.
 * 
 * FOI USADO AS CONSTANTES NA VARIAVEL DE COMISSÃO POR SETOR DENTRO DA CLASSE EMPREGADO,
 * COM ISSO SERIA MAIS FACIL DE ALTERAR CASO FOSSE NECESSARIO.
 * 
 * FOI USADO DE NOMECLATURA AS LETRAS EM MAISCULAS E NO INICIO USADO A PALAVRA "FINAL".
 */
package ex03;

import java.math.BigDecimal;

public class Ex03 {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("joão Pedro", "Rua abac", "(42)8888-8888", 3, BigDecimal.valueOf(1000), BigDecimal.valueOf(3));

        empregado.calcularSalario();
    }

}
