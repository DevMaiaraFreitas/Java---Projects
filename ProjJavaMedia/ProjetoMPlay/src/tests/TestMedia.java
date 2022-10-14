//Desenvolvido por: Maiara Cristina de Freitas

package tests;

import entidades.Media;
import persistencia.MediaDAO;

public class TestMedia {
    public static void main(String[] args) {
        Media media = new Media();
        media.setName("media2");
        media.setFile("Arquivo de audio");
        media.setSize(4);
        media.setDuration(69);
        

        MediaDAO.inserir(media);
        System.out.println(MediaDAO.listar());
        System.out.println(MediaDAO.excluir(1));
        System.out.println(MediaDAO.alterar(media));
        System.out.println(MediaDAO.inserir(media));
        
    }
    
}
