package connection;

import java.sql.*;

public class ConexaoMySQL {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver"; //indica o nome da classe dentro do JDBC
    private static String URL = "jdbc:mysql://localhost:3306"; //endere�o de acesso
    private static String USER = "root"; //usu�rio do bd
    private static String PASS = "418510"; //senha do bd

    public static Connection iniciarConexao() { //m�todo para conectar bd - retorna objeto do tipo Connection
        try { //TENTATIVA DE LOCALIZA��O DA CLASSE DE CONEX�O
            Class.forName(DRIVER); //ser� realizada uma busca pela classe
            return DriverManager.getConnection(URL, USER, PASS); //retorna conexao
        } catch (ClassNotFoundException | SQLException e) { //CASO N�O ENCONTRE A CLASSE
            throw new RuntimeException("Erro na conex�o: " + e); //Impress�o do erro
        }
    }

    public static void encerrarConexao(Connection connection) {
        if (connection != null) { //SE CONEX�O FOR DIFERENTE DE NULO
            try {
                connection.close(); //finaliza conex�o
            } catch (SQLException e) { //SE TENTAR FINALIZAR CONEX�O INEXISTENTE
                e.printStackTrace();//exibe a mensagem de erro
            }
        }
    }

    public static void encerrarConexao(Connection connection, PreparedStatement stmt) {
        encerrarConexao(connection);
        try {
            stmt.close();
        } catch (SQLException e) { //SE TENTAR FINALIZAR PREPAREDSTATEMENT INEXISTENTE
            e.printStackTrace();//exibe a mensagem de erro
        }
    }

    public static void encerrarConexao(Connection connection, PreparedStatement stmt, ResultSet rs) {
        encerrarConexao(connection, stmt);
        try {
            stmt.close();
        } catch (SQLException e) { //SE TENTAR FINALIZAR RESULTSET INEXISTENTE
            e.printStackTrace();//exibe a mensagem de erro
        }
    }
}
