package cli;

import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoTeste {
    private List<Produto> produtos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ProdutoTeste teste = new ProdutoTeste();
        int opcao;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Consultar Produto");
            System.out.println("3. Registrar Entrada");
            System.out.println("4. Registrar Saida");
            System.out.println("5. Listar Produtos");
            System.out.println("6. Alterar Produto");
            System.out.println("7. Excluir Produto");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao: ");
            opcao = Integer.parseInt(teste.sc.nextLine());
            switch (opcao){
                case 1:
                    teste.cadastrar();
                    break;
                case 2:
                    teste.consultar();
                    break;
                case 3:
                    teste.darEntrada();
                    break;
                case 4:
                    teste.darSaida();
                    break;
                case 5:
                    teste.listarProdutos();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }

    public void adicionarNaLista(Produto p){
        this.produtos.add(p);
    }
    public void cadastrar(){
        System.out.println("Digite o id do produto");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a descrição do produto");
        String descricao = sc.nextLine();
        System.out.println("Digite o valor do produto");
        double valor = Double.parseDouble(sc.nextLine());
        Produto produto = new Produto(id, descricao, valor);
        adicionarNaLista(produto);
        System.out.println("Produto cadastrado com sucesso");
    }

    public void consultar(){
        System.out.println("Digite o id do produto a ser procurado: ");
        int idProc = Integer.parseInt(sc.nextLine());
        Produto produtoProc = new Produto();
        produtoProc.setIdProduto(idProc);
        if(produtos.contains(produtoProc)){
            System.out.println("Encontrado: ");
            int indice = produtos.indexOf(produtoProc);
            produtoProc = produtos.get(indice);
            System.out.println(produtoProc);
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public void darEntrada(){
        System.out.println("Digite o id do Produto a registrar entrada");
        int idProc = Integer.parseInt(sc.nextLine());
        Produto produtoProc = new Produto();
        produtoProc.setIdProduto(idProc);
        if(produtos.contains(produtoProc)){
            System.out.println("Digite a quantidade a dar entrada: ");
            int qtd = Integer.parseInt(sc.nextLine());
            int indice = produtos.indexOf(produtoProc);
            produtos.get(indice).registrarEntrada(qtd);
            System.out.println("Quantidade registrada em entrada");
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public void darSaida(){
        System.out.println("Digite o id do Produto a registrar saida");
        int idProc = Integer.parseInt(sc.nextLine());
        Produto produtoProc = new Produto();
        produtoProc.setIdProduto(idProc);
        if(produtos.contains(produtoProc)){
            System.out.println("Digite a quantidade a dar saida: ");
            int qtd = Integer.parseInt(sc.nextLine());
            int indice = produtos.indexOf(produtoProc);
            produtos.get(indice).registrarSaida(qtd);
            System.out.println("Quantidade registrada em saida");
        }else{
            System.out.println("Produto não encontrado");
        }
    }

    public void listarProdutos(){
        for (Produto p : produtos){
            System.out.println(p);
            System.out.println("---------------------");
        }
    }
}
