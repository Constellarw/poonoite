public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setMarca("Hp");
        computador1.setModelo("XS30");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(1234567);
        computador1.setPreco(2000.0);
        computador1.imprimir();
        System.out.println();
        computador1.calcularValor();
        computador1.imprimir();
        System.out.println();
        Computador computador2 = new Computador();
        computador2.setMarca("ibm");
        computador2.setModelo("DD7");
        computador2.setNumeroSerie(2345678);
        computador2.setCor("Branca");
        computador2.setPreco(5000.0);
        computador2.imprimir();
        System.out.println();
        computador2.calcularValor();
        computador2.imprimir();

        boolean ok = computador2.alterarValor(5500.0);
        if(ok){
            System.out.println("Preço alterado com sucesso");

        }else{
            System.out.println("Preço não alterado");
        }
        System.out.println();
        computador2.imprimir();

    }
}