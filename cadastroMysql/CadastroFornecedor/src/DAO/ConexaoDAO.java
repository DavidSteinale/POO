package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    /*
    private String servidor="localhost:3306";
    private String banco="financeiro";
    private String usuario="stein@financeiro";
    private String senha="dir@3655";
*/
    public static Connection conectaDB(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/financeiro", "stein@financeiro", "dir@3655");
            System.out.println("Conectado com sucesso.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco." + erro);
            System.out.println("Erro ao conectar no banco.");
        }
        return conn;
    }
       
}
