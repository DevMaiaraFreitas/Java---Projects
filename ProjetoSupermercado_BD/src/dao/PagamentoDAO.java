package dao;

import connection.ConexaoMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Pagamento;
import model.Produto;

public class PagamentoDAO {
    public void create(Pagamento pagamento) {
        Connection connection = ConexaoMySQL.iniciarConexao(); //Abre conex�o com BD
        PreparedStatement stmt = null; //Cria um prepared statement

        try {
            stmt = connection.prepareStatement("INSERT INTO pagamento (tipoPagamento) VALUES (?)"); //SQL
            stmt.setString(1, pagamento.getTipoPagamento()); //Pega os valores dos atributos do objeto e joga para os VALUES

            stmt.executeUpdate(); //Executa o SQL

        } catch (SQLException e) { //Caso retorne algum erro do BD
            e.printStackTrace();
        } finally { //Finaliza conex�o com BD
            ConexaoMySQL.encerrarConexao(connection, stmt);
        }
    }

    public read(Pagamento pagamento){
        Connection connection = ConexaoMySQL.iniciarConexao(); //Inicia conex�o
        PreparedStatement stmt = null; //Cria um Prepared Statement
        ResultSet rs = null; //Cria um Result Set
        try {
            stmt = connection.prepareStatement("SELECT * FROM pagamento"); //SQL
            rs = stmt.executeQuery(); //Executa o SQL e armazena o resultado no ResultSet

        } catch (SQLException e) { //Caso retorne algum erro do BD
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt, rs);
        }
        return pagamento;
    }
}
