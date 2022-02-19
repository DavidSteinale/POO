package ex02;

import java.math.BigDecimal;

public class Fornecedor extends Pessoa {

    private BigDecimal valorCredito;
    private BigDecimal valorDivida;

    public Fornecedor(String nome, String telefone, BigDecimal valorCredito) {
        super(nome, telefone);
        this.valorCredito = valorCredito;
    }

    public BigDecimal obterSaldo() {
        return this.getValorCredito().subtract(this.getValorDivida());
    }

    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    public BigDecimal getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(BigDecimal valorDivida) {
        this.valorDivida = valorDivida;
    }

}
