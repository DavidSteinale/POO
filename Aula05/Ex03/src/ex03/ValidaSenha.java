package ex03;

import javax.swing.JOptionPane;

public class ValidaSenha extends Exception {

    public ValidaSenha(String senha) {
        super(senha);
        final int SENHA_INVALIDA = 1;
        JOptionPane.showMessageDialog(null, senha);
       // JOptionPane.showMessageDialog(null, SENHA_INVALIDA);

    }

}
