package ex04;

public class Ex04 {

    public static void main(String[] args) throws ContaException {
        ContaBancaria conta = new ContaBancaria();

        conta.setSaldo(80);
        conta.setLimite(100);

        try {
            conta.depositar(100);
        } catch (ContaException e) {

        }
        try {
            conta.sacar(110);
            System.out.println();
            System.out.println(conta.toString());
        } catch (ContaException e) {
        }
    }
}
