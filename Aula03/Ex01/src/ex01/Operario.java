package ex01;

import java.math.BigDecimal;

public class Operario extends Empregado {

    private BigDecimal valorProducao;
    private BigDecimal comissao;

    //CONSTRUTOR HERDADO DA CLASSE EMPREGADO E COM SEU ATRIBUTOS PARTICULARES
    public Operario(String nome, String endereco, String telefone, int codigoSetor, BigDecimal salarioBase,
            BigDecimal imposto, BigDecimal valorProducao, BigDecimal comissao) {

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setValorProducao(valorProducao);
        this.setComissao(comissao);
    }

    public String toString() {
        return "Operario {" + "nome=" + nome
                + ", endereco=" + endereco
                + ", telefone=" + telefone
                + ", Codigo do Setor=" + codigoSetor
                + ", Salario Base=" + salarioBase
                + ", Imposto=" + imposto
                + ", Valor da produção=" + valorProducao
                + ", Comissão=" + comissao
                + '}';
    }

    @Override
    public void calcularSalario() {
        BigDecimal comissaoPercentual = this.getComissao().divide(BigDecimal.valueOf(100));
        BigDecimal comissaoValor = this.getValorProducao().multiply(comissaoPercentual);// CALCULA O VALOR QUE SERÁ PAGO NA COMISSÃO
        BigDecimal valor = this.getSalarioBase().add(comissaoValor); // SOMA O VALOR DA COMISSÃO COM O SALARIO BASE

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
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

}
