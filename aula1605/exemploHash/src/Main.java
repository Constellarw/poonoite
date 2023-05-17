import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1, p2, p3;
        p1 = new Pessoa(1);
        p1.setNome("Oscar");
        p2 = new Pessoa(2, "Maria", "maria@gmail.com");
        p3 = new Pessoa(3);
        p3.setNome("Rodrigo Santos");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}