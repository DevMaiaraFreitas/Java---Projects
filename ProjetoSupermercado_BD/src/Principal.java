package src;

import dao.ProdutoDAO;
import model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcao;
        Produto produto = new Produto();
        Scanner scan = new Scanner(System.in);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> listaprodutos = new ArrayList<>();

        //Loop para solicitar op��o ao usu�rio
        opcao = 0;
        while (opcao != 5) {
            System.out.println("SELECIONE UMA DAS OP��ES ABAIXO");
            System.out.print("1 - Adicionar Produto\n2 - Visualizar Produto\n3 - Alterar Produto\n4 - Excluir Produto\n5 - Sair\nOP��O: ");
            opcao = scan.nextInt();

            //La�o condicional para realizar a��es conforme op��o escolhida pelo usu�rio
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome produto que deseja adicionar na venda:");
                    produto.setNome(scan.next());
                    System.out.println("Digite o pre�o do produto que deseja adicionar na venda:");
                    produto.setPreco(scan.nextDouble());
                    System.out.println("Digite a quantidade de estoque:");
                    produto.setQuantidadeEstoque(scan.nextInt());
                    produtoDAO.create(produto);
                }
                case 2 -> {
                    listarProdutos();
                }

                case 3 -> {
                    listarProdutos();
                    System.out.print("Digite o c�digo do produto que deseja alterar\nID: ");
                    produto.setId(scan.nextInt());
                    System.out.println("Digite o valor para nome:");
                    produto.setNome(scan.next());
                    System.out.println("Digite o valor para pre�o:");
                    produto.setPreco(scan.nextDouble());
                    System.out.println("Digite o valor para a quantidade de estoque:");
                    produto.setQuantidadeEstoque(scan.nextInt());
                    produtoDAO.update(produto);
                }
                case 4 -> {
                    listarProdutos();
                    System.out.print("Digite o c�digo do produto que deseja excluir\nID: ");
                    produto.setId(scan.nextInt());
                    produtoDAO.delete(produto);
                }
                case 5 -> System.out.println("Finalizando sistema...");

                default -> System.out.println("Op��o inv�lida!");
            }
        }
    }

    public static void listarProdutos() {
        ArrayList<Produto> listaprodutos = new ArrayList<>();
        ProdutoDAO produtoDAO = new ProdutoDAO();

        listaprodutos = produtoDAO.read();
        System.out.println("________________");
        System.out.println("PRODUTOS CADASTRADOS:");
        for (int cont = 0; cont < listaprodutos.size(); cont++) {
            System.out.println("ID: " + listaprodutos.get(cont).getId() + " | Produto: " + listaprodutos.get(cont).getNome() + " | Pre�o: " + listaprodutos.get(cont).getPreco() + " | Estoque: " + listaprodutos.get(cont).getQuantidadeEstoque());
        }
        System.out.println("________________");
    }
}
