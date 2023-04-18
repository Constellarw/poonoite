import model.Corrente;
import model.GerenciarConta;
import model.Poupanca;

public class ProgramaConta {
    public static void main(String[] args) {
        Corrente conta1 =
                new Corrente(1, "Vilma", 1000.0);
        Poupanca conta2 = new Poupanca(
                2, "Chico", 18, 0.67);
        conta2.depositar(300);
        conta1.depositar(2000);
        boolean sacou = conta2.sacar(400);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo ou limite");
        }
        System.out.println(conta2);
        System.out.println("Saldo de todas as contas: ");
        System.out.println(GerenciarConta.getTotalSaldos());

    }
}