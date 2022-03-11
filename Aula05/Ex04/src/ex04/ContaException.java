package ex04;

import javax.swing.JOptionPane;

public class ContaException extends Exception{
    
    public ContaException(String _mensagem){
        super(_mensagem);
       // final int SENHA_INVALIDA = 1;
        System.out.println(_mensagem);       
        
    }
    
}
