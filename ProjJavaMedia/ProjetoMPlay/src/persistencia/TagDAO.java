//Desenvolvido por: Maiara Cristina de Freitas

package persistencia;


import entidades.Tag;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.List;
import java.sql.Statement;

public class TagDAO {
   public static boolean iniciarConexao(Tag tag){
       try{
           Connection conexao = Conexao.getConexao();
           String sql = "INSERT INTO tag (name) VALUE (?)";
           PreparedStatement cmd = conexao.prepareStatement(sql);
           cmd.setString(1, tag.getName());
           cmd.execute();
           cmd.close();
           return true;
       }catch (Exception e){
           return false;
       }
   }
   
    public static boolean alterar(Tag tag){
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "UPDATE tag SET name = ? WHERE id =?";
            PreparedStatement cmd = conexao.prepareStatement(sql);
            cmd.setString(1,tag.getName());
            cmd.setInt(2, tag.getId());
            
            int br = cmd.executeUpdate();
            cmd.close();
            return br> 0;
           
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean excluir(int id){
        try {
            Connection conexao = Conexao.getConexao();
        String sql = "DELETE FROM tag WHERE id = ?";
        PreparedStatement cmd= conexao.prepareStatement(sql);
        cmd.setInt(1, id);
        
        int br = cmd.executeUpdate();
        cmd.close();
        return br>0;
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        
    }
   
   
    public static ArrayList<Tag> listar() {
        ArrayList<Tag> tags = new ArrayList<Tag>();
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "SELECT * FROM tag";
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()) {
                Tag t = new Tag();
                t.setId(resultado.getInt("id"));
                t.setName(resultado.getString("name"));
                tags.add(t);
            }
            resultado.close();
            comando.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tags;
    }
}
