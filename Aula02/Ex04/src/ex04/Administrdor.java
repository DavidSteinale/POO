package ex04;

import java.math.BigDecimal;

public class Administrdor extends Empregado {

    private BigDecimal ajudaDeCusto;

    public Administrdor(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public void calcularSalario() {
        System.out.println();
        System.out.printf("Nome do Administrador: %s \n", this.getNome());
        BigDecimal valor = this.getAjudaDeCusto().add(this.getSalarioBase());
        System.out.printf("Salário do Administrador %.2f \n", valor);

    }

    public BigDecimal getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(BigDecimal ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

}
