import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        produto.setCodigo(1);
        produto.setDescricao("Água com gás");
        System.out.println(produto);

        Produto produto2 = new Produto(2, "Coca-cola");
        System.out.println(produto2);






    }
}