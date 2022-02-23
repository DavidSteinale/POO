package ex03;

import java.math.BigDecimal;

public class Empregado extends Pessoa {

    protected int codigoSetor;
    protected BigDecimal salarioBase;
    protected BigDecimal imposto;
    
    // CONSTANTES
    
    private final BigDecimal COMISSAO1=BigDecimal.valueOf(5);
    private final BigDecimal COMISSAO2=BigDecimal.valueOf(10);
    private final BigDecimal COMISSAO3=BigDecimal.valueOf(20);

    //CONSTRUTOR HERDADO DA CLASSE PESSOA E COM SEU ATRIBUTOS PARTICULARES
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, BigDecimal salarioBase, BigDecimal imposto) {
        super(nome, endereco, telefone);
        this.setCodigoSetor(codigoSetor);
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
    }

    // FOI UTILIZADO COMO CATEGORIA DE POLIMOSFISMO A SOBRECARGA, POIS COMO EXITE ATRIBUTOS QUE SÓ EXISTE DENTRO DA SUBCLASSE,
    // FOI NECESSÁRIO ENTÃO ADICIONAR NO toString.
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
        BigDecimal valorImposto;
        BigDecimal comissaoPercentual;
        BigDecimal comissaoValor;
        BigDecimal salarioLiquido;
        BigDecimal salario;

        switch (this.getCodigoSetor()) {
            case 1:
                valorImposto = this.getImposto().multiply(this.getSalarioBase()); // CALCULA O VALOR DO IMPOSTO A SER COBRADO

                comissaoValor = this.getSalarioBase().multiply(COMISSAO1.divide(BigDecimal.valueOf(100)));// CALCULA A COMISSÃO

                salarioLiquido = this.getSalarioBase().subtract(valorImposto); // SUBTRAI O VALOR DO IMPOSTO DO SALARIO BASE
                salario = salarioLiquido.add(comissaoValor); // SOMA AO SALARIO LIQUIDO O VALOR DA COMISSÃO

                System.out.printf("Nome do funcionario: %s \n", this.getNome());
                System.out.printf("Salário base: %.2f \n", this.getSalarioBase());
                System.out.printf("Aliquota do imposto: %.2f%% \n", this.getImposto().multiply(BigDecimal.valueOf(100)));
                System.out.printf("Salário Líquido %.2f \n", salarioLiquido);
                System.out.printf("Valor do imposto pago: %.2f \n", valorImposto);
                System.out.printf("Salário somando %.2f%% de comissão: %.2f \n",
                        COMISSAO1, salario); // FALTA AJUSTAR NO ARREDONDAMENTO NO SALARIO

                break;
            case 2:
                valorImposto = this.getImposto().multiply(this.getSalarioBase()); // CALCULA O VALOR DO IMPOSTO A SER COBRADO

                comissaoValor = this.getSalarioBase().multiply(COMISSAO2.divide(BigDecimal.valueOf(100)));// CALCULA A COMISSÃO

                salarioLiquido = this.getSalarioBase().subtract(valorImposto); // SUBTRAI O VALOR DO IMPOSTO DO SALARIO BASE
                salario = salarioLiquido.add(comissaoValor); // SOMA AO SALARIO LIQUIDO O VALOR DA COMISSÃO

                System.out.printf("Nome do funcionario: %s \n", this.getNome());
                System.out.printf("Salário base: %.2f \n", this.getSalarioBase());
                System.out.printf("Aliquota do imposto: %.2f%% \n", this.getImposto().multiply(BigDecimal.valueOf(100)));
                System.out.printf("Salário Líquido %.2f \n", salarioLiquido);
                System.out.printf("Valor do imposto pago: %.2f \n", valorImposto);
                System.out.printf("Salário somando %.2f%% de comissão: %.2f \n",
                        COMISSAO2, salario); // FALTA AJUSTAR NO ARREDONDAMENTO NO SALARIO

                break;
            case 3:
                valorImposto = this.getImposto().multiply(this.getSalarioBase()); // CALCULA O VALOR DO IMPOSTO A SER COBRADO

                comissaoValor = this.getSalarioBase().multiply(COMISSAO3.divide(BigDecimal.valueOf(100)));// CALCULA A COMISSÃO

                salarioLiquido = this.getSalarioBase().subtract(valorImposto); // SUBTRAI O VALOR DO IMPOSTO DO SALARIO BASE
                salario = salarioLiquido.add(comissaoValor); // SOMA AO SALARIO LIQUIDO O VALOR DA COMISSÃO

                System.out.printf("Nome do funcionario: %s \n", this.getNome());
                System.out.printf("Salário base: %.2f \n", this.getSalarioBase());
                System.out.printf("Aliquota do imposto: %.2f%% \n", this.getImposto().multiply(BigDecimal.valueOf(100)));
                System.out.printf("Salário Líquido %.2f \n", salarioLiquido);
                System.out.printf("Valor do imposto pago: %.2f \n", valorImposto);
                System.out.printf("Salário somando %.2f%% de comissão: %.2f \n",
                        COMISSAO3, salario); // FALTA AJUSTAR NO ARREDONDAMENTO NO SALARIO

                break;
            default:
                valorImposto = this.getImposto().multiply(this.getSalarioBase()); // CALCULA O VALOR DO IMPOSTO A SER COBRADO
              
                salarioLiquido = this.getSalarioBase().subtract(valorImposto); // SUBTRAI O VALOR DO IMPOSTO DO SALARIO BASE
                
                System.out.println("----------SETOR NÃO EXITE--------");
                System.out.println("----NÃO SERÁ APLICADO COMISSÃO---");
                System.out.printf("Nome do funcionario: %s \n", this.getNome());
                System.out.printf("Salário base: %.2f \n", this.getSalarioBase());
                System.out.printf("Aliquota do imposto: %.2f%% \n", this.getImposto().multiply(BigDecimal.valueOf(100)));
                System.out.printf("Salário Líquido %.2f \n", salarioLiquido);
                System.out.printf("Valor do imposto pago: %.2f \n", valorImposto);
                System.out.printf("Salário SEM comissão: %.2f \n",salarioLiquido); 
                
        }
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
