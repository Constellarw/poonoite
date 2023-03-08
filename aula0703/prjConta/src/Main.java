public class Main {
    public static void main(String[] args) {

        Conta conta1  =new Conta();
        conta1.setNumConta(1);
        conta1.setNomeCliente("Joao");
        conta1.setSaldo(1000.0f);


        Conta conta2 = new Conta();
        conta2.setNumConta(2);
        conta2.setNomeCliente("Maromo");
        conta2.setSaldo(2000.0f);


        System.out.println(Conta.taxa);



    }
}