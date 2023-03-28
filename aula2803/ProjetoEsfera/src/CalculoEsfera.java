import java.util.Scanner;

public class CalculoEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        Esfera esfera = new Esfera();
        esfera.setRaio(Double.parseDouble(sc.nextLine()));

        System.out.println("Valor do volume é: " + esfera.calcularVolume());
    }
}