/**
 * CLASSE ONDE FAZ A COMUNICAÇÃO COM A CLASSE CONEXAODAO, ONDE SE CONECTA COM O BANCO E ENVIA O COMANDO DE "INSERT",
 * 
 */
package DAO;

import DTO.FornecedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FornecedorDAO {
      
    Connection conn;    
    PreparedStatement pstm;   

    public void inserir(FornecedorDTO objfornecedordao) { // RECEBE TODOS OS OBJETOS DA DTO(FornecedorDTO)
        String sql = "insert into fornecedor (nome, endereco) value(?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordao.getRazaoSocial());
            pstm.setString(2, objfornecedordao.getEndereco());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO" + erro);
        }
        

    }

}
