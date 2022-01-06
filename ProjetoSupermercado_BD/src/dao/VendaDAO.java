package dao;

import connection.ConexaoMySQL;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {
    public void create(Venda vlrTotal) {
        Connection connection = ConexaoMySQL.iniciarConexao(); //Abre conex�o com BD
        PreparedStatement stmt = null; //Cria um prepared statement

        try {
            stmt = connection.prepareStatement("INSERT INTO Venda (vlrTotal) VALUES (?)"); //SQL
            stmt.setString(1, venda.getVlrTotal()); //Pega os valores dos atributos do objeto e joga para os VALUES

            stmt.executeUpdate(); //Executa o SQL

        } catch (SQLException e) { //Caso retorne algum erro do BD
            e.printStackTrace();
        } finally { //Finaliza conex�o com BD
            ConexaoMySQL.encerrarConexao(connection, stmt);
        }
    }
}
