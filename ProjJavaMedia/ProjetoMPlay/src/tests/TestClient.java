//Desenvolvido por: Maiara Cristina de Freitas

package tests;

import entidades.Client;
import persistencia.ClienteDAO;


public class TestClient {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("nome cliente 1");
        client.setEmail("email@cliente1.com");
        client.setPhone("45364329 4034");
        

        ClienteDAO.inserir(client);
        System.out.println(ClienteDAO.listar());
        System.out.println(ClienteDAO.excluir(1));
        System.out.println(ClienteDAO.alterar(client));
        System.out.println(ClienteDAO.inserir(client));
        
    }
    
}
