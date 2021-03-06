/**
 * CLASSE ONDE FAZ A COMUNICAÇÃO COM A CLASSE CONEXAODAO, ONDE SE CONECTA COM O BANCO E ENVIA O COMANDO DE "INSERT",
 *
 */
package DAO;

import DTO.FornecedorDTO;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
//import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FornecedorDAO {

    Connection conn;    //DECLARAÇÃO DE VARIAVEL DO TIPO CONEXÃO
    PreparedStatement pstm;   // DECLARADO UMA VARIAVEL DO TIPO PreparedStatement PARA PODER EXECUTAR OS COMANDOS EM SQL
    ResultSet rs;
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public void inserir(FornecedorDTO objfornecedordao) { // RECEBE TODOS OS OBJETOS DA DTO(FornecedorDTO)
        String sql = "insert into fornecedor (nome, endereco) value(?,?)"; //CRIADO UMA VARIAVEL STRING, ONDE CONSTA O COMANDO DE INSERT NO BANCO FORNECEDOR

        conn = new ConexaoDAO().conectaDB();

        try {

            pstm = conn.prepareStatement(sql);// ENVIA PARA A COMANDO DA VARIAVEL "SQL"
            pstm.setString(1, objfornecedordao.getRazaoSocial()); // INFORMA PARA O PSTM OS CAMPOS QUE SERÁ PEGO AS INFORMAÇÕES E A POSIÇÃO DE CADA CAMPO "?" 
            pstm.setString(2, objfornecedordao.getEndereco());

            pstm.execute(); // EXECUTA O PROCEDIMENTO
            pstm.close(); // FECHA O ACESSO AO BANCO
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO inserir" + erro);
        }

    }

    public ArrayList<FornecedorDTO> listar() {

        String sql = "select * from fornecedor";
        conn = new ConexaoDAO().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);// ENVIA PARA A COMANDO DA VARIAVEL "SQL"
            rs = pstm.executeQuery();

            while (rs.next()) {
                FornecedorDTO objfornecedorDTO = new FornecedorDTO();
                
                objfornecedorDTO.setId_fornecedor(rs.getInt("idfornecedor"));
                objfornecedorDTO.setRazaoSocial(rs.getString("nome"));
                objfornecedorDTO.setEndereco(rs.getString("endereco"));

                lista.add(objfornecedorDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO listar" + erro);
        }
        return lista;

    }

}
