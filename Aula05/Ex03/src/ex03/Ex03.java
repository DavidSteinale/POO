package ex03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) throws ValidaSenha {
        //Scanner scanner = new Scanner(System.in);

        String cadastroSenha = JOptionPane.showInputDialog("Cadastre uma senha:");
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        int valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));

        String senha = JOptionPane.showInputDialog("Digite a senha cadastrada para mostrar o resultado da divisão:");

        if (senha.equals(cadastroSenha)) {
            try {
                float divisao = (valorA / valorB);
                JOptionPane.showMessageDialog(null, "Resultado: " + divisao);                
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Não é possivel dividir por 'ZERO'.");
            }
            
        } else {
            throw new ValidaSenha("Senha inválida");
        }

    }

}
