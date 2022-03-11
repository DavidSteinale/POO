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

    public boolean sacar(double valor) throws ContaException {
        if (this.getSaldoComLimite() >= valor) {
            this.setSaldo( this.getSaldo() - valor);           

        } else {
            throw new ContaException("Saldo insuficiente na conta.");
        }
        return true;
    }

    public void depositar(double valor) throws ContaException {
        this.setSaldo(this.saldo + valor);
        System.out.println();
        System.out.println("Depositado com sucesso.");
        System.out.println("Saldo atual(Saldo + Limite): " + this.getSaldoComLimite());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Conta Bancaria: {" + "saldo=" + saldo + ", limite=" + limite + '}';
    }

}
