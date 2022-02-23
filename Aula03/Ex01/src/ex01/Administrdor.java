package ex01;

import java.math.BigDecimal;

public class Administrdor extends Empregado {

    protected BigDecimal ajudaDeCusto;

    //CONSTRUTOR HERDADO DA CLASSE PESSOA E COM SEU ATRIBUTOS PARTICULARES
    public Administrdor(String nome, String endereco, String telefone, int codigoSetor, BigDecimal salarioBase,
            BigDecimal imposto, BigDecimal ajudaDeCusto) {

        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.setAjudaDeCusto(ajudaDeCusto);
    }
    
    public String toString() {
        return "Administrador {" + "nome=" + nome
                + ", endereco=" + endereco
                + ", telefone=" + telefone
                + ", Codigo do Setor=" + codigoSetor
                + ", Salario Base=" + salarioBase
                + ", Imposto=" + imposto
                + ", Ajuda de custo=" + ajudaDeCusto
                +'}';
    }

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
