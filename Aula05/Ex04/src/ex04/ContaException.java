package ex04;


public class ContaException extends Exception{
    
    public ContaException(String _mensagem){
        super(_mensagem);
        System.out.println(_mensagem);               
    }    
}
