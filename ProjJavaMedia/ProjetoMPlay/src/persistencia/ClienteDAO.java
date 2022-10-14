//Desenvolvido por: Maiara Cristina de Freitas

package persistencia;

import entidades.Client;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public static boolean inserir(Client client){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "INSERT INTO client (name, email, phone) VALUES (?,?,?)";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,client.getName());
           cmd.setString(2,client.getEmail());
           cmd.setString(3,String.valueOf(client.getPhone()));
           int result = cmd.executeUpdate();
           cmd.close();
           
           return result > 0;
           
       }catch (Exception e){
            System.out.println(e);
           return false;
       }
    }
    
    public static boolean alterar(Client client){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "UPDATE client SET name = ?, email= ?, phone= ? WHERE id= ?";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,client.getName());
           cmd.setString(2,client.getEmail());
           cmd.setString(3,String.valueOf(client.getPhone()));
           cmd.setInt(4,client.getId());
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
        String sql = "DELETE FROM client WHERE id = ?";
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
    
    public static List<Client> listar(){
        List<Client> listaClientes = new ArrayList<Client>();
        try {
            Connection conexao = Conexao.getConexao();
           String sql = "SELECT * FROM client";
           Statement cmd = conexao.createStatement();
           ResultSet res = cmd.executeQuery(sql);
           while(res.next()){
               
               Client c= new Client();
               c.setId(res.getInt("id"));
               c.setName(res.getString("name"));
               c.setEmail(res.getString("email"));
               c.setPhone(res.getString("phone"));
               
               listaClientes.add(c);
           }
           res.close();
           cmd.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaClientes;
        
    }
}
