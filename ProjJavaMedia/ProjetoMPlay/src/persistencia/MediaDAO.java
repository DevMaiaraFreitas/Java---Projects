//Desenvolvido por: Maiara Cristina de Freitas

package persistencia;

import java.sql.Statement;
import entidades.Media;
import entidades.Tag;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MediaDAO {
    public static boolean inserir(Media media){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "INSERT INTO media (name, file, size, duration) VALUES (?,?,?,?)";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,media.getName());
           cmd.setString(2,media.getFile());
           cmd.setInt(3,media.getSize());
           cmd.setInt(4,media.getDuration());
           int result = cmd.executeUpdate();
           cmd.close();
           
           return result > 0;
           
       }catch (Exception e){
            System.out.println(e);
           return false;
       }
    }
    
    public static boolean alterar(Media media){
        try{
           Connection conexao = Conexao.getConexao();
           String sql = "UPDATE media SET name = ?, file= ?, size= ?, duration= ? WHERE id= ?";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1,media.getName());
           cmd.setString(2,media.getFile());
           cmd.setInt(3,media.getSize());
           cmd.setInt(4,media.getDuration());
           cmd.setInt(5,media.getId());
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
        String sql = "DELETE FROM media WHERE id = ?";
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
    
    public static List<Media> listar(){
        List<Media> listaMedias = new ArrayList<Media>();
        try {
            Connection conexao = Conexao.getConexao();
           String sql = "SELECT * FROM media";
           Statement cmd = conexao.createStatement();
           ResultSet res = cmd.executeQuery(sql);
           while(res.next()){
               
               Media m= new Media();
               m.setId(res.getInt("id"));
               m.setName(res.getString("name"));
               m.setFile(res.getString("file"));
               m.setSize(res.getInt("id"));
               m.setDuration(res.getInt("duration"));
               
               listaMedias.add(m);
           }
           res.close();
           cmd.close();
           
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaMedias;
        
    }
}
