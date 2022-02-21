package ex05;

import java.math.BigDecimal;

public class Operario extends Empregado {

    private BigDecimal valorProducao;
    private BigDecimal comissão;

    public Operario(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public void calcularSalario() {
        BigDecimal comissaoPercentual = this.getComissao().divide(BigDecimal.valueOf(100));
        
        BigDecimal comissaoValor = this.getValorProducao().multiply(comissaoPercentual);
        BigDecimal valor = this.getSalarioBase().add(comissaoValor);
       

        System.out.println("-------------------------");
        System.out.println();
        System.out.printf("Nome do Operario: %s \n", this.getNome());
        System.out.printf("Percentual da comissão: %.2f \n", comissaoPercentual);
        System.out.printf("Valor da comissão: %.2f \n", comissaoValor);
        System.out.printf("Salário com comissão: %.2f \n", valor);
        System.out.println();
        System.out.println("-------------------------");

    }

    public BigDecimal getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(BigDecimal valorProducao) {
        this.valorProducao = valorProducao;
    }

    public BigDecimal getComissao() {
        return comissão;
    }

    public void setComissao(BigDecimal comissão) {
        this.comissão = comissão;
    }

}
