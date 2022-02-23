package ex03;

import java.math.BigDecimal;

public class Vendedor extends Empregado {

    private BigDecimal valorVendas;
    private BigDecimal comissao;

    //CONSTRUTOR HERDADO DA CLASSE PESSOA E COM SEU ATRIBUTOS PARTICULARES
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, BigDecimal salarioBase,
            BigDecimal imposto, BigDecimal valorVendas, BigDecimal comissao) {

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setValorVendas(valorVendas);
        this.setComissao(comissao);

    }

    // FOI UTILIZADO COMO CATEGORIA DE POLIMOSFISMO A SOBRECARGA, POIS COMO EXITE ATRIBUTOS QUE SÓ EXISTE DENTRO DA SUBCLASSE,
    // FOI NECESSÁRIO ENTÃO ADICIONAR NO toString.
    public String toString() {
        return "Operario {" + "nome=" + nome
                + ", endereco=" + endereco
                + ", telefone=" + telefone
                + ", Codigo do Setor=" + codigoSetor
                + ", Salario Base=" + salarioBase
                + ", Imposto=" + imposto
                + ", Valor das vendas=" + valorVendas
                + ", Comissão=" + comissao
                + '}';
    }

    @Override
    public void calcularSalario() {
        BigDecimal comissaoPercentual = this.getComissao().divide(BigDecimal.valueOf(100));
        BigDecimal comissaoValor = this.getValorVendas().multiply(comissaoPercentual);// CALCULA O VALOR QUE SERÁ PAGO NA COMISSÃO
        BigDecimal valor = this.getSalarioBase().add(comissaoValor); // SOMA O VALOR DA COMISSÃO COM O SALARIO BASE

        System.out.println("-------------------------");
        System.out.println();
        System.out.printf("Nome do Vendedor: %s \n", this.getNome());
        System.out.printf("Percentual da comissão: %.2f \n", comissaoPercentual);
        System.out.printf("Valor da comissão: %.2f \n", comissaoValor);
        System.out.printf("Salário com comissão: %.2f \n", valor);
        System.out.println();
        System.out.println("-------------------------");

    }

    public BigDecimal getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(BigDecimal valorVendas) {
        this.valorVendas = valorVendas;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

}
