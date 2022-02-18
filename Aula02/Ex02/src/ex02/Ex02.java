package ex02;

import java.math.BigDecimal;

public class Ex02 {

    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("FENSA", "(41) 36535896", BigDecimal.valueOf(10000));

        fornecedor.setEndereco("Av das Torres, 85");
        fornecedor.setValorDivida(BigDecimal.valueOf(2500));

        System.out.println("------DADOS DO FORNECEDOR-----");
        System.out.println("Fornecedor:" + fornecedor.getNome());
        System.out.println("Endereço:" + fornecedor.getEndereco());
        System.out.println("Telefone:" + fornecedor.getTelefone());
        System.out.printf("Valor: %.2f  \n", fornecedor.obterSaldo());
    }
}
