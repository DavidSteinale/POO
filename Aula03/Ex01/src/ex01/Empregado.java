package ex01;

import java.math.BigDecimal;

public class Empregado extends Pessoa {

    protected int codigoSetor;
    protected BigDecimal salarioBase;
    protected BigDecimal imposto;

    //CONSTRUTOR HERDADO DA CLASSE PESSOA E COM SEU ATRIBUTOS PARTICULARES
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, BigDecimal salarioBase, BigDecimal imposto) {
        super(nome, endereco, telefone);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

    public String toString() {
        return "Empregado {" + "nome=" + nome
                + ", endereco=" + endereco
                + ", telefone=" + telefone
                + ", Codigo do Setor=" + codigoSetor
                + ", Salario Base=" + salarioBase
                + ", Imposto=" + imposto
                + '}';
    }

    //METODO
    public void calcularSalario() {
        BigDecimal valor = this.getImposto().multiply(this.getSalarioBase());

        System.out.printf("Nome do funcionario: %s \n", this.getNome());
        System.out.printf("Salario base: %.2f \n", this.getSalarioBase());
        System.out.println("salario Liquido " + this.getSalarioBase().subtract(valor));
        System.out.printf("Valor do imposto pago %.2f%% \n", this.getImposto());
    }

    //METODOS MODIFICADORES
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) {
        this.salarioBase = salarioBase;
    }

    public BigDecimal getImposto() {
        return imposto;
    }

    public void setImposto(BigDecimal imposto) {
        this.imposto = imposto.divide(BigDecimal.valueOf(100));
    }

}
