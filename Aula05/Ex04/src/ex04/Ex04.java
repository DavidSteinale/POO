package ex04;

public class Ex04 {

    public static void main(String[] args) throws ContaException {
        ContaBancaria conta = new ContaBancaria();
        
        conta.setSaldo(500);
        conta.setLimite(3500);
         System.out.println("Saldo total:" + conta.getSaldoComLimite());
        conta.sacar(1000);
        
        
        
        System.out.println(conta.toString());      
       
        //conta.depositar(1000);
        
        
    }

}
