package ex04;

public class Ex04 {

    public static void main(String[] args) throws ContaException {
        ContaBancaria conta = new ContaBancaria();
        
        conta.setSaldo(700);
        conta.setLimite(100);
               
        //conta.depositar(1000);
       conta.sacar(800);
        
        
      
        System.out.println("");
        System.out.println(conta.toString());
           
       
        
        
        
    }

}
