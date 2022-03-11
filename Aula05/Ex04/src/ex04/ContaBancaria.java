package ex04;

public class ContaBancaria {

    private double saldo, limite;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoComLimite() {
        double saldo = this.getSaldo() + this.getLimite();
        return saldo;
    }

    public void sacar(double valor) throws ContaException {

        if ((valor < 500) || (this.getSaldoComLimite() < 0)) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                this.setSaldo(this.getSaldo() - valor);
                this.setLimite(this.getLimite() - (Math.abs(this.getSaldo())));
                System.out.println("Você entrou no Cheque especial");
            }
        } else {
            throw new ContaException("Saque não permitido. Valor do SAQUE maior que R$ 500,00 ou Saldo total ZERADO");
        }

    }
    public void depositar(double valor) throws ContaException {
        if (valor < 1000) {
            this.setSaldo(this.saldo + valor);
            System.out.println();
            System.out.println("Depositado com sucesso.");
            System.out.printf("Saldo Conta Corrente: %.2f \n", this.getSaldo());
            System.out.printf("Limite Cheque especial: %.2f \n", this.getLimite());
            System.out.printf("Saldo atual(Saldo + Limite): %.2f \n", this.getSaldoComLimite());
            System.out.println();
        }else{
            throw new ContaException("Deposito não permitido para valor acima de R$ 1.000,00.");
        }
    }

    @Override
    public String toString() {
        return "Conta Bancaria: {" + "saldo CC = " + saldo + ", Cheque Especial=" + limite + '}';
    }

}
