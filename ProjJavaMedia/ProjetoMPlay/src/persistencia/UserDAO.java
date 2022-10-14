//Desenvolvido por: Maiara Cristina de Freitas

package persistencia;

import entidades.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    
    public static boolean inserir(User user){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "INSERT INTO user (name, login, password) VALUES (?,?,?)";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,user.getName());
           cmd.setString(2,user.getLogin());
           cmd.setString(3,user.getPassword());;
           int result = cmd.executeUpdate();
           cmd.close();
           
           return result > 0;
           
       }catch (Exception e){
            System.out.println(e);
           return false;
       }
    }
    
    public static boolean alterar(User user){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "UPDATE user SET name = ?, login= ?, password= ? WHERE id= ?";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,user.getName());
           cmd.setString(2,user.getLogin());
           cmd.setString(3,user.getPassword());
           cmd.setInt(5,user.getId());
           int result = cmd.executeUpdate();
           cmd.close();
           
           return result > 0;
           
       }catch (Exception e){
            System.out.println(e);
           return false;
       }
    }
    
    public static boolean excluir(int id){
        try {
        Connection conexao = Conexao.getConexao();
        String sql = "DELETE FROM user WHERE id = ?";
        PreparedStatement cmd= conexao.prepareStatement(sql);
        cmd.setInt(1, id);
        int br = cmd.executeUpdate();
        cmd.close();
        
        return br>0;
        
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
}
