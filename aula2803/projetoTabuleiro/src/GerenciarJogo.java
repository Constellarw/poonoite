import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite: ");
        int p1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo palpite: ");
        int p2 = Integer.parseInt(sc.nextLine());
        Tabuleiro jogar = new Tabuleiro();
        jogar.palpitar(p1, p2);
    }
}