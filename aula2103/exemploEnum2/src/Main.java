public class Main {
    public static void main(String[] args) {
        Meses mes;
        mes = Meses.maio;

        int mesesDepois = 2;

        int novoIndice = (mes.ordinal() + mesesDepois) % Meses.values().length;

        Meses mesNovo = Meses.values()[novoIndice];

        System.out.println(mesNovo);




    }
}