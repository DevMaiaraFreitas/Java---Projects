//Desenvolvido por: Maiara Cristina de Freitas

package tests;

import entidades.User;
import persistencia.UserDAO;



public class TesteUsuario {
    public static void main(String[] args) {
        User user = new User();
        user.setName("usuario 1");
        user.setLogin("usuario1_1234");
        user.setPassword("senhaaA12345");

        UserDAO.inserir(user);
        
        
        System.out.println(UserDAO.alterar(user));
        System.out.println(UserDAO.excluir(1));
    }
    
}