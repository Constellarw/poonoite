import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try{
           Scanner sc = new Scanner(System.in);
           int a, b;
           System.out.println("Digite valor de A ");
           a = sc.nextInt();
           System.out.println("Digite valor de B ");
           b = sc.nextInt();
           int c =  a / b;
           System.out.println("Res. da Divisao: " + c);
       }catch (InputMismatchException ex){
           System.out.println("Numero informado deve ser inteiro");
       }catch (ArithmeticException ex){
           System.out.println("Impossivel dividir por zero");
       }catch (Exception ex){
           System.out.println("Aconteceu um erro inexperado: ");
       }finally {
           System.out.println("Passei de aqui sem erro ou com erro");
       }
    }
}