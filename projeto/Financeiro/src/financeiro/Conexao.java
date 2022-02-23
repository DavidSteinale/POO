package financeiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConecxao(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/financeiro", "stein@financeiro", "dir@3655");
            System.out.println("Conectado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco.");
        }
        return conn;
    }
    
    
}
