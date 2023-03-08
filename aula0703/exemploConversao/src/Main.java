import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //uma linha
        Scanner leitor = new Scanner(System.in);
        int a, b;
        /*
        de mais de uma linha
         */
        System.out.println("Digite o primeiro valor");
        a = Integer.parseInt(leitor.nextLine()) ;
        System.out.println("Digite o segundo valor");
        b = Integer.parseInt(leitor.nextLine()) ;
        int c = a + b;
        System.out.println("Resultado da soma: " + c);

        Cliente cliente = new Cliente();
        cliente.salvarNoBanco(1);
    }
}