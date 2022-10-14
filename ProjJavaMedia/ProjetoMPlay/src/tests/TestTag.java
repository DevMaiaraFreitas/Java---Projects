//Desenvolvido por: Maiara Cristina de Freitas

package tests;


import entidades.Tag;
import persistencia.TagDAO;

public class TestTag {
    public static void main(String[] args) {
        Tag tag = new Tag();
        tag.setName("teste1");

        TagDAO.iniciarConexao(tag);
        
        tag.setId(1);
        System.out.println(TagDAO.alterar(tag));
        System.out.println(TagDAO.excluir(1));
        System.out.println(TagDAO.listar());
    }
    
}
